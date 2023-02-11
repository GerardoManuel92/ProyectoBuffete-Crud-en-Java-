package Clases;

import Formularios.*;
import java.sql.*;
import ConexionSQL.ConectarBD;
import javax.swing.JOptionPane;

public class Login {

    FrmMenu menu = new FrmMenu();
    FrmLogin login = new FrmLogin();

    ConectarBD conectar = new ConectarBD();
    Connection cn = conectar.conexion();
    String usuario = "";
    String password = "";
    Statement st;
    ResultSet rs;

    public void Logueo(String usuario, String password) {
        try {
            this.usuario = usuario;
            this.password = password;

            String sql = "SELECT * FROM usuarios WHERE id_usuario='" + this.usuario + "' and password='" + this.password + "'";
            st = cn.createStatement();
            rs = st.executeQuery(sql);

            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "ACCESO CORRECTO AL SISTEMA 'BUFETE DE ABOGADOS'  \n"+"HOLA: "+ rs.getString("nombre") + " " + rs.getString("paterno") + " " + rs.getString("materno"));
                menu.lbl_usuario.setText(rs.getString("nombre") + " " + rs.getString("paterno") + " " + rs.getString("materno"));                
                menu.setVisible(true);
                login.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "<html><p style = \"  color: red; font:20px;  \">Usuario y/o contraseña son incorrectos</p></html>", "Datos Incorrectos", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion " + e.getMessage());
        } finally {
            try {
                st.close();
                rs.close();
                cn.close();
            } catch (SQLException e) {

            }
        }
    }

}
