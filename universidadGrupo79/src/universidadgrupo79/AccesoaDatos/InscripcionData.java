package universidadgrupo79.AccesoaDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo79.Entidades.Alumno;
import universidadgrupo79.Entidades.Inscripcion;
import universidadgrupo79.Entidades.Materia;

public class InscripcionData {

    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public ArrayList<Materia> listarMateriaNC(int id) {
        ArrayList<Materia> matnc = new ArrayList<>();

        try {
            String sql = "SELECT idMateria, Nombre, anio FROM materia WHERE estado = 1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia mat = new Materia();
                mat.setIdMateria(rs.getInt("idMateria"));
                mat.setNombre(rs.getString("nombre"));
                mat.setAnioMateria(rs.getInt("anio"));
                matnc.add(mat);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }

        return matnc;

    }
    
   public List<Materia> listarMateriasIns(int id) {

       ArrayList<Materia> materias = new ArrayList<>();
        MateriasData md = new MateriasData();

        String sql = "SELECT idMateria FROM inscripcion WHERE idAlumno= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = md.buscarMateria(rs.getInt("idMateria"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
        }
        return materias;
   
    }
public void Inscribir(Inscripcion insc) {

        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria)"
                + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

           ps.setDouble(1, insc.getNote());
           ps.setInt(2,insc.getAlumno().getIdAlumno());
           ps.setInt(3,insc.getMateria().getIdMateria());
           

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

             if (rs.next()) {

                insc.setIdInscripcion(rs.getInt(1));


                

                JOptionPane.showMessageDialog(null, "Inscripcion realizada con exito");

            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion");

        }

    }
}

