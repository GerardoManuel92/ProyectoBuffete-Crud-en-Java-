package Clases;

import java.sql.*;
import ConexionSQL.ConectarBD;
import Formularios.FrmClientesRegistrados;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroClientes {

    ConectarBD conectar = new ConectarBD();
    Connection cn = conectar.conexion();
    FrmClientesRegistrados clientes = new FrmClientesRegistrados();

    String id;
    String paterno;
    String materno;
    String nombre;
    String curp;
    String rfc;   

    ResultSet rs;
    Statement st;
    PreparedStatement pst;

    public void RegistrarCliente(String id, String paterno, String materno, String nombre, String curp, String rfc) {
        this.id = id;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.curp = curp;
        this.rfc = rfc;
        String sql = "INSERT INTO cliente VALUES(?,?,?,?,?,?)";

        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM cliente WHERE curp LIKE '" + curp + "' OR rfc LIKE'"+rfc+"'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL CURP O RFC INGRESADO YA ESTA REGISTRADO EN SISTEMA", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = cn.prepareStatement(sql);
                pst.setString(1, id);
                pst.setString(2, paterno);
                pst.setString(3, materno);
                pst.setString(4, nombre);
                pst.setString(5, curp);
                pst.setString(6, rfc);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error " + e, "Error inesperado", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                st.close();
                rs.close();
                cn.close();
            }catch(SQLException e){
                
            }
        }
    }
  
}
