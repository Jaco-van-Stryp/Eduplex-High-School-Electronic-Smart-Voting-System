//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018


package com.MainData;

import com.Backend.AntiOverload;
import com.Backend.AutoRepair;
import com.Backend.commonMethods;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JOptionPane;

public class SecureLogin extends javax.swing.JFrame {

     AntiOverload ao = new AntiOverload();
    
    
    commonMethods cm = new commonMethods();

    public SecureLogin() {
        initComponents();
        AutoRepair ar = new AutoRepair();
                            ar.saveSettingsToLocal();

        randomQuote.setVisible(false);
        lblJokeMsg.setVisible(false);
       
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneMain = new javax.swing.JPanel();
        btnLoginStudent = new javax.swing.JButton();
        txfFName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txfSName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboSGrade = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        randomQuote = new javax.swing.JLabel();
        lblJokeMsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);

        paneMain.setBackground(new java.awt.Color(8, 8, 94));
        paneMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLoginStudent.setBackground(new java.awt.Color(255, 89, 33));
        btnLoginStudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLoginStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnLoginStudent.setText("Vote");
        btnLoginStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginStudentActionPerformed(evt);
            }
        });
        paneMain.add(btnLoginStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 390, 40));

        txfFName.setBackground(new java.awt.Color(34, 34, 78));
        txfFName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfFName.setForeground(new java.awt.Color(255, 255, 255));
        paneMain.add(txfFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 390, 40));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FIRST NAME:");
        paneMain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txfSName.setBackground(new java.awt.Color(34, 34, 78));
        txfSName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfSName.setForeground(new java.awt.Color(255, 255, 255));
        paneMain.add(txfSName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 390, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SURNAME:");
        paneMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Grade:");
        paneMain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 19));

        comboSGrade.setBackground(new java.awt.Color(34, 34, 78));
        comboSGrade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboSGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11", "12", "Teacher" }));
        paneMain.add(comboSGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 390, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Your Grade & Name & Surname");
        paneMain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 51));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eduplex High School Electronic Voting System");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        paneMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 70));

        randomQuote.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        randomQuote.setForeground(new java.awt.Color(255, 255, 255));
        randomQuote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        randomQuote.setText("...");
        paneMain.add(randomQuote, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 720, 200));

        lblJokeMsg.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblJokeMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblJokeMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJokeMsg.setText("Loading Please Wait... ");
        paneMain.add(lblJokeMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 730, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnLoginStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginStudentActionPerformed
//this code runs all checks to get/save data to the database, check if they have already voted, tell the user if not ext.
cm.clearFirstVote();
this.load("active");

           boolean userVoted;
        String userFName = txfFName.getText();
        String userSName = txfSName.getText();
         userFName = userFName.trim();
            userSName = userSName.trim();
        
        userVoted = cm.hasUserVoted(userFName, userSName);
        String userGrade = comboSGrade.getSelectedItem() + "";
              
        if(userFName.matches(".*\\d+.*") || userSName.matches(".*\\d+.*"))
        {
            cm.submitPossableSuspect(userFName, userSName, userGrade, "Entered Numbers or related in a name/surname field [User Not Blocked]");
        }
        
         

        if (userFName.equalsIgnoreCase("") || userSName.equalsIgnoreCase("")) {
               this.load("unactive");
          
            JOptionPane.showMessageDialog(null, "Please fill in all the information correctly\n\n You may only vote one time\nCall a teacher for help if you can't login", "Fill In The Blanks!", JOptionPane.ERROR_MESSAGE);
          
        
        
        } else
        {
          

        if (userVoted == true) {
            this.load("unactive");
            cm.submitPossableSuspect(userFName, userSName, userGrade, "Atempted to login when user already voted");
            JOptionPane.showMessageDialog(null, "Sorry " + userFName + ", But It Looks Like You Have Already Voted\n\nOnly One Vote Per Person Is allowed!\nIf You Believe This Is A Mistake, Call A Teacher For Help!", "You May Only Vote Once!",JOptionPane.ERROR_MESSAGE);
        } else {
            if(cm.hasFirstVote(userGrade) == false)
            {
                this.load("unactive");
                JOptionPane.showMessageDialog(null, "Sorry " + userFName + ", Your Grade Is Not Allowed To Vote\nAsk a teacher for help if you believe this is a mistake!", "You May Not Vote!",JOptionPane.ERROR_MESSAGE);
                cm.submitPossableSuspect(userFName, userSName, userGrade, "Atempted to vote when they were not allowed to vote");
    
            new SecureLogin().setVisible(true);
            this.dispose();
            }
            else
            {
            
           cm.addToVoteList(userGrade, userFName, userSName);
                  //  cm.setSecondVote(userGrade);
           cm.loadUserInstructions(userGrade + ""); //Add more instructions
          
            
          // cm.loadUserInstructions(userGrade + ""); Temp Disabled Due To Possable Duplication Of Data
        
       //    while(ao.checkOverloaded() == true)
      //     {
              

        //       try {
         //          Thread.sleep(5000);
        //       } catch (InterruptedException ex) {
                 
      //         }
      //     }

           new mainVoteSystemBoys().setVisible(true);
            this.dispose();
            }
        }
        }
    }//GEN-LAST:event_btnLoginStudentActionPerformed

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
         PrintWriter ClearActiveVotes = null;
         PrintWriter ClearOldUser = null;
        try {
            //takes user to main menu
            new MainOptionSelection().setVisible(true);
            ClearActiveVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeUserVotedFor.db", false));
            ClearOldUser = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\OldUser.db", false));
            ClearActiveVotes.print("");
            ClearOldUser.print("");
            System.out.println("Data Cleared");
            this.dispose();
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Connection Error, Please make sure your computer has Read and Write Access", "Something Went Wrong",JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
    }//GEN-LAST:event_btnBackMousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       PrintWriter ClearActiveVotes = null;
         PrintWriter ClearOldUser = null;
        try {
            //takes user to main menu
         
            ClearActiveVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeUserVotedFor.db", false));
            ClearOldUser = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\OldUser.db", false));
            ClearActiveVotes.print("");
            ClearOldUser.print("");
            System.out.println("Data Cleared");
            
             System.exit(0);
        } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Connection Error, Please make sure your computer has Read and Write Access", "Something Went Wrong",JOptionPane.ERROR_MESSAGE);
          System.exit(0);
        }
     
       
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
       
    }//GEN-LAST:event_jLabel15MousePressed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SecureLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecureLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecureLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecureLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecureLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnLoginStudent;
    private javax.swing.JComboBox<String> comboSGrade;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblJokeMsg;
    private javax.swing.JPanel paneMain;
    private javax.swing.JLabel randomQuote;
    private javax.swing.JTextField txfFName;
    private javax.swing.JTextField txfSName;
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
            "At least I'm Not Waiting Alone This Time...",
            "Keep Calm And Wait With Me...",                          
            };    
     int rnd = new Random().nextInt(quotes.length);
    String activeQ = quotes[rnd];
  // if(ao.checkOverloaded() == true)
  //  {
    //    randomQuote.setText("There are too many people voting right now! You will automaticly be able to vote when they are done!");
  //  }
  //  else
    
         randomQuote.setText(activeQ);
    
    
    if (state.equalsIgnoreCase("active"))
    {
        comboSGrade.setVisible(false);
        txfFName.setVisible(false);
        txfSName.setVisible(false);
        btnLoginStudent.setVisible(false);
        jLabel2.setVisible(false);
        jLabel8.setVisible(false);
        jLabel6.setVisible(false);
        jLabel5.setVisible(false);
        lblJokeMsg.setVisible(true);
        randomQuote.setVisible(true);
     
    }
    else
    {
        comboSGrade.setVisible(true);
        txfFName.setVisible(true);
        txfSName.setVisible(true);
        btnLoginStudent.setVisible(true);
        jLabel2.setVisible(true);
        jLabel8.setVisible(true);
       jLabel6.setVisible(true);
        jLabel5.setVisible(true);
        randomQuote.setVisible(false);
        lblJokeMsg.setVisible(false);      
     
    }
}
}
