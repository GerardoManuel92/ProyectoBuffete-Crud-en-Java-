package Formularios;

import java.util.Calendar;
import java.util.Date;
import java.sql.*;
import ConexionSQL.ConectarBD;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmRegistroAsunto extends javax.swing.JInternalFrame {

    ConectarBD condb = new ConectarBD();
    Connection cn = condb.conexion();

    public FrmRegistroAsunto() {
        initComponents();
        MostrarIDAsunto();
        MostrarEstados();
        MostrarTipos();
        MostrarAsuntos();
        lbl_estado.setVisible(false);
        lbl_tipo.setVisible(false);
        txt_iddemandado.setEnabled(false);
        txt_datosdemandado.setEnabled(false);
        txt_idabogado.setEnabled(false);
        txt_datosdemandado.setEnabled(false);
        jcb_estado.setEnabled(false);
        jcb_tipo_persona.setEnabled(false);       
        btn_modifica.setEnabled(false);
        btn_elimina.setEnabled(false);
        ((JTextField) this.jd_fecha_inicio.getDateEditor()).setEnabled(false);
        ((JTextField) this.jd_fecha_termino.getDateEditor()).setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idasunto = new javax.swing.JTextField();
        txt_idcliente = new javax.swing.JTextField();
        txt_iddemandado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idabogado = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JButton();
        jcb_estado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_estado = new javax.swing.JLabel();
        lbl_tipo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_datoscliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_datosdemandado = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_datosabogado = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        btn_buscardemandado = new javax.swing.JButton();
        btn_buscarcliente = new javax.swing.JButton();
        btn_abogado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jcb_tipo_persona = new javax.swing.JComboBox<>();
        jcb_tipo = new javax.swing.JComboBox<>();
        jd_fecha_inicio = new com.toedter.calendar.JDateChooser();
        jd_fecha_termino = new com.toedter.calendar.JDateChooser();
        btnsalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taba_asuntos = new javax.swing.JTable();
        btn_modifica = new javax.swing.JButton();
        btn_elimina = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE ASUNTOS");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ID ASUNTO");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("ID CLIENTE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("TIPO PERSONA DEMANDADA");

        txt_idasunto.setEditable(false);
        txt_idasunto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idasunto.setForeground(new java.awt.Color(0, 102, 102));
        txt_idasunto.setText("Id asunto");
        txt_idasunto.setBorder(null);

        txt_idcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idcliente.setForeground(new java.awt.Color(0, 51, 51));
        txt_idcliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txt_iddemandado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_iddemandado.setForeground(new java.awt.Color(0, 51, 51));
        txt_iddemandado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("ESTADO");

        txt_idabogado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_idabogado.setForeground(new java.awt.Color(0, 51, 51));
        txt_idabogado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("GUARDAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        jcb_estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_estado.setForeground(new java.awt.Color(0, 102, 102));
        jcb_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA UN ESTADO--" }));
        jcb_estado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_estadoItemStateChanged(evt);
            }
        });
        jcb_estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_estadoMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("ID ABOGADO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("TIPO:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("FECHA INICIO");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("FECHA DE TERMINO");

        lbl_estado.setText("ID ESTADO");

        lbl_tipo.setText("ID TIPO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 153));
        jLabel12.setText("DATOS DEMANDADO");

        txt_datoscliente.setEditable(false);
        txt_datoscliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datoscliente.setForeground(new java.awt.Color(0, 51, 51));
        txt_datoscliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 153));
        jLabel13.setText("DATOS CLIENTE");

        txt_datosdemandado.setEditable(false);
        txt_datosdemandado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datosdemandado.setForeground(new java.awt.Color(0, 51, 51));
        txt_datosdemandado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setText("DATOS ABOGADO");

        txt_datosabogado.setEditable(false);
        txt_datosabogado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_datosabogado.setForeground(new java.awt.Color(0, 51, 51));
        txt_datosabogado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btn_buscardemandado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscardemandado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscardemandadoActionPerformed(evt);
            }
        });

        btn_buscarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_buscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarclienteActionPerformed(evt);
            }
        });

        btn_abogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        btn_abogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abogadoActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 153, 153));
        jLabel15.setText("ID DEMANDADO");

        jcb_tipo_persona.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tipo_persona.setForeground(new java.awt.Color(0, 102, 102));
        jcb_tipo_persona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA TIPO DE PERSONA--", "FISICA", "MORAL" }));
        jcb_tipo_persona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_tipo_personaActionPerformed(evt);
            }
        });

        jcb_tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tipo.setForeground(new java.awt.Color(0, 102, 102));
        jcb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA UN TIPO--" }));
        jcb_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tipoItemStateChanged(evt);
            }
        });
        jcb_tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_tipoMouseClicked(evt);
            }
        });

        jd_fecha_inicio.setBackground(new java.awt.Color(255, 255, 255));
        jd_fecha_inicio.setForeground(new java.awt.Color(0, 153, 153));
        jd_fecha_inicio.setDateFormatString("yyyy/MM/dd");
        jd_fecha_inicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jd_fecha_termino.setBackground(new java.awt.Color(255, 255, 255));
        jd_fecha_termino.setForeground(new java.awt.Color(0, 153, 153));
        jd_fecha_termino.setDateFormatString("yyyy/MM/dd");
        jd_fecha_termino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_registrar)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_tipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txt_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jcb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_estado))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_iddemandado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_buscardemandado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_idabogado, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_abogado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(txt_idasunto, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                            .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txt_datosabogado, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_datosdemandado, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_datoscliente, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(lbl_tipo))
                            .addComponent(jd_fecha_termino, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jd_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_idasunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpiar))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel3)
                                                .addComponent(txt_idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_buscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel13)
                                            .addComponent(txt_datoscliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(jcb_tipo_persona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_iddemandado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel15)))
                                    .addComponent(btn_buscardemandado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txt_datosdemandado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jcb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_estado))
                                    .addComponent(jLabel5))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(txt_idabogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_abogado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_datosabogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_tipo)
                            .addComponent(jcb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jd_fecha_inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jd_fecha_termino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(btn_registrar)
                .addGap(1, 1, 1))
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTROS ALMACENADOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16), new java.awt.Color(0, 102, 102))); // NOI18N

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
        ));
        taba_asuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taba_asuntosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(taba_asuntos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(433, 433, 433)
                                .addComponent(btnsalir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_modifica)
                                .addGap(30, 30, 30)
                                .addComponent(btn_elimina))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_elimina)
                            .addComponent(btn_modifica))
                        .addGap(39, 39, 39)
                        .addComponent(btnsalir)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
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
        String f_ini = ((JTextField) jd_fecha_inicio.getDateEditor().getUiComponent()).getText();
        String f_ter = ((JTextField) jd_fecha_termino.getDateEditor().getUiComponent()).getText();
       
        if (txt_idcliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE CLIENTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txt_iddemandado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE DEMANDADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_estado.getText().equals("ID ESTADO")) {
            JOptionPane.showMessageDialog(null, "ID DE ESTADO NO VALIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_tipo_persona.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONA EL TIPO DE PERSONA DEMANDADA", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txt_iddemandado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE DEMANDADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txt_idabogado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE ABOGADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_tipo.getText().equals("ID TIPO")) {
            JOptionPane.showMessageDialog(null, "ID DE TIPO NO VALIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (f_ini.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE INICIO DEL ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (f_ter.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE TERMINO DEL ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_cliente = Integer.parseInt(txt_idcliente.getText());
            int id_demandado = Integer.parseInt(txt_iddemandado.getText());
            int id_estado = Integer.parseInt(lbl_estado.getText());
            int id_abogado = Integer.parseInt(txt_idabogado.getText());
            int id_tipo = Integer.parseInt(lbl_tipo.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicio = sdf.format(jd_fecha_inicio.getDate());
            String fecha_termino = sdf.format(jd_fecha_termino.getDate());            
            RegistrarAsunto(id_cliente, id_demandado, id_estado, id_abogado, id_tipo, fecha_inicio, fecha_termino);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
        DeshabilitarCampos();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
        HabilitarMenu();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btn_buscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarclienteActionPerformed
        if (txt_idcliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE CLIENTE QUE DESEAS BUSCAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_cliente = Integer.parseInt(txt_idcliente.getText());
            BuscarCliente(id_cliente);
        }
    }//GEN-LAST:event_btn_buscarclienteActionPerformed

    private void jcb_tipo_personaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tipo_personaActionPerformed

    }//GEN-LAST:event_jcb_tipo_personaActionPerformed

    private void btn_buscardemandadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscardemandadoActionPerformed
        if (txt_iddemandado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE DEMANDADO QUE DESEAS BUSCAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_demandado = Integer.parseInt(txt_iddemandado.getText());
            if (jcb_tipo_persona.getSelectedIndex() == 1) {
                BuscarPersonaDemandada(id_demandado);
            } else if (jcb_tipo_persona.getSelectedIndex() == 2) {
                BuscarEmpresaDemandada(id_demandado);
            } else {
                JOptionPane.showMessageDialog(null, "POR FAVOR ELIJA EL TIPO DE PERSONA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_buscardemandadoActionPerformed

    private void jcb_estadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_estadoItemStateChanged
        MostrarIDEstados();
        txt_idabogado.setEnabled(true);
    }//GEN-LAST:event_jcb_estadoItemStateChanged

    private void jcb_estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_estadoMouseClicked

    }//GEN-LAST:event_jcb_estadoMouseClicked

    private void btn_abogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abogadoActionPerformed
        if (txt_idabogado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE ABOGADO QUE DESEAS BUSCAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_abogado = Integer.parseInt(txt_idabogado.getText());
            BuscarAbogado(id_abogado);
        }
    }//GEN-LAST:event_btn_abogadoActionPerformed

    private void jcb_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tipoItemStateChanged
        MostrarIDTipo();
        jd_fecha_inicio.setEnabled(true);
        jd_fecha_termino.setEnabled(true);
    }//GEN-LAST:event_jcb_tipoItemStateChanged

    private void jcb_tipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_tipoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_tipoMouseClicked

    private void btn_modificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificaActionPerformed
        String f_ini = ((JTextField) jd_fecha_inicio.getDateEditor().getUiComponent()).getText();
        String f_ter = ((JTextField) jd_fecha_termino.getDateEditor().getUiComponent()).getText();
        if (txt_idcliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE CLIENTE", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txt_iddemandado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE DEMANDADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_estado.getText().equals("ID ESTADO")) {
            JOptionPane.showMessageDialog(null, "ID DE ESTADO NO VALIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (jcb_tipo_persona.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONA EL TIPO DE PERSONA DEMANDADA", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txt_iddemandado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE DEMANDADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (txt_idabogado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESA EL ID DE ABOGADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (lbl_tipo.getText().equals("ID TIPO")) {
            JOptionPane.showMessageDialog(null, "ID DE TIPO NO VALIDO", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else if (f_ini.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE INICIO DEL ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (f_ter.equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES SELECCIONAR LA FECHA DE TERMINO DEL ASUNTO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            int id_asunto = Integer.parseInt(txt_idasunto.getText());
            int id_cliente = Integer.parseInt(txt_idcliente.getText());
            int id_demandado = Integer.parseInt(txt_iddemandado.getText());
            int id_estado = Integer.parseInt(lbl_estado.getText());
            int id_abogado = Integer.parseInt(txt_idabogado.getText());
            int id_tipo = Integer.parseInt(lbl_tipo.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String fecha_inicio = sdf.format(jd_fecha_inicio.getDate());
            String fecha_termino = sdf.format(jd_fecha_termino.getDate());
            ModificarRegistro(id_asunto, id_cliente, id_demandado, id_estado, id_abogado, id_tipo, fecha_inicio, fecha_termino);
        }
    }//GEN-LAST:event_btn_modificaActionPerformed

    private void btn_eliminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminaActionPerformed
        EliminarAsunto();
    }//GEN-LAST:event_btn_eliminaActionPerformed

    private void taba_asuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taba_asuntosMouseClicked

        int fila = taba_asuntos.getSelectedRow();
        if (fila >= 0) {
            txt_idasunto.setText(taba_asuntos.getValueAt(fila, 0).toString());
            txt_idcliente.setText(taba_asuntos.getValueAt(fila, 1).toString());
            txt_iddemandado.setText(taba_asuntos.getValueAt(fila, 2).toString());
            lbl_estado.setText(taba_asuntos.getValueAt(fila, 3).toString());
            txt_idabogado.setText(taba_asuntos.getValueAt(fila, 4).toString());
            lbl_tipo.setText(taba_asuntos.getValueAt(fila, 5).toString());
            Date date, date2;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse((String) taba_asuntos.getValueAt(fila, 6));
                jd_fecha_inicio.setDate(date);
                date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String) taba_asuntos.getValueAt(fila, 7));
                jd_fecha_termino.setDate(date2);
            } catch (ParseException ex) {
                Logger.getLogger(FrmRegistroAsesoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            HabilitarCampos();
            LeerCliente();
            LeerAbogado();
            LeerEstados();
            LeerTipos();
            LeerPersonaDemandada();
            btn_registrar.setEnabled(false);
            btn_modifica.setEnabled(true);
            btn_elimina.setEnabled(true);
    }//GEN-LAST:event_taba_asuntosMouseClicked
    }

    private void DeshabilitarCampos() {
        txt_iddemandado.setEnabled(false);
        txt_datosdemandado.setEnabled(false);
        txt_idabogado.setEnabled(false);
        txt_datosdemandado.setEnabled(false);
        jcb_estado.setEnabled(false);
        jcb_tipo.setEnabled(false);
        jcb_tipo_persona.setEnabled(false);
        jd_fecha_inicio.setEnabled(false);
        jd_fecha_termino.setEnabled(false);
    }

    private void HabilitarCampos() {
        txt_iddemandado.setEnabled(true);
        txt_datosdemandado.setEnabled(true);
        txt_idabogado.setEnabled(true);
        txt_datosdemandado.setEnabled(true);
        jcb_tipo.setEnabled(true);
        jcb_tipo_persona.setEnabled(true);
        jcb_estado.setEnabled(true);
        jd_fecha_inicio.setEnabled(true);
        jd_fecha_termino.setEnabled(true);
    }

    public void Limpiar() {
        txt_datosabogado.setText("");
        txt_datoscliente.setText("");
        txt_datosdemandado.setText("");
        txt_idabogado.setText("");
        txt_idasunto.setText("");
        txt_idcliente.setText("");
        txt_iddemandado.setText("");
        jcb_tipo.setSelectedIndex(0);
        lbl_estado.setText("ID ESTADO");
        lbl_tipo.setText("ID TIPO");
        jcb_estado.setSelectedIndex(0);
        jcb_tipo_persona.setSelectedIndex(0);
        btn_registrar.setEnabled(true);
        ((JTextField) jd_fecha_inicio.getDateEditor().getUiComponent()).setText("");
        ((JTextField) jd_fecha_termino.getDateEditor().getUiComponent()).setText("");
        DeshabilitarCampos();
    }

    private void MostrarIDAsunto() {
        Statement st;
        ResultSet rs;
        String sql = "select max(id_asunto)+1 as maximo from asunto";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_idasunto.setText(rs.getString("maximo"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ID ASUNTO", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarCliente(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select id_cliente, paterno, materno, nombre from cliente where id_cliente='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datoscliente.setText(rs.getString("id_cliente") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
                txt_iddemandado.setEnabled(true);
                jcb_tipo_persona.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "CLIENTE NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_idcliente.setText("");
                txt_datoscliente.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR REGISTRO", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarPersonaDemandada(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select * from persona_demandada WHERE id_demandado='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosdemandado.setText(rs.getString("id_demandado") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
                jcb_estado.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "PERSONA DEMANDADA  NO ENCONTRADA", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_iddemandado.setText("");
                txt_datosdemandado.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void BuscarEmpresaDemandada(int id) {
        Statement st;
        ResultSet rs;
        String sql = "select * from empresa_demandada WHERE id_demandado='" + id + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosdemandado.setText(rs.getString("id_demandado") + ".-  " + rs.getString("razon_social"));

                jcb_estado.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "EMPRESA NO ENCONTRADA", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_iddemandado.setText("");
                txt_datosdemandado.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
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
                jcb_tipo.setEnabled(true);
                jd_fecha_inicio.setEnabled(true);
                jd_fecha_termino.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "ABOGADO NO ENCONTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
                txt_idcliente.setText("");
                txt_datoscliente.setText("");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR REGISTRO", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarEstados() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM estado ORDER BY id_estado ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_estado.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarIDEstados() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_estado FROM estado WHERE descripcion='" + jcb_estado.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_estado.setText(rs.getString("id_estado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarTipos() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM tipo_asunto ORDER BY id_tipo ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_tipo.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarIDTipo() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_tipo FROM tipo_asunto  WHERE descripcion='" + jcb_tipo.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_tipo.setText(rs.getString("id_tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR ESTADOS", "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void RegistrarAsunto(int cliente, int demandado, int estado, int abogado, int tipo, String fecha_inicio, String fecha_termino) {
        PreparedStatement ps;
        String sql = "INSERT INTO asunto(id_cliente, id_demandado, id_estado, id_abogado, id_tipo, fecha_inicio, fecha_termino) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, cliente);
            ps.setInt(2, demandado);
            ps.setInt(3, estado);
            ps.setInt(4, abogado);
            ps.setInt(5, tipo);
            ps.setString(6, fecha_inicio);
            ps.setString(7, fecha_termino);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO CORRECTAMENTE");
            Limpiar();
            MostrarAsuntos();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL GUARDAR " + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void MostrarAsuntos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ASUNTO");
        modelo.addColumn("CLIENTE");
        modelo.addColumn("DEMANDADO");
        modelo.addColumn("ESTADO");
        modelo.addColumn("ABOGADO");
        modelo.addColumn("TIPO");
        modelo.addColumn("INICIO");
        modelo.addColumn("TERMINO");
        taba_asuntos.setModel(modelo);
        String registros[] = new String[8];
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM asunto";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString(1);
                registros[1] = rs.getString(2);
                registros[2] = rs.getString(3);
                registros[3] = rs.getString(4);
                registros[4] = rs.getString(5);
                registros[5] = rs.getString(6);
                registros[6] = rs.getString(7);
                registros[7] = rs.getString(8);
                modelo.addRow(registros);
            }
            taba_asuntos.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR REGISTROS " + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerPersonaDemandada() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM persona_demandada WHERE id_demandado='" + txt_iddemandado.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosdemandado.setText(rs.getString("id_demandado") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
                jcb_tipo_persona.setSelectedIndex(1);
            } else {
                LeerEmpresaDemandada();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerEmpresaDemandada() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM empresa_demandada WHERE id_demandado='" + txt_iddemandado.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (rs.next()) {
                txt_datosdemandado.setText(rs.getString("id_demandado") + ".-  " + rs.getString("razon_social"));
                jcb_tipo_persona.setSelectedIndex(2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerCliente() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_cliente, paterno, materno, nombre FROM cliente WHERE id_cliente='" + txt_idcliente.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                txt_datoscliente.setText(rs.getString("id_cliente") + ".-  " + rs.getString("paterno") + " " + rs.getString("materno") + " " + rs.getString("nombre"));
                txt_iddemandado.setEnabled(true);
                jcb_tipo_persona.setEnabled(true);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerEstados() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM estado WHERE id_estado='" + lbl_estado.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_estado.setSelectedItem(rs.getString("descripcion"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void LeerTipos() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM tipo_asunto WHERE id_tipo='" + lbl_tipo.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_tipo.setSelectedItem(rs.getString("descripcion"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ModificarRegistro(int id, int cliente, int demandado, int estado, int abogado, int tipo, String fecha_inicio, String fecha_termino) {
        PreparedStatement pst;
        String sql = "UPDATE asunto SET id_cliente='" + cliente + "', id_demandado='" + demandado + "', id_estado='" + estado + "',id_abogado='" + abogado + "', id_tipo='" + tipo
                + "',fecha_inicio='" + fecha_inicio + "', fecha_termino='" + fecha_termino + "' WHERE id_asunto='" + id + "'";
        try {
            pst = cn.prepareStatement(sql);
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR EL ASUNTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarAsuntos();
                Limpiar();
                DeshabilitarCampos();
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL MODIFICAR" + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void EliminarAsunto() {
        PreparedStatement pst = null;
        int fila = taba_asuntos.getSelectedRow();
        String id = taba_asuntos.getValueAt(fila, 0).toString();
        try {
            pst = cn.prepareStatement("DELETE FROM asunto WHERE id_asunto='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR A ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarAsuntos();
                JOptionPane.showMessageDialog(null, "EL ASUNTO HA SIDO ELIMINADO");
                DeshabilitarCampos();
                btn_registrar.setEnabled(true);
                btn_modifica.setEnabled(false);
                btn_elimina.setEnabled(false);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, NO PODEMOS ELIMINAR A ESTE ELEMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);

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
    private javax.swing.JButton btn_abogado;
    private javax.swing.JButton btn_buscarcliente;
    private javax.swing.JButton btn_buscardemandado;
    private javax.swing.JButton btn_elimina;
    private javax.swing.JButton btn_modifica;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_estado;
    private javax.swing.JComboBox<String> jcb_tipo;
    private javax.swing.JComboBox<String> jcb_tipo_persona;
    private com.toedter.calendar.JDateChooser jd_fecha_inicio;
    private com.toedter.calendar.JDateChooser jd_fecha_termino;
    private javax.swing.JLabel lbl_estado;
    private javax.swing.JLabel lbl_tipo;
    private javax.swing.JTable taba_asuntos;
    private javax.swing.JTextField txt_datosabogado;
    private javax.swing.JTextField txt_datoscliente;
    private javax.swing.JTextField txt_datosdemandado;
    private javax.swing.JTextField txt_idabogado;
    private javax.swing.JTextField txt_idasunto;
    private javax.swing.JTextField txt_idcliente;
    private javax.swing.JTextField txt_iddemandado;
    // End of variables declaration//GEN-END:variables
}
