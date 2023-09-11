
package universidadgrupo79.AccesoaDatos;

import java.sql.*;

/**
 *
 * @author kristo
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "universidadGrupo79";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conection;
    
    private Conexion() {}
    
    public static Connection getConexion() {
        
    }
 }
