//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018



package com.MainData;

import com.Backend.AntiOverload;
import com.Backend.AutoRepair;
import com.Backend.commonMethods;

import java.awt.Desktop;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.URL;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaco van Stryp
 */
public class MainOptionSelection extends javax.swing.JFrame { // This is the main GUI that opens first allowing the user to chose what they want to do

    /**
     * Creates new form MainOptionSelection
     */
    
    //Code checks if they should have administration access or not
    //this also gets the IP of this computer and compares it to existing IP's
    commonMethods cm = new commonMethods();
 
    AutoRepair ar = new AutoRepair();
    
    int xMouse;
    int yMouse;
Settings sm = new Settings();
    public MainOptionSelection() {
                    ar.saveSettingsToLocal();

        cm.CheckIfDatabaseLocationExcists();
        
        
ar.saveOptimisedSystemToLocalStorage();
        initComponents();

        cm.requestSuspCheck();
       // cm.checkForUpdate();
        jLabel5.setText("Version " + cm.softwareVersion);
        lblJokeMsg.setVisible(false);
        randomQuote.setVisible(false);
 
        try {
            
             if(sm.checkStatus("TestMode") == true)
                {
                    JOptionPane.showMessageDialog(null, "Note\n\nYou Are Running In Test Mode - Version " + cm.getSoftWareActiveVersion()+ "\n\nHistory Will Not Be Saved On This Computer!\n\nCall An Administrator For Help If You Believe This Is A Mistake!", "Test Mode", JOptionPane.WARNING_MESSAGE);
                PrintWriter saveActiveVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\OldUser.db", false));
            saveActiveVotes.print("");
                }
            
            if (cm.checkIfAdminAccessIsEmpty() == true) {
                int setAsAdministrator = JOptionPane.showConfirmDialog(null, "Hello! \n\nIt seems that no administration IP has been set yet\ndo you wish to set this computer as an Administration computer?\n\nNote\n\nMore Computers can be given Administration Access aswell!", "Hello!", 0);
                if (setAsAdministrator == 0) {

                    cm.addIPToAdminitrationAccess(InetAddress.getLocalHost().getHostAddress());

                } else {
                    System.out.println("No");
                    

                }
            }

            if (cm.doesUserIPHaveAdministrationAccess() == true) {
                
            } else {
               
                btnAdmin.setVisible(false);
                if(sm.checkStatus("AllowVote") == false)
                {
                    btnVote.setVisible(false);
                }
                if(sm.checkStatus("AllowNominate") == false)
                {
                    btnNominate.setVisible(false);
                }
                if(sm.checkStatus("AllowGetIP") == false)
                {
                    btnGetIP.setVisible(false);
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Looks like I could not gain access to the IP address, does this program have the appropriate permisions?");
        }
        
    }
    
        
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnVote = new javax.swing.JButton();
        btnNominate = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnGetIP = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblJokeMsg = new javax.swing.JLabel();
        randomQuote = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAdmin.setBackground(new java.awt.Color(255, 89, 33));
        btnAdmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Administration Information");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 345, 464, 70));

        btnVote.setBackground(new java.awt.Color(255, 89, 33));
        btnVote.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote.setForeground(new java.awt.Color(255, 255, 255));
        btnVote.setText("Vote");
        btnVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoteActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 109, 464, 70));

        btnNominate.setBackground(new java.awt.Color(255, 89, 33));
        btnNominate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNominate.setForeground(new java.awt.Color(255, 255, 255));
        btnNominate.setText("Nominate");
        btnNominate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNominateActionPerformed(evt);
            }
        });
        jPanel1.add(btnNominate, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 225, 464, 70));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eduplex High School Electronic Voting System");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 4, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, -1));

        btnGetIP.setBackground(new java.awt.Color(255, 89, 33));
        btnGetIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGetIP.setForeground(new java.awt.Color(255, 255, 255));
        btnGetIP.setText("Get IP");
        btnGetIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetIPActionPerformed(evt);
            }
        });
        jPanel1.add(btnGetIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 465, 85, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 67, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 477, 400, 24));

        lblJokeMsg.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblJokeMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblJokeMsg.setText("Loading Please Wait...");
        jPanel1.add(lblJokeMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 580, 80));

        randomQuote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        randomQuote.setForeground(new java.awt.Color(255, 255, 255));
        randomQuote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        randomQuote.setText("...");
        jPanel1.add(randomQuote, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 720, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoteActionPerformed
        this.load("active");
        new SecureLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoteActionPerformed

    private void btnNominateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominateActionPerformed
        //Takes the user to the nomination screen
         this.load("active");
        new MainNomination().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNominateActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
       //checks if user has administration access then takes them to the Administraion screen if the do have access 
         this.load("active");
       if (cm.doesUserIPHaveAdministrationAccess() == true) {
             try {
                
                 new AdministrationMainModern().setVisible(true);
                 this.dispose();
             } catch (Exception ex) {
             }
        } else {
            this.load("unactive");
            JOptionPane.showMessageDialog(null, "You dont seem to have Administration access");
        }

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnGetIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetIPActionPerformed
        //this will display the IP address of the computer the program is running on so it can be added as an Administration ip
        try {
            
               java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
            JOptionPane.showMessageDialog(null, "Your Ip Address is - " + InetAddress.getLocalHost().getHostAddress() + "\n\nYour Device Name Is - " + localMachine.getHostName());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong, unable to display ip address");
        }
    }//GEN-LAST:event_btnGetIPActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Code will log the user out and then close the program

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
     //This is used so the user can drag the window around without it having an frame
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        try {
            Desktop desktop=Desktop.getDesktop();
            desktop.browse(new URL(cm.logoWebsite).toURI());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jLabel15MousePressed

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
            java.util.logging.Logger.getLogger(MainOptionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainOptionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainOptionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainOptionSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainOptionSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnGetIP;
    private javax.swing.JButton btnNominate;
    private javax.swing.JButton btnVote;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJokeMsg;
    private javax.swing.JLabel randomQuote;
    // End of variables declaration//GEN-END:variables
public void load(String state)
{
      String quotes[] = {
            "Looks Like You Got One Of The Slower Computers, Better Luck Next Time!",
            "\"Never Let Your Computer Know That You Are In A Hurry!\"",
            "Sadly This Is Not The Fastest Computer Out There",
            "This Computer Has Been Working Overtime, Might Be A Little Slow At Doing Things",
        "Dont Mind Me... Just Waiting With You...",
            "Patience Is Not The Ability To Wait, But The Ability To Keep A Good Atitude While Waiting...",
            "I Started The Week With A Big Box Of Patience... The Box Is Empty Now...",
            "Whoever Said \"Patience Is A Virtue\" Has Never Experienced A Slow Computer",
            "Patience Leads To Its Own Reward...",
            "Atlease I'm Not Waiting Alone This Time...",
          "Keep Calm And Wait With Me...",                          
            };    
     int rnd = new Random().nextInt(quotes.length);
    String activeQ = quotes[rnd];
     randomQuote.setText(activeQ);
    if (state.equalsIgnoreCase("active"))
    {
        btnVote.setVisible(false);
        btnNominate.setVisible(false);
        btnAdmin.setVisible(false);
        jLabel2.setVisible(false);
        jLabel2.setVisible(false);
        jLabel5.setVisible(false);
        btnGetIP.setVisible(false);
        lblJokeMsg.setVisible(true);
        randomQuote.setVisible(true);
    }
    else
    {
          if(sm.checkStatus("AllowGetIP") == true)
                {
                    btnGetIP.setVisible(true);
                }
        btnVote.setVisible(true);
        btnNominate.setVisible(true);
        btnAdmin.setVisible(true);
        jLabel2.setVisible(true);
        jLabel2.setVisible(true);
        jLabel5.setVisible(true);
        lblJokeMsg.setVisible(true);
        randomQuote.setVisible(true);
        
    }
}
  
}
