package Formularios;

import javax.swing.JOptionPane;
import java.sql.*;
import ConexionSQL.ConectarBD;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;

public class FrmConsultaAbogados extends javax.swing.JInternalFrame {

    ConectarBD conectar = new ConectarBD();
    Connection cn = conectar.conexion();

    public FrmConsultaAbogados() {
        initComponents();
        MostrarAbogados("");
        MostrarGradoAcademico();
        MostrarTotalAbogados();
        lbl_grado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_abogados = new javax.swing.JTable();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_dato = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        txtpaterno = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtmaterno = new javax.swing.JTextField();
        txtrfc = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        jcb_grados = new javax.swing.JComboBox<>();
        lbl_grado = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("ABOGADOS REGISTRADOS EN SISTEMA");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagen15.jpg"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MUESTRA DE CLIENTES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 102, 102));

        tabla_abogados.setFont(new java.awt.Font("Tahoma", 0, 14));
        tabla_abogados.setForeground(new java.awt.Color(0, 102, 102));
        tabla_abogados = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        tabla_abogados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "APELLIDO PATERNO", "APELLIDO MATERNO", "NOMBRE COMPLETO", "RFC", "CEDULA PROFESIONAL", "GRADO ACADÉMICO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_abogados.setRowHeight(25);
        tabla_abogados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_abogadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_abogados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
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
        jLabel2.setText("INGRESE CUALQUIER VALOR QUE DESEA BUSCAR DE UN ABOGADO");

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
        jLabel4.setText("ID ABOGADO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("APELLIDO PATERNO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("APELLIDO MATERNO");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("NOMBRE(S)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("RFC");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("CÉDULA PROFESIONAL");

        txtpaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpaterno.setBorder(null);

        txtid.setEditable(false);
        txtid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtid.setBorder(null);

        txtmaterno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtmaterno.setBorder(null);

        txtrfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtrfc.setBorder(null);

        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnombre.setBorder(null);

        txtcedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcedula.setBorder(null);

        jcb_grados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcb_grados.setForeground(new java.awt.Color(0, 102, 102));
        jcb_grados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONA EL GRADO--" }));
        jcb_grados.setBorder(null);
        jcb_grados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_gradosItemStateChanged(evt);
            }
        });
        jcb_grados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_gradosActionPerformed(evt);
            }
        });

        lbl_grado.setText("ID GRADO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115)
                .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(522, 522, 522))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(260, 260, 260)
                                        .addComponent(jLabel7)
                                        .addGap(146, 146, 146))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcb_grados, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)))))))
                .addGap(18, 18, 18)
                .addComponent(lbl_grado)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtrfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_grados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_grado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("ABOGADOS EN SISTEMA");

        lbl_total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel10))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(292, 292, 292)
                            .addComponent(btnmodificar)
                            .addGap(18, 18, 18)
                            .addComponent(btneliminar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_salir))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_abogadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_abogadosMouseClicked
        btnmodificar.setEnabled(true);
        btneliminar.setEnabled(true);
        int fila = tabla_abogados.getSelectedRow();
        if (fila >= 0) {
            txtid.setText(tabla_abogados.getValueAt(fila, 0).toString());
            txtpaterno.setText(tabla_abogados.getValueAt(fila, 1).toString());
            txtmaterno.setText(tabla_abogados.getValueAt(fila, 2).toString());
            txtnombre.setText(tabla_abogados.getValueAt(fila, 3).toString());
            txtrfc.setText(tabla_abogados.getValueAt(fila, 4).toString());
            txtcedula.setText(tabla_abogados.getValueAt(fila, 5).toString());
            lbl_grado.setText(tabla_abogados.getValueAt(fila, 6).toString());
            MostrarGradoSeleccion();
        } else {
            JOptionPane.showMessageDialog(null, "Debes selecionar una fila de la tabla", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_tabla_abogadosMouseClicked

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        if (txtid.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ID INCORRECTO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtpaterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR UN APELLIDO PATERNO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtmaterno.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR UN APELLIDO MATERNO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtnombre.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR UN NOMBRE", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtrfc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR EL RFC", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtrfc.getText().length() != 13) {
            JOptionPane.showMessageDialog(null, "EL RFC DEBE CONTENER 13 CARACTERES", "RFC INCOMPLETO O INCORRECTO", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtcedula.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "DEBES INTRODUCIR LA CÉDULA", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtcedula.getText().length() < 7 || txtcedula.getText().length() > 8) {
            JOptionPane.showMessageDialog(null, "LA CEDULA DEBE CONTENER 7 U 8 DIGITOS", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }else if (jcb_grados.getSelectedIndex()==0) {
            JOptionPane.showMessageDialog(null, "DEBES ELEGIR UN GRADO ACADEMICO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }else if (lbl_grado.getText().equals("ID GRADO")) {
            JOptionPane.showMessageDialog(null, "GRADO NO VÁLIDO", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String id = txtid.getText();
            String paterno = txtpaterno.getText();
            String materno = txtmaterno.getText();
            String nombre = txtnombre.getText();
            String rfc = txtrfc.getText();
            int cedula = Integer.parseInt(txtcedula.getText());
            int grado = Integer.parseInt(lbl_grado.getText());
            ModificarAbogados(id, paterno, materno, nombre, rfc, cedula, grado);
        }
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        EliminarAbogados();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.dispose();  
        HabilitarMenu();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_datoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_datoKeyReleased
        String dato = txt_dato.getText();
        MostrarAbogados(dato);
    }//GEN-LAST:event_txt_datoKeyReleased

    private void jcb_gradosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_gradosItemStateChanged
        MostrarIdGrado();
    }//GEN-LAST:event_jcb_gradosItemStateChanged

    private void jcb_gradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_gradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcb_gradosActionPerformed
 
     private void Limpiar(){
        txtid.setText("");
        txtpaterno.setText("");
        txtmaterno.setText("");
        txtnombre.setText("");        
        txtrfc.setText("");
        txtcedula.setText("");
        lbl_grado.setText("");
        jcb_grados.setSelectedIndex(0);
    }
     
    private void MostrarTotalAbogados() {
        String sql = "SELECT COUNT(*) AS TOTAL FROM abogado";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_total.setText(String.valueOf(rs.getInt("TOTAL")));
            }

        } catch (Exception e) {
        }
    }

    private void MostrarAbogados(String dato) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs;
        Statement st;
        PreparedStatement pst;
        modelo.addColumn("ID ABOGADO");
        modelo.addColumn("APELLIDO PATERNO");
        modelo.addColumn("APELLIDO MATERNO");
        modelo.addColumn("NOMBRE (S)");
        modelo.addColumn("RFC");
        modelo.addColumn("CEDULA PROFESIONAL");
        modelo.addColumn("GRADO ACADÉMICO");
        tabla_abogados.setModel(modelo);
        String sql = "";
        if (dato.equals("")) {
            sql = "SELECT * FROM abogado ORDER BY id_abogado ASC";
        } else {
            sql = "SELECT * FROM abogado WHERE id_abogado LIKE '%" + dato + "%' OR paterno LIKE'%" + dato + "%'OR materno LIKE'%" + dato + "%'OR nombre LIKE'%" + dato
                    + "%'OR rfc LIKE'%" + dato + "%'OR cedula LIKE'%" + dato + "%'";
        }
        String datos[] = new String[7];
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
                datos[6] = rs.getString(7);
                modelo.addRow(datos);
            }
            tabla_abogados.setModel(modelo);
        } catch (SQLException e) {
        }
    }

    private void ModificarAbogados(String id, String paterno, String materno, String nombre, String rfc, int cedula, int grado) {
        ResultSet rs;
        Statement st;
        PreparedStatement pst = null;
        try {
            pst = cn.prepareStatement("UPDATE abogado SET paterno='" + paterno
                    + "',materno='" + materno + "',nombre='" + nombre + "',rfc='" + rfc + "',cedula='" + cedula + "', id_grado='" + grado
                    + "' WHERE id_abogado='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS MODIFICAR LOS DATOS DEL ABOGADO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarAbogados("");
                Limpiar();
                JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "HA OCURRIDO UN ERROR " + e, "Error inesperado", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void EliminarAbogados() {
        ResultSet rs;
        Statement st;
        PreparedStatement pst = null;
        int fila = tabla_abogados.getSelectedRow();
        String id = tabla_abogados.getValueAt(fila, 0).toString();
        try {
            pst = cn.prepareStatement("DELETE FROM abogado WHERE id_abogado='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO QUE DESEAS ELIMINAR A ESTE ELEMENTO?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarAbogados("");
                Limpiar();
                JOptionPane.showMessageDialog(null, "EL ABOGADO HA SIDO ELIMINADO");
                MostrarTotalAbogados();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "LO SENTIMOS, NO PODEMOS ELIMINAR A ESTE ELEMENTO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarGradoAcademico() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM grado_academico ORDER BY id_grado ASC";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grados.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR EL GRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarGradoSeleccion() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT descripcion FROM grado_academico WHERE id_grado='" + lbl_grado.getText() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_grados.setSelectedItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR EL GRADO", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void MostrarIdGrado() {
        Statement st;
        ResultSet rs;
        String sql = "SELECT id_grado FROM grado_academico WHERE descripcion='" + jcb_grados.getSelectedItem().toString() + "'";
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_grado.setText(rs.getString("id_grado"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO MOSTRAR EL ID", "ERROR", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JComboBox<String> jcb_grados;
    private javax.swing.JLabel lbl_grado;
    private javax.swing.JLabel lbl_total;
    public javax.swing.JTable tabla_abogados;
    private javax.swing.JTextField txt_dato;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmaterno;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpaterno;
    private javax.swing.JTextField txtrfc;
    // End of variables declaration//GEN-END:variables
}
