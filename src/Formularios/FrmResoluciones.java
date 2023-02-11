package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

public class FrmResoluciones extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection con = condb.conexion();

    public FrmResoluciones() {
        initComponents();
        MostrarResolucion();
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(false);
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
        tabla_grados = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_descripcion2 = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("REGISTRO DE RESOLUCIONES DE CASOS");

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
                .addContainerGap()
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnregistrar)
                    .addGroup(panel_registroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panel_registroLayout.setVerticalGroup(
            panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_registroLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panel_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnregistrar)
                .addGap(25, 25, 25))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen10.jpg"))); // NOI18N

        panel_vista.setBackground(new java.awt.Color(255, 255, 255));
        panel_vista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETALLE DE TIPOS DE MEDIO REGISTRADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        tabla_grados.setFont(new java.awt.Font("Tahoma", 0, 16));
        tabla_grados.setForeground(new java.awt.Color(0, 102, 102));
        tabla_grados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tabla_grados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_grados.setRowHeight(30);
        tabla_grados.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tabla_grados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_gradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_grados);

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
                        .addGap(0, 90, Short.MAX_VALUE)))
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addGap(20, 20, 20))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panel_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(417, 417, 417)
                            .addComponent(jLabel4)))
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(btnsalir)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 49, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_vista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 55, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_descripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_descripcionMouseClicked
        txt_descripcion.setText("");
    }//GEN-LAST:event_txt_descripcionMouseClicked

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if (txt_descripcion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INGRESAR EL NOMBRE DE TIPO DE ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            AgregarResolucion(txt_descripcion.getText());
            txt_descripcion.setText("");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void tabla_gradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_gradosMouseClicked
        int fila = tabla_grados.getSelectedRow();
        if (fila >= 0) {
            txt_id.setText(tabla_grados.getValueAt(fila, 0).toString());
            txt_descripcion2.setText(tabla_grados.getValueAt(fila, 1).toString());
            btneliminar.setEnabled(true);
            btnmodificar.setEnabled(true);
            btnregistrar.setEnabled(false);
        }
    }//GEN-LAST:event_tabla_gradosMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (txt_id.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO EXISTE UN ID DISPONIBLE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_descripcion2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INGRESAR UNA DESCRIPCION DE RESOLUCION", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            ModificarResolucion(Integer.parseInt(txt_id.getText()), txt_descripcion2.getText());
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        ElimimarResolucion();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void Limpiar() {
        txt_descripcion.setText("");
        txt_descripcion2.setText("");
        txt_id.setText("");
        btneliminar.setEnabled(false);
        btnmodificar.setEnabled(false);
        btnregistrar.setEnabled(true);
    }

    public void AgregarResolucion(String descripcion) {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO resolucion(descripcion)  VALUES(?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM resolucion WHERE descripcion LIKE '" + descripcion + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "LA DESCRIPCIÓN QUE INGERASTE YA SE ENCUENTRA REGISTRADA", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, descripcion);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
                MostrarResolucion();
                Limpiar();
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarResolucion() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID RESOLUCION");
        modelo.addColumn("DESCRIPCION");
        tabla_grados.setModel(modelo);

        try {
            String sql = "SELECT * FROM resolucion ORDER BY id_resolucion ASC";
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
            tabla_grados.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ModificarResolucion(int id, String descripcion) {
        PreparedStatement ps;
        String sql = "UPDATE resolucion SET descripcion='" + descripcion + "' WHERE id_resolucion='" + id + "'";

        try {
            ps = con.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarResolucion();
                JOptionPane.showMessageDialog(null, "DATO ACTUALIZADO CORRECTAMENTE");
                Limpiar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void ElimimarResolucion() {
        int fila = tabla_grados.getSelectedRow();
        String id = tabla_grados.getValueAt(fila, 0).toString();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement("DELETE FROM resolucion WHERE id_resolucion='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarResolucion();
                JOptionPane.showMessageDialog(null, "EL ELEMENTO HA SIDO ELIMINADO");
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
    private javax.swing.JTable tabla_grados;
    private javax.swing.JTextField txt_descripcion;
    private javax.swing.JTextField txt_descripcion2;
    private javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
