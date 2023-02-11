
package Formularios;

import java.sql.*;
import javax.swing.JOptionPane;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;

public class FrmNuevoRegistroContacto extends javax.swing.JInternalFrame {
 ConectarBD condb=new ConectarBD();
 Connection con=condb.conexion();
    public FrmNuevoRegistroContacto() {
        initComponents();
        lbl_idtipo.setVisible(false);
        lbl_idmedio.setVisible(false);
        MostrarTiposMedios();
        MostrarIDMedio();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_curp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_rfc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        panel_contacto = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jcb_tiposmedio = new javax.swing.JComboBox<>();
        lbl_contacto = new javax.swing.JLabel();
        lbl_idtipo = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        lbl_idmedio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_buscarasunto = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ID CLIENTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("APELLIDO PATERNO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("APELLIDO MATERNO");

        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(0, 102, 102));
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        txt_paterno.setEditable(false);
        txt_paterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_paterno.setForeground(new java.awt.Color(0, 51, 51));
        txt_paterno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txt_materno.setEditable(false);
        txt_materno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_materno.setForeground(new java.awt.Color(0, 51, 51));
        txt_materno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("NOMBRE COMPLETO");

        txt_nombre.setEditable(false);
        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 51, 51));
        txt_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("CURP");

        txt_curp.setEditable(false);
        txt_curp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_curp.setForeground(new java.awt.Color(0, 51, 51));
        txt_curp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        txt_curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_curpActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("RFC");

        txt_rfc.setEditable(false);
        txt_rfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rfc.setForeground(new java.awt.Color(0, 51, 51));
        txt_rfc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen3.jpg"))); // NOI18N

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

        btnsalir.setBackground(new java.awt.Color(0, 153, 153));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("VOLVER A MENU");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        panel_contacto.setBackground(new java.awt.Color(255, 255, 255));
        panel_contacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTABLECER TIPO DE CONTACTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("SELECCIONA TIPO DE CONTACTO");

        jcb_tiposmedio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tiposmedio.setForeground(new java.awt.Color(0, 51, 51));
        jcb_tiposmedio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--ELIGE UN TIPO DE CONTACTO--" }));
        jcb_tiposmedio.setBorder(null);
        jcb_tiposmedio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tiposmedioItemStateChanged(evt);
            }
        });
        jcb_tiposmedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_tiposmedioMouseClicked(evt);
            }
        });

        lbl_contacto.setBackground(new java.awt.Color(255, 255, 255));
        lbl_contacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_contacto.setForeground(new java.awt.Color(0, 102, 102));

        lbl_idtipo.setText("ID TIPO");

        txt_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_valor.setForeground(new java.awt.Color(0, 51, 51));
        txt_valor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        lbl_idmedio.setText("ID MEDIO");

        javax.swing.GroupLayout panel_contactoLayout = new javax.swing.GroupLayout(panel_contacto);
        panel_contacto.setLayout(panel_contactoLayout);
        panel_contactoLayout.setHorizontalGroup(
            panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contactoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_tiposmedio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idtipo))
                    .addGroup(panel_contactoLayout.createSequentialGroup()
                        .addComponent(lbl_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idmedio)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        panel_contactoLayout.setVerticalGroup(
            panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcb_tiposmedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idtipo))
                .addGap(18, 18, 18)
                .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_idmedio)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE NUEVOS  CONTACTOS DE CLIENTES");

        btn_buscarasunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscarasunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_registrar)
                .addGap(18, 18, 18)
                .addComponent(btnsalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_buscarasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(btnlimpiar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_buscarasunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(panel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btnsalir))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
      if(txt_id.getText().equals("")){
          JOptionPane.showMessageDialog(null, "DEBES INGRESAR UN ID DE CLIENTE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
      }else if(jcb_tiposmedio.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR EL TIPO DE CONTACTO A REGISTRAR", "NO HAY SELECCION DE MEDIO DE CONTACTO", JOptionPane.ERROR_MESSAGE);
      }else if(txt_valor.getText().equals("")){
          JOptionPane.showMessageDialog(null, "DEBES INGRESAR ALGUN CONTACTO DEL CLIENTE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
      }else{
          AgregarMedioContacto();
          RegistroMedioContacto();
          MostrarIDMedio();
      }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jcb_tiposmedioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tiposmedioItemStateChanged
        MostrarIDTipoMedio();
        if (jcb_tiposmedio.getSelectedIndex() == 1) {
            lbl_contacto.setText("INGRESA NUMERO TELEFÓNICO");
        } else if (jcb_tiposmedio.getSelectedIndex() == 2) {
            lbl_contacto.setText("INGRESA CORREO ELECTRÓNICO");
        } else if (jcb_tiposmedio.getSelectedIndex() == 3) {
            lbl_contacto.setText("INGRESA NOMBRE DE PERFIL");
        } else {

        }
    }//GEN-LAST:event_jcb_tiposmedioItemStateChanged

    private void jcb_tiposmedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_tiposmedioMouseClicked

    }//GEN-LAST:event_jcb_tiposmedioMouseClicked

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed

    private void txt_curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_curpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_curpActionPerformed

    private void btn_buscarasuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasuntoActionPerformed
       if(txt_id.getText().equals("")){
           JOptionPane.showMessageDialog(null, "INGRESA EL ID DE CLIENTE A BUSCAR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
       }else{
           BuscarCliente(Integer.parseInt(txt_id.getText()));
       }
    }//GEN-LAST:event_btn_buscarasuntoActionPerformed

     public void MostrarIDMedio() {
        try {
            String sql = "SELECT MAX(id_medio)+1 as medio FROM medio_contacto";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                lbl_idmedio.setText(String.valueOf(rs.getInt("medio")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e, "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }
     
      public void MostrarTiposMedios() {
        try {
            String sql = "SELECT descripcion FROM tipo_medio ORDER BY id_tipo ASC";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                this.jcb_tiposmedio.addItem(rs.getString("descripcion"));                
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar", "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDTipoMedio() {
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select id_tipo from tipo_medio where descripcion='" + jcb_tiposmedio.getSelectedItem().toString() + "'");
            while (rs.next()) {
                this.lbl_idtipo.setText(rs.getString("id_tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void BuscarCliente(int id){
        Statement st;
        ResultSet rs;
        String sql="SELECT paterno, materno, nombre, curp, rfc FROM cliente where id_cliente='"+id+"'";
        try {
            st=con.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                txt_paterno.setText(rs.getString("paterno"));
                txt_materno.setText(rs.getString("materno"));
                txt_nombre.setText(rs.getString("nombre"));
                txt_curp.setText(rs.getString("curp"));
                txt_rfc.setText(rs.getString("rfc"));
            }else{
                JOptionPane.showMessageDialog(null, "CLIENTE NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_id.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar"+e, "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
     public void AgregarMedioContacto() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO medio_contacto(id_tipo,id_cliente) VALUES(?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, lbl_idtipo.getText());
            pst.setString(2, txt_id.getText());
            pst.executeUpdate();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }
     
      public void AgregarTelefono() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO telefono VALUES(?,?)";
        try {
            if (txt_valor.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "EL NUMERO TELEFÓNICO DEBE CONTENER 10 DIGITOS", "INFORMACION INCORRECTA", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio.getText());
                pst.setString(2, txt_valor.getText());
                pst.executeUpdate();
                Limpiar();
            }

            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");                
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }
      
       public void AgregarEmail() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO email VALUES(?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM email WHERE cuenta LIKE '" + txt_valor.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL EMAIL QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio.getText());
                pst.setString(2, txt_valor.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");   
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }
       
       public void AgregarFacebook() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO facebook VALUES(?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM facebook WHERE cuenta LIKE '" + txt_valor.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL NOMBRE DE PERFIL QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio.getText());
                pst.setString(2, txt_valor.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }
       
        public void RegistroMedioContacto() {
        if (jcb_tiposmedio.getSelectedIndex()==1) {
            AgregarTelefono();
        } else if (jcb_tiposmedio.getSelectedIndex()==2) {
            AgregarEmail();
        } else if (jcb_tiposmedio.getSelectedIndex()==3) {
            AgregarFacebook();
        }
    }
        
        private void Limpiar(){
            txt_curp.setText("");
            txt_id.setText("");
            txt_materno.setText("");
            txt_nombre.setText("");
            txt_paterno.setText("");
            txt_rfc.setText("");
            txt_valor.setText("");
            jcb_tiposmedio.setSelectedIndex(0);
            lbl_contacto.setText("");
            lbl_idtipo.setText("");
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscarasunto;
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
    private javax.swing.JComboBox<String> jcb_tiposmedio;
    private javax.swing.JLabel lbl_contacto;
    private javax.swing.JLabel lbl_idmedio;
    private javax.swing.JLabel lbl_idtipo;
    private javax.swing.JPanel panel_contacto;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_rfc;
    private javax.swing.JTextField txt_valor;
    // End of variables declaration//GEN-END:variables
}
