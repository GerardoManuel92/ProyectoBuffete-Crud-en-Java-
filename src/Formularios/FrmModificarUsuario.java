package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import javax.swing.JOptionPane;

public class FrmModificarUsuario extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmModificarUsuario() {
        initComponents();
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        btn_modificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        txt_confirm_password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btn_busqueda = new javax.swing.JButton();
        txt_busqueda = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESE DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("INGRESA EL ID DE USUARIO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("PASSWORD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("CONFIRMAR PASSWORD");

        txt_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(0, 102, 102));

        btn_modificar.setBackground(new java.awt.Color(0, 153, 153));
        btn_modificar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("MODIFICAR");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("NOMBRE (S)");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("APELLIDO PATERNO");

        txt_paterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_paterno.setForeground(new java.awt.Color(0, 102, 102));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("APELLIDO MATERNO");

        txt_materno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_materno.setForeground(new java.awt.Color(0, 102, 102));

        txt_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(0, 102, 102));

        txt_confirm_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_confirm_password.setForeground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("NOMBRE DE USUARIO");

        btn_busqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_busquedaActionPerformed(evt);
            }
        });

        txt_busqueda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_busqueda.setForeground(new java.awt.Color(0, 102, 102));

        btn_eliminar.setBackground(new java.awt.Color(0, 153, 153));
        btn_eliminar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(0, 153, 153));
        btn_limpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_busqueda)
                                .addGap(18, 18, 18)
                                .addComponent(btn_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_confirm_password)
                            .addComponent(txt_materno)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(btn_limpiar)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_modificar))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(btn_eliminar)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("CONSULTA DE USUARIOS EN SISTEMA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnsalir)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jLabel7))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir)
                .addGap(16, 16, 16))
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

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (txt_usuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR UN ID DE USUARIO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR NOMBRE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_paterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR APELLIDO PATERNO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_materno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR APELLIDO MATERNO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR UN PASSWORD", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_confirm_password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE CONFIRMAR SU PASSWORD", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            String usuario = txt_usuario.getText();
            String nombre = txt_nombre.getText();
            String paterno = txt_paterno.getText();
            String materno = txt_materno.getText();
            String password = txt_password.getText();
            if (txt_confirm_password.getText().equals(txt_password.getText())) {
                ModificarUsuario(usuario, nombre, paterno, materno, password);
            } else {
                JOptionPane.showMessageDialog(null, "LAS CONTRASEÑAS NO COINCIDEN", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btn_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_busquedaActionPerformed
        if (txt_busqueda.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE USUARIO PARA PODER BUSCAR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            String dato = txt_busqueda.getText();
            Buscar(dato);
        }
    }//GEN-LAST:event_btn_busquedaActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        EliminarUsuario(txt_busqueda.getText());
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void Buscar(String dato) {
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM usuarios WHERE id_usuario='" + dato + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                txt_usuario.setText(rs.getString("id_usuario"));
            txt_nombre.setText(rs.getString("nombre"));
            txt_paterno.setText(rs.getString("paterno"));
            txt_materno.setText(rs.getString("materno"));
            txt_password.setText(rs.getString("password"));
            txt_confirm_password.setText(txt_password.getText());
            btn_modificar.setEnabled(true);
            btn_eliminar.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "NO SE ENCONTRO ESTE ID DE USUARIO REGISTRADO EN SISTEMA" , "VALOR NO ENCONTRADO", JOptionPane.ERROR_MESSAGE);
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ModificarUsuario(String id, String nombre, String paterno, String materno, String password) {
        PreparedStatement ps;
        String sql = "UPDATE usuarios SET id_usuario='" + id + "', nombre='" + nombre + "', paterno='" + paterno + "', materno='" + materno + "', password='" + password
                + "' WHERE id_usuario='" + id + "'";
        try {
            int s = JOptionPane.showConfirmDialog(null, "¿DESEAS GUARDAR LOS CAMBIOS REALIZADOS?", "CONFIRMACION", 0);
            if (s == 0) {
                ps = cn.prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "LOS DATOS DEL USUARIO HAN SIDO MODIFICADOS CORRECTAMENTE");
                Limpiar();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR USUARIO" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void EliminarUsuario(String dato) {
        PreparedStatement ps;
        String sql = "DELETE FROM usuarios WHERE id_usuario='" + dato + "'";
        try {
            int s = JOptionPane.showConfirmDialog(null, "SE ELIMINARAN TODOS LOS DATOS DEL USUARIO DEL SISTEMA, ¿ESTAS SEGURO QUE DESEAS CONTINUAR?", "CONFIRMACION", 0);
            if (s == 0) {
                ps = cn.prepareStatement(sql);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "EL USUARIO HA SIDO ELIMINADO DEL SISTEMA");
                Limpiar();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR AL USUARIO" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void Limpiar() {
        txt_busqueda.setText("");
        txt_confirm_password.setText("");
        txt_materno.setText("");
        txt_nombre.setText("");
        txt_password.setText("");
        txt_paterno.setText("");
        txt_usuario.setText("");        
        btn_modificar.setEnabled(false);
        btn_eliminar.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_busqueda;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JPasswordField txt_confirm_password;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
