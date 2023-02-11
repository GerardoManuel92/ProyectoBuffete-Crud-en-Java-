package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class FrmAuditoriaTelefono extends javax.swing.JInternalFrame {
    ConectarBD condb=new ConectarBD();
    Connection cn=condb.conexion();

    public FrmAuditoriaTelefono() {
        initComponents();
        MostrarRegistros();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registros = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("AUDITORIA DE REGISTROS DE NUMEROS TELEFÓNICOS");

        tabla_registros.setFont(new java.awt.Font("Tahoma", 0, 14));
        tabla_registros.setForeground(new java.awt.Color(0, 102, 102));
        tabla_registros = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tabla_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_registros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabla_registros.setRowHeight(30);
        jScrollPane1.setViewportView(tabla_registros);

        jButton4.setBackground(new java.awt.Color(0, 102, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("VOLVER A MENU");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1306, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_jButton4ActionPerformed
private void MostrarRegistros(){
    DefaultTableModel modelo=new DefaultTableModel();
    modelo.addColumn("OPERACION");
    modelo.addColumn("USUARIO");
    modelo.addColumn("FECHA");
    modelo.addColumn("NUEVO ID MEDIO");
    modelo.addColumn("NUEVO NUMERO");
    modelo.addColumn("ANTERIOR ID MEDIO");
    modelo.addColumn("ANTERIOR NUMERO");
    tabla_registros.setModel(modelo);
    
    Statement st;
    ResultSet rs;
    String sql="SELECT * FROM auditoria_telefono";
    String datos[]=new String[7];
    
    try {
        st=cn.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            datos[2]=rs.getString(3);
            datos[3]=rs.getString(4);
            datos[4]=rs.getString(5);
            datos[5]=rs.getString(6);
            datos[6]=rs.getString(7);
            modelo.addRow(datos);
        }
        tabla_registros.setModel(modelo);
    } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "ERROR AL CARGAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
    }
}

private void HabilitarMenu(){
         FrmMenu menu=new FrmMenu();
        menu.jMasOpciones.setEnabled(true);
        menu.jMenuAbogado.setEnabled(true);
        menu.jMenuAsunto.setEnabled(true);
        menu.jMenuAudiencia.setEnabled(true);
        menu.jMenuClientes.setEnabled(true);
        menu.jMenuDemandados.setEnabled(true);
        menu.jMenuEstado.setEnabled(true);
        menu.jMenuLugares.setEnabled(true);
        menu.jMenuPersonas.setEnabled(true);
        menu.jMenuResolucion.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_registros;
    // End of variables declaration//GEN-END:variables
}
