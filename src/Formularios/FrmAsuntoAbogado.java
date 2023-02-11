package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAsuntoAbogado extends javax.swing.JInternalFrame {
    
    

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmAsuntoAbogado() {
        initComponents();
        MostrarRegistros();
        MostrarAsuntos();
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
        lbl_asunto.setVisible(false);
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txt_idabogado = new javax.swing.JTextField();
        btn_abogado = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_datosabogado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcb_asuntos = new javax.swing.JComboBox<>();
        lbl_asunto = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taba_asuntos = new javax.swing.JTable();
        btn_modifica = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESE DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("ID ABOGADO");

        txt_idabogado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idabogado.setForeground(new java.awt.Color(0, 51, 51));
        txt_idabogado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_abogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_abogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abogadoActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("DATOS ABOGADO");

        txt_datosabogado.setEditable(false);
        txt_datosabogado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datosabogado.setForeground(new java.awt.Color(0, 51, 51));
        txt_datosabogado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("ASUNTO");

        jcb_asuntos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_asuntos.setForeground(new java.awt.Color(0, 102, 102));
        jcb_asuntos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA UN ASUNTO--" }));
        jcb_asuntos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_asuntosItemStateChanged(evt);
            }
        });
        jcb_asuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_asuntosMouseClicked(evt);
            }
        });

        lbl_asunto.setText("ID ASUNTO");

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("GUARDAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_idabogado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_abogado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_datosabogado, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_asuntos, javax.swing.GroupLayout.Alignment.LEADING, 0, 231, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_asunto)
                        .addGap(58, 58, 58)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_registrar)
                .addGap(196, 196, 196))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_abogado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_idabogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnlimpiar))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txt_datosabogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcb_asuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_asunto))
                .addGap(36, 36, 36)
                .addComponent(btn_registrar)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("ASIGNACIÓN DE ASUNTOS A ABOGADOS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTROS ALMACENADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N

        taba_asuntos.setFont(new java.awt.Font("Tahoma", 0, 14));
        taba_asuntos.setForeground(new java.awt.Color(0, 102, 102));
        taba_asuntos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        taba_asuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
        {
            public boolean isCellEditable(int row, int column){
                return false;
            }
        }
    );
    taba_asuntos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            taba_asuntosMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(taba_asuntos);

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

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(btn_modifica)
                    .addGap(26, 26, 26)
                    .addComponent(btn_elimina)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_modifica)
                .addComponent(btn_elimina))
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

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 114, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(290, 290, 290)
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnsalir)
            .addGap(181, 181, 181))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(btnsalir)
            .addContainerGap(28, Short.MAX_VALUE))
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

    private void btn_abogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abogadoActionPerformed
        if (txt_idabogado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INTRODUCE EL ID DEL ABOGADO QUE DESEAS BUSCAR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_abogado = Integer.parseInt(txt_idabogado.getText());
            BuscarAbogado(id_abogado);
        }
    }//GEN-LAST:event_btn_abogadoActionPerformed

    private void jcb_asuntosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_asuntosItemStateChanged
        MostrarIDAsuntos();
    }//GEN-LAST:event_jcb_asuntosItemStateChanged

    private void jcb_asuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_asuntosMouseClicked

    }//GEN-LAST:event_jcb_asuntosMouseClicked

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if (txt_datosabogado.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "NO HAY REGISTROS VISIBLES", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_idabogado.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INTRODUCE EL ID DEL ABOGADO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_asuntos.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONA UN TIPO DE ASUNTO", "OPCION NO VALIDA", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_asunto.getText().equals("ID ASUNTO")) {
            JOptionPane.showMessageDialog(null, "ID DE ASUNTO NO VALIDO", "CAMPO ERRONEO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_abogado = Integer.parseInt(txt_idabogado.getText());
            int id_asunto = Integer.parseInt(lbl_asunto.getText());
            RegistrarAsignacion(id_abogado, id_asunto);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void taba_asuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taba_asuntosMouseClicked

        int fila = taba_asuntos.getSelectedRow();
        if (fila >= 0) {
            txt_idabogado.setText(taba_asuntos.getValueAt(fila, 0).toString());
            lbl_asunto.setText(taba_asuntos.getValueAt(fila, 1).toString());
            LeerAbogado();
            LeerAsunto();
            btn_registrar.setEnabled(false);
            btn_modifica.setEnabled(true);
            btn_elimina.setEnabled(true);
    }//GEN-LAST:event_taba_asuntosMouseClicked

    }
    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
        int id_abogado = Integer.parseInt(txt_idabogado.getText());
        int id_asunto = Integer.parseInt(lbl_asunto.getText());
        ModificarRegistro(id_abogado, id_asunto);
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed
        ElimimarRegistro();
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void Limpiar() {
        txt_idabogado.setText("");
        txt_datosabogado.setText("");
        jcb_asuntos.setSelectedIndex(0);
        lbl_asunto.setText("ID ASUNTO");
        btn_registrar.setEnabled(true);
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
    }

    private void RegistrarAsignacion(int id_abogado, int id_tipo) {
        ResultSet rs;
        Statement st;
        PreparedStatement ps;
        String sql = "INSERT INTO asunto_abogado VALUES(?,?)";
        try {
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM asunto_abogado WHERE  id_abogado LIKE '" + id_abogado + "' and id_tipo LIKE '" + id_tipo + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL ABOGADO YA SE ENCUENTRA ASIGNADO A ESTE TIPO DE CASO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                ps = cn.prepareStatement(sql);
                ps.setInt(1, id_abogado);
                ps.setInt(2, id_tipo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                MostrarRegistros();
                Limpiar();               
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarAbogado(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select id_abogado, paterno, materno, nombre from abogado where id_abogado='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosabogado.setText(rs.getString("id_abogado") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
                jcb_asuntos.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "ID DE ABOGADO NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_idabogado.setText("");
                txt_datosabogado.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR REGISTRO", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarAsuntos() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM tipo_asunto ORDER BY id_tipo ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_asuntos.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarIDAsuntos() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_tipo FROM tipo_asunto WHERE descripcion='" + jcb_asuntos.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_asunto.setText(rs.getString("id_tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarRegistros() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn(" ABOGADO");
        modelo.addColumn("TIPO DE ASUNTO");
        taba_asuntos.setModel(modelo);

        try {
            String sql = "SELECT * FROM asunto_abogado ORDER BY id_abogado ASC";
            Statement st;
            ResultSet rs;
            String tipos[] = new String[2];
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                tipos[0] = rs.getString(1);
                tipos[1] = rs.getString(2);
                modelo.addRow(tipos);
            }
            taba_asuntos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerAbogado() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_abogado, paterno, materno, nombre FROM abogado WHERE id_abogado='" + txt_idabogado.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_datosabogado.setText(rs.getString("id_abogado") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerAsunto() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM tipo_asunto WHERE id_tipo='" + lbl_asunto.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_asuntos.setSelectedItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ModificarRegistro(int id_abogado, int id_tipo) {
        PreparedStatement ps;
        String sql = "UPDATE asunto_abogado SET id_abogado='"+id_abogado+"', id_tipo='" + id_tipo + "' WHERE id_abogado='" + id_abogado + "'";

        try {
            ps = cn.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR LOS DATOS?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "DATO ACTUALIZADO CORRECTAMENTE");
                MostrarRegistros();
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ElimimarRegistro() {
        int fila = taba_asuntos.getSelectedRow();
        String asunto = taba_asuntos.getValueAt(fila, 1).toString();
        PreparedStatement ps;

        try {
            ps = cn.prepareStatement("DELETE FROM asunto_abogado WHERE id_tipo='" + asunto + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "EL ELEMENTO HA SIDO ELIMINADO");
                MostrarRegistros();
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, EL ELEMENTO NO PUEDE SER ELIMINADO", "ERROR", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btn_abogado;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_asuntos;
    private javax.swing.JLabel lbl_asunto;
    private javax.swing.JTable taba_asuntos;
    private javax.swing.JTextField txt_datosabogado;
    private javax.swing.JTextField txt_idabogado;
    // End of variables declaration//GEN-END:variables
}
