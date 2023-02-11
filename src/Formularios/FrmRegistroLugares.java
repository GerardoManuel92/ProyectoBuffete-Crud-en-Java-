package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroLugares extends javax.swing.JInternalFrame {

    ConectarBD conbd = new ConectarBD();
    Connection con = conbd.conexion();

    public FrmRegistroLugares() {
        initComponents();
        MostrarLugar();
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
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DE OFICINAS O JUZGADOS");

        panel_registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_registro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR NUEVO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("OFICINA O JUZGADO");

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
                .addContainerGap()
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnregistrar)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(btnregistrar)
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen11.jpg"))); // NOI18N

        panel_vista.setBackground(new java.awt.Color(255, 255, 255));
        panel_vista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE DE TIPOS DE MEDIO REGISTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        tabla_estados.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
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

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
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
                                .addComponent(btnlimpiar)))
                        .addGap(0, 254, Short.MAX_VALUE)))
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
                    .addComponent(btnlimpiar))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(panel_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnsalir)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(73, 73, 73)
                    .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(385, Short.MAX_VALUE)))
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

    private void txt_descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_descripcionMouseClicked
        txt_descripcion.setText("");
    }//GEN-LAST:event_txt_descripcionMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if (txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL NOMBRE DE OFICINA O LUGAR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            AgregarLugar(txt_descripcion.getText());
            txt_descripcion.setText("");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void tabla_estadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_estadosMouseClicked
        int fila = tabla_estados.getSelectedRow();
        if (fila >= 0) {
            txt_id.setText(tabla_estados.getValueAt(fila, 0).toString());
            txt_descripcion2.setText(tabla_estados.getValueAt(fila, 1).toString());
        }
    }//GEN-LAST:event_tabla_estadosMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (txt_descripcion2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL NOMBRE DE OFICINA O LUGAR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            ModificarLugar(Integer.parseInt(txt_id.getText()), txt_descripcion2.getText());
            txt_descripcion.setText("");
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ElimimarLugar();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        txt_id.setText("");
        txt_descripcion2.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void Limpiar(){
        txt_id.setText("");
        txt_descripcion.setText("");
        txt_id.setText("");
    }
    public void AgregarLugar(String descripcion) {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO lugar(descripcion)  VALUES(?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM lugar WHERE descripcion LIKE '" + descripcion + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "LA OFICINA O JUZGADO QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, descripcion);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "<html><p style = \"  color: green; font:20px;  \">REGISTRO EXITOSO</p></html>");
                MostrarLugar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarLugar() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID LUGAR");
        modelo.addColumn("DESCRIPCION");
        tabla_estados.setModel(modelo);

        try {
            String sql = "SELECT * FROM lugar ORDER BY id_lugar ASC";
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

    public void ModificarLugar(int id, String descripcion) {
        PreparedStatement ps;
        String sql = "UPDATE lugar SET descripcion='" + descripcion + "' WHERE id_lugar='" + id + "'";

        try {
            ps = con.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR LOS DATOS DE ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarLugar();
                JOptionPane.showMessageDialog(null, "DATO ACTUALIZADO CORRECTAMENTE");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ElimimarLugar() {
        int fila = tabla_estados.getSelectedRow();
        String id = tabla_estados.getValueAt(fila, 0).toString();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("DELETE FROM lugar WHERE id_lugar='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarLugar();
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
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnlimpiar;
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
