package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroPersonasAudiencias extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmRegistroPersonasAudiencias() {
        initComponents();
        MostrarRegistros();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_id_persona = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        txt_datos_persona = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btn_buscar_persona = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_id_audiencia = new javax.swing.JTextField();
        btn_buscar_audiencia = new javax.swing.JButton();
        txt_datos_audiencia = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_registros = new javax.swing.JTable();
        btn_modifica = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE ASISTENCIA DE PERSONAS EN AUDIENCIAS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("INGRESE ID PERSONA");

        txt_id_persona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id_persona.setForeground(new java.awt.Color(0, 51, 51));
        txt_id_persona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("GUARDAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        txt_datos_persona.setEditable(false);
        txt_datos_persona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datos_persona.setForeground(new java.awt.Color(0, 51, 51));
        txt_datos_persona.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btn_buscar_persona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_personaActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("DATOS DE LA PERSONA");

        txt_id_audiencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id_audiencia.setForeground(new java.awt.Color(0, 51, 51));
        txt_id_audiencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_buscar_audiencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscar_audiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscar_audienciaActionPerformed(evt);
            }
        });

        txt_datos_audiencia.setEditable(false);
        txt_datos_audiencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datos_audiencia.setForeground(new java.awt.Color(0, 51, 51));
        txt_datos_audiencia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("INGRESE ID AUDIENCIA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(105, 105, 105)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_datos_audiencia)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(txt_id_audiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btn_buscar_audiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_registrar)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buscar_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_datos_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlimpiar)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_id_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txt_datos_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_buscar_persona, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_id_audiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscar_audiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_datos_audiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_registrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen21.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTROS ALMACENADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(0, 153, 153));

        tabla_registros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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
        tabla_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_registrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_registros);

        btn_modifica.setBackground(new java.awt.Color(0, 102, 102));
        btn_modifica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_modifica.setText("MODIFICAR REGISTRO");
        btn_modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaActionPerformed(evt);
            }
        });

        btn_elimina.setBackground(new java.awt.Color(0, 102, 102));
        btn_elimina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_elimina.setText("ELIMINAR REGISTRO");
        btn_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_modifica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_elimina)
                .addGap(21, 21, 21))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifica)
                    .addComponent(btn_elimina)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnsalir)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
       if(txt_id_persona.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NO HAY UN ID DE PERSONA INGRESADO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
        }else if(txt_id_audiencia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NO HAY UN ID DE AUDIENCIA INGRESADO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
        }else {        
        int id_persona = Integer.parseInt(txt_id_persona.getText());
        int id_audiencia = Integer.parseInt(txt_id_audiencia.getText());
        RegistrarAsistencia(id_persona, id_audiencia);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btn_buscar_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_personaActionPerformed
        if(txt_id_persona.getText().equals("")){
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE PERSONA QUE DESEAS BUSCAR","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
        }else {
        int id_persona = Integer.parseInt(txt_id_persona.getText());
        BuscarPersona(id_persona);
        }
    }//GEN-LAST:event_btn_buscar_personaActionPerformed

    private void btn_buscar_audienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscar_audienciaActionPerformed
         if(txt_id_audiencia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE AUDIENCIA QUE DESEAS BUSCAR","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
        }else {
        int id_audiencia = Integer.parseInt(txt_id_audiencia.getText());
        BuscarAudiencia(id_audiencia);
         }
    }//GEN-LAST:event_btn_buscar_audienciaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed
        EliminarAsistencia();
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
        if(txt_id_persona.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NO HAY UN ID DE PERSONA INGRESADO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
        }else if(txt_id_audiencia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "NO HAY UN ID DE AUDIENCIA INGRESADO","CAMPO VACIO",JOptionPane.ERROR_MESSAGE);
        }else {        
        int id_persona = Integer.parseInt(txt_id_persona.getText());
        int id_audiencia = Integer.parseInt(txt_id_audiencia.getText());
        ModificarAsistencia(id_persona, id_audiencia);
        }
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void tabla_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_registrosMouseClicked

        int fila = tabla_registros.getSelectedRow();
        if (fila >= 0) {
            txt_id_persona.setText(tabla_registros.getValueAt(fila, 0).toString());
            txt_id_audiencia.setText(tabla_registros.getValueAt(fila, 1).toString());
            LeerAudiencia();
            LeerPersona();
            btn_registrar.setEnabled(false);
            btn_modifica.setEnabled(true);
            btn_elimina.setEnabled(true);
        }
    }//GEN-LAST:event_tabla_registrosMouseClicked

    private void Limpiar() {
        txt_datos_audiencia.setText("");
        txt_datos_persona.setText("");
        txt_id_audiencia.setText("");
        txt_id_persona.setText("");
        btn_registrar.setEnabled(true);
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
    }

    private void BuscarPersona(int id) {
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM persona_audiencia WHERE id_persona='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datos_persona.setText(rs.getString("id_persona") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "ID DE PERSONA NO ENCOTRADO", "DATO NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                 txt_datos_persona.setText("");
                txt_id_persona.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarAudiencia(int id) {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_audiencia FROM audiencia WHERE id_audiencia='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datos_audiencia.setText(rs.getString("id_audiencia"));
            } else {
                JOptionPane.showMessageDialog(null, "ID DE AUDIENCIA NO ENCOTRADO", "DATO NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
                txt_datos_audiencia.setText("");
                txt_id_audiencia.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void RegistrarAsistencia(int persona, int audiencia) {
        PreparedStatement ps;
        String sql = "INSERT INTO asistencia_personas VALUES (?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, persona);
            ps.setInt(2, audiencia);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO CORRECTAMENTE");
            Limpiar();
            MostrarRegistros();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarRegistros() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("PERSONA");
        modelo.addColumn("AUDIENCIA");
        tabla_registros.setModel(modelo);
        String datos[] = new String[2];
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM asistencia_personas ORDER BY id_persona ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                modelo.addRow(datos);
            }
            tabla_registros.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ModificarAsistencia(int persona, int audiencia) {
        PreparedStatement ps;
        String sql = "UPDATE asistencia_personas SET id_persona='" + persona + "', id_audiencia='" + audiencia + "' WHERE id_persona='" + persona + "'";
        try {
            ps = cn.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR ESTA AUDIENCIA?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
                MostrarRegistros();
                Limpiar();
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR REGISTRO" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void EliminarAsistencia() {
        PreparedStatement pst = null;
        int fila = tabla_registros.getSelectedRow();
        String id = tabla_registros.getValueAt(fila, 0).toString();
        try {
            pst = cn.prepareStatement("DELETE FROM asistencia_personas WHERE id_persona='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR A ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarRegistros();
                JOptionPane.showMessageDialog(null, "EL REGISTRO SE HA ELIMINADO");
                Limpiar();
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, NO PODEMOS ELIMINAR A ESTE ELEMENTO" + ex, "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void LeerPersona() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM persona_audiencia WHERE id_persona='" + txt_id_persona.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datos_persona.setText(rs.getString("id_persona") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "ID DE PERSONA NO ENCOTRADO", "DATO NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerAudiencia() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_audiencia FROM audiencia WHERE id_audiencia='" + txt_id_audiencia.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datos_audiencia.setText(rs.getString("id_audiencia"));
            } else {
                JOptionPane.showMessageDialog(null, "ID DE AUDIENCIA NO ENCOTRADO", "DATO NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btn_buscar_audiencia;
    private javax.swing.JButton btn_buscar_persona;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_registros;
    private javax.swing.JTextField txt_datos_audiencia;
    private javax.swing.JTextField txt_datos_persona;
    private javax.swing.JTextField txt_id_audiencia;
    private javax.swing.JTextField txt_id_persona;
    // End of variables declaration//GEN-END:variables
}
