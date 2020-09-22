/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Course;
import Classes.Role;
import Classes.User;
import Classes.UsersCategories;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ManageUser extends javax.swing.JFrame {

    /**
     * Creates new form ManageUser
     */
    public ManageUser() {
        initComponents();
    }
    
    Menu menuInstance = null;

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
        nameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lastnameField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        optionalEmailField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        genderField = new javax.swing.JComboBox();
        createManageUser = new javax.swing.JButton();
        changeManageUser = new javax.swing.JButton();
        exitManageUser = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        phoneField = new javax.swing.JTextField();
        adminCheckBox = new javax.swing.JCheckBox();
        teacherCheckBox = new javax.swing.JCheckBox();
        preceptorCheckBox = new javax.swing.JCheckBox();
        studentCheckBox = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Crear usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Datos del usuario:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Correo:");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Correo 2:");

        jLabel7.setText("Contraseña:");

        jLabel8.setText("Teléfono:");

        jLabel10.setText("Sexo:");

        genderField.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "                           ", "Masculino", "Femenino", "Otro" }));

        createManageUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createManageUser.setText("CREAR");
        createManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createManageUserActionPerformed(evt);
            }
        });

        changeManageUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        changeManageUser.setText("MODIFICAR");
        changeManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeManageUserActionPerformed(evt);
            }
        });

        exitManageUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitManageUser.setText("SALIR");
        exitManageUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitManageUserActionPerformed(evt);
            }
        });

        jLabel12.setText("Confirmar Contraseña:");

        jLabel9.setText("Usuario:");

        jButton1.setText("COMPROBAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        phoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phoneFieldKeyTyped(evt);
            }
        });

        adminCheckBox.setText("Administrador");

        teacherCheckBox.setText("Profesor");

        preceptorCheckBox.setText("Preceptor");

        studentCheckBox.setText("Alumno");

        jLabel13.setText("Categoría:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel10)
                                        .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(genderField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentCheckBox)
                                    .addComponent(jLabel13)
                                    .addComponent(teacherCheckBox)
                                    .addComponent(preceptorCheckBox)
                                    .addComponent(adminCheckBox)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(passwordField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(emailField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lastnameField, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel6)
                                        .addComponent(optionalEmailField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                        .addComponent(confirmPasswordField))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(createManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeManageUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitManageUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optionalEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(genderField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preceptorCheckBox)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createManageUser)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changeManageUser)
                        .addComponent(exitManageUser)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void changeManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeManageUserActionPerformed
        ModifyUser modifyUser = new ModifyUser();
        modifyUser.setVisible(true);
        modifyUser.menuInstance = menuInstance;
        dispose();
    }//GEN-LAST:event_changeManageUserActionPerformed

    private void exitManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitManageUserActionPerformed
        menuInstance.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitManageUserActionPerformed

    private void createManageUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createManageUserActionPerformed
        if (emptyLoginFields()) return;
        
        if(!(JOptionPane.showConfirmDialog(null, "Está seguro de crearlo?") == 0)) return;
        
        User user = new User();
        user.setUsername(usernameField.getText());
        user.setName(nameField.getText());
        user.setLastname(lastnameField.getText());
        user.setEmail(emailField.getText());
        user.setOptionalEmail(optionalEmailField.getText());
        user.setPassword(new String(passwordField.getPassword()).toString());
        user.setPhone(Long.parseLong(phoneField.getText()));
        user.setGender(genderField.getSelectedItem().toString());
        
        if(user.save()){
            try {   
                setCategories();
                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");
                if(studentCheckBox.isSelected()) {
                  if(!(JOptionPane.showConfirmDialog(null, "Desea inscribir al alumno en primer año?") == 0)) return;
                  RegisterFirstGrade registerFirstGrade = new RegisterFirstGrade();
                  registerFirstGrade.setVisible(true);
                }
            } catch (ParseException ex) {
                Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            cleanFields();     
            
        } else {
            if(user.getErrorCode() == 1062) {
                JOptionPane.showMessageDialog(null, "El nombre de usario ingresado no está disponible");
                usernameField.setText("");
                usernameField.requestFocus();
            }
            else {
                JOptionPane.showMessageDialog(null, "Se ha producido un error (código: " + String.valueOf(user.getErrorCode()) + ")");
            }
        }
    }//GEN-LAST:event_createManageUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(usernameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de usuario");
        } else if (User.checkUsername(usernameField.getText())){
            JOptionPane.showMessageDialog(null, "El nombre de usuario no está disponible");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario está disponible");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void phoneFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneFieldKeyTyped
        if(!(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')) evt.consume();
    }//GEN-LAST:event_phoneFieldKeyTyped


    private boolean emptyLoginFields() {
        if(usernameField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de usuario"); 
            return true;
        }
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
        if(phoneField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el número de teléfono"); 
            return true;
        }
        if(genderField.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Ingrese el genéro"); 
            return true;
        }
        if (!studentCheckBox.isSelected() && !teacherCheckBox.isSelected() && !preceptorCheckBox.isSelected() && !adminCheckBox.isSelected()) {
            JOptionPane.showMessageDialog(null, "Indique al menos una categoría del usuario"); 
            return true;
        }
            
        return false;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox adminCheckBox;
    private javax.swing.JButton changeManageUser;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JButton createManageUser;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitManageUser;
    private javax.swing.JComboBox genderField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField optionalEmailField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JCheckBox preceptorCheckBox;
    private javax.swing.JCheckBox studentCheckBox;
    private javax.swing.JCheckBox teacherCheckBox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
 
    private void cleanFields() {
        usernameField.setText("");
        nameField.setText("");
        lastnameField.setText("");
        emailField.setText("");
        optionalEmailField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        phoneField.setText("");
        genderField.setSelectedIndex(0);
        studentCheckBox.setSelected(false);
        teacherCheckBox.setSelected(false);
        preceptorCheckBox.setSelected(false);
        adminCheckBox.setSelected(false);
    }

    private void setCategories() throws ParseException {
        //UsersCategories usersCategories = new UsersCategories();
        
        if(studentCheckBox.isSelected()) User.addCategorie("Alumno", usernameField.getText());
        if(teacherCheckBox.isSelected()) User.addCategorie("Profesor", usernameField.getText());
        if(preceptorCheckBox.isSelected()) User.addCategorie("Preceptor", usernameField.getText());
        if(adminCheckBox.isSelected()) User.addCategorie("Administrador", usernameField.getText());
        
    }
}
