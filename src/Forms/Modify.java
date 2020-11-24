/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Utils.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author lagos
 */
public class Modify extends javax.swing.JFrame {

  /**
   * Creates new form Modify
   */
  public Modify() {
    initComponents();
  }
  
  ArrayList list;
  String table;
  ManageCourse manageCourse;
  LoadSubject loadSubject;
  
  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    combo = new javax.swing.JComboBox<>();
    nameField = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jToggleButton1 = new javax.swing.JToggleButton();
    jToggleButton2 = new javax.swing.JToggleButton();
    jButton1 = new javax.swing.JButton();
    titleLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
      public void windowClosed(java.awt.event.WindowEvent evt) {
        formWindowClosed(evt);
      }
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    combo.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        comboItemStateChanged(evt);
      }
    });

    jLabel1.setText("Nuevo nombre:");

    jToggleButton1.setText("ELIMINAR");
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton1ActionPerformed(evt);
      }
    });

    jToggleButton2.setText("GUARDAR");
    jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton2ActionPerformed(evt);
      }
    });

    jButton1.setText("VOLVER");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    titleLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    titleLabel.setText("Modificar ");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(62, 62, 62)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jToggleButton2))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(titleLabel))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jToggleButton1)))
        .addContainerGap(67, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addComponent(titleLabel)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jToggleButton1))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jToggleButton2))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
        .addComponent(jButton1)
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    String title = table.substring(0, 1).toUpperCase() + table.substring(1).toLowerCase();
    titleLabel.setText(title);
  }//GEN-LAST:event_formWindowActivated

  private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
   if(!(JOptionPane.showConfirmDialog(null, "Está seguro de eliminarlo?") == 0)) return;
   
   if(deleteRow()) {
      if (manageCourse != null) manageCourse.changeBoxs();
      if (loadSubject != null) loadSubject.changeBoxs();
      JOptionPane.showMessageDialog(null, "Se ha eliminado corecctamente");
      combo.removeItem(combo.getSelectedItem());
      return;
    }
    
    JOptionPane.showMessageDialog(null, "Se ha producido un error inespearado");
  }//GEN-LAST:event_jToggleButton1ActionPerformed

  private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
    if(combo.getSelectedIndex() == 0) {
      JOptionPane.showMessageDialog(null, "Seleccione lo que desea modificar");
      return;
    }
    
    if(nameField.getText().isEmpty()) {
      JOptionPane.showMessageDialog(null, "Ingrese el nuevo nombre");
      return;
    }  
    
    if(!(JOptionPane.showConfirmDialog(null, "Está seguro de modificarlo?") == 0)) return;
    
    String name = nameField.getText();
    
    if(modifyRow(name)) {
      
      if (manageCourse != null) manageCourse.changeBoxs();
      if (loadSubject != null) loadSubject.changeBoxs();
      
      JOptionPane.showMessageDialog(null, "Se ha modificado corecctamente");
      
      combo.removeItem(combo.getSelectedItem());
      combo.addItem(name);
      nameField.setText("");
      return;
    }
    
    JOptionPane.showMessageDialog(null, "Se ha producido un error inespearado");
  }//GEN-LAST:event_jToggleButton2ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    

    if (manageCourse != null) manageCourse.setVisible(true);
    if (loadSubject != null)  loadSubject.setVisible(true);

    dispose();    
  }//GEN-LAST:event_jButton1ActionPerformed

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    changeCombo();
  }//GEN-LAST:event_formWindowOpened

  private void comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboItemStateChanged
    nameField.setText(combo.getSelectedItem().toString());
  }//GEN-LAST:event_comboItemStateChanged

  private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    if (manageCourse != null) manageCourse.setVisible(true);
    if (loadSubject != null) loadSubject.setVisible(true);
  }//GEN-LAST:event_formWindowClosed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox<String> combo;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JToggleButton jToggleButton2;
  private javax.swing.JTextField nameField;
  private javax.swing.JLabel titleLabel;
  // End of variables declaration//GEN-END:variables

  private void changeCombo() {
    Utils.Combo.setComboBoxItems(list, combo);
  }

  private boolean deleteRow() {
    BasicDataSource bs = Config.setDBParams();
    Connection connection = null;

    String prefix = table.substring(0, 3);
    int cod = getCodByNameInTable(table, combo.getSelectedItem().toString());
    
    String query = "UPDATE " + table + " SET " + prefix + "_FECHAFIN=? WHERE " + prefix + "_COD=" + cod + ";";

    try {
      java.sql.Date todayDate = new java.sql.Date(new Date().getTime());

      connection = bs.getConnection();
      PreparedStatement preparedStatemnet = connection.prepareStatement(query);
      preparedStatemnet.setDate(1, todayDate);
      preparedStatemnet.execute();
      
      return true;
    } catch (SQLException e) {
      System.out.println("ERROR: " + e.getMessage());
    } finally {
      if(connection != null) try {
        connection.close();
      } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    return false;
  } 

  private int getCodByNameInTable(String table, String name) {
    BasicDataSource bs = Config.setDBParams();
    Connection connection = null;
    java.sql.Date todayDate = new java.sql.Date(new Date().getTime());

    String prefix = table.substring(0, 3);

    String query = "SELECT * FROM `" + table + "` WHERE `" + prefix + "_NOMBRE`='" + name + "' AND '" + prefix + "_FECHAFIN' > ?;";

    try {
      connection = bs.getConnection();
      PreparedStatement preparedStatemnet = connection.prepareStatement(query);
      preparedStatemnet.setDate(1, todayDate);
      preparedStatemnet.execute();
      ResultSet rs = (ResultSet) preparedStatemnet.getResultSet();

      if(rs.next()){
        return (int) rs.getInt(prefix + "_COD");
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

    return 0;
  }

  private boolean modifyRow(String newName) {
    BasicDataSource bs = Config.setDBParams();
    Connection connection = null;

    String prefix = table.substring(0, 3);
    int cod = getCodByNameInTable(table, combo.getSelectedItem().toString());
    
    String query = "UPDATE " + table + " SET " + prefix + "_NOMBRE=? WHERE " + prefix + "_COD=" + cod + " AND " + prefix + "_FECHAFIN > ?;";

    try {
      java.sql.Date todayDate = new java.sql.Date(new Date().getTime());

      connection = bs.getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(query);
      preparedStatement.setString(1, newName);
      preparedStatement.setDate(2, todayDate);
      preparedStatement.execute();
      
      return true;
    } catch (SQLException e) {
      System.out.println("ERROR: " + e.getMessage());
    } finally {
      if(connection != null) try {
        connection.close();
      } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
    return false;
  }
}