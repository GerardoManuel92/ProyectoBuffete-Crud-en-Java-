package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class FrmRegistroDemandado extends javax.swing.JInternalFrame {
    
    ConectarBD condb=new ConectarBD();
    Connection cn=condb.conexion();

    public FrmRegistroDemandado() {
        initComponents();
            MostrarID();
            MostrarTipoDemandado();
            lbl_idtipo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcb_tipo = new javax.swing.JComboBox<>();
        lbl_idtipo = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE DATOS PARA DEMAMDADOS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ID DEMANDADO");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(0, 102, 102));
        txt_id.setText("ID DEMANDADO");
        txt_id.setBorder(null);

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("GUARDAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("DIRECCION");

        txt_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_direccion.setForeground(new java.awt.Color(0, 51, 51));
        txt_direccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("TIPO DE DEMANDADO");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen17.jpg"))); // NOI18N

        jcb_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tipo.setForeground(new java.awt.Color(0, 102, 102));
        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONAR TIPO DEMANDADO--" }));
        jcb_tipo.setBorder(null);
        jcb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tipoItemStateChanged(evt);
            }
        });

        lbl_idtipo.setText("ID DEMANDADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiar)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_idtipo))
                            .addComponent(btn_registrar))
                        .addGap(27, 76, Short.MAX_VALUE)))
                .addComponent(jLabel8)
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_idtipo))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_registrar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        btnsalir.setBackground(new java.awt.Color(0, 153, 153));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("VOLVER A MENU");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsalir)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if(jcb_tipo.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "POR FAVOR ELIGE UN TIPO DE DEMANDADO" , "NO HAY SELECCION", JOptionPane.ERROR_MESSAGE);
        }else if(lbl_idtipo.getText().equals("ID DEMANDADO")){
            JOptionPane.showMessageDialog(null, "ID DE DEMANDADO NO VALIDO" , "CAMPO INCORRECTO", JOptionPane.ERROR_MESSAGE);
        }else if(txt_direccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESA LA DIRECCIÓN DEL DEMANDADO" , "CAMPO INCORRECTO", JOptionPane.ERROR_MESSAGE);
        }else {        
        int tipo=Integer.parseInt(lbl_idtipo.getText());
        String direccion=txt_direccion.getText();        
        RegistrarAsesoria(tipo, direccion);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void jcb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tipoItemStateChanged
        MostrarIDTipo();
    }//GEN-LAST:event_jcb_tipoItemStateChanged

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void RegistrarAsesoria(int tipo, String direccion){
        PreparedStatement ps;
        String sql="INSERT INTO demandado (id_tipo,direccion) VALUES (?,?)";
        
        try {
            ps=cn.prepareStatement(sql);
            ps.setInt(1, tipo);
            ps.setString(2, direccion);
            ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "DATOS DE DEMANDADO REGISTRADOS CON EXITO");
              JOptionPane.showMessageDialog(null, "AHORA DEBES REGISTRAR A UNA PERSONA FISICA O MORAL CON ESTA DIRECCION EN EL APARTADO CORRESPONDIENTE");
             MostrarID();
             Limpiar();
        } catch (HeadlessException | SQLException e) {
             JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void MostrarID(){
        Statement st;
        ResultSet rs;
        String sql="SELECT MAX(id_demandado)+1 AS maximo FROM demandado";
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                txt_id.setText(String.valueOf(rs.getString("maximo")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ID" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
     private void MostrarTipoDemandado(){
        Statement st;
        ResultSet rs;
        String sql="SELECT descripcion FROM tipo_demandado";
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                jcb_tipo.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LOS TIPOS" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
     private void MostrarIDTipo(){
        Statement st;
        ResultSet rs;
        String sql="SELECT id_tipo FROM tipo_demandado WHERE descripcion='"+jcb_tipo.getSelectedItem().toString()+"'";
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                lbl_idtipo.setText(String.valueOf(rs.getString("id_tipo")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ID" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void Limpiar(){
        txt_direccion.setText("");
        jcb_tipo.setSelectedIndex(0);
        
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
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JLabel lbl_idtipo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
