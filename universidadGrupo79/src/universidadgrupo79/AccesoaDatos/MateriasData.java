package universidadgrupo79.AccesoaDatos;

import java.sql.Connection;
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
import universidadgrupo79.Entidades.Materia;

public class MateriasData {

    private Connection con = null;

    public MateriasData() {
        con = Conexion.getConexion();

    }

    public void guardarMateria(Materia mat) {

        String sql = "INSERT INTO materia( nombre, anio, estado)"
                + " VALUES (?,?,?)";
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, mat.getNombre());
            ps.setInt(2, mat.getAnioMateria());
            ps.setBoolean(3, mat.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                mat.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo correctamente la materia");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");

        }

    }

    public void eliminarMateria(int codigo) {
        try {
            String sql = "UPDATE Materia SET estado =0 WHERE idMateria=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, codigo);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó la materia.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Materia");

        }
    }

   public Materia buscarMateria(int codigo) {
        Materia mat = new Materia();
        
        // SELECT idMateria`nombre`, `anio`, `estado` FROM `materia` WHERE 1

        String sql = "SELECT idMateria,nombre,anio,estado FROM materia WHERE idMateria = ? AND estado = 1;";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, codigo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                mat.setIdMateria(rs.getInt(1));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("anio"));
                mat.setEstado(true);


            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia");
                ps.close();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");

        }

        return mat;
    }
   public List<Materia> listarMaterias() {

        ArrayList<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT  * FROM materia WHERE  estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Materia materia = new Materia();

                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anio"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla Materia");
        }
        return materias;

    }

}
