/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadesalud;

/**
 *
 * @author adm
 */
public class Administracion extends javax.swing.JFrame {

    /**
     * Creates new form Administracion
     */
    public Administracion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        fondo = new javax.swing.JPanel();
        NombreRegristro = new javax.swing.JLabel();
        ApellidoRegristro = new javax.swing.JLabel();
        NombreRegristro2 = new javax.swing.JLabel();
        UsuarioRegristro = new javax.swing.JLabel();
        xxx = new javax.swing.JLabel();
        UsuarioReg = new javax.swing.JTextField();
        ApellidoReg = new javax.swing.JTextField();
        NombreReg = new javax.swing.JTextField();
        ContrasenaReg = new javax.swing.JPasswordField();
        RegistrarUsuario = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Rg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro.setText("Nombre: ");
        fondo.add(NombreRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        ApellidoRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        ApellidoRegristro.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoRegristro.setText("Apellido:");
        fondo.add(ApellidoRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        NombreRegristro2.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        NombreRegristro2.setForeground(new java.awt.Color(0, 0, 0));
        NombreRegristro2.setText("Contraseña : ");
        fondo.add(NombreRegristro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        UsuarioRegristro.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        UsuarioRegristro.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioRegristro.setText("Usuario :");
        fondo.add(UsuarioRegristro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        xxx.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        xxx.setForeground(new java.awt.Color(0, 0, 0));
        xxx.setText("Registro ");
        fondo.add(xxx, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        UsuarioReg.setBackground(new java.awt.Color(255, 255, 255));
        UsuarioReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        UsuarioReg.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioRegActionPerformed(evt);
            }
        });
        fondo.add(UsuarioReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 220, -1));

        ApellidoReg.setBackground(new java.awt.Color(255, 255, 255));
        ApellidoReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ApellidoReg.setForeground(new java.awt.Color(0, 0, 0));
        ApellidoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoRegActionPerformed(evt);
            }
        });
        fondo.add(ApellidoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 220, -1));

        NombreReg.setBackground(new java.awt.Color(255, 255, 255));
        NombreReg.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        NombreReg.setForeground(new java.awt.Color(0, 0, 0));
        NombreReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreRegActionPerformed(evt);
            }
        });
        fondo.add(NombreReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 220, -1));

        ContrasenaReg.setBackground(new java.awt.Color(255, 255, 255));
        ContrasenaReg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ContrasenaReg.setForeground(new java.awt.Color(0, 0, 0));
        fondo.add(ContrasenaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 220, -1));

        RegistrarUsuario.setText("Registrar");
        fondo.add(RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 140, 40));

        jPasswordField1.setText("jPasswordField1");
        fondo.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 230, -1));

        jLabel1.setText("Repetir Contraseña");
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        Salir.setText("Salir ");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoRg.png"))); // NOI18N
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 130, -1));

        jLabel6.setText("ROL");
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA", "USUARIO", "ADMINISTRADOR" }));
        fondo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        Rg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo rosa.jpg"))); // NOI18N
        fondo.add(Rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 800, 525));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Registrar Usuario", jPanel1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"RANDY", "MARMOL", "randy", "ADMINISTRADOR"},
                {"EULISE", "MATIAS", "matias", "ADMINISTRADOR"},
                {"JUNIOR", "CABA", "junior", "USUARIO"}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "USUARIO", "ROL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("USUARIOS REGISTRADOS");

        jButton1.setText("Buscar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jButton1)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ver Usuarios Registrados", jPanel2);

        jLabel5.setText("USUARIO: ");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("PACIENTES");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setText("TURNOS");

        jCheckBox3.setText("MEDICOS");

        jCheckBox4.setText("DISPONIBIIDAD");

        jCheckBox5.setText("ARS");

        jCheckBox6.setText("ADMINISTRACION");

        jButton2.setText("DAR PERMISOS");

        jTextField3.setEditable(false);

        jLabel4.setText("TIPO USUARIO");

        jButton3.setText("BUSCAR USUARIO");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jTextField2))
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addGap(98, 98, 98)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(33, 33, 33)
                        .addComponent(jCheckBox3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox5))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox6))))
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(265, 265, 265))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox6)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton3)))
                .addGap(16, 16, 16)
                .addComponent(jButton2)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Permisos de Usuario", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 551, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Acerca de", jPanel4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioRegActionPerformed

    private void ApellidoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidoRegActionPerformed

    private void NombreRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreRegActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        Login LG = new Login ();
        LG.setVisible(true);
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoReg;
    private javax.swing.JLabel ApellidoRegristro;
    private javax.swing.JPasswordField ContrasenaReg;
    private javax.swing.JTextField NombreReg;
    private javax.swing.JLabel NombreRegristro;
    private javax.swing.JLabel NombreRegristro2;
    private javax.swing.JButton RegistrarUsuario;
    private javax.swing.JLabel Rg;
    private javax.swing.JButton Salir;
    private javax.swing.JTextField UsuarioReg;
    private javax.swing.JLabel UsuarioRegristro;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel xxx;
    // End of variables declaration//GEN-END:variables
}