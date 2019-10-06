//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018
//This class handles the Smart Display Methods, It is ment to have this GUI Displayed on a big screen where
//All Voters Can See It, Every time some one votes, they will be thanked for voting
///If No One Votes In x Times 3 Seconds (x Being 5 Currently)
//The Program will automaticly display a GIF on how the users should vote.
package com.MainData;

import com.Backend.AntiOverload;
import com.Backend.commonMethods;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Jaco van Stryp
 */
public class MainSmartDisplay extends javax.swing.JFrame { // This is the main GUI that opens first allowing the user to chose what they want to do
    Settings sm = new Settings();
    AntiOverload ao = new AntiOverload();
    commonMethods cm = new commonMethods(); //Initiialising variables to allow for refreshing and animations aswell as mouse movement
    String dbLoc = cm.getDatabaseLocation();
    int xMouse;
    int yMouse;
  //  int prevActive = ao.getActiveComputers();
    boolean running = true;
    Timer timer;
    Timer ticker;
    int displayCounter = 0;
int countTimeout = 0;
    public MainSmartDisplay() {
        initComponents();
        howItWorks.setVisible(false);
        this.StartShowingData(); // Activates Data Transaction Methods
        this.StartSmartAnimation(); // Activates Animation Methods
        if (cm.doesUserIPHaveAdministrationAccess() == true) {
            btnBack.setVisible(true);

        } else {
            btnBack.setVisible(false);
        }
    }

    /**
     * Creates new form MainOptionSelection
     */
    //Code checks if they should have administration access or not
    //this also gets the IP of this computer and compares it to existing IP's
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt02 = new javax.swing.JLabel();
        txt01 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JLabel();
        txtName3 = new javax.swing.JLabel();
        totalNamesInQue = new javax.swing.JLabel();
        howItWorks = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eduplex High School Electronic Voting System");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 50, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("[Start Tutorial]");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 90, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 67, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 8, 24));

        txt02.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        txt02.setForeground(new java.awt.Color(255, 255, 255));
        txt02.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt02, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 1130, 80));

        txt01.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        txt01.setForeground(new java.awt.Color(255, 255, 255));
        txt01.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1130, 80));

        txtName1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        txtName1.setForeground(new java.awt.Color(255, 255, 255));
        txtName1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName1.setText("Eduplex High School Electronic Voting System");
        jPanel1.add(txtName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1140, 70));

        txtName2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        txtName2.setForeground(new java.awt.Color(255, 255, 255));
        txtName2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName2.setText("Making Voting Fun, Faster And More Efficient");
        jPanel1.add(txtName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1140, 70));

        txtName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtName3.setForeground(new java.awt.Color(255, 255, 255));
        txtName3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtName3.setText("Ask A Teacher For Help If You Are Stuck!");
        jPanel1.add(txtName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 1140, 70));

        totalNamesInQue.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        totalNamesInQue.setForeground(new java.awt.Color(255, 255, 255));
        totalNamesInQue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalNamesInQue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                totalNamesInQueMousePressed(evt);
            }
        });
        jPanel1.add(totalNamesInQue, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 1170, 20));

        howItWorks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/HowItWorksBackGround.gif"))); // NOI18N
        jPanel1.add(howItWorks, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 1150, 660));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        //This code allows the user to move the GUI To A Bigger Screen, For Example A Projector
        this.setLocation(x - xMouse, y - yMouse);

    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased
        //This code allows the user to move the GUI To A Bigger Screen, For Example A Projector

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MouseReleased

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        //This code allows the user to move the GUI To A Bigger Screen, For Example A Projector

        xMouse = evt.getX();
        yMouse = evt.getY();

    }//GEN-LAST:event_jPanel2MousePressed

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        //takes user to main menu
        new MainOptionSelection().setVisible(true);
        running = false;
        timer.stop();
        ticker.stop();

        this.dispose();
    }//GEN-LAST:event_btnBackMousePressed

    private void totalNamesInQueMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_totalNamesInQueMousePressed
        PrintWriter printer = null;
        try { // clears Queue
            printer = new PrintWriter(new FileWriter(dbLoc + "\\smartDisplayLastUser.db", false));
            printer.print("");
            printer.close();

        } catch (Exception ex) {

        }


    }//GEN-LAST:event_totalNamesInQueMousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        try { // opens the website linked to the logo
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URL(cm.logoWebsite).toURI());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jLabel15MousePressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
   this.autoSwitch();
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(MainSmartDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainSmartDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainSmartDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainSmartDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSmartDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel howItWorks;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel totalNamesInQue;
    private javax.swing.JLabel txt01;
    private javax.swing.JLabel txt02;
    private javax.swing.JLabel txtName1;
    private javax.swing.JLabel txtName2;
    private javax.swing.JLabel txtName3;
    // End of variables declaration//GEN-END:variables
String line1 = "";
    String line2 = "";
    String line3 = "";
   int nextGroupLoader = 0;
    public void StartShowingData() {
//This recieves and handles all data that gets submited by the voting clients, It Will Refresh Every 3 Seconds And display the next name in
//The queue, If no one votes for a while, the program will detect that and display a GIF On how the user can vote.
        timer = new Timer(3000, (ActionEvent e) -> {
            try {
displayCounter++;
//int curActive = ao.getActiveComputers();
  //              oStatus.setText(ao.getActiveComputers() + " / " + ao.getMaxComputers() + " People Currently Voting");
    //            if((prevActive==0) && (curActive >= 1) && (nextGroupLoader >= 7))
                {
                        if(sm.checkStatus("autopilot") == true)
            {
                              this.autoSwitch();

            }
              
                }
      //          if(curActive == 0)
                {
                    nextGroupLoader++;
                    System.out.println("CurActive Loader - " + nextGroupLoader);

                    if(nextGroupLoader == 7) //Notification * 3 duration
                    {
                        this.announceNextGroup();
                    }
                }
               //else
                {
                    nextGroupLoader = 0;
                }
               // prevActive = curActive;
                int totalNames = 0;
                String cLine = "";
                String aLine = "";
                Scanner scFile = new Scanner(new File(dbLoc + "\\smartDisplayLastUser.db"));
                Scanner allFile = new Scanner(new File(dbLoc + "\\smartDisplayLastUser.db"));
                Scanner listFile = new Scanner(new File(dbLoc + "\\smartDisplayLastUser.db"));//3 Scanners Required to allow for acurate data

                if (scFile.hasNextLine()) {

                    cLine = scFile.nextLine();
                    txt01.setText("Thank You");
                    txt02.setText("For Voting");

                    line3 = line2;
                    txtName3.setText(line3);
                    line2 = line1;
                    txtName2.setText(line2);
                    line1 = cLine;
                    txtName1.setText(line1);
                    System.out.println("next");
                    displayCounter = 0;
                    System.out.println("RESET");
                } else {
                    displayCounter++;
                    System.out.println(displayCounter); // handles timeout to display Helping GIF
                    if (displayCounter >= 5) {
                        this.showTutorial(true);
                    } else {
                        this.showTutorial(false);
                    }
                }
                ArrayList<String> names = new ArrayList<String>();
                while (allFile.hasNext()) {
                    names.add(allFile.nextLine());

                }
                names.remove(cLine); // Stores and clears the next name in the file so it can work as a queue system.
                PrintWriter printer = new PrintWriter(new FileWriter(dbLoc + "\\smartDisplayLastUser.db", false));
                for (int i = 0; i < names.size(); i++) {
                    printer.println(names.get(i));

                }

                totalNamesInQue.setText("Names In Queue -[" + names.size() + "] - Estemated Wait Time - " + this.timeConversion(names.size() * 3) + " - [Click Here To Clear Queue]");

                scFile.close();
                allFile.close();
                printer.close();

            } catch (Exception ex) {

            }
        });

        timer.start();

    }
    Random rand = new Random(); // help generate random colours for special names

    public void StartSmartAnimation() { // This method handels the animation of special names, Currently only All Grade 12 IT Students in 2018
        //This can be changed to allow any one else to have that name animation.

        ticker = new Timer(100, (ActionEvent e) -> {

            float r = rand.nextFloat();
            float g = rand.nextFloat(); // Floats used to generate an acurate colour
            float b = rand.nextFloat();
            String firstLine = txtName1.getText();
            String secondLine = txtName2.getText();
            String thirdLine = txtName3.getText();

            //if name is there
            //animate it
            //else set it to white
            if (firstLine.equalsIgnoreCase("- [ X ] -  " + "Jaco van Stryp" + "  - [ X ] -") || firstLine.equalsIgnoreCase("- [ X ] -  " + "Luc Jacobs" + "  - [ X ] -") || firstLine.equalsIgnoreCase("- [ X ] -  " + "Isipho Kave" + "  - [ X ] -") || firstLine.equalsIgnoreCase("- [ X ] -  " + "Bryan-Luc Brink" + "  - [ X ] -") || firstLine.equalsIgnoreCase("- [ X ] -  " + "Liesl Krause" + "  - [ X ] -")) { //Special Animation For Grade 12 IT Students/Teacher
                txtName1.setForeground(new java.awt.Color(r, g, b));
            } else {
                txtName1.setForeground(new java.awt.Color(255, 255, 255)); //White
            }

            if (secondLine.equalsIgnoreCase("- [ X ] -  " + "Jaco van Stryp" + "  - [ X ] -") || secondLine.equalsIgnoreCase("- [ X ] -  " + "Luc Jacobs" + "  - [ X ] -") || secondLine.equalsIgnoreCase("- [ X ] -  " + "Isipho Kave" + "  - [ X ] -") || secondLine.equalsIgnoreCase("- [ X ] -  " + "Bryan-Luc Brink" + "  - [ X ] -") || secondLine.equalsIgnoreCase("- [ X ] -  " + "Liesl Krause" + "  - [ X ] -")) { //Special Animation For Grade 12 IT Students/Teacher
                txtName2.setForeground(new java.awt.Color(r, g, b));
            } else {
                txtName2.setForeground(new java.awt.Color(255, 255, 255));
            }
            if (thirdLine.equalsIgnoreCase("- [ X ] -  " + "Jaco van Stryp" + "  - [ X ] -") || thirdLine.equalsIgnoreCase("- [ X ] -  " + "Luc Jacobs" + "  - [ X ] -") || thirdLine.equalsIgnoreCase("- [ X ] -  " + "Isipho Kave" + "  - [ X ] -") || thirdLine.equalsIgnoreCase("- [ X ] -  " + "Bryan-Luc Brink" + "  - [ X ] -") || thirdLine.equalsIgnoreCase("- [ X ] -  " + "Liesl Krause" + "  - [ X ] -")) { //Special Animation For Grade 12 IT Students/Teacher
                txtName3.setForeground(new java.awt.Color(r, g, b));
            } else {
                txtName3.setForeground(new java.awt.Color(255, 255, 255));
            }

        });

        ticker.start();

    }

    private String timeConversion(int totalSeconds) { // This method handles time convertion to generate an acurate estemated time before
        //the Queue clears up

        final int MINUTES_IN_AN_HOUR = 60;
        final int SECONDS_IN_A_MINUTE = 60;

        int seconds = totalSeconds % SECONDS_IN_A_MINUTE;
        int totalMinutes = totalSeconds / SECONDS_IN_A_MINUTE;
        int minutes = totalMinutes % MINUTES_IN_AN_HOUR;
        int hours = totalMinutes / MINUTES_IN_AN_HOUR;

        return hours + " Hours " + minutes + " Minutes " + seconds + " Seconds";
    }

    private void showTutorial(boolean status) //section handles displaying the helping GIF Clearly to the user
    {

        if (status == true) {

            txt01.setVisible(false);
            txtName1.setVisible(false);
            txtName2.setVisible(false);
            txtName3.setVisible(false);
            txt02.setVisible(false);
            totalNamesInQue.setVisible(false);
            howItWorks.setVisible(true);
            // oStatus.setVisible(false);

        } else {
            txt01.setVisible(true);
            txtName1.setVisible(true);
            txtName2.setVisible(true);
            txtName3.setVisible(true);
            txt02.setVisible(true);
            totalNamesInQue.setVisible(true);
            howItWorks.setVisible(false);
            //oStatus.setVisible(true);

        }

    }

   public void autoSwitch()
   {
   
       timer.stop();
       ticker.stop();
       int x = this.getX();
       int y = this.getY();
        audioTutorial test = new audioTutorial();
        System.out.println(this.getWidth() + " " + this.getHeight() + "\n\n" + x + " " + y);
        test.setLocation(x, y);
        test.setVisible(true);
       
       this.dispose();
            
   }
   
   
    public void announceNextGroup() {

        try {
            if(sm.checkStatus("autopilot") == true)
            {
                 Clip clip;
            URL url = this.getClass().getResource("/com/res/nextgroup.wav");
            System.out.println(url);

            String filePath = url + "";

            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(url));
            clip.start();
            }
           
        } catch (Exception e) {
            e.printStackTrace();
            

        }
    }



}
