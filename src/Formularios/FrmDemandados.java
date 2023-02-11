package Formularios;

import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmDemandados extends javax.swing.JInternalFrame {
    
    ConectarBD con = new ConectarBD();
    Connection cn = con.conexion();
    
    public FrmDemandados() {
        initComponents();
        MostrarDemandados("");
        MostrarTipoDemandado();
        MostrarTotalDemanados();
        lbl_tipo.setVisible(false);
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_demandados = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_dato = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtdatos = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jcb_tipos = new javax.swing.JComboBox<>();
        lbl_tipo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("DEMANDADOS REGISTRADOS EN SISTEMA");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen15.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MUESTRA DE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        tabla_demandados.setFont(new java.awt.Font("Tahoma", 0, 14));
        tabla_demandados.setForeground(new java.awt.Color(0, 102, 102));
        tabla_demandados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tabla_demandados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_demandados.setRowHeight(25);
        tabla_demandados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_demandadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_demandados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        btnmodificar.setBackground(new java.awt.Color(0, 102, 102));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodificar.setText("MODIFICAR REGISTRO");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 102, 102));
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR REGISTRO");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(0, 102, 102));
        btn_salir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_salir.setText("REGRESAR A MENU");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("BUSQUEDA AVANZADA"), "BUSQUEDA AVANZADA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("INGRESE CUALQUIER VALOR QUE DESEA BUSCAR SOBRE DEMANDADOS");

        txt_dato.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_dato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_datoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txt_dato, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_dato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS PARA EDITAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("ID DEMANDADO");

        txtdatos.setEditable(false);
        txtdatos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        jcb_tipos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tipos.setForeground(new java.awt.Color(0, 102, 102));
        jcb_tipos.setBorder(null);
        jcb_tipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tiposItemStateChanged(evt);
            }
        });

        lbl_tipo.setText("ID TIPO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("NOMBRE O RAZON SOCIAL");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("TIPO DEMANDADO:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("DIRECCIÓN");

        txt_direccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jcb_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_tipo)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(160, 160, 160)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(178, 178, 178))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcb_tipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_tipo))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("DEMANDADOS EN SISTEMA:");

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(40, 40, 40)
                                .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_salir)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)
                    .addComponent(btn_salir))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_demandadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_demandadosMouseClicked
        btnmodificar.setEnabled(true);
        btneliminar.setEnabled(true);
        int fila = tabla_demandados.getSelectedRow();
        if (fila >= 0) {
            txtid.setText(tabla_demandados.getValueAt(fila, 0).toString());
            lbl_tipo.setText(tabla_demandados.getValueAt(fila, 1).toString());
            txt_direccion.setText(tabla_demandados.getValueAt(fila, 2).toString());
            MostrarTipoSeleccion();
            LeerPersonaFisica();
            btnmodificar.setEnabled(true);
            btneliminar.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debes selecionar una fila de la tabla", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tabla_demandadosMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (txt_direccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR LA DIRECCION", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int id = Integer.parseInt(txtid.getText());
            int tipo = Integer.parseInt(lbl_tipo.getText());
            String direccion = txt_direccion.getText();
            ModificarDemandados(id, tipo, direccion);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        EliminarDemandados();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();        
        HabilitarMenu();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_datoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_datoKeyReleased
        String dato = txt_dato.getText();
        MostrarDemandados(dato);
    }//GEN-LAST:event_txt_datoKeyReleased

    private void jcb_tiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tiposItemStateChanged
        MostrarIdTipo();
    }//GEN-LAST:event_jcb_tiposItemStateChanged
    
    private void Limpiar() {
        txtid.setText("");
        txtdatos.setText("");
        txt_dato.setText("");
        txtdatos.setText("");
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
    }

    private void MostrarTotalDemanados() {
        String sql = "SELECT COUNT(*) AS TOTAL FROM demandado";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_total.setText(String.valueOf(rs.getInt("TOTAL")));
            }
            
        } catch (SQLException e) {
        }
    }
    
    private void MostrarDemandados(String dato) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        modelo.addColumn("ID DEMANDADO");
        modelo.addColumn("ID TIPO DEMANDADO");
        modelo.addColumn("DIRECCIÓN");
        tabla_demandados.setModel(modelo);
        String sql = "";
        if (dato.equals("")) {
            sql = "SELECT * FROM demandado ORDER BY id_demandado ASC";
        } else {
            sql = "SELECT * FROM demandado WHERE id_demandado LIKE '%" + dato + "%' OR id_tipo LIKE'%" + dato + "%'OR direccion LIKE'%" + dato + "%'";
        }
        String datos[] = new String[3];
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }
            tabla_demandados.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR REGISTROS " + e, "Error inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void ModificarDemandados(int id, int tipo, String direccion) {
        ResultSet rs;
        Statement st;
        PreparedStatement pst = null;
        try {
            pst = cn.prepareStatement("UPDATE demandado SET id_tipo='" + tipo + "',direccion='" + direccion + "' WHERE id_demandado='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR LOS DATOS DEL DEMANDADO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarDemandados("");
                Limpiar();
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR " + e, "Error inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void EliminarDemandados() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst = null;
        int fila = tabla_demandados.getSelectedRow();
        String id = tabla_demandados.getValueAt(fila, 0).toString();
        try {
            pst = cn.prepareStatement("DELETE FROM demandado WHERE id_demandado='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR A ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarDemandados("");
                Limpiar();
                JOptionPane.showMessageDialog(null, "EL DEMANDADO HA SIDO ELIMINADO");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO PUEDES ELIMINAR ESTE REGISTRO MIENTRAS EXISTA UN DEMANDADO LIGADO A EL", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void LeerPersonaFisica() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT paterno, materno, nombre FROM persona_demandada WHERE id_demandado='" + txtid.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txtdatos.setText(rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            } else {
                LeerPersonaMoral();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE CARGARON LOS DATOS" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void LeerPersonaMoral() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT razon_social FROM empresa_demandada WHERE id_demandado='" + txtid.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txtdatos.setText(rs.getString("razon_social"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE CARGARON LOS DATOS" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void MostrarTipoDemandado() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM tipo_demandado";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_tipos.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE CARGARON LOS TIPOS" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void MostrarTipoSeleccion() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM tipo_demandado WHERE id_tipo='" + lbl_tipo.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_tipos.setSelectedItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR EL TIPO" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void MostrarIdTipo() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_tipo FROM tipo_demandado WHERE descripcion='" + jcb_tipos.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_tipo.setText(rs.getString("id_tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR EL ID" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void HabilitarMenu() {
        FrmMenu menu = new FrmMenu();
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
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_tipos;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JLabel lbl_total;
    public javax.swing.JTable tabla_demandados;
    private javax.swing.JTextField txt_dato;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txtdatos;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
