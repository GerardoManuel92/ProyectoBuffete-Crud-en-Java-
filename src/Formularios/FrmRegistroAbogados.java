package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class FrmRegistroAbogados extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmRegistroAbogados() {
        initComponents();
        MostrarIDAbogado();
        MostrarGrados();
        MostrarIdGrado();
        lbl_idgrado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_rfc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcb_grado = new javax.swing.JComboBox<>();
        lbl_idgrado = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE ABOGADOS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ID CLIENTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("APELLIDO PATERNO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("APELLIDO MATERNO");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(0, 102, 102));
        txt_id.setText("ID ABOGADO");
        txt_id.setBorder(null);

        txt_paterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_paterno.setForeground(new java.awt.Color(0, 51, 51));
        txt_paterno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txt_materno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_materno.setForeground(new java.awt.Color(0, 51, 51));
        txt_materno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("NOMBRE COMPLETO");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 51, 51));
        txt_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("RFC");

        txt_rfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rfc.setForeground(new java.awt.Color(0, 51, 51));
        txt_rfc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        txt_rfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rfcActionPerformed(evt);
            }
        });
        txt_rfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rfcKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("CEDULA");

        txt_cedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_cedula.setForeground(new java.awt.Color(0, 51, 51));
        txt_cedula.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("GRADO ADACÉMICO");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen14.jpg"))); // NOI18N

        jcb_grado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_grado.setForeground(new java.awt.Color(0, 102, 102));
        jcb_grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONAR GRADO ACADÉMICO--" }));
        jcb_grado.setBorder(null);
        jcb_grado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_gradoItemStateChanged(evt);
            }
        });

        lbl_idgrado.setText("ID GRADO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(58, 58, 58)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_rfc, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                        .addComponent(txt_cedula))
                                    .addComponent(jcb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addComponent(btnlimpiar)
                        .addGap(173, 173, 173))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_idgrado)
                    .addComponent(btn_registrar))
                .addGap(139, 139, 139))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcb_grado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idgrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_registrar))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnsalir)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if(txt_paterno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESAR APELLIDO PATERNO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(txt_materno.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESAR APELLIDO MATERNO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(txt_nombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESAR EL NOMBRE COMPLETO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(txt_rfc.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESAR EL RFC", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(txt_cedula.getText().equals("")){
            JOptionPane.showMessageDialog(null, "INGRESAR LA CEDULA PROFESIONAL", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(txt_cedula.getText().length()<7 || txt_cedula.getText().length()>8){
            JOptionPane.showMessageDialog(null, "LA CEDULA DENE TENER 7 U 8 CARACTERES", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(jcb_grado.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR EL GRADO ACADEMICO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if(lbl_idgrado.getText().equals("ID GRADO")){
            JOptionPane.showMessageDialog(null, "ID NO VALIDO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else{        
        String paterno = txt_paterno.getText();
        String materno = txt_materno.getText();
        String nombre = txt_nombre.getText();
        String rfc = txt_rfc.getText();
        int cedula = Integer.parseInt(txt_cedula.getText());
        int grado = Integer.parseInt(lbl_idgrado.getText());
        AgregarAbogado(paterno, materno, nombre, rfc, cedula, grado);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jcb_gradoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_gradoItemStateChanged
        MostrarIdGrado();
    }//GEN-LAST:event_jcb_gradoItemStateChanged

    private void txt_rfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rfcActionPerformed
        
    }//GEN-LAST:event_txt_rfcActionPerformed

    private void txt_rfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rfcKeyTyped
       
    }//GEN-LAST:event_txt_rfcKeyTyped

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char c=evt.getKeyChar();
        
        if(Character.isLetter(c)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "SOLO SE ADMITEN NUMEROS", "ERROR DE CAMPO", JOptionPane.ERROR_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

   private void MostrarGrados(){
        Statement st;
        ResultSet rs;
        String sql="SELECT descripcion FROM grado_academico";
        
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                jcb_grado.addItem(rs.getString("descripcion"));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR GRADOS" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
   }
   
    private void MostrarIdGrado(){
        Statement st;
        ResultSet rs;
        String sql="SELECT id_grado FROM grado_academico WHERE descripcion='"+jcb_grado.getSelectedItem().toString()+"'";
        
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                lbl_idgrado.setText(rs.getString("id_grado"));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR  ID GRADO" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
   }
    
    private void AgregarAbogado(String paterno, String materno, String nombre, String rfc, int cedula, int grado) {
        Statement st;
        ResultSet rs;
        String sql = "INSERT INTO abogado (paterno, materno, nombre, rfc, cedula, id_grado) VALUES (?,?,?,?,?,?)";

        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM abogado WHERE rfc LIKE '" + rfc + "' OR cedula LIKE'" + cedula + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL  RFC  O NUMERO DE CEDULA INGRESADO YA ESTA REGISTRADO EN SISTEMA", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                PreparedStatement ps = cn.prepareStatement(sql);
                ps.setString(1, paterno);
                ps.setString(2, materno);
                ps.setString(3, nombre);
                ps.setString(4, rfc);
                ps.setInt(5, cedula);
                ps.setInt(6, grado);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "ABOGADO REGISTRADO CORRECTAMENTE");
                MostrarIDAbogado();
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL REGISTRAR" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void MostrarIDAbogado(){
        Statement st;
        ResultSet rs;
        String sql="SELECT MAX(id_abogado)+1 as maximo FROM abogado";
        
        try {
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                txt_id.setText(String.valueOf(rs.getString("maximo")));
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ID" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }  
    

    private void Limpiar() {
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_nombre.setText("");
        txt_rfc.setText("");
        txt_cedula.setText("");
        lbl_idgrado.setText("");
        jcb_grado.setSelectedIndex(0);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcb_grado;
    private javax.swing.JLabel lbl_idgrado;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_rfc;
    // End of variables declaration//GEN-END:variables
}
