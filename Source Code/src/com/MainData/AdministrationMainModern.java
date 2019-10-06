//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018
package com.MainData;

import com.Backend.AutoRepair;
import com.Backend.SmartEncryption;
import com.Backend.SmartSQLProcessing;
import com.Backend.commonMethods;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.Timer;

public class AdministrationMainModern extends javax.swing.JFrame { //This class is where all the
    //changing and working with data happens, it makes it easy for the administrator to get all the information easaly and 
    //quickly when they need it
Timer proBarTimer;
int curValue = 0;
int maxValue = 0;

    commonMethods cm = new commonMethods(); // makes a connection called "cm" to allow methods to be called form the
    MainNomination mn = new MainNomination();
    //commonMethods class

    /**
     * Creates new form MainOptionSelection
     */         

    public AdministrationMainModern() {
        initComponents();
        processSpeed03.setVisible(false);
        processSpeed02.setVisible(false);
        processSpeed01.setVisible(false);

               dbLinesLeft.setVisible(false);

      timeLeft.setVisible(false);
      timeLeft1.setVisible(false);
      dbSizelbl.setVisible(false);
           proBar.setVisible(false);
           lblMainStatus2.setVisible(false);
           lblMainStatus3.setVisible(false);
           lblMainStatus4.setVisible(false);
           lblMainStatus5.setVisible(false);

                      
        SmartSQLProcessing spp = new SmartSQLProcessing();
        if (spp.hasMoreData() == true) {
          
            txaMainOutput.setVisible(false);
            txaMainOutputScroll.setVisible(false);
            btnDisplayVoters.setEnabled(false);
            brnReset.setEnabled(false);
            btnChangeVoteValue.setEnabled(false);
            btnAddAdministatorIP.setEnabled(false);
            btnDisplayVoting.setEnabled(false);
            btnDisplayAdminIP.setEnabled(false);
            btnDisplaySuspicious.setEnabled(false);;
            btnPrintData.setEnabled(false);
            btnRemoveData.setEnabled(false);
            btnChangeVoteValue.setEnabled(false);
            btnRefresh.setVisible(false);
        } else {

        }

        this.loadTopPeople();  //When the program opens it will load all the results of the votes instantly to the administrator

    }

    String activeDisplayValue = "TopVoted"; // this string will be changed based on what is being displayed currently

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        brnReset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSettings = new javax.swing.JButton();
        btnAddAdministatorIP = new javax.swing.JButton();
        btnDisplayVoting = new javax.swing.JButton();
        btnDisplayVoters = new javax.swing.JButton();
        btnDisplayAdminIP = new javax.swing.JButton();
        btnDisplaySuspicious = new javax.swing.JButton();
        btnPrintData = new javax.swing.JButton();
        btnRemoveData = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txaMainOutputScroll = new javax.swing.JScrollPane();
        txaMainOutput = new javax.swing.JTextArea();
        btnProcessData = new javax.swing.JButton();
        timeLeft = new javax.swing.JLabel();
        timeLeft1 = new javax.swing.JLabel();
        proBar = new javax.swing.JProgressBar();
        dbSizelbl = new javax.swing.JLabel();
        dbLinesLeft = new javax.swing.JLabel();
        processSpeed03 = new javax.swing.JButton();
        lblMainStatus5 = new javax.swing.JLabel();
        processSpeed01 = new javax.swing.JButton();
        processSpeed02 = new javax.swing.JButton();
        lblMainStatus2 = new javax.swing.JLabel();
        lblMainStatus3 = new javax.swing.JLabel();
        lblMainStatus4 = new javax.swing.JLabel();
        btnChangeVoteValue = new javax.swing.JButton();
        btnSmartDisplay = new javax.swing.JButton();
        lblMainStatus1 = new javax.swing.JLabel();

        jLabel72.setBackground(new java.awt.Color(255, 255, 255));
        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(0, 0, 153));
        jLabel72.setText("Person # With % Votes");

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(0, 0, 153));
        jLabel74.setText("Person # With % Votes");

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(0, 0, 153));
        jLabel75.setText("Person # With % Votes");

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(0, 0, 153));
        jLabel78.setText("Person # With % Votes");

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 153));
        jLabel77.setText("Person # With % Votes");

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 153));
        jLabel76.setText("Person # With % Votes");

        jLabel71.setBackground(new java.awt.Color(255, 255, 255));
        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(0, 0, 153));
        jLabel71.setText("Person # With % Votes");

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(0, 0, 153));
        jLabel73.setText("Person # With % Votes");

        jLabel70.setBackground(new java.awt.Color(255, 255, 255));
        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 0, 153));
        jLabel70.setText("Person # With % Votes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(8, 8, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        brnReset.setBackground(new java.awt.Color(167, 5, 5));
        brnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        brnReset.setForeground(new java.awt.Color(255, 255, 255));
        brnReset.setText("Reset Student Data");
        brnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnResetActionPerformed(evt);
            }
        });
        jPanel2.add(brnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 241, 50));

        btnRefresh.setBackground(new java.awt.Color(255, 89, 33));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh Data");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel2.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 241, 50));

        btnSettings.setBackground(new java.awt.Color(255, 89, 33));
        btnSettings.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings.setText("Settings");
        btnSettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingsActionPerformed(evt);
            }
        });
        jPanel2.add(btnSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 241, 50));

        btnAddAdministatorIP.setBackground(new java.awt.Color(255, 89, 33));
        btnAddAdministatorIP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddAdministatorIP.setForeground(new java.awt.Color(255, 255, 255));
        btnAddAdministatorIP.setText("Add Another Administrator IP");
        btnAddAdministatorIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAdministatorIPActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddAdministatorIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 50));

        btnDisplayVoting.setBackground(new java.awt.Color(255, 89, 33));
        btnDisplayVoting.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDisplayVoting.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayVoting.setText("Display Voting Results");
        btnDisplayVoting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayVotingActionPerformed(evt);
            }
        });
        jPanel2.add(btnDisplayVoting, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 241, 50));

        btnDisplayVoters.setBackground(new java.awt.Color(255, 89, 33));
        btnDisplayVoters.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDisplayVoters.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayVoters.setText("Display List Of Voters");
        btnDisplayVoters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayVotersActionPerformed(evt);
            }
        });
        jPanel2.add(btnDisplayVoters, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 241, 50));

        btnDisplayAdminIP.setBackground(new java.awt.Color(255, 89, 33));
        btnDisplayAdminIP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDisplayAdminIP.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayAdminIP.setText("Display Admin IP's");
        btnDisplayAdminIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAdminIPActionPerformed(evt);
            }
        });
        jPanel2.add(btnDisplayAdminIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 241, 50));

        btnDisplaySuspicious.setBackground(new java.awt.Color(255, 89, 33));
        btnDisplaySuspicious.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDisplaySuspicious.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplaySuspicious.setText("Display Suspicious Activity");
        btnDisplaySuspicious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplaySuspiciousActionPerformed(evt);
            }
        });
        jPanel2.add(btnDisplaySuspicious, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 241, 50));

        btnPrintData.setBackground(new java.awt.Color(255, 89, 33));
        btnPrintData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPrintData.setForeground(new java.awt.Color(255, 255, 255));
        btnPrintData.setText("Print Current Data");
        btnPrintData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintDataActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrintData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 241, 50));

        btnRemoveData.setBackground(new java.awt.Color(255, 89, 33));
        btnRemoveData.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnRemoveData.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveData.setText("Remove User From Current List");
        btnRemoveData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDataActionPerformed(evt);
            }
        });
        jPanel2.add(btnRemoveData, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 241, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 70, 290, 660));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eduplex High School Electronic Voting System");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-- Administration --");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 40, -1, -1));

        btnBack1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Back.png"))); // NOI18N
        btnBack1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBack1MousePressed(evt);
            }
        });
        jPanel3.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 52));

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        jPanel3.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1069, 11, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 11, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 70));

        jPanel4.setBackground(new java.awt.Color(8, 8, 94));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txaMainOutput.setEditable(false);
        txaMainOutput.setBackground(new java.awt.Color(34, 34, 78));
        txaMainOutput.setColumns(20);
        txaMainOutput.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txaMainOutput.setForeground(new java.awt.Color(255, 255, 255));
        txaMainOutput.setLineWrap(true);
        txaMainOutput.setRows(5);
        txaMainOutput.setAlignmentX(15.0F);
        txaMainOutput.setAlignmentY(18.0F);
        txaMainOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txaMainOutputScroll.setViewportView(txaMainOutput);

        jPanel4.add(txaMainOutputScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 21, 810, 540));

        btnProcessData.setBackground(new java.awt.Color(255, 89, 33));
        btnProcessData.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnProcessData.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessData.setText("Process Data");
        btnProcessData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessDataActionPerformed(evt);
            }
        });
        jPanel4.add(btnProcessData, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 700, 50));

        timeLeft.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timeLeft.setForeground(new java.awt.Color(255, 255, 255));
        timeLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLeft.setText("Please Wait While Data Is Being Processed...");
        jPanel4.add(timeLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 275, 730, 70));

        timeLeft1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timeLeft1.setForeground(new java.awt.Color(255, 255, 255));
        timeLeft1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeLeft1.setText("Do NOT Close The Program");
        jPanel4.add(timeLeft1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 335, 730, 70));
        jPanel4.add(proBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 490, 650, 40));

        dbSizelbl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        dbSizelbl.setForeground(new java.awt.Color(255, 255, 255));
        dbSizelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dbSizelbl.setText("Database Size");
        jPanel4.add(dbSizelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 730, 50));

        dbLinesLeft.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        dbLinesLeft.setForeground(new java.awt.Color(255, 255, 255));
        dbLinesLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dbLinesLeft.setText("Database Size");
        jPanel4.add(dbLinesLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 730, 50));

        processSpeed03.setBackground(new java.awt.Color(255, 89, 33));
        processSpeed03.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processSpeed03.setForeground(new java.awt.Color(255, 255, 255));
        processSpeed03.setText("1 / 100ms");
        processSpeed03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processSpeed03ActionPerformed(evt);
            }
        });
        jPanel4.add(processSpeed03, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 200, 40));

        lblMainStatus5.setBackground(new java.awt.Color(255, 255, 255));
        lblMainStatus5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainStatus5.setForeground(new java.awt.Color(255, 255, 255));
        lblMainStatus5.setText("Intense");
        jPanel4.add(lblMainStatus5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, -1, -1));

        processSpeed01.setBackground(new java.awt.Color(40, 224, 64));
        processSpeed01.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processSpeed01.setForeground(new java.awt.Color(255, 255, 255));
        processSpeed01.setText("1 / 500ms");
        processSpeed01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processSpeed01ActionPerformed(evt);
            }
        });
        jPanel4.add(processSpeed01, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 40));

        processSpeed02.setBackground(new java.awt.Color(255, 89, 33));
        processSpeed02.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        processSpeed02.setForeground(new java.awt.Color(255, 255, 255));
        processSpeed02.setText("1 / 250ms");
        processSpeed02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processSpeed02ActionPerformed(evt);
            }
        });
        jPanel4.add(processSpeed02, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 200, 40));

        lblMainStatus2.setBackground(new java.awt.Color(255, 255, 255));
        lblMainStatus2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainStatus2.setForeground(new java.awt.Color(255, 255, 255));
        lblMainStatus2.setText("Processing Speed");
        jPanel4.add(lblMainStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, -1));

        lblMainStatus3.setBackground(new java.awt.Color(255, 255, 255));
        lblMainStatus3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainStatus3.setForeground(new java.awt.Color(255, 255, 255));
        lblMainStatus3.setText("Normal");
        jPanel4.add(lblMainStatus3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        lblMainStatus4.setBackground(new java.awt.Color(255, 255, 255));
        lblMainStatus4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainStatus4.setForeground(new java.awt.Color(255, 255, 255));
        lblMainStatus4.setText("Fast");
        jPanel4.add(lblMainStatus4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 820, 580));

        btnChangeVoteValue.setBackground(new java.awt.Color(255, 89, 33));
        btnChangeVoteValue.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnChangeVoteValue.setForeground(new java.awt.Color(255, 255, 255));
        btnChangeVoteValue.setText("Change Vote Value");
        btnChangeVoteValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeVoteValueActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangeVoteValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 40));

        btnSmartDisplay.setBackground(new java.awt.Color(255, 89, 33));
        btnSmartDisplay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSmartDisplay.setForeground(new java.awt.Color(255, 255, 255));
        btnSmartDisplay.setText("Smart Display");
        btnSmartDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmartDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnSmartDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 241, 40));

        lblMainStatus1.setBackground(new java.awt.Color(255, 255, 255));
        lblMainStatus1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMainStatus1.setForeground(new java.awt.Color(255, 255, 255));
        lblMainStatus1.setText("Displaying - Voting Results");
        jPanel1.add(lblMainStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   Timer ticker, twister;
   String strValue;
    public void StartTheTimer() {
       String speed = "unknown";
   
 String location = cm.getDatabaseLocation() + "\\SmartSQLProcessing\\";//Loads Folder
 String dbLocation = cm.getDatabaseLocation() + "\\StudentVotingData.accdb";//Loads Folder
           proBar.setVisible(true);

            File folderOr = new File(location);
            File[] listOfFilesOr = folderOr.listFiles();  
            int max = listOfFilesOr.length;
            proBar.setMaximum(max);
ticker = new Timer(2000, (ActionEvent e) -> {


 File dbfile = new File(dbLocation);
 

            File folder = new File(location);
            File[] listOfFiles = folder.listFiles();
            double persDone = (listOfFilesOr.length - listOfFiles.length);
            persDone = persDone/listOfFilesOr.length;
            persDone = persDone * 100;
           
           int persComplete = (int) persDone;
          
                                              strValue = persComplete + "% Done)";

                       proBar.setValue(listOfFilesOr.length - listOfFiles.length);
                       if(persComplete == 0)
                       {
                           strValue = "0%)";
                       }
                       if(persComplete == 100)
                       {
                           new MainOptionSelection().setVisible(true);
                                                this.dispose();
                                                 ticker.stop();
                                                 persComplete = 101;
                       }
                       
                     
                                            
                       dbSizelbl.setText("Processing - " + sp.query);
                 
            timeLeft1.setText("Do NOT Close The Program (" + strValue);
            
        });

        ticker.start();

    }
    
      public void StartTheTimerNum2() {
       dbLinesLeft.setVisible(true);
twister = new Timer(5, (ActionEvent e) -> {
     dbSizelbl.setText("Processing - " + sp.query);
   dbLinesLeft.setText(sp.linesLeft);
        });

        twister.start();

    }
    
    private void btnSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingsActionPerformed
        new Settings().setVisible(true); // opens the Settings GUI
        this.dispose(); //Disposes this GUI

    }//GEN-LAST:event_btnSettingsActionPerformed

    private void btnAddAdministatorIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAdministatorIPActionPerformed
        String userIPToAdd = JOptionPane.showInputDialog("Enter the IP Address you wish to give administration access\n\nTo find the address to add, Do The Following:\n\nOpen the program on a computer that you want to give administration rights\nClick on \"Get IP\" and Enter the IP Address in here.");
        //when this button is pressed, the user will be prompted to enter another IP Address that should obtain administration access
        cm.addIPToAdminitrationAccess(userIPToAdd);

    }//GEN-LAST:event_btnAddAdministatorIPActionPerformed

    private void brnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnResetActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to clear all data from all databases\n\nThis can not be reversed\n\nAll Student data will be permenantly removed", "Warning", 0);
        try { // this method will delete and clear all information that was entered by students or that has to do with students
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;

            if (confirm == 0) {

                System.out.println("Yes");
                String query = "delete * from UsersToVoteFor";
                PreparedStatement add = myconObj.prepareStatement(query);
                add.executeUpdate();
                query = "delete * from UsersAlreadyVoted";
                add = myconObj.prepareStatement(query);
                add.executeUpdate();
                query = "delete * from SuspiciousLoginAttempts";
                add = myconObj.prepareStatement(query);
                add.executeUpdate();
                PrintWriter printerClear = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\ImageSources.db"));
                printerClear.print("");
                printerClear.close();
                PrintWriter printerClearNext = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\AntiDoubleVote.db"));
                printerClearNext.print("");
                printerClearNext.close();
                this.loadTopPeople();
                PrintWriter printer = null;
  PrintWriter printerClearIP = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\IPAdministrationAllowed.db", false));
                    printerClearIP.print("");
                    printerClearIP.close();
                printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\smartDisplayLastUser.db", false));
                printer.print("");
                printer.close();
               
                    AutoRepair ar = new AutoRepair();
                       ar.reloadOptimisedSystem();

                JOptionPane.showMessageDialog(null, "All data has been reset successfuly!");

            } else {
                System.out.println("No");

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error has ocured");
        }
    }//GEN-LAST:event_brnResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        new AdministrationMainModern().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDisplayVotingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayVotingActionPerformed
        this.loadTopPeople(); //This will switch the data being displayed to the Voting Results
        btnChangeVoteValue.setVisible(true);
        btnSmartDisplay.setVisible(true);
        lblMainStatus5.setText("Displaying - Voting Results");

    }//GEN-LAST:event_btnDisplayVotingActionPerformed

    private void btnBack1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBack1MousePressed
        new MainOptionSelection().setVisible(true); // takes the user back to the main window where they can select Vote/Nominate/Administration
        this.dispose();
    }//GEN-LAST:event_btnBack1MousePressed

    private void btnDisplayVotersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayVotersActionPerformed
//this loads everyone that has already voted with extra information
        this.loadAllVoters();
        btnSmartDisplay.setVisible(false);
        btnChangeVoteValue.setVisible(false);
        lblMainStatus5.setText("Displaying - All Voters");

    }//GEN-LAST:event_btnDisplayVotersActionPerformed

    private void btnDisplayAdminIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAdminIPActionPerformed
        this.loadAdministrationIP(); // loads every one with administratuin permisions
        btnSmartDisplay.setVisible(false);
        btnChangeVoteValue.setVisible(false);
        lblMainStatus5.setText("Displaying - Administration IP Addresses");

    }//GEN-LAST:event_btnDisplayAdminIPActionPerformed

    private void btnDisplaySuspiciousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplaySuspiciousActionPerformed

        this.loadSuspiciousData(); // loads suspiciouse data
        btnSmartDisplay.setVisible(false);
        btnChangeVoteValue.setVisible(false);
        lblMainStatus5.setText("Displaying - Suspicious Data");


    }//GEN-LAST:event_btnDisplaySuspiciousActionPerformed

    private void btnPrintDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintDataActionPerformed
        //This is the data that will print what ever is being displayed to the user
        try {

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String currentTime = (dtf.format(now));

            String YourString = (cm.getSchoolType() + " Electronic Voting System Information" + "\nPrinting Date - " + currentTime + "\n\n" + txaMainOutput.getText()); //define and set contents of your string - remember about formating with \n if you want to have it split on lines
            JTextArea YourTextArea = new JTextArea(); //define new Swing JtextArea
            YourTextArea.setLineWrap(true); //set line wrap for YourTextArea - this will prevent too long lines to be cut - they will be wrapaed to next line
            YourTextArea.append(YourString); //append YourString to YourTextArea
            YourTextArea.print(); //this will display print dialog that will lead you to print contents of YourTextArea so in efect contents of YourString
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnPrintDataActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        //close the program

        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnRemoveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDataActionPerformed
        //This codes checks what information is displayed and asks input to fill a query that will remove data from the database
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;

            if (activeDisplayValue.equalsIgnoreCase("TopVoted")) {

                String fName = JOptionPane.showInputDialog("Enter the FIRST NAME of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String sName = JOptionPane.showInputDialog("Enter the SURNAME of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String grade = JOptionPane.showInputDialog("Enter the GRADE of the person you want to remove\n\nNote\n\nMake sure of your spelling!");

                fName = fName.trim();
                sName = sName.trim();
                grade = grade.trim();

                String query = "delete * from UsersToVoteFor Where fName = '" + fName + "' And sName = '" + sName + "' And grade = '" + grade + "'";
                PreparedStatement add = myconObj.prepareStatement(query);
                add.executeUpdate();
                this.loadTopPeople();
                JOptionPane.showMessageDialog(null, fName + " " + sName + " in grade " + grade + " has been removed\nif they existed in the database");
            } else if (activeDisplayValue.equalsIgnoreCase("AllVoters")) {

                String fName = JOptionPane.showInputDialog("Enter the FIRST NAME of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String sName = JOptionPane.showInputDialog("Enter the SURNAME of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String grade = JOptionPane.showInputDialog("Enter the GRADE of the person you want to remove\n\nNote\n\nMake sure of your spelling!");

                fName = fName.trim();
                sName = sName.trim();
                grade = grade.trim();

                String query = "delete * from UsersAlreadyVoted Where fName = '" + fName + "' And Surname = '" + sName + "' And Grade = '" + grade + "'";
                PreparedStatement add = myconObj.prepareStatement(query);
                add.executeUpdate();
                this.loadAllVoters();
                JOptionPane.showMessageDialog(null, fName + " " + sName + " in grade " + grade + " has been removed\nif they existed in the database");

                this.loadAllVoters();
            } else if (activeDisplayValue.equalsIgnoreCase("AdministrationIP")) {
                String dbIP = JOptionPane.showInputDialog("Enter the IP Address you want to remove!");

                dbIP = dbIP.trim();

                String query = "delete * from IPAdministrationAllowed Where IPAddress = '" + dbIP + "'";
                PreparedStatement add = myconObj.prepareStatement(query);
                add.executeUpdate();
                this.loadAdministrationIP();
                JOptionPane.showMessageDialog(null, dbIP + " has been removed from all Administration access\nif they existed in the database");

            } else if (activeDisplayValue.equalsIgnoreCase("AllVoters")) {
                String fName = JOptionPane.showInputDialog("Enter the \n\nFIRST NAME\n\n of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String sName = JOptionPane.showInputDialog("Enter the \n\nSURNAME\n\n of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String grade = JOptionPane.showInputDialog("Enter the \n\nGRADE\n\n of the person you want to remove\n\nNote\n\nMake sure of your spelling!");

                fName = fName.trim();
                sName = sName.trim();
                grade = grade.trim();

                String query = "delete * from UsersToVoteFor Where fName = '" + fName + "' And sName = '" + sName + "' And grade = '" + grade + "'";
                PreparedStatement add = myconObj.prepareStatement(query);
                add.executeUpdate();
                this.loadTopPeople();
                JOptionPane.showMessageDialog(null, fName + " " + sName + " in grade " + grade + " has been removed\nif they existed in the database");
            } else if (activeDisplayValue.equalsIgnoreCase("SuspectData")) {

                String fName = JOptionPane.showInputDialog("Enter the \n\nFIRST NAME\n\n of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String sName = JOptionPane.showInputDialog("Enter the \n\nSURNAME\n\n of the person you want to remove\n\nNote\n\nMake sure of your spelling!");
                String grade = JOptionPane.showInputDialog("Enter the \n\nGRADE\n\n of the person you want to remove\n\nNote\n\nMake sure of your spelling!");

                fName = fName.trim();
                sName = sName.trim();
                grade = grade.trim();

                String query = "delete * from SuspiciousLoginAttempts Where fName = '" + fName + "' And Surname = '" + sName + "' And Grade = '" + grade + "'";
                PreparedStatement add = myconObj.prepareStatement(query);
                add.executeUpdate();
                this.loadSuspiciousData();
                JOptionPane.showMessageDialog(null, fName + " " + sName + " in grade " + grade + " has been removed from Suspicious list\nif they existed in the database");

            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Could Not Complete Action\nPlease try again but make sure all information is filled in correctly\n\nError Details:\n\n" + e.getLocalizedMessage());
        }
        AutoRepair ar = new AutoRepair();
        ar.reloadOptimisedSystem();
    }//GEN-LAST:event_btnRemoveDataActionPerformed

    private void btnChangeVoteValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeVoteValueActionPerformed
        //this will change the value of the total votes the user wants to change
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;

            String fName = JOptionPane.showInputDialog("Enter the\n\nFIRST NAME\n\nof whom you want to change voting data");
            String sName = JOptionPane.showInputDialog("Enter the\n\nSURNAME\n\nof whom you want to change voting data");
            String grade = JOptionPane.showInputDialog("Enter the\n\nGRADE\n\nof whom you want to change voting data");
            String explenation = JOptionPane.showInputDialog("Enter the\n\nEXPLENATION\n\nof Why you want to change the data");
            explenation = explenation.trim();

            if (explenation.equalsIgnoreCase("")) {
                JOptionPane.showMessageDialog(null, "No data has been changed");
            } else {

                int votes = Integer.parseInt(JOptionPane.showInputDialog("Enter the votes you want to change this user to"));
                int score = Integer.parseInt(JOptionPane.showInputDialog("Enter the score you want to change this user to"));

                int confirm = JOptionPane.showConfirmDialog(null, "Is the following information correct\n" + fName + " " + sName + " in grade " + grade + "\n-\tWill have their votes changed to " + votes + "\n-\tWill have their score changed to " + score + "\nThe reason is:\n" + explenation, "Note", 0);

                if (confirm == 0) {

                    String query = "Update UsersToVoteFor SET ReasonForChangingData = '" + explenation + "' WHERE Grade = '" + grade + "' AND fName = '" + fName + "' AND sName = '" + sName + "'";
                    PreparedStatement add = myconObj.prepareStatement(query);
                    add.executeUpdate();

                    fName = fName.trim();
                    sName = sName.trim();
                    grade = grade.trim();

                    query = "update UsersToVoteFor SET TotalVotes = " + votes + " Where fName = '" + fName + "' And sName = '" + sName + "' And Grade = '" + grade + "'";
                    add = myconObj.prepareStatement(query);
                    add.executeUpdate();

                    query = "update UsersToVoteFor SET Score = " + score + " Where fName = '" + fName + "' And sName = '" + sName + "' And Grade = '" + grade + "'";
                    add = myconObj.prepareStatement(query);
                    add.executeUpdate();

                    this.loadTopPeople();
                    JOptionPane.showMessageDialog(null, fName + " " + sName + " in grade " + grade + " Total votes & score was changed\nif they existed in the database");

                } else {
                    System.out.println("No");

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnChangeVoteValueActionPerformed

    private void btnSmartDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmartDisplayActionPerformed
        new MainSmartDisplay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSmartDisplayActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URL(cm.logoWebsite).toURI());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jLabel6MousePressed
 SmartSQLProcessing sp = new SmartSQLProcessing();
    private void btnProcessDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessDataActionPerformed
        //THIS THING
       

         btnProcessData.setText("Creating Backup...");
    lblMainStatus2.setVisible(true);
           lblMainStatus3.setVisible(true);
           lblMainStatus4.setVisible(true);
           lblMainStatus5.setVisible(true);

    processSpeed03.setVisible(true);
        processSpeed02.setVisible(true);
        processSpeed01.setVisible(true);
        btnSmartDisplay.setEnabled(false);
        btnSettings.setEnabled(false);
          btnBack1.setVisible(false);
            btnClose.setVisible(false);
                JOptionPane.showMessageDialog(null, "Please Note\n\nOnly Click \"Ok\" When There Is No One Is Currently Voting!\n\nThis Will Clear All Saved SQL Statements", "Click Ok When No One Is Votning", JOptionPane.WARNING_MESSAGE);

     StartTheTimer();
     StartTheTimerNum2(); 
       AutoRepair ar = new AutoRepair();
          ar.backupSQLProcessing();
                  btnProcessData.setVisible(false);

        timeLeft.setVisible(true);
                     dbSizelbl.setVisible(true);
        
        timeLeft1.setVisible(true);
    sp.processAllStatements();
     
  

             

       
     


    }//GEN-LAST:event_btnProcessDataActionPerformed

    private void processSpeed03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processSpeed03ActionPerformed
      sp.processingSpeed = 100;
        processSpeed03.setBackground(new java.awt.Color(40, 224, 64)); 
        processSpeed01.setBackground(new java.awt.Color(255, 89, 33));
        processSpeed02.setBackground(new java.awt.Color(255, 89, 33));
    }//GEN-LAST:event_processSpeed03ActionPerformed

    private void processSpeed01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processSpeed01ActionPerformed
        sp.processingSpeed = 500;
        processSpeed01.setBackground(new java.awt.Color(40, 224, 64)); 
        processSpeed02.setBackground(new java.awt.Color(255, 89, 33));
        processSpeed03.setBackground(new java.awt.Color(255, 89, 33));
    }//GEN-LAST:event_processSpeed01ActionPerformed

    private void processSpeed02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processSpeed02ActionPerformed
        sp.processingSpeed = 250;
        processSpeed02.setBackground(new java.awt.Color(40, 224, 64)); 
        processSpeed01.setBackground(new java.awt.Color(255, 89, 33));
        processSpeed03.setBackground(new java.awt.Color(255, 89, 33));
    }//GEN-LAST:event_processSpeed02ActionPerformed

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
            java.util.logging.Logger.getLogger(AdministrationMainModern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministrationMainModern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministrationMainModern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministrationMainModern.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministrationMainModern().setVisible(true);
           
            }
            
        });
        
          
          

      
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnReset;
    private javax.swing.JButton btnAddAdministatorIP;
    private javax.swing.JLabel btnBack1;
    private javax.swing.JButton btnChangeVoteValue;
    private javax.swing.JLabel btnClose;
    private javax.swing.JButton btnDisplayAdminIP;
    private javax.swing.JButton btnDisplaySuspicious;
    private javax.swing.JButton btnDisplayVoters;
    private javax.swing.JButton btnDisplayVoting;
    private javax.swing.JButton btnPrintData;
    private javax.swing.JButton btnProcessData;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemoveData;
    private javax.swing.JButton btnSettings;
    private javax.swing.JButton btnSmartDisplay;
    public javax.swing.JLabel dbLinesLeft;
    public javax.swing.JLabel dbSizelbl;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblMainStatus1;
    private javax.swing.JLabel lblMainStatus2;
    private javax.swing.JLabel lblMainStatus3;
    private javax.swing.JLabel lblMainStatus4;
    private javax.swing.JLabel lblMainStatus5;
    private javax.swing.JProgressBar proBar;
    private javax.swing.JButton processSpeed01;
    private javax.swing.JButton processSpeed02;
    private javax.swing.JButton processSpeed03;
    public javax.swing.JLabel timeLeft;
    public javax.swing.JLabel timeLeft1;
    private javax.swing.JTextArea txaMainOutput;
    private javax.swing.JScrollPane txaMainOutputScroll;
    // End of variables declaration//GEN-END:variables
    
    
    public void loadTopPeople() { //this runs a series of queries to load all appropriate information into the current open window
        //making is easy for the user to see the information.
        activeDisplayValue = "TopVoted";
        try {

            int b8 = mn.getCustomNominated("m", "8");
            int f8 = mn.getCustomNominated("f", "8");
            int b9 = mn.getCustomNominated("m", "9");
            int f9 = mn.getCustomNominated("f", "9");
            int b10 = mn.getCustomNominated("m", "10");
            int f10 = mn.getCustomNominated("f", "10");
            int b11 = mn.getCustomNominated("m", "11");
            int f11 = mn.getCustomNominated("f", "11");

            int total = b8 + f8 + b9 + f9 + b10 + f10 + b11 + f11;

            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            //Grade 8 B
            String query = "select * from UsersToVoteFor WHERE grade = '8' and gender = 'm' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.setText("Arranged List Of Nominated Students \n[Total Nominated - " + total + "]\n\n");
            txaMainOutput.append("Grade 8 Boys \n[" + b8 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }

            //Grade 8 G
            query = "select * from UsersToVoteFor WHERE grade = '8' and gender = 'f' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 8 Girls\n[" + f8 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }

            //Grade 9 B
            query = "select * from UsersToVoteFor WHERE grade = '9' and gender = 'm' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 9 Boys\n[" + b9 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }
                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }
            //Grade 9 G
            query = "select * from UsersToVoteFor WHERE grade = '9' and gender = 'f' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 9 Girls\n[" + f9 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }

            //Grade 10 B
            query = "select * from UsersToVoteFor WHERE grade = '10' and gender = 'm' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 10 Boys\n[" + b10 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }
            //Grade 10 G
            query = "select * from UsersToVoteFor WHERE grade = '10' and gender = 'f' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 10 Girls\n[" + f10 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }

            //Grade 11 B
            query = "select * from UsersToVoteFor WHERE grade = '11' and gender = 'm' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 11 Boys\n[" + b11 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }

            //Grade 11 G
            query = "select * from UsersToVoteFor WHERE grade = '11' and gender = 'f' ORDER BY Score DESC";
            result = stmt.executeQuery(query);
            txaMainOutput.append("\n\nGrade 11 Girls\n[" + f11 + " Nominated]\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("sName");
                int originalVotes = result.getInt("OriginalVotes");
                int votes = result.getInt("TotalVotes");
                String explenation = result.getString("ReasonForChangingData");
                int finalScore = result.getInt("Score");
                if (votes != originalVotes) {

                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + " (Original Votes - " + originalVotes + ")\n    Reason for change - " + explenation + "\n\n");

                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " With " + votes + " Votes And A Final Score Of " + finalScore + "\n\n");
                }

                System.out.println(namef + " " + names + " With " + votes + " Votes Has been loaded");
            }

            System.out.println("Successfuly loaded all data");
            txaMainOutput.setCaretPosition(0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERROR\n\n\nUnable to load data from database");
        }

    }

    private void loadAllVoters() { //this runs a series of queries to load all appropriate information into the current open window
        //making is easy for the user to see the information.
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            //Grade 8 
            String query = "select * from UsersAlreadyVoted Where grade = '8'";
            result = stmt.executeQuery(query);
            txaMainOutput.setText("List Of Users Who Had Already Voted\n\n\n");
            txaMainOutput.append("Grade 8\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String votedFor = result.getString("VotedFor");
                String time = result.getString("CurrentTime");
                if (votedFor == null) {
                    votedFor = "No One";
                }
                String prevVoter = result.getString("VotedBefore");
                if (prevVoter.equalsIgnoreCase("")) {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    This was the first vote this " + "\n    Time: " + time + "\n\n");
                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    The previous voter was " + prevVoter + "\n    Time: " + time + "\n\n");
                }
            }

            //Grade 9
            query = "select * from UsersAlreadyVoted Where grade = '9'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("\n\nGrade 9\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String votedFor = result.getString("VotedFor");
                String time = result.getString("CurrentTime");
                if (votedFor == null) {
                    votedFor = "No One";
                }
                String prevVoter = result.getString("VotedBefore");
                if (prevVoter.equalsIgnoreCase("")) {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    This was the first vote on the computer" + "\n    Time: " + time + "\n\n");
                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    The previous voter was " + prevVoter + "\n    Time: " + time + "\n\n");
                }
            }

            //Grade 10
            query = "select * from UsersAlreadyVoted Where grade = '10'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("\n\nGrade 10\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String votedFor = result.getString("VotedFor");
                String time = result.getString("CurrentTime");
                if (votedFor == null) {
                    votedFor = "No One";
                }
                String prevVoter = result.getString("VotedBefore");
                if (prevVoter.equalsIgnoreCase("")) {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    This was the first vote on the computer" + "\n    Time: " + time + "\n\n");
                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    The previous voter was " + prevVoter + "\n    Time: " + time + "\n\n");
                }
            }

            //Grade 11
            query = "select * from UsersAlreadyVoted Where grade = '11'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("\n\nGrade 11\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String votedFor = result.getString("VotedFor");
                String time = result.getString("CurrentTime");
                if (votedFor == null) {
                    votedFor = "No One";
                }
                String prevVoter = result.getString("VotedBefore");
                if (prevVoter.equalsIgnoreCase("")) {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    This was the first vote on the computer" + "\n    Time: " + time + "\n\n");
                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    The previous voter was " + prevVoter + "\n    Time: " + time + "\n\n");
                }
            }
            //Grade 12
            query = "select * from UsersAlreadyVoted Where grade = '12'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("\n\nGrade 12\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String votedFor = result.getString("VotedFor");
                String time = result.getString("CurrentTime");
                if (votedFor == null) {
                    votedFor = "No One";
                }
                String prevVoter = result.getString("VotedBefore");
                if (prevVoter.equalsIgnoreCase("")) {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    This was the first vote on the computer" + "\n    Time: " + time + "\n\n");
                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    The previous voter was " + prevVoter + "\n    Time: " + time + "\n\n");
                }
            }
            //Teachers
            query = "select * from UsersAlreadyVoted Where grade = 'Teacher'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("\n\nTeachers\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String votedFor = result.getString("VotedFor");
                String time = result.getString("CurrentTime");
                if (votedFor == null) {
                    votedFor = "No One";
                }
                String prevVoter = result.getString("VotedBefore");
                if (prevVoter.equalsIgnoreCase("")) {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    This was the first vote on the computer" + "\n    Time: " + time + "\n\n");
                } else {
                    txaMainOutput.append("-   " + namef + " " + names + " Voted For:\n    " + votedFor + "\n    The previous voter was " + prevVoter + "\n    Time: " + time + "\n\n");
                }

            }
            txaMainOutput.setCaretPosition(0);
            activeDisplayValue = "AllVoters";
        } catch (Exception ex) {
            ex.printStackTrace();

            JOptionPane.showMessageDialog(null, "An Error has occured");
        }
    }

    private void loadAdministrationIP() {
        //this runs a series of queries to load all appropriate information into the current open window
        //making is easy for the user to see the information.
        try {
            PrintWriter printer = new PrintWriter(new FileWriter(cm.getDatabaseLocation() + "\\IPAdministrationAllowed.db", true));
                    printer.print("");
                    printer.close();
            Scanner scFile = new Scanner(new File(cm.getDatabaseLocation() + "\\IPAdministrationAllowed.db"));

            //IP Data
           
            txaMainOutput.setText("List IP Addresses With Administration Rights\n\n\n");
            String genActiveIP = InetAddress.getLocalHost().getHostAddress();
            SmartEncryption se = new SmartEncryption();
            while (scFile.hasNextLine()) {
                String dbIP = se.decrypt(scFile.nextLine());
                if (dbIP.equalsIgnoreCase(genActiveIP)) {
                    txaMainOutput.append("-   " + dbIP + "    (Your IP) \n");
                } else {
                    txaMainOutput.append("-   " + dbIP + "\n");
                }
            }
            activeDisplayValue = "AdministrationIP";
            txaMainOutput.setCaretPosition(0);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error has occured");
        }

    }

    private void loadSuspiciousData() //this runs a series of queries to load all appropriate information into the current open window
    //making is easy for the user to see the information.
    {
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            String query = "select * from SuspiciousLoginAttempts Where Grade = '8'";
            result = stmt.executeQuery(query);
            txaMainOutput.setText("List Of Users Who Had Suspicious Activity\n\n\n");
            txaMainOutput.append("Grade 8\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");

            }

            query = "select * from SuspiciousLoginAttempts Where Grade = '9'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("Grade 9\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");

            }

            query = "select * from SuspiciousLoginAttempts Where Grade = '10'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("Grade 10\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");
            }

            query = "select * from SuspiciousLoginAttempts Where Grade = '11'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("Grade 11\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");

            }
            query = "select * from SuspiciousLoginAttempts Where Grade = '12'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("Grade 12\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");

            }
            query = "select * from SuspiciousLoginAttempts Where Grade = 'Teacher'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("Teachers\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");

            }
            query = "select * from SuspiciousLoginAttempts Where Grade = 'Other'";
            result = stmt.executeQuery(query);

            txaMainOutput.append("Other\n\n\n");
            while (result.next()) {
                String namef = result.getString("fName");
                String names = result.getString("Surname");
                String grade = result.getString("Grade");
                String explenation = result.getString("Explination");
                String ip = result.getString("ComputerIP");
                String time = result.getString("CurrentTime");
                String mName = result.getString("MachineName");

                txaMainOutput.append("-   " + namef + " " + names + "\n    " + explenation + "\n    IP Address: " + ip + "\n    Time: " + time + "\n    Computer Name: " + mName + "\n\n");

            }
            activeDisplayValue = "SuspectData";
            txaMainOutput.setCaretPosition(0);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "An error has occured");
        }
    }

}
