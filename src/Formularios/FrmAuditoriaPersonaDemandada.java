package Formularios;
import java.sql.*;
import ConexionSQL.ConectarBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAuditoriaPersonaDemandada extends javax.swing.JInternalFrame {
    ConectarBD conbd=new ConectarBD();
    Connection cn=conbd.conexion();

    public FrmAuditoriaPersonaDemandada() {
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
        jLabel1.setText("AUDITORIA DE REGISTROS DE PERSONAS DEMANDADAS");

        tabla_registros.setFont(new java.awt.Font("Tahoma", 0, 14));
        tabla_registros.setForeground(new java.awt.Color(0, 51, 51));
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
        tabla_registros.setGridColor(new java.awt.Color(0, 102, 102));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel1)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(58, 58, 58))
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
        modelo.addColumn("AUTOR");
        modelo.addColumn("FECHA");
        modelo.addColumn("NUEVO ID DEMANDADO");
        modelo.addColumn("NUEVO PATERNO");
        modelo.addColumn("NUEVO MATERNO");
        modelo.addColumn("NUEVO NOMBRE");        
        modelo.addColumn("ANTERIOR ID DEMANDADO");
        modelo.addColumn("ANTERIOR PATERNO");
        modelo.addColumn("ANTERIOR MATERNO");
         modelo.addColumn("ANTERIOR NOMBRE");       
        tabla_registros.setModel(modelo);
        Statement st;
        ResultSet rs;        
        String sql="SELECT * FROM auditoria_persona_demandada";
        String datos[]=new String[11];
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
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);                
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
