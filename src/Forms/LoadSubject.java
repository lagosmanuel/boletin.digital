/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Course;
import Classes.Division;
import Classes.Orientation;
import Classes.Subject;
import Classes.Year;
import Utils.Combo;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class LoadSubject extends javax.swing.JFrame {

  /**
   * Creates new form LoadSubject
   */
  public LoadSubject() {
      initComponents();
  }
    
  Menu menu;

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
    nameField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    yearBox = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();
    orientationBox = new javax.swing.JComboBox();
    exitLoadSubject = new javax.swing.JButton();
    loadSubject = new javax.swing.JButton();
    typeBox = new javax.swing.JComboBox<>();
    jLabel6 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Cargar materia");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel2.setText("Indique el nombre de la materia que desee cargar:");

    jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jLabel3.setText("Determine los siguientes datos:");

    jLabel4.setText("Año:");

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
    loadSubject.setText("CARGAR");
    loadSubject.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loadSubjectActionPerformed(evt);
      }
    });

    typeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                                             ", "Formación General", "Formación Técnica Específica" }));
    typeBox.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        typeBoxActionPerformed(evt);
      }
    });

    jLabel6.setText("Categoria:");

    jButton1.setText("NUEVA");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("MODIFICAR");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setText("EDITAR");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(exitLoadSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(12, 12, 12))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE))
                  .addComponent(yearBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(orientationBox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(jLabel5)))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(loadSubject, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(0, 0, Short.MAX_VALUE))
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
            .addContainerGap())))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(19, 19, 19)
        .addComponent(jLabel1)
        .addGap(25, 25, 25)
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(jLabel3)
        .addGap(23, 23, 23)
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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addGap(26, 26, 26))
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(typeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton1)
            .addComponent(jButton3)))
        .addComponent(loadSubject)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(exitLoadSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(21, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void loadSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSubjectActionPerformed
      if (checkEmptyFields()) return;
      if (!Year.checkYear(yearBox.getSelectedItem().toString(), orientationBox.getSelectedIndex())) {
        JOptionPane.showMessageDialog(null, "Los datos ingresados del año y la orientación son incorrectos");
        return;
      }
      if (!Subject.checkType(typeBox.getSelectedItem().toString())) {
        JOptionPane.showMessageDialog(null, "El tipo de matería no existe");
        return;
      }
      if (orientationBox.getSelectedIndex() == 1 && typeBox.getSelectedIndex() == 2) {
        JOptionPane.showMessageDialog(null, "Revise el tipo de la materia");
        return;
      }

      if(!(JOptionPane.showConfirmDialog(null, "Está seguro de crearla?") == 0)) return;

      Subject subject = new Subject();
      subject.setForcod(typeBox.getSelectedIndex());
      subject.setName(nameField.getText());

      try {
        if(subject.save()) {
          String year = yearBox.getSelectedItem().toString();
          String orientation = orientationBox.getSelectedItem().toString();

          int oricod = Orientation.getOrientationcod(orientation);
          int anocod = Year.getYearcod(year);

          if(orientationBox.getSelectedItem().toString().equals("General")) {
            if(!Course.setCourses(oricod, anocod, Course.getCoursesCod(year, orientation), Subject.getSubjectcod(subject.getName(), subject.getForcod()), subject.getForcod())) {
              JOptionPane.showMessageDialog(null, "Algo salió mal");
              subject.delete();
              return;
            }
          } else {
            if(!Course.setCourse(oricod, anocod, Course.getCourseCod(year, orientation), Subject.getSubjectcod(subject.getName(), subject.getForcod()), subject.getForcod())){
              JOptionPane.showMessageDialog(null, "Algo salió mal");
              subject.delete();
              return;
            }
          }

          JOptionPane.showMessageDialog(null, "La materia fue creada correctamente");
          cleanFields();
        } else {
          JOptionPane.showMessageDialog(null, "Algo salió mal. código de error: " + subject.errorCode);
        }
      } catch (ParseException ex) {
        Logger.getLogger(LoadSubject.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_loadSubjectActionPerformed

    private void orientationBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orientationBoxActionPerformed
        
    }//GEN-LAST:event_orientationBoxActionPerformed

    private void exitLoadSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitLoadSubjectActionPerformed
      menu.setVisible(true);
      dispose();
    }//GEN-LAST:event_exitLoadSubjectActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    LoadType loadType = new LoadType();
    loadType.loadSubject = this;
    loadType.setVisible(true);
  }//GEN-LAST:event_jButton1ActionPerformed

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    changeBoxs();
  }//GEN-LAST:event_formWindowActivated

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    this.setVisible(false);
    Modify modify = new Modify();
    modify.setVisible(true);
    modify.list = Subject.getTypes();
    modify.loadSubject = this;
    modify.table = "FORMACIONES";
  }//GEN-LAST:event_jButton3ActionPerformed

  private void typeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeBoxActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_typeBoxActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.setVisible(false);
    Modify modify = new Modify();
    modify.setVisible(true);
    modify.list = Subject.getSubjects();
    modify.loadSubject = this;
    modify.table = "MATERIAS";
  }//GEN-LAST:event_jButton2ActionPerformed

    
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton exitLoadSubject;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JButton loadSubject;
  private javax.swing.JTextField nameField;
  private javax.swing.JComboBox orientationBox;
  private javax.swing.JComboBox<String> typeBox;
  private javax.swing.JComboBox yearBox;
  // End of variables declaration//GEN-END:variables

  private boolean checkEmptyFields() {
    if (nameField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Indique el nombre");
    } else if(yearBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Indique el año");
    } else if(orientationBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Indique la orientación");
    } else if (typeBox.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Ingrese el tipo");
    } else {
      return false;
    }

    return true;
  }

  public void cleanFields() {
    nameField.setText("");
    yearBox.setSelectedIndex(0);
    orientationBox.setSelectedIndex(0);
    typeBox.setSelectedIndex(0);
    nameField.requestFocus();
  }

  void changeBoxs() {
    Combo.setComboBoxItems(Year.getYears(), yearBox);
    Combo.setComboBoxItems(Orientation.getOrientations(), orientationBox);
    Combo.setComboBoxItems(Subject.getTypes(), typeBox);
  }
}
