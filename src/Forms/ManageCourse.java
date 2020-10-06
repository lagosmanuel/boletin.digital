/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Categorie;
import Classes.Course;
import Classes.Division;
import Classes.Orientation;
import Classes.Subject;
import Classes.User;
import Classes.Year;
import Utils.Combo;
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
public class ManageCourse extends javax.swing.JFrame {

    /**
     * Creates new form ManageCourse
     */
    public ManageCourse() {
      initComponents();
      changeBoxs();
    }

    Menu menu;
    private String userToMoveUsername;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel6 = new javax.swing.JLabel();
    jButton3 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    studentsManageCourse = new javax.swing.JButton();
    jLabel8 = new javax.swing.JLabel();
    exitManageCourse = new javax.swing.JButton();
    yearBox = new javax.swing.JComboBox<>();
    orientationBox = new javax.swing.JComboBox<>();
    divisionBox = new javax.swing.JComboBox<>();
    jLabel9 = new javax.swing.JLabel();
    studentsManageCourse1 = new javax.swing.JButton();
    jLabel10 = new javax.swing.JLabel();
    studentsManageCourse2 = new javax.swing.JButton();
    jLabel11 = new javax.swing.JLabel();
    jSeparator1 = new javax.swing.JSeparator();
    studentsManageCourse3 = new javax.swing.JButton();
    jLabel12 = new javax.swing.JLabel();
    loadSubject = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jButton5 = new javax.swing.JButton();
    jButton6 = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    usernameField = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jToggleButton1 = new javax.swing.JToggleButton();
    jLabel13 = new javax.swing.JLabel();

    jLabel6.setText("jLabel6");

    jButton3.setText("jButton3");

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Administración de cursos");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Anotar alumnos en un curso determinado");

    jLabel3.setText("Año:");

    jLabel4.setText("Orientación:");

    jLabel5.setText("División:");

    studentsManageCourse.setText("CREAR");
    studentsManageCourse.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        studentsManageCourseActionPerformed(evt);
      }
    });

    exitManageCourse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    exitManageCourse.setText("SALIR");
    exitManageCourse.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitManageCourseActionPerformed(evt);
      }
    });

    yearBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                        ", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo" }));

    orientationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                ", "General", "Informática", "Electromecánica" }));

    divisionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "               ", "Primera", "Segunda" }));

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel9.setText("Cursos");

    studentsManageCourse1.setText("CREAR");
    studentsManageCourse1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        studentsManageCourse1ActionPerformed(evt);
      }
    });

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel10.setText("Años");

    studentsManageCourse2.setText("CREAR");
    studentsManageCourse2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        studentsManageCourse2ActionPerformed(evt);
      }
    });

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel11.setText("Orientaciones");

    studentsManageCourse3.setText("CREAR");
    studentsManageCourse3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        studentsManageCourse3ActionPerformed(evt);
      }
    });

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
    jLabel12.setText("Divisiones");

    loadSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    loadSubject.setText("ANOTAR");
    loadSubject.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loadSubjectActionPerformed(evt);
      }
    });

    jButton4.setText("EDITAR");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    jButton5.setText("EDITAR");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton5ActionPerformed(evt);
      }
    });

    jButton6.setText("ELIMINAR");
    jButton6.setEnabled(false);

    jButton7.setText("ELIMINAR");
    jButton7.setEnabled(false);

    jLabel7.setText("Usuario:");

    jButton1.setText("LISTA  DE USUARIOS");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jToggleButton1.setText("MOVER CURSOS");
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton1ActionPerformed(evt);
      }
    });

    jLabel13.setText("Esta opción le permite mover cursos enteros");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(51, 51, 51)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loadSubject))
                  .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8))
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                      .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(studentsManageCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                      .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addComponent(jLabel10)
                      .addComponent(studentsManageCourse1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                      .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12))
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                      .addGroup(layout.createSequentialGroup()
                        .addComponent(studentsManageCourse2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(studentsManageCourse3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                  .addComponent(jLabel1)
                  .addComponent(jLabel2)
                  .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel3)
                      .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addComponent(jLabel7))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel4)
                      .addComponent(orientationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(jLabel5)
                      .addComponent(divisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(usernameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                  .addComponent(jToggleButton1))
                .addGap(0, 20, Short.MAX_VALUE))))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitManageCourse)))
        .addGap(13, 13, 13))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(20, 20, 20)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(orientationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(divisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jButton1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(loadSubject)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel13)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel8)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jToggleButton1)
        .addGap(18, 18, 18)
        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(studentsManageCourse1))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(studentsManageCourse))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel11)
              .addComponent(jLabel12))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(studentsManageCourse2)
              .addComponent(studentsManageCourse3))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton4)
          .addComponent(jButton5)
          .addComponent(jButton6)
          .addComponent(jButton7))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(exitManageCourse)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

    private void exitManageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitManageCourseActionPerformed
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitManageCourseActionPerformed

  private void studentsManageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsManageCourseActionPerformed
    LoadCourse loadCourse = new LoadCourse();
    loadCourse.setVisible(true);
    loadCourse.menu = menu;
    dispose();
  }//GEN-LAST:event_studentsManageCourseActionPerformed

  private void studentsManageCourse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsManageCourse1ActionPerformed
    LoadYear loadYear = new LoadYear();
    loadYear.setVisible(true);
    loadYear.manageCourse = this;
  }//GEN-LAST:event_studentsManageCourse1ActionPerformed

  private void studentsManageCourse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsManageCourse2ActionPerformed
    LoadOrientation loadOrientation = new LoadOrientation();
    loadOrientation.setVisible(true);
    loadOrientation.manageCourse = this;
  }//GEN-LAST:event_studentsManageCourse2ActionPerformed

  private void studentsManageCourse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsManageCourse3ActionPerformed
    LoadDivision loadDivision = new LoadDivision();
    loadDivision.setVisible(true);
    loadDivision.manageCourse = this;
  }//GEN-LAST:event_studentsManageCourse3ActionPerformed

  private void loadSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSubjectActionPerformed
    if (checkEmptyFields()) return;
    if (!Year.checkYear(yearBox.getSelectedItem().toString(), orientationBox.getSelectedItem().toString())) {
      JOptionPane.showMessageDialog(null, "Los datos ingresados del año y la orientación son incorrectos");
      return;
    }

    boolean success = false;
    
    if(!(JOptionPane.showConfirmDialog(null, "Está seguro de anotarlo?") == 0)) return;
    
      int percod = User.getUserCodeByUsername(usernameField.getText());
      
      if(percod == 0) {
        JOptionPane.showMessageDialog(this, "El alumno no fue encontrado");
      }
      
      if(!User.isCategorie(percod, "Alumno")) {
        JOptionPane.showMessageDialog(this, "El usuario no es un alumno actualmente");
        return;
      };
      
      int oricod = Orientation.getOrientationcod(orientationBox.getSelectedItem().toString());
      int anocod = Year.getYearcod(yearBox.getSelectedItem().toString());
      int curcod = Course.getCourseCod(yearBox.getSelectedItem().toString(), orientationBox.getSelectedItem().toString(), divisionBox.getSelectedItem().toString());
      
      try {
        Course.registerStudentInCourse(percod, oricod, anocod, curcod);
        success = true;
      } catch (SQLException ex) {
        Logger.getLogger(CourseToCourse.class.getName()).log(Level.SEVERE, null, ex);
      } catch (ParseException ex) {
        Logger.getLogger(CourseToCourse.class.getName()).log(Level.SEVERE, null, ex);
      } finally {
        if(success == true) {
          JOptionPane.showMessageDialog(this, "El alumno fue anotado");
          cleanFields();
        } else {
          JOptionPane.showMessageDialog(this, "Se produjo un error inesperado");
        }
      }
  }//GEN-LAST:event_loadSubjectActionPerformed

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
  }//GEN-LAST:event_formWindowActivated

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    this.setVisible(false);
    Modify modify = new Modify();
    modify.setVisible(true);
    modify.list = Orientation.getOrientations();
    modify.manageCourse = this;
    modify.table = "ORIENTACIONES";
  }//GEN-LAST:event_jButton4ActionPerformed

  private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    this.setVisible(false);
    Modify modify = new Modify();
    modify.setVisible(true);
    modify.list = Division.getDivisions();
    modify.manageCourse = this;
    modify.table = "DIVISIONES";
  }//GEN-LAST:event_jButton5ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    UserList userList = new UserList();
    userList.setVisible(true);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    CourseToCourse courseToCourse = new CourseToCourse();
    courseToCourse.setVisible(true);
    courseToCourse.manageCourse = this;
    this.setVisible(false);
  }//GEN-LAST:event_jToggleButton1ActionPerformed

    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> divisionBox;
  private javax.swing.JButton exitManageCourse;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JButton jButton5;
  private javax.swing.JButton jButton6;
  private javax.swing.JButton jButton7;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
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
  private javax.swing.JSeparator jSeparator1;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JButton loadSubject;
  private javax.swing.JComboBox<String> orientationBox;
  private javax.swing.JButton studentsManageCourse;
  private javax.swing.JButton studentsManageCourse1;
  private javax.swing.JButton studentsManageCourse2;
  private javax.swing.JButton studentsManageCourse3;
  private javax.swing.JTextField usernameField;
  private javax.swing.JComboBox<String> yearBox;
  // End of variables declaration//GEN-END:variables

  private boolean checkEmptyFields() {
    if(yearBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Indique el año");
    } else if(orientationBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Indique la orientación");
    } else if (divisionBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Ingrese la división");
    } else if (usernameField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ingrese el usuario");
    } else { 
      return false;
    }

    return true;
  }

  void changeBoxs() {
    Combo.setComboBoxItems(Year.getYears(), yearBox);
    Combo.setComboBoxItems(Orientation.getOrientations(), orientationBox);
    Combo.setComboBoxItems(Division.getDivisions(), divisionBox);
  }
  
  public void cleanFields() {
    yearBox.setSelectedIndex(0);
    orientationBox.setSelectedIndex(0);
    divisionBox.setSelectedIndex(0);
    usernameField.setText("");
  }
}
