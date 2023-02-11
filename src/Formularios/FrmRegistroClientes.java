package Formularios;

import java.awt.Color;
import java.sql.*;
import ConexionSQL.ConectarBD;
import javax.swing.JOptionPane;
import Clases.RegistroClientes;
import java.awt.HeadlessException;

public class FrmRegistroClientes extends javax.swing.JInternalFrame {

    ConectarBD conbd = new ConectarBD();
    Connection con = conbd.conexion();

    public FrmRegistroClientes() {
        initComponents();
        btnlimpiar.setBackground(Color.getHSBColor(0, 153, 153));
        MostrarIDCliente();
        MostrarTiposMedios();
        MostrarIDMedio();
        lbl_idmedio.setVisible(false);
        lbl_idmedio2.setVisible(false);
        lbl_idtipo2.setVisible(false);
        lbl_idtipo.setVisible(false);
        panel_contacto2.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_paterno = new javax.swing.JTextField();
        txt_materno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_curp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_rfc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        panel_contacto = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jcb_tiposmedio = new javax.swing.JComboBox<>();
        lbl_contacto = new javax.swing.JLabel();
        lbl_idtipo = new javax.swing.JLabel();
        txt_valor = new javax.swing.JTextField();
        lbl_idmedio = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jrbtn_si = new javax.swing.JRadioButton();
        jrbtn_no = new javax.swing.JRadioButton();
        panel_contacto2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jcb_tiposmedio2 = new javax.swing.JComboBox<>();
        lbl_contacto2 = new javax.swing.JLabel();
        lbl_idtipo2 = new javax.swing.JLabel();
        txt_valor2 = new javax.swing.JTextField();
        lbl_idmedio2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("ID CLIENTE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("APELLIDO PATERNO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("APELLIDO MATERNO");

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(0, 102, 102));
        txt_id.setText("Id cliente");
        txt_id.setBorder(null);

        txt_paterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_paterno.setForeground(new java.awt.Color(0, 51, 51));
        txt_paterno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        txt_materno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_materno.setForeground(new java.awt.Color(0, 51, 51));
        txt_materno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("NOMBRE COMPLETO");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(0, 51, 51));
        txt_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("CURP");

        txt_curp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_curp.setForeground(new java.awt.Color(0, 51, 51));
        txt_curp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));
        txt_curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_curpActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("RFC");

        txt_rfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_rfc.setForeground(new java.awt.Color(0, 51, 51));
        txt_rfc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 1, true));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen3.jpg"))); // NOI18N

        btn_registrar.setBackground(new java.awt.Color(0, 153, 153));
        btn_registrar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("GUARDAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btnlimpiar.setBackground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnsalir.setBackground(new java.awt.Color(0, 153, 153));
        btnsalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnsalir.setForeground(new java.awt.Color(255, 255, 255));
        btnsalir.setText("VOLVER A MENU");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        panel_contacto.setBackground(new java.awt.Color(255, 255, 255));
        panel_contacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTABLECER TIPO DE CONTACTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("SELECCIONA TIPO DE CONTACTO");

        jcb_tiposmedio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tiposmedio.setForeground(new java.awt.Color(0, 51, 51));
        jcb_tiposmedio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--ELIGE UN TIPO DE CONTACTO--" }));
        jcb_tiposmedio.setBorder(null);
        jcb_tiposmedio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tiposmedioItemStateChanged(evt);
            }
        });
        jcb_tiposmedio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_tiposmedioMouseClicked(evt);
            }
        });

        lbl_contacto.setBackground(new java.awt.Color(255, 255, 255));
        lbl_contacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_contacto.setForeground(new java.awt.Color(0, 102, 102));

        lbl_idtipo.setText("ID TIPO");

        txt_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_valor.setForeground(new java.awt.Color(0, 51, 51));
        txt_valor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_valorActionPerformed(evt);
            }
        });

        lbl_idmedio.setText("ID MEDIO");

        javax.swing.GroupLayout panel_contactoLayout = new javax.swing.GroupLayout(panel_contacto);
        panel_contacto.setLayout(panel_contactoLayout);
        panel_contactoLayout.setHorizontalGroup(
            panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contactoLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_tiposmedio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idtipo))
                    .addGroup(panel_contactoLayout.createSequentialGroup()
                        .addComponent(lbl_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idmedio)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel_contactoLayout.setVerticalGroup(
            panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jcb_tiposmedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idtipo))
                .addGap(18, 18, 18)
                .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_idmedio)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("¿DESEA AGREGAR OTRO MEDIO DE CONTACTO?");

        jrbtn_si.setBackground(new java.awt.Color(0, 153, 153));
        jrbtn_si.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbtn_si.setText("SI");
        jrbtn_si.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn_siMouseClicked(evt);
            }
        });

        jrbtn_no.setBackground(new java.awt.Color(0, 153, 153));
        jrbtn_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jrbtn_no.setText("NO");
        jrbtn_no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrbtn_noMouseClicked(evt);
            }
        });

        panel_contacto2.setBackground(new java.awt.Color(255, 255, 255));
        panel_contacto2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ESTABLECER TIPO DE CONTACTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 153));
        jLabel11.setText("SELECCIONA TIPO DE CONTACTO");

        jcb_tiposmedio2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_tiposmedio2.setForeground(new java.awt.Color(0, 51, 51));
        jcb_tiposmedio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--ELIGE UN TIPO DE CONTACTO--" }));
        jcb_tiposmedio2.setBorder(null);
        jcb_tiposmedio2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_tiposmedio2ItemStateChanged(evt);
            }
        });
        jcb_tiposmedio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcb_tiposmedio2MouseClicked(evt);
            }
        });

        lbl_contacto2.setBackground(new java.awt.Color(255, 255, 255));
        lbl_contacto2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_contacto2.setForeground(new java.awt.Color(0, 102, 102));

        lbl_idtipo2.setText("ID TIPO");

        txt_valor2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_valor2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 51)));

        lbl_idmedio2.setText("ID MEDIO");

        javax.swing.GroupLayout panel_contacto2Layout = new javax.swing.GroupLayout(panel_contacto2);
        panel_contacto2.setLayout(panel_contacto2Layout);
        panel_contacto2Layout.setHorizontalGroup(
            panel_contacto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contacto2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contacto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_contacto2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_tiposmedio2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idtipo2))
                    .addGroup(panel_contacto2Layout.createSequentialGroup()
                        .addComponent(lbl_contacto2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_idmedio2)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        panel_contacto2Layout.setVerticalGroup(
            panel_contacto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contacto2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_contacto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jcb_tiposmedio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_idtipo2))
                .addGap(18, 18, 18)
                .addGroup(panel_contacto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_contacto2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_contacto2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_valor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_idmedio2)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("REGISTRO DE NUEVOS CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(316, 316, 316)
                .addComponent(btn_registrar)
                .addGap(18, 18, 18)
                .addComponent(btnsalir)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)
                                .addGap(46, 46, 46)
                                .addComponent(jrbtn_si)
                                .addGap(33, 33, 33)
                                .addComponent(jrbtn_no))
                            .addComponent(panel_contacto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnlimpiar)
                                    .addComponent(jLabel8)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(panel_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jrbtn_si)
                    .addComponent(jrbtn_no))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_contacto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btnsalir))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_tiposmedio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_tiposmedio2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_tiposmedio2MouseClicked

    private void jcb_tiposmedio2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tiposmedio2ItemStateChanged
        MostrarIDTipoMedio2();
        if (jcb_tiposmedio2.getSelectedIndex() == 1) {
            lbl_contacto2.setText("INGRESA NUMERO TELEFÓNICO");
        } else if (jcb_tiposmedio2.getSelectedIndex() == 2) {
            lbl_contacto2.setText("INGRESA CORREO ELECTRÓNICO");
        } else if (jcb_tiposmedio2.getSelectedIndex() == 3) {
            lbl_contacto2.setText("INGRESA NOMBRE DE PERFIL");
        } else {

        }
    }//GEN-LAST:event_jcb_tiposmedio2ItemStateChanged

    private void jrbtn_noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn_noMouseClicked
        jrbtn_si.setSelected(false);
        panel_contacto2.setVisible(false);
    }//GEN-LAST:event_jrbtn_noMouseClicked

    private void jrbtn_siMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrbtn_siMouseClicked
        MostrarIDMedio2();
        jrbtn_no.setSelected(false);
        panel_contacto2.setVisible(true);
    }//GEN-LAST:event_jrbtn_siMouseClicked

    private void jcb_tiposmedioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcb_tiposmedioMouseClicked

    }//GEN-LAST:event_jcb_tiposmedioMouseClicked

    private void jcb_tiposmedioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_tiposmedioItemStateChanged
        MostrarIDTipoMedio();
        if (jcb_tiposmedio.getSelectedIndex() == 1) {
            lbl_contacto.setText("INGRESA NUMERO TELEFÓNICO");
        } else if (jcb_tiposmedio.getSelectedIndex() == 2) {
            lbl_contacto.setText("INGRESA CORREO ELECTRÓNICO");
        } else if (jcb_tiposmedio.getSelectedIndex() == 3) {
            lbl_contacto.setText("INGRESA NOMBRE DE PERFIL");
        } else {

        }
    }//GEN-LAST:event_jcb_tiposmedioItemStateChanged

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
       HabilitarMenu();
        this.dispose();
        
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        if (txt_paterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR APELLIDO PATERNO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_materno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR APELLIDO MATERNO", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_nombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR NOMBRE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_curp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR CURP", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_rfc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR REGISTRO FEDERAL DE CONTRIBUYENTE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_curp.getText().length() != 18) {
            JOptionPane.showMessageDialog(null, "EL CURP DEBE CONTENER 18 CARACTERES", "CURP INCORRECTO O INCOMPLETO", JOptionPane.ERROR_MESSAGE);
        } else if (txt_rfc.getText().length() != 13) {
            JOptionPane.showMessageDialog(null, "EL RFC DEBE CONTENER 13 CARACTERES", "RFC INCORRECTO O INCOMPLETO", JOptionPane.ERROR_MESSAGE);
        }else if (jrbtn_si.isSelected()==false && jrbtn_no.isSelected()==false) {
            JOptionPane.showMessageDialog(null, "POR FAVOR SELECCIONA SI DESEAS AGREGAR OTRO MEDIO DE CONTACTO", "RFC INCORRECTO O INCOMPLETO", JOptionPane.ERROR_MESSAGE);
        }else if (txt_valor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FAVOR DE INGRESAR CONTACTO DEL CLIENTE", "CAMPO VACIO", JOptionPane.ERROR_MESSAGE);
        } else {
            String id = txt_id.getText();
            String paterno = txt_paterno.getText();
            String materno = txt_materno.getText();
            String nombre = txt_nombre.getText();
            String curp = txt_curp.getText();
            String rfc = txt_rfc.getText();
            RegistroClientes rclientes = new RegistroClientes();
            rclientes.RegistrarCliente(id, paterno, materno, nombre, curp, rfc);
            if (jrbtn_si.isSelected() == true) {                
                AgregarMedioContacto();
                RegistroMedioContacto();
                AgregarMedioContacto2();
                RegistroMedioContactoSecundario();
                MostrarIDCliente();
                MostrarIDMedio(); 
                Limpiar();
            } else {               
                AgregarMedioContacto();
                RegistroMedioContacto();
                MostrarIDCliente();
                MostrarIDMedio();
                Limpiar();
            }
        }
                     
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_curpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_curpActionPerformed

    private void txt_valorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_valorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_valorActionPerformed

    public void MostrarIDCliente() {
        try {
            String sql = "SELECT MAX(id_cliente)+1 as id FROM cliente";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                txt_id.setText(String.valueOf(rs.getInt("id")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e, "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDMedio() {
        try {
            String sql = "SELECT MAX(id_medio)+1 as medio FROM medio_contacto";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                lbl_idmedio.setText(String.valueOf(rs.getInt("medio")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e, "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDMedio2() {
        try {
            String sql = "SELECT MAX(id_medio)+2 as medio FROM medio_contacto";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                lbl_idmedio2.setText(String.valueOf(rs.getInt("medio")));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar"+e, "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarTiposMedios() {
        try {
            String sql = "SELECT descripcion FROM tipo_medio ORDER BY id_tipo ASC";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                this.jcb_tiposmedio.addItem(rs.getString("descripcion"));
                this.jcb_tiposmedio2.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar", "Error Inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MostrarIDTipoMedio() {
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select id_tipo from tipo_medio where descripcion='" + jcb_tiposmedio.getSelectedItem().toString() + "'");
            while (rs.next()) {
                this.lbl_idtipo.setText(rs.getString("id_tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void MostrarIDTipoMedio2() {
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select id_tipo from tipo_medio where descripcion='" + jcb_tiposmedio2.getSelectedItem().toString() + "'");
            while (rs.next()) {
                this.lbl_idtipo2.setText(rs.getString("id_tipo"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void AgregarMedioContacto() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO medio_contacto(id_tipo,id_cliente) VALUES(?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, lbl_idtipo.getText());
            pst.setString(2, txt_id.getText());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");                

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarMedioContacto2() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO medio_contacto (id_tipo,id_cliente) VALUES(?,?)";

        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, lbl_idtipo2.getText());
            pst.setString(2, txt_id.getText());
            pst.executeUpdate();
            //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");                

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarTelefono() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO telefono VALUES(?,?)";
        try {
            if (txt_valor.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "EL NUMERO TELEFÓNICO DEBE CONTENER 10 DIGITOS", "INFORMACION INCORRECTA", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio.getText());
                pst.setString(2, txt_valor.getText());
                pst.executeUpdate();
            }

            //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");                
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarTelefonoSecundario() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO telefono VALUES(?,?)";
        try {
            if (txt_valor2.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "EL NUMERO TELEFÓNICO DEBE CONTENER 10 DIGITOS", "INFORMACION INCORRECTA", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio2.getText());
                pst.setString(2, txt_valor2.getText());
                pst.executeUpdate();
            }

            //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");                
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarEmail() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO email VALUES(?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM email WHERE cuenta LIKE '" + txt_valor.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL EMAIL QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio.getText());
                pst.setString(2, txt_valor.getText());
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");               
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarEmailSecundario() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO email VALUES(?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM email WHERE cuenta LIKE '" + txt_valor2.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL EMAIL QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio2.getText());
                pst.setString(2, txt_valor2.getText());
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");               
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarFacebook() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO facebook VALUES(?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM facebook WHERE cuenta LIKE '" + txt_valor.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL NOMBRE DE PERFIL QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio.getText());
                pst.setString(2, txt_valor.getText());
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");               
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void AgregarFacebookSecundario() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        String sql = "INSERT INTO facebook VALUES(?,?)";
        try {
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM facebook WHERE cuenta LIKE '" + txt_valor2.getText() + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "EL NOMBRE DE PERFIL QUE INGERASTE YA SE ENCUENTRA REGISTRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = con.prepareStatement(sql);
                pst.setString(1, lbl_idmedio2.getText());
                pst.setString(2, txt_valor2.getText());
                pst.executeUpdate();
                //JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");               
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR" + e, "ERROR INESPERADO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void Limpiar() {
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_nombre.setText("");
        txt_curp.setText("");
        txt_rfc.setText("");
        txt_valor.setText("");
        txt_valor2.setText("");
        jcb_tiposmedio.setSelectedIndex(0);
        jcb_tiposmedio2.setSelectedIndex(0);
        panel_contacto2.setVisible(false);
        jrbtn_no.setSelected(false);
         jrbtn_si.setSelected(false);
    }

    public void RegistroMedioContacto() {
        if (jcb_tiposmedio.getSelectedIndex()==1) {
            AgregarTelefono();
        } else if (jcb_tiposmedio.getSelectedIndex()==2) {
            AgregarEmail();
        } else if (jcb_tiposmedio.getSelectedIndex()==3) {
            AgregarFacebook();
        }
    }

    public void RegistroMedioContactoSecundario() {
        if (jcb_tiposmedio2.getSelectedIndex()==1) {
            AgregarTelefonoSecundario();
        } else if (jcb_tiposmedio2.getSelectedIndex()==2) {
            AgregarEmailSecundario();
        } else if (jcb_tiposmedio2.getSelectedIndex()==3) {
            AgregarFacebookSecundario();
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
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcb_tiposmedio;
    private javax.swing.JComboBox<String> jcb_tiposmedio2;
    private javax.swing.JRadioButton jrbtn_no;
    private javax.swing.JRadioButton jrbtn_si;
    private javax.swing.JLabel lbl_contacto;
    private javax.swing.JLabel lbl_contacto2;
    private javax.swing.JLabel lbl_idmedio;
    private javax.swing.JLabel lbl_idmedio2;
    private javax.swing.JLabel lbl_idtipo;
    private javax.swing.JLabel lbl_idtipo2;
    private javax.swing.JPanel panel_contacto;
    private javax.swing.JPanel panel_contacto2;
    private javax.swing.JTextField txt_curp;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_rfc;
    private javax.swing.JTextField txt_valor;
    private javax.swing.JTextField txt_valor2;
    // End of variables declaration//GEN-END:variables
}
