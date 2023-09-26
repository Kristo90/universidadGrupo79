package universidadgrupo79.AccesoaDatos;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo79.Entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    public void guardarAlumno(Alumno alu) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, alu.getDni());
            ps.setString(2, alu.getApellido());
            ps.setString(3, alu.getNombre());
            // Clase Date del SQL (transformar un LocalDate a Date)
            ps.setDate(4, Date.valueOf(alu.getFechaNac()));
            ps.setBoolean(5, alu.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            while (rs.next()) {

                alu.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
                System.out.println(alu.getIdAlumno());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }

    }

    public void eliminarAlumno(int id) {
        try {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
    }

    public Alumno buscarAlumno(int dni) {
        Alumno alumno = new Alumno();
        // Alumno alumno = null;
        // SELECT `idAlumno`, `dni`, `apellido`, `nombre`, `fechaNacimiento`, `estado` FROM `alumno` WHERE 1

        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1;";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, dni);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                alumno.setIdAlumno(rs.getInt(1));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(true);

            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());

        }

        return alumno;
    }

    public List<Alumno> listarAlumno() {
ArrayList<Alumno> alu=new ArrayList<>();
        try {
            String sql = " SELECT idAlumno,nombre, apellido, dni FROM alumno WHERE estado=1";

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int idAlumno=rs.getInt(1);
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int dni = rs.getInt("dni");
                Alumno alum = new Alumno(idAlumno,nombre, apellido, dni);
                alu.add(alum);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alu;
    }

}
