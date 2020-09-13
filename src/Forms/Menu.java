/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.User;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Menu extends javax.swing.JFrame {

  /**
   * Creates new form Menu
   */
  public static String currentUsername;
  public static int currentUserCode;
  public static ArrayList currentUserCategories = new ArrayList();

  public Menu(int usercode, String username, ArrayList userCategories) {
    currentUserCode = usercode;
    currentUsername = username;
    currentUserCategories = userCategories;

    initComponents();
    enableButtonsByUserCategories(currentUserCategories);
  }
   
    
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        seeMarksButton = new javax.swing.JButton();
        seeCoursesButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loadMarksButton = new javax.swing.JButton();
        loadSubjectsButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        manageSubjectsButton = new javax.swing.JButton();
        manageUsersButton = new javax.swing.JButton();
        manageCoursesButton = new javax.swing.JButton();
        exitMenu = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("CURSOS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Menú");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Ver:");

        seeMarksButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seeMarksButton.setText("NOTAS ");
        seeMarksButton.setEnabled(false);

        seeCoursesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seeCoursesButton.setText("CURSOS");
        seeCoursesButton.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cargar:");

        loadMarksButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadMarksButton.setText("NOTAS");
        loadMarksButton.setEnabled(false);

        loadSubjectsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadSubjectsButton.setText("MATERIAS");
        loadSubjectsButton.setEnabled(false);
        loadSubjectsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSubjectsButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Administrar:");

        manageSubjectsButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageSubjectsButton.setText("MATERIAS");
        manageSubjectsButton.setEnabled(false);
        manageSubjectsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSubjectsButtonActionPerformed(evt);
            }
        });

        manageUsersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageUsersButton.setText("USUARIOS");
        manageUsersButton.setEnabled(false);
        manageUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUsersButtonActionPerformed(evt);
            }
        });

        manageCoursesButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        manageCoursesButton.setText("CURSOS");
        manageCoursesButton.setEnabled(false);
        manageCoursesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCoursesButtonActionPerformed(evt);
            }
        });

        exitMenu.setText("SALIR");
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });

        jButton1.setText("CONTRASEÑA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seeMarksButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(loadMarksButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(manageCoursesButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(seeCoursesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(manageSubjectsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                            .addComponent(loadSubjectsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(manageUsersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)))))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seeMarksButton)
                    .addComponent(seeCoursesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadMarksButton)
                    .addComponent(loadSubjectsButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageSubjectsButton)
                    .addComponent(manageCoursesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageUsersButton)
                    .addComponent(jButton1))
                .addGap(14, 14, 14)
                .addComponent(exitMenu)
                .addGap(6, 6, 6))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUsersButtonActionPerformed
      ManageUser manageUser = new ManageUser();
      manageUser.setVisible(true);
      manageUser.menuInstance = this;
      this.setVisible(false);
    }//GEN-LAST:event_manageUsersButtonActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
      if(JOptionPane.showConfirmDialog(null, "Está seguro de salir?") == 0) dispose();
    }//GEN-LAST:event_exitMenuActionPerformed

    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_exitMenuMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      ChangePassword changePassword = new ChangePassword();
      changePassword.username = currentUsername;
      changePassword.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void manageCoursesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCoursesButtonActionPerformed
      ManageCourse manageCourse = new ManageCourse();
      manageCourse.setVisible(true);
      manageCourse.menu = this;
      this.setVisible(false);
    }//GEN-LAST:event_manageCoursesButtonActionPerformed

    private void manageSubjectsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageSubjectsButtonActionPerformed
      ManageSubject manageSubject = new ManageSubject();
      manageSubject.setVisible(true);
      manageSubject.menu = this;
      this.setVisible(false);
    }//GEN-LAST:event_manageSubjectsButtonActionPerformed

    private void loadSubjectsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSubjectsButtonActionPerformed
      LoadSubject loadSubject = new LoadSubject();
      loadSubject.setVisible(true);
      loadSubject.menu = this;
      this.setVisible(false);
    }//GEN-LAST:event_loadSubjectsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loadMarksButton;
    private javax.swing.JButton loadSubjectsButton;
    private javax.swing.JButton manageCoursesButton;
    private javax.swing.JButton manageSubjectsButton;
    private javax.swing.JButton manageUsersButton;
    private javax.swing.JButton seeCoursesButton;
    private javax.swing.JButton seeMarksButton;
    // End of variables declaration//GEN-END:variables

    private void enableButtonsByUserCategories(ArrayList currentUserCategories) {
        for(int i = 0; i < currentUserCategories.size(); i++) {
            int categorie = (int) currentUserCategories.get(i);    
            
            if(User.getCatcodByCategorieName("Alumno") == categorie || User.getCatcodByCategorieName("Profesor") == categorie || User.getCatcodByCategorieName("Administrador") == categorie) {
                seeMarksButton.setEnabled(true);
                seeCoursesButton.setEnabled(true);
            } 
          
            if(User.getCatcodByCategorieName("Profesor") == categorie) {
                loadMarksButton.setEnabled(true);
            }
            
            if(User.getCatcodByCategorieName("Preceptor") == categorie || User.getCatcodByCategorieName("Administrador") == categorie) {
                seeMarksButton.setEnabled(true);
                seeCoursesButton.setEnabled(true);
                manageCoursesButton.setEnabled(true);
                manageSubjectsButton.setEnabled(true);
                loadSubjectsButton.setEnabled(true);
            }   
            
            if(categorie == 4) {
                manageUsersButton.setEnabled(true);
            }
        }
    }
}
