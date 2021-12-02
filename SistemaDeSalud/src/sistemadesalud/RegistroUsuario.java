/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemadesalud;

/**
 *
 * @author Matias
 */
public class RegistroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
         initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Rg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
        fondo.add(RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 140, 40));

        Salir.setText("Salir ");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        fondo.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoRg.png"))); // NOI18N
        fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 130, -1));

        Rg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo rosa.jpg"))); // NOI18N
        fondo.add(Rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 500, 525));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel xxx;
    // End of variables declaration//GEN-END:variables
}
