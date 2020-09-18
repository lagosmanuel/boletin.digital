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
 * @author acer
 */
public class ModifyUser extends javax.swing.JFrame {

  /**
   * Creates new form ModifyUser
   */
  public ModifyUser() {
      initComponents();
  }

  Menu menuInstance = null;

  int usercode;
  String userUsername;
  String userPassword;
  String userName;
  String userLastname;
  String userEmail;
  String userOtherEmail;
  long userPhone;
  String userGender;
    
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
    jLabel9 = new javax.swing.JLabel();
    nameField = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    lastnameField = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    emailField = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    otherEmailField = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    phoneField = new javax.swing.JTextField();
    jLabel15 = new javax.swing.JLabel();
    genderBox = new javax.swing.JComboBox();
    exitModifyUser = new javax.swing.JButton();
    saveModifyUser = new javax.swing.JButton();
    usernameUserToFindField = new javax.swing.JTextField();
    jToggleButton1 = new javax.swing.JToggleButton();
    jSeparator1 = new javax.swing.JSeparator();
    jButton1 = new javax.swing.JButton();
    adminCheckBox = new javax.swing.JCheckBox();
    teacherCheckBox = new javax.swing.JCheckBox();
    preceptorCheckBox = new javax.swing.JCheckBox();
    studentCheckBox = new javax.swing.JCheckBox();
    jLabel14 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    passwordField = new javax.swing.JPasswordField();
    confirmPasswordField = new javax.swing.JPasswordField();
    jLabel5 = new javax.swing.JLabel();
    usernameLabel = new javax.swing.JLabel();
    deleteUser = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Modificar usuario");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Nombre de usuario:");

    jLabel9.setText("Nombre:");

    jLabel10.setText("Apellido:");

    jLabel11.setText("Correo:");

    jLabel12.setForeground(new java.awt.Color(204, 0, 0));
    jLabel12.setText("Correo 2:");

    otherEmailField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        otherEmailFieldActionPerformed(evt);
      }
    });

    jLabel13.setText("Teléfono:");

    jLabel15.setText("Sexo:");

    genderBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                      ", "Masculino", "Femenino", "Otro" }));
    genderBox.setToolTipText("");
    genderBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        genderBoxActionPerformed(evt);
      }
    });

    exitModifyUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    exitModifyUser.setText("SALIR");
    exitModifyUser.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitModifyUserActionPerformed(evt);
      }
    });

    saveModifyUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    saveModifyUser.setText("GUARDAR");
    saveModifyUser.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        saveModifyUserActionPerformed(evt);
      }
    });

    jToggleButton1.setText("BUSCAR");
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton1ActionPerformed(evt);
      }
    });

    jButton1.setText("LISTA  DE USUARIOS");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    adminCheckBox.setText("Administrador");

    teacherCheckBox.setText("Profesor");

    preceptorCheckBox.setText("Preceptor");

    studentCheckBox.setText("Alumno");
    studentCheckBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        studentCheckBoxActionPerformed(evt);
      }
    });

    jLabel14.setText("Categoría:");

    jLabel3.setForeground(new java.awt.Color(255, 0, 51));
    jLabel3.setText("Contraseña:");

    jLabel4.setForeground(new java.awt.Color(255, 0, 51));
    jLabel4.setText("Confirmar Contraseña");

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel5.setText("Usuario:");

    usernameLabel.setText("    ");

    deleteUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    deleteUser.setText("ELIMINAR");
    deleteUser.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        deleteUserActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(10, 10, 10)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jSeparator1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                  .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(usernameUserToFindField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 1, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(deleteUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(saveModifyUser)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(exitModifyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel15)
                .addComponent(jLabel13)
                .addComponent(phoneField)
                .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(studentCheckBox)
                .addComponent(teacherCheckBox)
                .addComponent(preceptorCheckBox)
                .addComponent(adminCheckBox)))
            .addComponent(jLabel10)
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11)
                .addComponent(jLabel3))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jLabel12)
                .addComponent(otherEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel14)))
            .addGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(lastnameField)
                .addComponent(nameField)
                .addComponent(jLabel9)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGap(18, 18, 18)
              .addComponent(confirmPasswordField)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(usernameLabel)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addGap(27, 27, 27)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(usernameUserToFindField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jToggleButton1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(usernameLabel))
        .addGap(12, 12, 12)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3)
          .addComponent(jLabel4))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel9)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel10)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel11)
          .addComponent(jLabel12))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(otherEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel13)
          .addComponent(jLabel14))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel15)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(genderBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(studentCheckBox)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(teacherCheckBox)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(preceptorCheckBox)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(adminCheckBox)))
        .addGap(46, 46, 46)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(exitModifyUser)
          .addComponent(saveModifyUser)
          .addComponent(deleteUser))
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void otherEmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherEmailFieldActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_otherEmailFieldActionPerformed

    private void exitModifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitModifyUserActionPerformed
      menuInstance.setVisible(true);
      dispose();
    }//GEN-LAST:event_exitModifyUserActionPerformed

    private void genderBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderBoxActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_genderBoxActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
      userUsername = usernameUserToFindField.getText();
      usercode = User.getUserCodeByUsername(userUsername);
      if(usercode == 0) {
        JOptionPane.showMessageDialog(null, "El usuario no existe");
        return;
      } else {
        BasicDataSource bs = Config.setDBParams();
        Connection connection = null;

        ArrayList userCategories = new ArrayList();

        String query = "SELECT * FROM `PERSONAS` WHERE `PER_COD`='" + usercode + "'";

        try {
          connection = bs.getConnection();
          PreparedStatement preparedStatemnet = connection.prepareStatement(query);
          preparedStatemnet.execute();
          ResultSet rs = (ResultSet) preparedStatemnet.getResultSet();

          if(rs.next()){
            userPassword = rs.getString("PER_CONTRASENA");
            userName = rs.getString("PER_NOMBRE");
            userLastname = rs.getString("PER_APELLIDO");
            userEmail = rs.getString("PER_CORREO");
            userOtherEmail = rs.getString("PER_CORREO2");
            userPhone = rs.getLong("PER_TELEFONO");
            userGender = rs.getString("PER_SEXO");

            changeFields();
          } else {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
          }

        } catch (SQLException e) {
          System.out.println("ERROR: " + e);
        } finally {
          if(connection != null) try {
            connection.close();
          } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
          }
        }
      }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void saveModifyUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveModifyUserActionPerformed
      if (emptyFields()) return;
      if(!(JOptionPane.showConfirmDialog(null, "Está seguro de guardar?") == 0)) return;

      String newpassword = new String(passwordField.getPassword()).toString();

      User updatedUser = new User();
      updatedUser.setUsername(usernameLabel.getText());
      updatedUser.setName(nameField.getText());
      updatedUser.setLastname(lastnameField.getText());
      updatedUser.setPassword(newpassword.isEmpty() == false ? newpassword:userPassword);
      updatedUser.setEmail(emailField.getText());
      updatedUser.setOptionalEmail(otherEmailField.getText());
      updatedUser.setPhone(Long.parseLong(phoneField.getText()));
      updatedUser.setGender(genderBox.getSelectedItem().toString());

      try {
        changeCategories();
      } catch (ParseException ex) {
        Logger.getLogger(ModifyUser.class.getName()).log(Level.SEVERE, null, ex);
      }

      if(updatedUser.modify()) {
        JOptionPane.showMessageDialog(null, "El usuario ha sido modificado con éxito");
        cleanFields();
      } else {
        JOptionPane.showMessageDialog(null, "Se ha producido un error. Código: " + String.valueOf(updatedUser.getErrorCode()));
      }
    }//GEN-LAST:event_saveModifyUserActionPerformed

    private void studentCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentCheckBoxActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_studentCheckBoxActionPerformed

  private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
    String username = usernameUserToFindField.getText();
    if (username.equals("")) {
      JOptionPane.showMessageDialog(null, "Ingrese el nombre del usuario a eliminar");
      return;
    }
    int usercod = User.getUserCodeByUsername(username);
    if (usercod == 0) {
      JOptionPane.showMessageDialog(null, "El usuario no existe");
      return;
    }
    if(!(JOptionPane.showConfirmDialog(null, "Está seguro de eliminarlo?") == 0)) return;
    
    User.delete(usercod);
  }//GEN-LAST:event_deleteUserActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    UserList userList = new UserList();
    userList.setVisible(true);
  }//GEN-LAST:event_jButton1ActionPerformed

    

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JCheckBox adminCheckBox;
  private javax.swing.JPasswordField confirmPasswordField;
  private javax.swing.JButton deleteUser;
  private javax.swing.JTextField emailField;
  private javax.swing.JButton exitModifyUser;
  private javax.swing.JComboBox genderBox;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JTextField lastnameField;
  private javax.swing.JTextField nameField;
  private javax.swing.JTextField otherEmailField;
  private javax.swing.JPasswordField passwordField;
  private javax.swing.JTextField phoneField;
  private javax.swing.JCheckBox preceptorCheckBox;
  private javax.swing.JButton saveModifyUser;
  private javax.swing.JCheckBox studentCheckBox;
  private javax.swing.JCheckBox teacherCheckBox;
  private javax.swing.JLabel usernameLabel;
  private javax.swing.JTextField usernameUserToFindField;
  // End of variables declaration//GEN-END:variables

  private void changeFields() {
    usernameLabel.setText(userUsername);
    nameField.setText(userName);
    lastnameField.setText(userLastname);
    emailField.setText(userEmail);
    otherEmailField.setText(userOtherEmail);
    phoneField.setText(String.valueOf(userPhone));
    genderBox.setSelectedItem(userGender);
    studentCheckBox.setSelected(false);
    teacherCheckBox.setSelected(false);
    preceptorCheckBox.setSelected(false);
    adminCheckBox.setSelected(false);

    ArrayList userCategories = User.getUserCategoriesByUsercode(usercode);
    int categoriesSize = userCategories.size();

    for(int i = 0; i < categoriesSize; i++) {
      int categorie = (int) userCategories.get(i);
      if(categorie == 1) studentCheckBox.setSelected(true); 
      else if(categorie == 2) teacherCheckBox.setSelected(true);
      else if(categorie == 3) preceptorCheckBox.setSelected(true);
      else if(categorie == 4) adminCheckBox.setSelected(true);
    }
  }
    
  private boolean emptyFields() {
    if(nameField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ingrese el nombre"); 
      return true;
    }
    if(lastnameField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ingrese el apellido"); 
      return true;
    }
    if(emailField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ingrese el correo"); 
      return true;
    }
    if(!String.valueOf(passwordField.getPassword()).isEmpty() && String.valueOf(confirmPasswordField.getPassword()).isEmpty()) { 
      JOptionPane.showMessageDialog(null, "Confirme la contraseña");
      return true; 
   }
    if(!String.valueOf(confirmPasswordField.getPassword()).isEmpty() && String.valueOf(passwordField.getPassword()).isEmpty()) { 
      JOptionPane.showMessageDialog(null, "ingrese la contraseña");
      return true; 
    }
    if(!String.valueOf(passwordField.getPassword()).equals(String.valueOf(confirmPasswordField.getPassword()))) {
      JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
      return true; 
    }
    if(phoneField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ingrese el número de teléfono"); 
      return true;
    }
    if(genderBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Ingrese el genéro"); 
      return true;
    }

    return false;
  }
    
  private void cleanFields() {
      usernameUserToFindField.setText("");
      usernameLabel.setText("");
      nameField.setText("");
      lastnameField.setText("");
      emailField.setText("");
      otherEmailField.setText("");
      passwordField.setText("");
      confirmPasswordField.setText("");
      phoneField.setText("");
      genderBox.setSelectedIndex(0);
      studentCheckBox.setSelected(false);
      teacherCheckBox.setSelected(false);
      preceptorCheckBox.setSelected(false);
      adminCheckBox.setSelected(false);

  }

  private void changeCategories() throws ParseException {
    ArrayList userCategories = User.getUserCategoriesByUsercode(usercode);

    boolean wasStudent = false;
    boolean wasTeacher = false;
    boolean wasPreceptor = false;
    boolean wasAdmin = false;

    for(int i = 0; i < userCategories.size(); i++) {
      int categorie = (int) userCategories.get(i);    

      if(categorie == 1 && !studentCheckBox.isSelected()) User.removeCategorie("Alumno", userUsername);
      else if(categorie == 2 && !teacherCheckBox.isSelected()) User.removeCategorie("Profesor", userUsername);
      else if(categorie == 3 && !preceptorCheckBox.isSelected()) User.removeCategorie("Preceptor", userUsername);
      else if(categorie == 4 && !adminCheckBox.isSelected()) User.removeCategorie("Administrador", userUsername);

      if(categorie == 1) wasStudent = true;
      else if(categorie == 2) wasTeacher = true;
      else if(categorie == 3) wasPreceptor = true;
      else if(categorie == 4) wasAdmin = true;
    }

    if(studentCheckBox.isSelected() && !wasStudent){
      User.addCategorie("Alumno", userUsername);
    } 
    if(teacherCheckBox.isSelected() && !wasTeacher){
      User.addCategorie("Profesor", userUsername);
    }
    if(preceptorCheckBox.isSelected() && !wasPreceptor){
      User.addCategorie("Preceptor", userUsername);
    }
    if(adminCheckBox.isSelected() && !wasAdmin) {
      User.addCategorie("Administrador", userUsername);
    }
  }
}
