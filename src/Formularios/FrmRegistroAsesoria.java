package Formularios;

import java.sql.*;
import java.util.Date;
import ConexionSQL.ConectarBD;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroAsesoria extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmRegistroAsesoria() {
        initComponents();
        MostrarRegistros();
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
        ((JTextField) this.jd_fecha.getDateEditor()).setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_asesor = new javax.swing.JTextField();
        txt_hora = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_datosasesor = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btn_buscarasesor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt_asesorado = new javax.swing.JTextField();
        btn_buscarasesorado = new javax.swing.JButton();
        txt_datosasesorado = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_idasunto = new javax.swing.JTextField();
        btn_buscarasunto = new javax.swing.JButton();
        txt_datoasunto = new javax.swing.JTextField();
        txt_tema = new javax.swing.JTextField();
        jd_fecha = new com.toedter.calendar.JDateChooser();
        btnsalir = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();
        btn_modifica = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_asuntos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE ASESORIAS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("ABOGADO ASESOR");

        txt_asesor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_asesor.setForeground(new java.awt.Color(0, 51, 51));
        txt_asesor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

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
        jLabel7.setText("TEMA A TRATAR:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("FECHA");

        txt_datosasesor.setEditable(false);
        txt_datosasesor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datosasesor.setForeground(new java.awt.Color(0, 51, 51));
        txt_datosasesor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btn_buscarasesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscarasesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasesorActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("ABOGADO ASESORADO");

        txt_asesorado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_asesorado.setForeground(new java.awt.Color(0, 51, 51));
        txt_asesorado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_buscarasesorado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscarasesorado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasesoradoActionPerformed(evt);
            }
        });

        txt_datosasesorado.setEditable(false);
        txt_datosasesorado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datosasesorado.setForeground(new java.awt.Color(0, 51, 51));
        txt_datosasesorado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 153));
        jLabel16.setText("ASUNTO");

        txt_idasunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idasunto.setForeground(new java.awt.Color(0, 51, 51));
        txt_idasunto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_buscarasunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscarasunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarasuntoActionPerformed(evt);
            }
        });

        txt_datoasunto.setEditable(false);
        txt_datoasunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datoasunto.setForeground(new java.awt.Color(0, 51, 51));
        txt_datoasunto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txt_tema.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_tema.setForeground(new java.awt.Color(0, 51, 51));
        txt_tema.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jd_fecha.setBackground(new java.awt.Color(255, 255, 255));
        jd_fecha.setForeground(new java.awt.Color(0, 102, 102));
        jd_fecha.setDateFormatString("yyyy/MM/dd");
        jd_fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_idasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_buscarasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_datoasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel16)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_tema, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_buscarasesor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jd_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_registrar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_datosasesorado, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addComponent(txt_asesorado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_buscarasesorado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_datosasesor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(48, 48, 48))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_asesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscarasesor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_datosasesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(txt_asesorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscarasesorado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txt_datosasesorado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_idasunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscarasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_datoasunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_tema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnlimpiar))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jd_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_registrar)
                .addGap(43, 43, 43))
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

        btn_elimina.setBackground(new java.awt.Color(0, 102, 102));
        btn_elimina.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_elimina.setText("ELIMINAR REGISTRO");
        btn_elimina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminaActionPerformed(evt);
            }
        });

        btn_modifica.setBackground(new java.awt.Color(0, 102, 102));
        btn_modifica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_modifica.setText("MODIFICAR REGISTRO");
        btn_modifica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificaActionPerformed(evt);
            }
        });

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen16.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnsalir)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_modifica)
                                .addGap(36, 36, 36)
                                .addComponent(btn_elimina)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_modifica)
                            .addComponent(btn_elimina))
                        .addGap(36, 36, 36)
                        .addComponent(btnsalir)))
                .addContainerGap(38, Short.MAX_VALUE))
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

    private void tabla_asuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_asuntosMouseClicked

        int fila = tabla_asuntos.getSelectedRow();
        if (fila >= 0) {
            txt_asesor.setText(tabla_asuntos.getValueAt(fila, 0).toString());
            txt_asesorado.setText(tabla_asuntos.getValueAt(fila, 1).toString());
            txt_idasunto.setText(tabla_asuntos.getValueAt(fila, 2).toString());
            txt_tema.setText(tabla_asuntos.getValueAt(fila, 3).toString());
            txt_hora.setText(tabla_asuntos.getValueAt(fila, 4).toString());
            Date date;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse((String)tabla_asuntos.getValueAt(fila, 5));
                jd_fecha.setDate(date);
            } catch (ParseException ex) {
                Logger.getLogger(FrmRegistroAsesoria.class.getName()).log(Level.SEVERE, null, ex);
            }            
            LeerAsesor();
            LeerAsesorado();
            LeerAsunto();
            btn_registrar.setEnabled(false);
            btn_modifica.setEnabled(true);
            btn_elimina.setEnabled(true);
        }
    }//GEN-LAST:event_tabla_asuntosMouseClicked

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
       String s=((JTextField) jd_fecha.getDateEditor().getUiComponent()).getText();
        if (txt_asesor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA INGRESAR ID DE ASESOR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_asesorado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA INGRESAR ID DE ASESORADO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_idasunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA EL ID DE ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        }else if (txt_datoasunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ID DE ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_tema.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA EL TEMA DE LA ASESORIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_hora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA LA HORA DE LA ASESORIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE LA ASESORIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_asesor = Integer.parseInt(txt_asesor.getText());
            int id_asesorado = Integer.parseInt(txt_asesorado.getText());
            int id_asunto = Integer.parseInt(txt_idasunto.getText());
            String tema = txt_tema.getText();
            int hora = Integer.parseInt(txt_hora.getText());
             SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jd_fecha.getDate());
            ModificarRegistro(id_asesor, id_asesorado, id_asunto, tema, hora, date);
        }
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed
        EliminarAsesoria();
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String s=((JTextField) jd_fecha.getDateEditor().getUiComponent()).getText();
        if (txt_asesor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA INGRESAR ID DE ASESOR", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_asesorado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA INGRESAR ID DE ASESORADO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_idasunto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESAR EL NOMBRE COMPLETO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_tema.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA EL TEMA DE LA ASESORIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_hora.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESA LA HORA DE LA ASESORIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (s.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE LA ASESORIA", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_asesor = Integer.parseInt(txt_asesor.getText());
            int id_asesorado = Integer.parseInt(txt_asesorado.getText());
            int id_asunto = Integer.parseInt(txt_idasunto.getText());
            String tema = txt_tema.getText();
            int hora = Integer.parseInt(txt_hora.getText());
           SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(jd_fecha.getDate());
            Registrar(id_asesor, id_asesorado, id_asunto, tema, hora, date);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btn_buscarasesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasesorActionPerformed
        int id_asesor = Integer.parseInt(txt_asesor.getText());
        BuscarAsesor(id_asesor);
    }//GEN-LAST:event_btn_buscarasesorActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btn_buscarasesoradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasesoradoActionPerformed
        int id_asesor = Integer.parseInt(txt_asesor.getText());
        int id_asesorado = Integer.parseInt(txt_asesorado.getText());
        if (id_asesorado == id_asesor) {
            JOptionPane.showMessageDialog(null, "AL ABOGADO NO PUEDE ASESORARSE A SI MISMO", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        } else {
            BuscarAsesorado(id_asesorado);
        }
    }//GEN-LAST:event_btn_buscarasesoradoActionPerformed

    private void btn_buscarasuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarasuntoActionPerformed
        int id_asunto = Integer.parseInt(txt_idasunto.getText());
        BuscarAsunto(id_asunto);
    }//GEN-LAST:event_btn_buscarasuntoActionPerformed

    private void Limpiar() {
        ((JTextField) jd_fecha.getDateEditor().getUiComponent()).setText("");
        txt_asesor.setText("");
        txt_asesorado.setText("");
        txt_datoasunto.setText("");
        txt_datosasesorado.setText("");
        txt_datosasesor.setText("");        
        txt_hora.setText("");
        txt_idasunto.setText("");
        txt_tema.setText("");
        btn_registrar.setEnabled(true);
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
    }

    private void BuscarAsesor(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select paterno, materno, nombre from abogado where id_abogado='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosasesor.setText(rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "ABOGADO NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_asesor.setText("");
                txt_datosasesor.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarAsesorado(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select paterno, materno, nombre from abogado where id_abogado='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosasesorado.setText(rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            } else {
                JOptionPane.showMessageDialog(null, "ABOGADO NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_asesorado.setText("");
                txt_datosasesorado.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
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
                txt_datoasunto.setText(rs.getString("id_asunto"));
            } else {
                JOptionPane.showMessageDialog(null, "ASUNTO NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_idasunto.setText("");
                txt_datoasunto.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL BUSCAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Registrar(int asesor, int asesorado, int asunto, String tema, int hora, String fecha) {
        PreparedStatement ps;
        String sql = "INSERT INTO asesoria VALUES(?,?,?,?,?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, asesor);
            ps.setInt(2, asesorado);
            ps.setInt(3, asunto);
            ps.setString(4, tema);
            ps.setInt(5, hora);
            ps.setString(6, fecha);
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
        modelo.addColumn("ASESOR");
        modelo.addColumn("ASESORADO");
        modelo.addColumn("ASUNTO");
        modelo.addColumn("TEMA");
        modelo.addColumn("FECHA");
        modelo.addColumn("HORA");
        tabla_asuntos.setModel(modelo);
        String datos[] = new String[6];
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM asesoria";
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

    private void ModificarRegistro(int asesor, int asesorado, int asunto, String tema, int hora, String fecha) {
        PreparedStatement ps;
        String sql = "UPDATE asesoria SET asesorado='" + asesorado + "', id_asunto='" + asunto + "', tema='" + tema + "', hora='" + hora + "', fecha='" + fecha
                + "'WHERE asesor='" + asesor + "'";
        try {
            ps = cn.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR LA ASESORIA?", "CONFIRMACION", 0);
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

    private void EliminarAsesoria() {
        PreparedStatement pst = null;
        int fila = tabla_asuntos.getSelectedRow();
        String id = tabla_asuntos.getValueAt(fila, 0).toString();
        try {
            pst = cn.prepareStatement("DELETE FROM asesoria WHERE asesor='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR A ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarRegistros();
                JOptionPane.showMessageDialog(null, "LA ASESORIA SE HA ELIMINADO");
                Limpiar();
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, NO PODEMOS ELIMINAR A ESTE ELEMENTO" + ex, "ERROR", JOptionPane.ERROR_MESSAGE);

        }
    }

    private void LeerAsesor() {
        Statement st;
        ResultSet rs;
        String sql = "select paterno, materno, nombre from abogado where id_abogado='" + txt_asesor.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_datosasesor.setText(rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LEER DATOS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerAsesorado() {
        Statement st;
        ResultSet rs;
        String sql = "select paterno, materno, nombre from abogado where id_abogado='" + txt_asesorado.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_datosasesorado.setText(rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LEER DATOS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerAsunto() {
        Statement st;
        ResultSet rs;
        String sql = "select id_asunto from asunto where id_asunto='" + txt_idasunto.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_datoasunto.setText(rs.getString("id_asunto"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL LEER DATOS" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JButton btn_buscarasesor;
    private javax.swing.JButton btn_buscarasesorado;
    private javax.swing.JButton btn_buscarasunto;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jd_fecha;
    private javax.swing.JTable tabla_asuntos;
    private javax.swing.JTextField txt_asesor;
    private javax.swing.JTextField txt_asesorado;
    private javax.swing.JTextField txt_datoasunto;
    private javax.swing.JTextField txt_datosasesor;
    private javax.swing.JTextField txt_datosasesorado;
    private javax.swing.JTextField txt_hora;
    private javax.swing.JTextField txt_idasunto;
    private javax.swing.JTextField txt_tema;
    // End of variables declaration//GEN-END:variables
}
