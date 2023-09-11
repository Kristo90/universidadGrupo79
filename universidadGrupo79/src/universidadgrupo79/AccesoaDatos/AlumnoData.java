
package universidadgrupo79.AccesoaDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo79.Entidades.Alumno;

/**
 *
 * @author kristo
 */
public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno (Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimennto, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            // Clase Date del SQL (transformar un LocalDate a Date)
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            while (rs.next()) {
                
                alumno.setIdAlumno(1);
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
        }
        
    }
}
