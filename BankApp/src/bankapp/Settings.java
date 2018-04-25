/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import com.sun.glass.events.KeyEvent;
import java.awt.Point;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author KINGSLEY
 */
public class Settings extends javax.swing.JFrame {

    /**
     * Creates new form Settings
     */
    Connection conn;
    account usrAcct;
    
    public Settings() {
        initComponents();
    }

    public Settings(account AcctObj, Connection Obj){
        initComponents();
        conn = Obj ;
        usrAcct = AcctObj;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        newFname = new javax.swing.JTextField();
        FName = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        newLname = new javax.swing.JTextField();
        LName = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        newUsr = new javax.swing.JTextField();
        usrNumber = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pin = new javax.swing.JButton();
        newPinNumber = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        pinNumber = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        newMobileNumber = new javax.swing.JTextField();
        mobile = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        oldUsr = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });

        jLabel1.setText("Change first Name : ");

        FName.setBackground(new java.awt.Color(102, 102, 102));
        FName.setText("Change");
        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Change Last Name : ");

        LName.setBackground(new java.awt.Color(102, 102, 102));
        LName.setText("Change");
        LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameActionPerformed(evt);
            }
        });

        jLabel3.setText("Change Usr Number : ");

        newUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newUsrKeyTyped(evt);
            }
        });

        usrNumber.setBackground(new java.awt.Color(102, 102, 102));
        usrNumber.setText("Change");
        usrNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usrNumberActionPerformed(evt);
            }
        });

        jLabel4.setText("Change Pin : ");

        pin.setBackground(new java.awt.Color(102, 102, 102));
        pin.setText("Change");
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });

        newPinNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newPinNumberKeyTyped(evt);
            }
        });

        jLabel5.setText("Change mobile Number : ");

        pinNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinNumberKeyTyped(evt);
            }
        });

        jLabel6.setText("old Usr :");

        newMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newMobileNumberKeyTyped(evt);
            }
        });

        mobile.setBackground(new java.awt.Color(102, 102, 102));
        mobile.setText("Change");
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });

        jLabel7.setText("<----  Home");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        oldUsr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                oldUsrKeyTyped(evt);
            }
        });

        jLabel8.setText("old Pin :");

        jLabel9.setText("new Usr:");

        jLabel10.setText("new Pin :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mobile))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(28, 28, 28)
                                            .addComponent(newFname, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(oldUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FName)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(newPinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(newLname, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pin)
                                    .addComponent(usrNumber)
                                    .addComponent(LName))))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LName))))
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newUsr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usrNumber))
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin))
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //changes the first name of user
    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:
        if(FName.getText() != null){
        usrAcct.setFirstName(FName.getText());
        JOptionPane.showMessageDialog(null, "Completed!");
        }
        else{
            JOptionPane.showMessageDialog(null,"No entry");
        }
    }//GEN-LAST:event_FNameActionPerformed
   
    //changes the last name of user
    private void LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameActionPerformed
        // TODO add your handling code here:
        if(LName.getText() != null){
        usrAcct.setLastName(LName.getText());
        JOptionPane.showMessageDialog(null,"Completed!");
        }
        else{
            JOptionPane.showMessageDialog(null,"No entry");
        }
    }//GEN-LAST:event_LNameActionPerformed
    
    //changes the user number of user
    private void usrNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrNumberActionPerformed
        try {
            // TODO add your handling code here:
            Statement stmt = conn.createStatement();
            if (usrAcct.getUsrNumber() == Integer.parseInt(oldUsr.getText())){
              
                String sql = "SELECT usrNo from userInfo where usrNo = " 
                        + Integer.parseInt(oldUsr.getText()) ;
                ResultSet rs = stmt.executeQuery(sql);
                
                if (rs == null){
                
                String sqlOne = "UPDATE userInfo SET usrNo = " + Integer.parseInt(oldUsr.getText())  ;
                stmt.executeUpdate(sqlOne);
                JOptionPane.showMessageDialog(null, "Successful!");
                
                }
                else{
                    JOptionPane.showMessageDialog(null, "User Already exists");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong usr Number");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_usrNumberActionPerformed

    //changes the pin of the usr
    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
        if(pin.getText() != null){
            if(Integer.parseInt(pinNumber.getText())== usrAcct.getPin() ){
                usrAcct.setPin(Integer.parseInt(newPinNumber.getText()));
                JOptionPane.showMessageDialog(null, "Completed!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Wrong pin");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No entry");
        }    
        
    }//GEN-LAST:event_pinActionPerformed

    //changes the mobile number of the user
    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
        if(newMobileNumber.getText() != null){
               usrAcct.setLastName(newMobileNumber.getText());
               JOptionPane.showMessageDialog(null,"Completed!");
        }
        else{
            JOptionPane.showMessageDialog(null,"No entry");
        }        
        
    }//GEN-LAST:event_mobileActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        home usrHome = new home(usrAcct,conn);
        usrHome.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void oldUsrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oldUsrKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) ||(c == KeyEvent.VK_BACKSPACE)
                || c == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_oldUsrKeyTyped

    private void newUsrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newUsrKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) ||(c == KeyEvent.VK_BACKSPACE)
                || c == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_newUsrKeyTyped

    private void newMobileNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newMobileNumberKeyTyped
         char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) ||(c == KeyEvent.VK_BACKSPACE)
                || c == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_newMobileNumberKeyTyped

    private void pinNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinNumberKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) ||(c == KeyEvent.VK_BACKSPACE)
                || c == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_pinNumberKeyTyped

    private void newPinNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newPinNumberKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)) ||(c == KeyEvent.VK_BACKSPACE)
                || c == KeyEvent.VK_DELETE){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_newPinNumberKeyTyped

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        Point p = evt.getLocationOnScreen();
        this.setLocation(p);
    }//GEN-LAST:event_jPanel1MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Settings().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FName;
    private javax.swing.JButton LName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mobile;
    private javax.swing.JTextField newFname;
    private javax.swing.JTextField newLname;
    private javax.swing.JTextField newMobileNumber;
    private javax.swing.JPasswordField newPinNumber;
    private javax.swing.JTextField newUsr;
    private javax.swing.JTextField oldUsr;
    private javax.swing.JButton pin;
    private javax.swing.JPasswordField pinNumber;
    private javax.swing.JButton usrNumber;
    // End of variables declaration//GEN-END:variables
}