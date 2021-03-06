/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Course;
import Classes.Division;
import Classes.Orientation;
import Utils.Combo;
import Classes.Year;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lagos
 */
public class DeleteCourse extends javax.swing.JFrame {

    /**
     * Creates new form LoadCourse
     */
    public DeleteCourse() {
        initComponents();
    }
    
    ManageCourse manageCourse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    yearBox = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();
    orientationBox = new javax.swing.JComboBox();
    exitLoadSubject = new javax.swing.JButton();
    loadSubject = new javax.swing.JButton();
    divisionBox = new javax.swing.JComboBox<>();
    jLabel1 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
    });

    yearBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "           ", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo" }));

    jLabel5.setText("Orientación:");

    orientationBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "           ", "General", "Informática", "Electromecánica" }));
    orientationBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        orientationBoxActionPerformed(evt);
      }
    });

    exitLoadSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    exitLoadSubject.setText("SALIR");
    exitLoadSubject.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitLoadSubjectActionPerformed(evt);
      }
    });

    loadSubject.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    loadSubject.setText("ELIMINAR");
    loadSubject.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loadSubjectActionPerformed(evt);
      }
    });

    divisionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                     ", "Primera", "Segunda", "Tercera" }));

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Eliminar curso");

    jLabel6.setText("División:");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setText("Determine los datos del curso");

    jLabel4.setText("Año:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addComponent(exitLoadSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(56, 56, 56)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(loadSubject)
            .addGap(244, 244, 244))
          .addComponent(jLabel6)
          .addComponent(jLabel1)
          .addComponent(jLabel3)
          .addComponent(divisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel4)
              .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(orientationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel5))))
        .addContainerGap(60, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(32, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addComponent(jLabel3)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(orientationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(divisionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(loadSubject)
        .addGap(26, 26, 26)
        .addComponent(exitLoadSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void orientationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orientationBoxActionPerformed

  }//GEN-LAST:event_orientationBoxActionPerformed

  private void exitLoadSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitLoadSubjectActionPerformed
    manageCourse.setVisible(true);
    dispose();
  }//GEN-LAST:event_exitLoadSubjectActionPerformed

  private void loadSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSubjectActionPerformed
    if (checkEmptyFields()) return;
    if (!Year.checkYear(yearBox.getSelectedItem().toString(), orientationBox.getSelectedItem().toString())) {
      JOptionPane.showMessageDialog(null, "Los datos ingresados del año y la orientación son incorrectos");
      return;
    }

    if(!(JOptionPane.showConfirmDialog(null, "Está seguro de eliminarlo?") == 0)) return;

    Course course = new Course();
    
    int oricod = Orientation.getOrientationcod((String) orientationBox.getSelectedItem()); 
    int yearcod = Year.getYearcod((String) yearBox.getSelectedItem(), oricod);
        
    String div = divisionBox.getSelectedItem().toString();
   
    int curcod = Course.getCurcodByDivsion(oricod, yearcod, div, false);
    
    if(curcod == 0 ){
      JOptionPane.showMessageDialog(null, "El curso no existe");
      return;
    }
     
    Course.deleteByCurcod(curcod);
   
    JOptionPane.showMessageDialog(null, "El curso fue eliminado");
    
    cleanFields();
  }//GEN-LAST:event_loadSubjectActionPerformed

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    changeBoxs();
  }//GEN-LAST:event_formWindowActivated

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    manageCourse.setVisible(true);
  }//GEN-LAST:event_formWindowClosed

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> divisionBox;
  private javax.swing.JButton exitLoadSubject;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JButton loadSubject;
  private javax.swing.JComboBox orientationBox;
  private javax.swing.JComboBox yearBox;
  // End of variables declaration//GEN-END:variables

  private boolean checkEmptyFields() {
      if(yearBox.getSelectedIndex() == 0) {
          JOptionPane.showMessageDialog(null, "Indique el año");
      } else if(orientationBox.getSelectedIndex() == 0) {
          JOptionPane.showMessageDialog(null, "Indique la orientación");
      } else if (divisionBox.getSelectedIndex() == 0) {
          JOptionPane.showMessageDialog(null, "Indique la división");
      } else {
          return false;
      }

      return true;
    }
    
    public void cleanFields() {
      yearBox.setSelectedIndex(0);
      orientationBox.setSelectedIndex(0);
      divisionBox.setSelectedIndex(0);
    }

  void changeBoxs() {
    Combo.setComboBoxItems(Year.getYears(false), yearBox);
    Combo.setComboBoxItems(Orientation.getOrientations(false), orientationBox);
    Combo.setComboBoxItems(Division.getDivisions(false), divisionBox);
  }
}
