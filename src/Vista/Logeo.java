
package Vista;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *@version 1.0
 * @author Alejandroo
 */
public class Logeo extends javax.swing.JFrame {

    /**
     *
     */
    public Logeo() {
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsuario = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContrasena = new javax.swing.JPasswordField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jLabelImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(530, 300));
        getContentPane().setLayout(null);

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario :");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(260, 60, 54, 17);

        jLabelContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelContrasena.setText("Contraseña :");
        getContentPane().add(jLabelContrasena);
        jLabelContrasena.setBounds(240, 110, 80, 17);

        jTextFieldUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(340, 60, 130, 22);

        jPasswordFieldContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldContrasenaActionPerformed(evt);
            }
        });
        jPasswordFieldContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordFieldContrasenaKeyPressed(evt);
            }
        });
        getContentPane().add(jPasswordFieldContrasena);
        jPasswordFieldContrasena.setBounds(340, 110, 130, 22);

        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accept.png"))); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAceptarMouseEntered(evt);
            }
        });
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        jButtonAceptar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonAceptarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButtonAceptarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButtonAceptarKeyTyped(evt);
            }
        });
        getContentPane().add(jButtonAceptar);
        jButtonAceptar.setBounds(240, 160, 120, 40);

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir);
        jButtonSalir.setBounds(380, 160, 110, 40);

        jLabelImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/man key.png"))); // NOI18N
        jLabelImage.setText("jLabel3");
        getContentPane().add(jLabelImage);
        jLabelImage.setBounds(0, 0, 230, 260);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

        
        String usuario = jTextFieldUsuario.getText();
        String password = new String(jPasswordFieldContrasena.getPassword());

        if (usuario.equals("Alejandro") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Bienvenido " + usuario, "Login Correcto", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El usuario/contraseña no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonAceptarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAceptarKeyPressed
        

    }//GEN-LAST:event_jButtonAceptarKeyPressed

    private void jButtonAceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAceptarMouseEntered

    }//GEN-LAST:event_jButtonAceptarMouseEntered

    private void jButtonAceptarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAceptarKeyReleased

    }//GEN-LAST:event_jButtonAceptarKeyReleased

    private void jPasswordFieldContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContrasenaKeyPressed
        if(evt.getKeyChar() == KeyEvent.VK_ENTER) {
            String usuario = jTextFieldUsuario.getText();
        String password = new String(jPasswordFieldContrasena.getPassword());
        
        if(usuario.equals("Alejandro") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Bienvenido "+ usuario, "Login Correcto", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "El usuario/contraseña no es correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_jPasswordFieldContrasenaKeyPressed

    private void jPasswordFieldContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldContrasenaActionPerformed

    }//GEN-LAST:event_jPasswordFieldContrasenaActionPerformed

    private void jTextFieldUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioKeyTyped

        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
            JOptionPane.showMessageDialog(this, "El caracter no es valido", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextFieldUsuarioKeyTyped

    private void jButtonAceptarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonAceptarKeyTyped
        
    }//GEN-LAST:event_jButtonAceptarKeyTyped

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logeo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldContrasena;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
