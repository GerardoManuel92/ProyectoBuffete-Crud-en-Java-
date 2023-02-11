package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

public class FrmEstados extends javax.swing.JInternalFrame {

    ConectarBD conbd = new ConectarBD();
    Connection con = conbd.conexion();

    public FrmEstados() {
        initComponents();
        MostrarEstados();
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
        UIManager UI = new UIManager();
        UI.put("OptionPane.background", new ColorUIResource(255, 255, 255));
        UI.put("Panel.background", new ColorUIResource(255, 255, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_registro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_descripcion = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panel_vista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_estados = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_descripcion2 = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DE ESTADOS");

        panel_registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_registro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CREAR NUEVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("DESCRIPCION");

        txt_descripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));
        txt_descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_descripcionMouseClicked(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(0, 102, 102));
        btnregistrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_registroLayout = new javax.swing.GroupLayout(panel_registro);
        panel_registro.setLayout(panel_registroLayout);
        panel_registroLayout.setHorizontalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(btnregistrar))
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnregistrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen8.jpg"))); // NOI18N

        panel_vista.setBackground(new java.awt.Color(255, 255, 255));
        panel_vista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE DE TIPOS DE MEDIO REGISTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        tabla_estados.setFont(new java.awt.Font("Tahoma", 0, 16));
        tabla_estados.setForeground(new java.awt.Color(0, 102, 102));
        tabla_estados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tabla_estados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_estados.setRowHeight(30);
        tabla_estados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_estadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_estados);

        btnmodificar.setBackground(new java.awt.Color(0, 102, 102));
        btnmodificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnmodificar.setText("MODIFICAR");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(0, 102, 102));
        btneliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 51));
        jLabel5.setText("ID");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("DESCRIPCIÓN");

        txt_descripcion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_descripcion2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 153));
        btn_limpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_vistaLayout = new javax.swing.GroupLayout(panel_vista);
        panel_vista.setLayout(panel_vistaLayout);
        panel_vistaLayout.setHorizontalGroup(
            panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vistaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnmodificar)
                .addGap(70, 70, 70)
                .addComponent(btneliminar)
                .addGap(64, 64, 64))
            .addGroup(panel_vistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panel_vistaLayout.createSequentialGroup()
                        .addGroup(panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_vistaLayout.createSequentialGroup()
                                .addComponent(txt_descripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(btn_limpiar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_vistaLayout.setVerticalGroup(
            panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_vistaLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_vistaLayout.createSequentialGroup()
                        .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_descripcion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_vistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmodificar)
                    .addComponent(btneliminar)))
        );

        btnsalir.setBackground(new java.awt.Color(0, 102, 102));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setText("VOLVER A MENU");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel1)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(panel_vista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnsalir)
                                .addGap(40, 40, 40)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panel_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_descripcionMouseClicked
        txt_descripcion.setText("");
    }//GEN-LAST:event_txt_descripcionMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if (txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA UNA DESCRIPCION DE ESTADO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            AgregarEstado(txt_descripcion.getText());
            txt_descripcion.setText("");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void tabla_estadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_estadosMouseClicked
        int fila = tabla_estados.getSelectedRow();
        if (fila >= 0) {
            txt_id.setText(tabla_estados.getValueAt(fila, 0).toString());
            txt_descripcion2.setText(tabla_estados.getValueAt(fila, 1).toString());
            btnregistrar.setEnabled(false);
            btnmodificar.setEnabled(true);
            btneliminar.setEnabled(true);
        }
    }//GEN-LAST:event_tabla_estadosMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (txt_descripcion2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA UNA DESCRIPCION DE ESTADO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            ModificarEstado(Integer.parseInt(txt_id.getText()), txt_descripcion2.getText());
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ElimimarEstado();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void Limpiar() {
        txt_id.setText("");
        txt_descripcion2.setText("");
        btnregistrar.setEnabled(true);
        btnmodificar.setEnabled(false);
        btneliminar.setEnabled(false);
    }

    public void AgregarEstado(String descripcion) {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO estado(descripcion)  VALUES(?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM estado WHERE descripcion LIKE '" + descripcion + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "LA DESCRIPCIÓN QUE INGERASTE YA SE ENCUENTRA REGISTRADA", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, descripcion);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "<html><p style = \"  font:30px;  \">REGISTRO EXITOSO</p></html>");
                MostrarEstados();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarEstados() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID ESTADO");
        modelo.addColumn("DESCRIPCION");
        tabla_estados.setModel(modelo);

        try {
            String sql = "SELECT * FROM estado ORDER BY id_estado ASC";
            Statement st;
            ResultSet rs;
            String tipos[] = new String[2];

            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                tipos[0] = rs.getString(1);
                tipos[1] = rs.getString(2);
                modelo.addRow(tipos);
            }
            tabla_estados.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ModificarEstado(int id, String descripcion) {
        PreparedStatement ps;
        String sql = "UPDATE estado SET descripcion='" + descripcion + "' WHERE id_estado='" + id + "'";

        try {
            ps = con.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR EL ESTADO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarEstados();
                Limpiar();
                JOptionPane.showMessageDialog(null, "DATO ACTUALIZADO CORRECTAMENTE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ElimimarEstado() {
        int fila = tabla_estados.getSelectedRow();
        String id = tabla_estados.getValueAt(fila, 0).toString();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("DELETE FROM estado WHERE id_estado='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarEstados();
                Limpiar();
                JOptionPane.showMessageDialog(null, "EL ELEMENTO HA SIDO ELIMINADO");
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
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_registro;
    private javax.swing.JPanel panel_vista;
    private javax.swing.JTable tabla_estados;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
