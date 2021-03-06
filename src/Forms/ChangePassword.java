/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.User;
import Utils.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author lagos
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form changePassword
     */
  public ChangePassword() {
      initComponents();
  }
    
  String username;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    currentPasswordField = new javax.swing.JPasswordField();
    passwordField = new javax.swing.JPasswordField();
    confirmPasswordField = new javax.swing.JPasswordField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Cambiar la contraseña");

    jLabel2.setText("Contraseña actual:");

    jLabel3.setText("Nueva contraseña:");

    jLabel4.setText("Confirmar contraseña:");

    jButton1.setText("CAMBIAR");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("VOLVER");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(41, 41, 41)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(passwordField)
              .addComponent(currentPasswordField)
              .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(layout.createSequentialGroup()
            .addGap(89, 89, 89)
            .addComponent(jLabel1)))
        .addContainerGap(49, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(131, 131, 131))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addComponent(jLabel1)
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton2)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (emptyFields()) return;

    try {
      if (User.checkPassword(username, String.valueOf(currentPasswordField.getPassword()))) {
        if(!(JOptionPane.showConfirmDialog(null, "Está seguro de cambiarla?") == 0)) return;
        
        if(User.changePassword(username, String.valueOf(passwordField.getPassword()))) {
          JOptionPane.showMessageDialog(null, "Su contraseña fue actualizada correctamente");
          dispose();
        } else {
          JOptionPane.showMessageDialog(null, "Hubo un error inesperado");
        }
      } else {
        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
      }      
    } catch (ParseException ex) {
      Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
    }

      currentPasswordField.setText("");
      passwordField.setText("");
      confirmPasswordField.setText("");
      currentPasswordField.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPasswordField confirmPasswordField;
  private javax.swing.JPasswordField currentPasswordField;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JPasswordField passwordField;
  // End of variables declaration//GEN-END:variables

  private boolean emptyFields() {

      if(String.valueOf(currentPasswordField.getPassword()).isEmpty()) { 
          JOptionPane.showMessageDialog(null, "Ingrese su contraseña actual");
          return true; 
      }

      if(String.valueOf(passwordField.getPassword()).isEmpty()) { 
          JOptionPane.showMessageDialog(null, "Ingrese la contraseña");
          return true; 
      }
      if(String.valueOf(confirmPasswordField.getPassword()).isEmpty()) { 
          JOptionPane.showMessageDialog(null, "Confirme la contraseña");
          return true; 
      }
      if(!String.valueOf(passwordField.getPassword()).equals(String.valueOf(confirmPasswordField.getPassword()))) {
          JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
          return true; 
      }


      return false;
  }
   
}
