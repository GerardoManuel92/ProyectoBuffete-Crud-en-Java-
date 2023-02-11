package ConexionSQL;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConectarBD {

    Connection conectar ;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/buffete", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return conectar;
    }
}
