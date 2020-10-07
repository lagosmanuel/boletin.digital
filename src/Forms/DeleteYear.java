/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Classes.Course;
import Classes.Orientation;
import Classes.Subject;
import static Classes.Subject.errorCode;
import static Classes.Subject.getForcod;
import static Classes.Subject.getName;
import Classes.Year;
import Utils.Combo;
import Utils.Config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author lagos
 */
public class DeleteYear extends javax.swing.JFrame {

  /**
   * Creates new form LoadType
   */
  public DeleteYear() {
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

    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jToggleButton1 = new javax.swing.JToggleButton();
    jLabel4 = new javax.swing.JLabel();
    orientationBox = new javax.swing.JComboBox<>();
    yearBox = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setResizable(false);
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowActivated(java.awt.event.WindowEvent evt) {
        formWindowActivated(evt);
      }
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    jLabel1.setText("Nueva año");

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel2.setText("Años");

    jButton1.setText("ELIMINAR");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jToggleButton1.setText("SALIR");
    jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jToggleButton1ActionPerformed(evt);
      }
    });

    jLabel4.setText("Orientación:");

    orientationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "                          ", "General", "Informática", "Electromecánica" }));

    yearBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "           ", "Primero", "Segundo", "Tercero", "Cuarto", "Quinto", "Sexto", "Séptimo" }));

    jLabel5.setText("Año:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel2)
          .addComponent(jLabel1)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
              .addComponent(jButton1)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(jLabel5))
              .addGap(18, 18, 18)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(yearBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(orientationBox, 0, 222, Short.MAX_VALUE)))))
        .addContainerGap(28, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(orientationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel5))
        .addGap(23, 23, 23)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jToggleButton1))
        .addContainerGap())
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    dispose();
  }//GEN-LAST:event_jToggleButton1ActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   
    int oricod = Orientation.getOrientationcod(orientationBox.getSelectedItem().toString());
    
    if(oricod == 0) {
      JOptionPane.showMessageDialog(null, "La orientación no existe");
      return;
    }
    
    if(!Year.checkYear(yearBox.getSelectedItem().toString(), orientationBox.getSelectedItem().toString())){
      JOptionPane.showMessageDialog(null, "Los datos ingresados del año y la orientación son incorrectos");
      return;
    }
    
    if(!(JOptionPane.showConfirmDialog(null, "Está seguro de eliminarlo?") == 0)) return;
    
    Year.delete(yearBox.getSelectedItem().toString(), orientationBox.getSelectedItem().toString());
    
    JOptionPane.showMessageDialog(null, "El año fue eliminado");
    
    manageCourse.changeBoxs();
    manageCourse.setVisible(true);
    dispose();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    // TODO add your handling code here:
  }//GEN-LAST:event_formWindowOpened

  private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    changeBoxs();
  }//GEN-LAST:event_formWindowActivated

  /**
   * @param args the command line arguments
   */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JToggleButton jToggleButton1;
  private javax.swing.JComboBox<String> orientationBox;
  private javax.swing.JComboBox yearBox;
  // End of variables declaration//GEN-END:variables

  private boolean yearAlreadyExist(int oricod, String year) throws ParseException {
    BasicDataSource bs = Config.setDBParams();
    Connection connection = null;

    String query = "SELECT * FROM `ANOS` WHERE `ANO_NOMBRE`='" + year + "' AND `ANO_ORICOD`='" + oricod  + "';";

    try {
      connection = bs.getConnection();
      PreparedStatement preparedStatemnet = connection.prepareStatement(query);
      preparedStatemnet.execute();
      ResultSet rs = (ResultSet) preparedStatemnet.getResultSet();

      if(rs.next()){
        updateYear(rs.getInt("ANO_COD"));
        return true;
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
    
    return false;
  }
  
  private void updateYear(int anocod) throws ParseException {
    BasicDataSource bs = Config.setDBParams();
    Connection connection = null;

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    java.sql.Date neverDate = new java.sql.Date(sdf.parse("01-01-3000").getTime());

    String query = "UPDATE ANOS SET ANO_FECHAFIN=? WHERE ANO_COD=" + anocod + " AND ANO_FECHAFIN < ?;";

    try {           
      connection = bs.getConnection();
      PreparedStatement preparedStatemnet = connection.prepareStatement(query);
      preparedStatemnet.setDate(1, neverDate);
      preparedStatemnet.setDate(2, neverDate);
      preparedStatemnet.execute();

    } catch (SQLException e) {
      System.out.println("ERROR: " + e.getMessage());
    } finally {
      if(connection != null) try {
        connection.close();
      } catch (SQLException ex) {
        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }

  private boolean newYear(int oricod, String year) throws ParseException {
    if(yearAlreadyExist(oricod, year)) return true;

    BasicDataSource bs = Config.setDBParams();
    Connection connection = null;

    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    java.sql.Date neverDate = new java.sql.Date(sdf.parse("01-01-3000").getTime());

    String query = "INSERT INTO `ANOS` (`ANO_ORICOD`, `ANO_NOMBRE`, `ANO_FECHAFIN`) VALUES (?, ?, ?);";

    try {
      connection = bs.getConnection();
      PreparedStatement preparedStatemnet = connection.prepareStatement(query);
      preparedStatemnet.setInt(1, oricod);
      preparedStatemnet.setString(2, year);
      preparedStatemnet.setDate(3, neverDate);
      preparedStatemnet.execute();


      return true;
    } catch (SQLException e) {
      System.out.println("ERROR: " + e.getMessage());
      errorCode = e.getErrorCode();
    } finally {
      if(connection != null) try {
          connection.close();
      } catch (SQLException ex) {
          Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    return false;
  }

  private void changeBoxs() {
    Combo.setComboBoxItems(Orientation.getOrientations(), orientationBox);
    Combo.setComboBoxItems(Year.getYears(), yearBox);
  }
}
