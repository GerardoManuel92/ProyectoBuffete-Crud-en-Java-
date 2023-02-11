package Formularios;

import java.sql.*;
import ConexionSQL.ConectarBD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmRegistroAudiencia extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmRegistroAudiencia() {
        initComponents();
        MostrarIDAudiencia();
        MostrarRegistros();
        MostrarLugares();
        MostrarResolucion();
        lbl_lugar.setVisible(false);
        lbl_resolucion.setVisible(false);
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
        ((JTextField) this.jd_fecha.getDateEditor()).setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_asuntos = new javax.swing.JTable();
        btn_modifica = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idaudiencia = new javax.swing.JTextField();
        txt_idasunto = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_lugar = new javax.swing.JLabel();
        lbl_resolucion = new javax.swing.JLabel();
        txt_asunto = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btn_buscarasunto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jcb_lugar = new javax.swing.JComboBox<>();
        jcb_resolucion = new javax.swing.JComboBox<>();
        jd_fecha = new com.toedter.calendar.JDateChooser();
        btnsalir = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        tabla_asuntos.setFont(new java.awt.Font("Tahoma", 0, 14));
        tabla_asuntos.setForeground(new java.awt.Color(0, 102, 102));
        tabla_asuntos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tabla_asuntos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_asuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_asuntosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_asuntos);

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btn_modifica)
                        .addGap(41, 41, 41)
                        .addComponent(btn_elimina))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modifica)
                    .addComponent(btn_elimina))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE AUDIENCIAS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ID AUDIENCIA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("LUGAR");

        txt_idaudiencia.setEditable(false);
        txt_idaudiencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idaudiencia.setForeground(new java.awt.Color(0, 102, 102));
        txt_idaudiencia.setText("Id Audiencia");
        txt_idaudiencia.setBorder(null);

        txt_idasunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idasunto.setForeground(new java.awt.Color(0, 51, 51));
        txt_idasunto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txt_hora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_hora.setForeground(new java.awt.Color(0, 51, 51));
        txt_hora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("GUARDAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("HORA");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("RESOLUCION");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("FECHA ");

        lbl_lugar.setText("ID LUGAR");

        lbl_resolucion.setText("ID RESOLUCION");

        txt_asunto.setEditable(false);
        txt_asunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_asunto.setForeground(new java.awt.Color(0, 51, 51));
        txt_asunto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btn_buscarasunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscarasunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasuntoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("ASUNTO");

        jcb_lugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_lugar.setForeground(new java.awt.Color(0, 102, 102));
        jcb_lugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA LUGAR U OFICINA--" }));
        jcb_lugar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_lugarItemStateChanged(evt);
            }
        });
        jcb_lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_lugarActionPerformed(evt);
            }
        });

        jcb_resolucion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_resolucion.setForeground(new java.awt.Color(0, 102, 102));
        jcb_resolucion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA UNA RESOLUCION--" }));
        jcb_resolucion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_resolucionItemStateChanged(evt);
            }
        });
        jcb_resolucion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_resolucionMouseClicked(evt);
            }
        });

        jd_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jd_fecha.setForeground(new java.awt.Color(0, 102, 102));
        jd_fecha.setDateFormatString("yyyy/MM/dd");
        jd_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15))
                .addGap(89, 89, 89)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btn_registrar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcb_resolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_resolucion)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txt_idaudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_lugar))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_asunto, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idasunto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscarasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 52, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jd_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_idaudiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiar))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jcb_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_lugar))
                        .addGap(29, 29, 29)
                        .addComponent(btn_buscarasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_idasunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jd_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcb_resolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_resolucion))
                .addGap(27, 27, 27)
                .addComponent(btn_registrar)
                .addGap(31, 31, 31))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(415, 415, 415))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir)
                        .addGap(66, 66, 66))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir)))
                .addContainerGap(51, Short.MAX_VALUE))
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
        String s = ((JTextField) jd_fecha.getDateEditor().getUiComponent()).getText();
        if (jcb_lugar.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "DEBES ELEGIR UNA OFICINA O LUGAR", "OPCION NO VALIDA", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_lugar.getText().equals("ID LUGAR")) {
            JOptionPane.showMessageDialog(null, "ID DE OFICINA NO VALIDO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_asunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA EL ID DE ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE LA AUDIENCIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_hora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INGRESAR LA HORA DE AUDIENCIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_resolucion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "DEBES ELEGIR UNA RESOLUCION DE AUDIENCIA", "OPCION NO VALIDA", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_resolucion.getText().equals("ID RESOLUCION")) {
            JOptionPane.showMessageDialog(null, "ID DE RESOLUCION NO VALIDO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_lugar = Integer.parseInt(lbl_lugar.getText());
            int id_asunto = Integer.parseInt(txt_asunto.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(jd_fecha.getDate());            
            int hora = Integer.parseInt(txt_hora.getText());
            int id_resolucion = Integer.parseInt(lbl_resolucion.getText());
            Registrar(id_lugar, id_asunto, fecha, hora, id_resolucion);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed

    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btn_buscarasuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasuntoActionPerformed
        if (txt_idasunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE ASUNTO A BUSCAR", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_asunto = Integer.parseInt(txt_idasunto.getText());
            BuscarAsunto(id_asunto);
        }
    }//GEN-LAST:event_btn_buscarasuntoActionPerformed

    private void jcb_lugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_lugarActionPerformed

    }//GEN-LAST:event_jcb_lugarActionPerformed

    private void jcb_resolucionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_resolucionItemStateChanged
        MostrarIDResolucion();
    }//GEN-LAST:event_jcb_resolucionItemStateChanged

    private void jcb_resolucionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_resolucionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_resolucionMouseClicked

    private void jcb_lugarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_lugarItemStateChanged
        MostrarIDLugares();
    }//GEN-LAST:event_jcb_lugarItemStateChanged

    private void tabla_asuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_asuntosMouseClicked

        int fila = tabla_asuntos.getSelectedRow();
        if (fila >= 0) {
            txt_idaudiencia.setText(tabla_asuntos.getValueAt(fila, 0).toString());
            lbl_lugar.setText(tabla_asuntos.getValueAt(fila, 1).toString());
            txt_asunto.setText(tabla_asuntos.getValueAt(fila, 2).toString());
            txt_hora.setText(tabla_asuntos.getValueAt(fila, 4).toString());
            lbl_resolucion.setText(tabla_asuntos.getValueAt(fila, 5).toString());
            Date date;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse((String) tabla_asuntos.getValueAt(fila, 3));
                jd_fecha.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(FrmRegistroAsesoria.class.getName()).log(Level.SEVERE, null, ex);
            }

            LeerLugar();
            LeerResolucion();
            btn_registrar.setEnabled(false);
            btn_modifica.setEnabled(true);
            btn_elimina.setEnabled(true);
        }
    }//GEN-LAST:event_tabla_asuntosMouseClicked

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
        String s = ((JTextField) jd_fecha.getDateEditor().getUiComponent()).getText();
        if (jcb_lugar.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "DEBES ELEGIR UNA OFICINA O LUGAR", "OPCION NO VALIDA", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_lugar.getText().equals("ID LUGAR")) {
            JOptionPane.showMessageDialog(null, "ID DE OFICINA NO VALIDO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_asunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA EL ID DE ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE LA AUDIENCIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_hora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INGRESAR LA HORA DE AUDIENCIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_resolucion.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "DEBES ELEGIR UNA RESOLUCION DE AUDIENCIA", "OPCION NO VALIDA", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_resolucion.getText().equals("ID RESOLUCION")) {
            JOptionPane.showMessageDialog(null, "ID DE RESOLUCION NO VALIDO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_audiencia = Integer.parseInt(txt_idaudiencia.getText());
            int id_lugar = Integer.parseInt(lbl_lugar.getText());
            int id_asunto = Integer.parseInt(txt_asunto.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = sdf.format(jd_fecha.getDate());
            int hora = Integer.parseInt(txt_hora.getText());
            int id_resolucion = Integer.parseInt(lbl_resolucion.getText());
            ModificarRegistro(id_audiencia, id_lugar, id_asunto, fecha, hora, id_resolucion);
        }
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed
        EliminarAsunto();
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void Limpiar() {
        txt_asunto.setText("");
        ((JTextField) jd_fecha.getDateEditor().getUiComponent()).setText("");
        txt_hora.setText("");
        txt_idasunto.setText("");
        txt_idaudiencia.setText("");
        jcb_lugar.setSelectedIndex(0);
        jcb_resolucion.setSelectedIndex(0);
        lbl_lugar.setText("ID LUGAR");
        lbl_resolucion.setText("ID RESOLUCION");
        btn_registrar.setEnabled(true);
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
    }

    private void MostrarIDAudiencia() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT MAX(id_audiencia)+1 as total FROM audiencia";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_idaudiencia.setText(rs.getString("total"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ID AUDIENCIA" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarLugares() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM lugar ORDER BY id_lugar ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_lugar.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LUGARES" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarIDLugares() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_lugar FROM lugar WHERE descripcion='" + jcb_lugar.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_lugar.setText(rs.getString("id_lugar"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LUGARES" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarResolucion() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM resolucion ORDER BY id_resolucion ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_resolucion.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR RESOLUCION" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarIDResolucion() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_resolucion FROM resolucion WHERE descripcion='" + jcb_resolucion.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_resolucion.setText(rs.getString("id_resolucion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LUGARES" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarAsunto(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select id_asunto from asunto where id_asunto='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_asunto.setText(rs.getString("id_asunto"));
            } else {
                JOptionPane.showMessageDialog(null, "ASUNTO NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Registrar(int lugar, int asunto, String fecha, int hora, int resolucion) {
        PreparedStatement ps;
        String sql = "INSERT INTO audiencia (id_lugar, id_asunto, fecha, hora, id_resolucion) VALUES(?,?,?,?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, lugar);
            ps.setInt(2, asunto);
            ps.setString(3, fecha);
            ps.setInt(4, hora);
            ps.setInt(5, resolucion);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO CORRECTAMENTE");
            MostrarRegistros();
            Limpiar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarRegistros() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("AUDIENCIA");
        modelo.addColumn("LUGAR U OFICINA");
        modelo.addColumn("ASUNTO");
        modelo.addColumn("FECHA");
        modelo.addColumn("HORA");
        modelo.addColumn("RESOLUCIÓN");
        tabla_asuntos.setModel(modelo);
        String datos[] = new String[6];
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM audiencia";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                modelo.addRow(datos);
            }
            tabla_asuntos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR REGISTROS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ModificarRegistro(int audiencia, int lugar, int asunto, String fecha, int hora, int resolucion) {
        PreparedStatement ps;
        String sql = "UPDATE audiencia SET id_lugar='" + lugar + "', id_asunto='" + asunto + "', fecha='" + fecha + "', hora='" + hora + "', id_resolucion='" + resolucion
                + "'WHERE id_audiencia='" + audiencia + "'";
        try {
            ps = cn.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR ESTA AUDIENCIA?", "CONFIRMACION", 0);
            if (s == 0) {
                ps.executeUpdate();
                MostrarRegistros();
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
                Limpiar();
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR REGISTRO" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void EliminarAsunto() {
        PreparedStatement pst = null;
        int fila = tabla_asuntos.getSelectedRow();
        String id = tabla_asuntos.getValueAt(fila, 0).toString();
        try {
            pst = cn.prepareStatement("DELETE FROM audiencia WHERE id_audiencia='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR A ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarRegistros();
                JOptionPane.showMessageDialog(null, "LA AUDIENCIA SE HA ELIMINADO");
                Limpiar();
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, NO PODEMOS ELIMINAR A ESTE ELEMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void LeerLugar() {
        Statement st;
        ResultSet rs;
        String sql = "select descripcion from lugar where id_lugar='" + lbl_lugar.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_lugar.setSelectedItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LEER LUGAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerResolucion() {
        Statement st;
        ResultSet rs;
        String sql = "select descripcion from resolucion where id_resolucion='" + lbl_resolucion.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_resolucion.setSelectedItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LEER RESOLUCION" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btn_buscarasunto;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_lugar;
    private javax.swing.JComboBox<String> jcb_resolucion;
    private com.toedter.calendar.JDateChooser jd_fecha;
    private javax.swing.JLabel lbl_lugar;
    private javax.swing.JLabel lbl_resolucion;
    private javax.swing.JTable tabla_asuntos;
    private javax.swing.JTextField txt_asunto;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_idasunto;
    private javax.swing.JTextField txt_idaudiencia;
    // End of variables declaration//GEN-END:variables
}
