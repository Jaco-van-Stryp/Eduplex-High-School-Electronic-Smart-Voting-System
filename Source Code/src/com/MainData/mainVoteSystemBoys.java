//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018
//This class is incharge of loading all the nominations for the appropriate gender, all code will make sure there are no duplications and
//only show the appropriate data to the user without displaying wrong entries
//It will make sure the data is neatly given to the user without anything being cut off
//The Data will be displayed randomly if the user has that checked in settings
//NOTE



package com.MainData;

import com.Backend.AntiOverload;
import com.Backend.AutoRepair;
import com.Backend.SmartSQLProcessing;
import com.Backend.commonMethods;
import static java.awt.AWTEventMulticaster.add;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.ToolTipManager;

public class mainVoteSystemBoys extends javax.swing.JFrame {

    Settings sm = new Settings();
    MultiVote mv = new MultiVote();
    AntiOverload ao = new AntiOverload();
    AutoRepair ar = new AutoRepair();
    boolean nextPage = false;

    commonMethods cm = new commonMethods();
    String grade = cm.loadGradeData();
    String score = mv.getMultiVoteSettings(grade, "VoteOnePoints");

    boolean secondVote = true;
        int votesAllowed;
   
     
//calls all methods to load appropriate data

    public mainVoteSystemBoys() {
           
        if (cm.hasFirstVote(grade) == false) {
            new SecureLogin().setVisible(true);
            this.dispose();
            JOptionPane.showMessageDialog(null, "Your Grade (" + grade + ") is not allowed to vote\nAsk a teacher for help.", "You are not Allowed to Vote", JOptionPane.ERROR_MESSAGE);

        } else { //start else
            
            if (cm.usedFirstVote() == false) {
                votesAllowed = Integer.parseInt(cm.getGradeData(cm.loadGradeData(), "b", "1"));//The total votes allowed (will be read from the settings file)
               score = mv.getMultiVoteSettings(grade, "VoteOnePoints");
                grade = cm.getFirstVote(grade);

                
            } else {
            score = mv.getMultiVoteSettings(grade, "VoteTwoPoints");
                grade = cm.getSecondVote(grade);
       votesAllowed = Integer.parseInt(cm.getGradeData(cm.loadGradeData(), "b", "2"));//The total votes allowed (will be read from the settings file)

                JOptionPane.showMessageDialog(null, "You will now be able to vote Again\nThis Time you will vote for the Grade " + grade + " group\n\nNow You may vote for " + cm.getGradeData(cm.loadGradeData(), "b", "2") + " Boy(s) and " + cm.getGradeData(cm.loadGradeData(), "f", "2") + " Girl(s)\n\nThis Vote will be for the Head Leaders");
                secondVote = true;
             
            }
            
            initComponents();
                     lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


//            ao.addActiveComputer();
          //  this.loadTotalPages();
         
            this.loadAllData();

            try {
                PrintWriter saveActiveVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeUserVotedFor.db", false));
                saveActiveVotes.print("");
            } catch (IOException ex) {

            }

            txfShowGrade.setText("Grade " + 11 + " Girls"); //### FIX THIS

            txfShowGrade.setText("Grade " + grade + " Girls");

          

        }//end else
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sel01 = new javax.swing.JButton();
        sel16 = new javax.swing.JButton();
        sel06 = new javax.swing.JButton();
        sel11 = new javax.swing.JButton();
        sel17 = new javax.swing.JButton();
        sel12 = new javax.swing.JButton();
        sel07 = new javax.swing.JButton();
        sel02 = new javax.swing.JButton();
        sel18 = new javax.swing.JButton();
        sel13 = new javax.swing.JButton();
        sel08 = new javax.swing.JButton();
        sel03 = new javax.swing.JButton();
        sel19 = new javax.swing.JButton();
        sel14 = new javax.swing.JButton();
        sel09 = new javax.swing.JButton();
        sel04 = new javax.swing.JButton();
        sel05 = new javax.swing.JButton();
        sel10 = new javax.swing.JButton();
        sel15 = new javax.swing.JButton();
        sel20 = new javax.swing.JButton();
        sel21 = new javax.swing.JButton();
        sel22 = new javax.swing.JButton();
        sel23 = new javax.swing.JButton();
        sel24 = new javax.swing.JButton();
        sel25 = new javax.swing.JButton();
        sel26 = new javax.swing.JButton();
        sel27 = new javax.swing.JButton();
        sel28 = new javax.swing.JButton();
        sel29 = new javax.swing.JButton();
        sel30 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txfShowGrade = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btnNextPage = new javax.swing.JButton();
        lblTotalVotedFor = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblMainMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sel01.setBackground(new java.awt.Color(255, 102, 102));
        sel01.setText("Name 1");
        sel01.setMaximumSize(new java.awt.Dimension(125, 125));
        sel01.setMinimumSize(new java.awt.Dimension(106, 106));
        sel01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel01ActionPerformed(evt);
            }
        });
        jPanel1.add(sel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 76, 125, 105));

        sel16.setBackground(new java.awt.Color(255, 102, 102));
        sel16.setText("Name 16");
        sel16.setMaximumSize(new java.awt.Dimension(125, 125));
        sel16.setMinimumSize(new java.awt.Dimension(106, 106));
        sel16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel16ActionPerformed(evt);
            }
        });
        jPanel1.add(sel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 304, 125, 100));

        sel06.setBackground(new java.awt.Color(255, 102, 102));
        sel06.setText("Name 6");
        sel06.setMaximumSize(new java.awt.Dimension(125, 125));
        sel06.setMinimumSize(new java.awt.Dimension(106, 106));
        sel06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel06ActionPerformed(evt);
            }
        });
        jPanel1.add(sel06, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 76, 125, 106));

        sel11.setBackground(new java.awt.Color(255, 102, 102));
        sel11.setText("Name 11");
        sel11.setMaximumSize(new java.awt.Dimension(125, 125));
        sel11.setMinimumSize(new java.awt.Dimension(106, 106));
        sel11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel11ActionPerformed(evt);
            }
        });
        jPanel1.add(sel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 193, 125, 100));

        sel17.setBackground(new java.awt.Color(255, 102, 102));
        sel17.setText("Name 17");
        sel17.setMaximumSize(new java.awt.Dimension(125, 125));
        sel17.setMinimumSize(new java.awt.Dimension(106, 106));
        sel17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel17ActionPerformed(evt);
            }
        });
        jPanel1.add(sel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 304, 125, 100));

        sel12.setBackground(new java.awt.Color(255, 102, 102));
        sel12.setText("Name 12");
        sel12.setMaximumSize(new java.awt.Dimension(125, 125));
        sel12.setMinimumSize(new java.awt.Dimension(106, 106));
        sel12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel12ActionPerformed(evt);
            }
        });
        jPanel1.add(sel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 193, 125, 100));

        sel07.setBackground(new java.awt.Color(255, 102, 102));
        sel07.setText("Name 7");
        sel07.setMaximumSize(new java.awt.Dimension(125, 125));
        sel07.setMinimumSize(new java.awt.Dimension(106, 106));
        sel07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel07ActionPerformed(evt);
            }
        });
        jPanel1.add(sel07, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 193, 125, 100));

        sel02.setBackground(new java.awt.Color(255, 102, 102));
        sel02.setText("Name 2");
        sel02.setMaximumSize(new java.awt.Dimension(125, 125));
        sel02.setMinimumSize(new java.awt.Dimension(106, 106));
        sel02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel02ActionPerformed(evt);
            }
        });
        jPanel1.add(sel02, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 76, 125, 105));

        sel18.setBackground(new java.awt.Color(255, 102, 102));
        sel18.setText("Name 18");
        sel18.setMaximumSize(new java.awt.Dimension(125, 125));
        sel18.setMinimumSize(new java.awt.Dimension(106, 106));
        sel18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel18ActionPerformed(evt);
            }
        });
        jPanel1.add(sel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 304, 125, 100));

        sel13.setBackground(new java.awt.Color(255, 102, 102));
        sel13.setText("Name 13");
        sel13.setMaximumSize(new java.awt.Dimension(125, 125));
        sel13.setMinimumSize(new java.awt.Dimension(106, 106));
        sel13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel13ActionPerformed(evt);
            }
        });
        jPanel1.add(sel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 304, 125, 100));

        sel08.setBackground(new java.awt.Color(255, 102, 102));
        sel08.setText("Name 8");
        sel08.setMaximumSize(new java.awt.Dimension(125, 125));
        sel08.setMinimumSize(new java.awt.Dimension(106, 106));
        sel08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel08ActionPerformed(evt);
            }
        });
        jPanel1.add(sel08, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 193, 125, 100));

        sel03.setBackground(new java.awt.Color(255, 102, 102));
        sel03.setText("Name 3");
        sel03.setMaximumSize(new java.awt.Dimension(125, 125));
        sel03.setMinimumSize(new java.awt.Dimension(106, 106));
        sel03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel03ActionPerformed(evt);
            }
        });
        jPanel1.add(sel03, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 76, 125, 106));

        sel19.setBackground(new java.awt.Color(255, 102, 102));
        sel19.setText("Name 19");
        sel19.setMaximumSize(new java.awt.Dimension(125, 125));
        sel19.setMinimumSize(new java.awt.Dimension(106, 106));
        sel19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel19ActionPerformed(evt);
            }
        });
        jPanel1.add(sel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 413, 125, 100));

        sel14.setBackground(new java.awt.Color(255, 102, 102));
        sel14.setText("Name 14");
        sel14.setMaximumSize(new java.awt.Dimension(125, 125));
        sel14.setMinimumSize(new java.awt.Dimension(106, 106));
        sel14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel14ActionPerformed(evt);
            }
        });
        jPanel1.add(sel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 304, 125, 100));

        sel09.setBackground(new java.awt.Color(255, 102, 102));
        sel09.setText("Name 9");
        sel09.setMaximumSize(new java.awt.Dimension(125, 125));
        sel09.setMinimumSize(new java.awt.Dimension(106, 106));
        sel09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel09ActionPerformed(evt);
            }
        });
        jPanel1.add(sel09, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 193, 125, 100));

        sel04.setBackground(new java.awt.Color(255, 102, 102));
        sel04.setText("Name 4");
        sel04.setMaximumSize(new java.awt.Dimension(125, 125));
        sel04.setMinimumSize(new java.awt.Dimension(106, 106));
        sel04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel04ActionPerformed(evt);
            }
        });
        jPanel1.add(sel04, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 76, 125, 106));

        sel05.setBackground(new java.awt.Color(255, 102, 102));
        sel05.setText("Name 5");
        sel05.setMaximumSize(new java.awt.Dimension(125, 125));
        sel05.setMinimumSize(new java.awt.Dimension(106, 106));
        sel05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel05ActionPerformed(evt);
            }
        });
        jPanel1.add(sel05, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 76, 125, 106));

        sel10.setBackground(new java.awt.Color(255, 102, 102));
        sel10.setText("Name 10");
        sel10.setMaximumSize(new java.awt.Dimension(125, 125));
        sel10.setMinimumSize(new java.awt.Dimension(106, 106));
        sel10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel10ActionPerformed(evt);
            }
        });
        jPanel1.add(sel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 193, 125, 100));

        sel15.setBackground(new java.awt.Color(255, 102, 102));
        sel15.setText("Name 15");
        sel15.setMaximumSize(new java.awt.Dimension(125, 125));
        sel15.setMinimumSize(new java.awt.Dimension(106, 106));
        sel15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel15ActionPerformed(evt);
            }
        });
        jPanel1.add(sel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 304, 125, 100));

        sel20.setBackground(new java.awt.Color(255, 102, 102));
        sel20.setText("Name 20");
        sel20.setMaximumSize(new java.awt.Dimension(125, 125));
        sel20.setMinimumSize(new java.awt.Dimension(106, 106));
        sel20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel20ActionPerformed(evt);
            }
        });
        jPanel1.add(sel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 413, 125, 100));

        sel21.setBackground(new java.awt.Color(255, 102, 102));
        sel21.setText("Name 21");
        sel21.setMaximumSize(new java.awt.Dimension(125, 125));
        sel21.setMinimumSize(new java.awt.Dimension(106, 106));
        sel21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel21ActionPerformed(evt);
            }
        });
        jPanel1.add(sel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 413, 125, 100));

        sel22.setBackground(new java.awt.Color(255, 102, 102));
        sel22.setText("Name 22");
        sel22.setMaximumSize(new java.awt.Dimension(125, 125));
        sel22.setMinimumSize(new java.awt.Dimension(106, 106));
        sel22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel22ActionPerformed(evt);
            }
        });
        jPanel1.add(sel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 412, 125, 102));

        sel23.setBackground(new java.awt.Color(255, 102, 102));
        sel23.setText("Name 23");
        sel23.setMaximumSize(new java.awt.Dimension(125, 125));
        sel23.setMinimumSize(new java.awt.Dimension(106, 106));
        sel23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel23ActionPerformed(evt);
            }
        });
        jPanel1.add(sel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 410, 125, 106));

        sel24.setBackground(new java.awt.Color(255, 102, 102));
        sel24.setText("Name 24");
        sel24.setMaximumSize(new java.awt.Dimension(125, 125));
        sel24.setMinimumSize(new java.awt.Dimension(106, 106));
        sel24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel24ActionPerformed(evt);
            }
        });
        jPanel1.add(sel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 410, 125, 106));

        sel25.setBackground(new java.awt.Color(255, 102, 102));
        sel25.setText("Name 25");
        sel25.setMaximumSize(new java.awt.Dimension(125, 125));
        sel25.setMinimumSize(new java.awt.Dimension(106, 106));
        sel25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel25ActionPerformed(evt);
            }
        });
        jPanel1.add(sel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 522, 125, 106));

        sel26.setBackground(new java.awt.Color(255, 102, 102));
        sel26.setText("Name 26");
        sel26.setMaximumSize(new java.awt.Dimension(125, 125));
        sel26.setMinimumSize(new java.awt.Dimension(106, 106));
        sel26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel26ActionPerformed(evt);
            }
        });
        jPanel1.add(sel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 522, 125, 106));

        sel27.setBackground(new java.awt.Color(255, 102, 102));
        sel27.setText("Name 27");
        sel27.setMaximumSize(new java.awt.Dimension(125, 125));
        sel27.setMinimumSize(new java.awt.Dimension(106, 106));
        sel27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel27ActionPerformed(evt);
            }
        });
        jPanel1.add(sel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 522, 125, 106));

        sel28.setBackground(new java.awt.Color(255, 102, 102));
        sel28.setText("Name 28");
        sel28.setMaximumSize(new java.awt.Dimension(125, 125));
        sel28.setMinimumSize(new java.awt.Dimension(106, 106));
        sel28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel28ActionPerformed(evt);
            }
        });
        jPanel1.add(sel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 522, 125, 106));

        sel29.setBackground(new java.awt.Color(255, 102, 102));
        sel29.setText("Name 29");
        sel29.setMaximumSize(new java.awt.Dimension(125, 125));
        sel29.setMinimumSize(new java.awt.Dimension(106, 106));
        sel29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel29ActionPerformed(evt);
            }
        });
        jPanel1.add(sel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 522, 125, 106));

        sel30.setBackground(new java.awt.Color(255, 102, 102));
        sel30.setText("Name 30");
        sel30.setMaximumSize(new java.awt.Dimension(125, 125));
        sel30.setMinimumSize(new java.awt.Dimension(106, 106));
        sel30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sel30ActionPerformed(evt);
            }
        });
        jPanel1.add(sel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(673, 522, 125, 106));

        jPanel2.setBackground(new java.awt.Color(8, 8, 94));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("To Vote for someone");

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Click On The Person");

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("If You Wish To Change");

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Your selection, Click on");

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("The Same Person Again");

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("When you are done");

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Click on the button");

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Below to vote for the");

        txfShowGrade.setBackground(new java.awt.Color(255, 255, 255));
        txfShowGrade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfShowGrade.setForeground(new java.awt.Color(255, 255, 255));
        txfShowGrade.setText("Grade &G& Girls");

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Boys");

        btnNextPage.setBackground(new java.awt.Color(255, 82, 24));
        btnNextPage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNextPage.setText("Go To Girls Page");
        btnNextPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextPageActionPerformed(evt);
            }
        });

        lblTotalVotedFor.setBackground(new java.awt.Color(255, 255, 255));
        lblTotalVotedFor.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblTotalVotedFor.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalVotedFor.setText("0 / 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel9)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel25)
                                        .addComponent(jLabel26)
                                        .addComponent(jLabel27)
                                        .addComponent(jLabel24)
                                        .addComponent(txfShowGrade))))
                            .addComponent(btnNextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalVotedFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txfShowGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(lblTotalVotedFor, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextPage, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 102, 51));

        lblMainMessage.setBackground(new java.awt.Color(255, 255, 255));
        lblMainMessage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMainMessage.setForeground(new java.awt.Color(255, 255, 255));
        lblMainMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMainMessage.setText("Vote - Boys - Page 1 / 1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(lblMainMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
                .addGap(168, 168, 168))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMainMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1095, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int totalSelected = 0;
//variables for every button to see if its clicked or not
    boolean chosen01 = false;
    boolean chosen02 = false;
    boolean chosen03 = false;
    boolean chosen04 = false;
    boolean chosen05 = false;
    boolean chosen06 = false;
    boolean chosen07 = false;
    boolean chosen08 = false;
    boolean chosen09 = false;
    boolean chosen10 = false;
    boolean chosen11 = false;
    boolean chosen12 = false;
    boolean chosen13 = false;
    boolean chosen14 = false;
    boolean chosen15 = false;
    boolean chosen16 = false;
    boolean chosen17 = false;
    boolean chosen18 = false;
    boolean chosen19 = false;
    boolean chosen20 = false;
    boolean chosen21 = false;
    boolean chosen22 = false;
    boolean chosen23 = false;
    boolean chosen24 = false;
    boolean chosen25 = false;
    boolean chosen26 = false;
    boolean chosen27 = false;
    boolean chosen28 = false;
    boolean chosen29 = false;
    boolean chosen30 = false;
 
    int activeVotes = 0; // amount of buttons the user has clicked

    // All code marked "//x" is different from the code above it 
    private void sel01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel01ActionPerformed
//this comment counts for all buttons, it sets the value to true if clicked, and change the color to green
//and adds one vote, if its clicked again, it reverses all code
        if (chosen01 == false) {
            chosen01 = true;
            sel01.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel01.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen01 = false;
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        }

    }//GEN-LAST:event_sel01ActionPerformed

    private void btnNextPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextPageActionPerformed
                   
                   
        

            if (!(activeVotes > votesAllowed)) {
         
            
                this.saveVotingData();

                new mainVoteSystemGirls().setVisible(true);
                this.dispose();
            } else {
                   btnNextPage.setText("Go To Girls Page");
                JOptionPane.showMessageDialog(null, "Hold Up\n\n\nYou are only allowed to vote for " + votesAllowed + " People\n\n\nYou have " + activeVotes + "/" + votesAllowed + " Selected");
            }
        
    }//GEN-LAST:event_btnNextPageActionPerformed

    private void sel02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel02ActionPerformed

        if (chosen02 == false) {//x
            chosen02 = true;//x
            sel02.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel02.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen02 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }

    }//GEN-LAST:event_sel02ActionPerformed

    private void sel03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel03ActionPerformed

        if (chosen03 == false) {//x
            chosen03 = true;//x
            sel03.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel03.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen03 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }

    }//GEN-LAST:event_sel03ActionPerformed

    private void sel04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel04ActionPerformed

        if (chosen04 == false) {//x
            chosen04 = true;//x
            sel04.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel04.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen04 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }

    }//GEN-LAST:event_sel04ActionPerformed

    private void sel05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel05ActionPerformed

        if (chosen05 == false) {//x
            chosen05 = true;//x
            sel05.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel05.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen05 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }

    }//GEN-LAST:event_sel05ActionPerformed

    private void sel06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel06ActionPerformed

        if (chosen06 == false) {//x
            chosen06 = true;//x
            sel06.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel06.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen06 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }

    }//GEN-LAST:event_sel06ActionPerformed

    private void sel07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel07ActionPerformed

        if (chosen07 == false) {//x
            chosen07 = true;//x
            sel07.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel07.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen07 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel07ActionPerformed

    private void sel08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel08ActionPerformed

        if (chosen08 == false) {//x
            chosen08 = true;//x
            sel08.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel08.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen08 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel08ActionPerformed

    private void sel09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel09ActionPerformed
        if (chosen09 == false) {//x
            chosen09 = true;//x
            sel09.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel09.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen09 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel09ActionPerformed

    private void sel10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel10ActionPerformed
        if (chosen10 == false) {//x
            chosen10 = true;//x
            sel10.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel10.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen10 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel10ActionPerformed

    private void sel11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel11ActionPerformed
        if (chosen11 == false) {//x
            chosen11 = true;//x
            sel11.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel11.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen11 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel11ActionPerformed

    private void sel12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel12ActionPerformed
        if (chosen12 == false) {//x
            chosen12 = true;//x
            sel12.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel12.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen12 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel12ActionPerformed

    private void sel13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel13ActionPerformed
        if (chosen13 == false) {//x
            chosen13 = true;//x
            sel13.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel13.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen13 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel13ActionPerformed

    private void sel14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel14ActionPerformed
        if (chosen14 == false) {//x
            chosen14 = true;//x
            sel14.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel14.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen14 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel14ActionPerformed

    private void sel15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel15ActionPerformed
        if (chosen15 == false) {//x
            chosen15 = true;//x
            sel15.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel15.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen15 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel15ActionPerformed

    private void sel16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel16ActionPerformed
        if (chosen16 == false) {//x
            chosen16 = true;//x
            sel16.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel16.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen16 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel16ActionPerformed

    private void sel17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel17ActionPerformed
        if (chosen17 == false) {//x
            chosen17 = true;//x
            sel17.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel17.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen17 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel17ActionPerformed

    private void sel18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel18ActionPerformed
        if (chosen18 == false) {//x
            chosen18 = true;//x
            sel18.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel18.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen18 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel18ActionPerformed

    private void sel19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel19ActionPerformed
        if (chosen19 == false) {//x
            chosen19 = true;//x
            sel19.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel19.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen19 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel19ActionPerformed

    private void sel20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel20ActionPerformed
        if (chosen20 == false) {//x
            chosen20 = true;//x
            sel20.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel20.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen20 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel20ActionPerformed

    private void sel21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel21ActionPerformed
        if (chosen21 == false) {//x
            chosen21 = true;//x
            sel21.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel21.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen21 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel21ActionPerformed

    private void sel22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel22ActionPerformed
        if (chosen22 == false) {//x
            chosen22 = true;//x
            sel22.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel22.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen22 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel22ActionPerformed

    private void sel23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel23ActionPerformed
        if (chosen23 == false) {//x
            chosen23 = true;//x
            sel23.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel23.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen23 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel23ActionPerformed

    private void sel24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel24ActionPerformed
        if (chosen24 == false) {//x
            chosen24 = true;//x
            sel24.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
            lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        } else {
            sel24.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen24 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel24ActionPerformed

    private void sel25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel25ActionPerformed
        if (chosen25 == false) {//x
            chosen25 = true;//x
            sel25.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel25.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen25 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel25ActionPerformed

    private void sel26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel26ActionPerformed
        if (chosen26 == false) {//x
            chosen26 = true;//x
            sel26.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel26.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen26 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel26ActionPerformed

    private void sel27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel27ActionPerformed
        if (chosen27 == false) {//x
            chosen27 = true;//x
            sel27.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel27.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen27 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel27ActionPerformed

    private void sel28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel28ActionPerformed
        if (chosen28 == false) {//x
            chosen28 = true;//x
            sel28.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel28.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen28 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel28ActionPerformed

    private void sel29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel29ActionPerformed
        if (chosen29 == false) {//x
            chosen29 = true;//x
            sel29.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel29.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen29 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel29ActionPerformed

    private void sel30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sel30ActionPerformed
        if (chosen30 == false) {//x
            chosen30 = true;//x
            sel30.setBackground(new java.awt.Color(102, 255, 102)); //x
            System.out.println("TRUE");
            activeVotes++;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);


        } else {
            sel30.setBackground(new java.awt.Color(255, 102, 102)); //x
            chosen30 = false;//x
            System.out.println("FALSE");
            activeVotes--;
            System.out.println(activeVotes + " / " + votesAllowed);
                        lblTotalVotedFor.setText(activeVotes + " / " + votesAllowed);

        }
    }//GEN-LAST:event_sel30ActionPerformed

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
            java.util.logging.Logger.getLogger(mainVoteSystemBoys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainVoteSystemBoys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainVoteSystemBoys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainVoteSystemBoys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainVoteSystemBoys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNextPage;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblMainMessage;
    private javax.swing.JLabel lblTotalVotedFor;
    private javax.swing.JButton sel01;
    private javax.swing.JButton sel02;
    private javax.swing.JButton sel03;
    private javax.swing.JButton sel04;
    private javax.swing.JButton sel05;
    private javax.swing.JButton sel06;
    private javax.swing.JButton sel07;
    private javax.swing.JButton sel08;
    private javax.swing.JButton sel09;
    private javax.swing.JButton sel10;
    private javax.swing.JButton sel11;
    private javax.swing.JButton sel12;
    private javax.swing.JButton sel13;
    private javax.swing.JButton sel14;
    private javax.swing.JButton sel15;
    private javax.swing.JButton sel16;
    private javax.swing.JButton sel17;
    private javax.swing.JButton sel18;
    private javax.swing.JButton sel19;
    private javax.swing.JButton sel20;
    private javax.swing.JButton sel21;
    private javax.swing.JButton sel22;
    private javax.swing.JButton sel23;
    private javax.swing.JButton sel24;
    private javax.swing.JButton sel25;
    private javax.swing.JButton sel26;
    private javax.swing.JButton sel27;
    private javax.swing.JButton sel28;
    private javax.swing.JButton sel29;
    private javax.swing.JButton sel30;
    private javax.swing.JLabel txfShowGrade;
    // End of variables declaration//GEN-END:variables

    public void loadAllData() { // method loads all appropriate text into the buttons and sets them visable if they should have text
        ToolTipManager.sharedInstance().setInitialDelay(0); //xx
        boolean showPictures = sm.checkStatus("DisplayPictures"); //xx
        boolean showTextOnPictures = sm.checkStatus("DisplayTextOnPictures"); //xx
        int cV1 = cm.getTextColour(1); //xx
        int cV2 = cm.getTextColour(2); //xx
        int cV3 = cm.getTextColour(3); //xx

        try {
            
            //NEW CODE
            
            Scanner scFile = new Scanner(new File(cm.getLocalStorageLocation() + "\\ImageSources.db"));
            String[] fNameArr = new String[300];
            String[] sNameArr = new String[300];
            String[] locationArr = new String[300];
            int size = 0;
            while(scFile.hasNextLine())
            {
                String line = scFile.nextLine();
                Scanner scLine = new Scanner(line).useDelimiter("#");
                String fName = scLine.next();
                String sName = scLine.next();
                String location = scLine.next();
                String UserGrade = scLine.next();
                String UserGender = scLine.next();
                scLine.close();
                if(grade.equalsIgnoreCase(UserGrade) && UserGender.equalsIgnoreCase("m"))
                {
                    fNameArr[size] = fName;        
                sNameArr[size] = sName;        
                locationArr[size] = fName;        
                size++;
                }
                
            }
            
            
            PrintWriter saveActiveNumVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeTotalVotes.db", false));
            saveActiveNumVotes.print("");
            saveActiveNumVotes.close();

            Scanner countTotalVotes = new Scanner(new File(cm.getLocalStorageLocation() + "\\activeTotalVotes.db"));
            if (countTotalVotes.hasNext()) {
                activeVotes = countTotalVotes.nextInt();
            }
          int counter = 0;
           /* Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            String query = "";
            if (sm.checkStatus("ForceRandomisedDisplay") == true) {
                query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"m\" ORDER BY RAND()";
            } else {
                query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"m\"";
            }
            result = stmt.executeQuery(query);
*/
            String dbfName = "";
            String dbSurname = "";

            if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                
                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel01.setToolTipText(dbfName + " " + dbSurname);
                    sel01.setIcon(cm.resize(icon, sel01.getWidth() - 15, sel01.getHeight() + 15));
                    sel01.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel01.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel01.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel01.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>"); //html code used to simulate a next line for a button
            } else {
                sel01.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel02.setToolTipText(dbfName + " " + dbSurname);
                    sel02.setIcon(cm.resize(icon, sel02.getWidth() - 15, sel02.getHeight() + 15));
                    sel02.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel02.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel02.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel02.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel02.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel02.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel03.setToolTipText(dbfName + " " + dbSurname);
                    sel03.setIcon(cm.resize(icon, sel03.getWidth() - 15, sel03.getHeight() + 15));
                    sel03.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel03.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel03.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel03.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel03.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel04.setToolTipText(dbfName + " " + dbSurname);
                    sel04.setIcon(cm.resize(icon, sel04.getWidth() - 15, sel04.getHeight() + 15));
                    sel04.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel04.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel04.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel04.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel04.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel04.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel05.setToolTipText(dbfName + " " + dbSurname);
                    sel05.setIcon(cm.resize(icon, sel05.getWidth() - 15, sel05.getHeight() + 15));
                    sel05.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel05.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel05.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel05.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel05.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel05.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel06.setToolTipText(dbfName + " " + dbSurname);
                    sel06.setIcon(cm.resize(icon, sel06.getWidth() - 15, sel06.getHeight() + 15));
                    sel06.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel06.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel06.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel06.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel06.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel06.setVisible(false);
            }
             if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel07.setToolTipText(dbfName + " " + dbSurname);
                    sel07.setIcon(cm.resize(icon, sel07.getWidth() - 15, sel07.getHeight() + 15));
                    sel07.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel07.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel07.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel07.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel07.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel07.setVisible(false);
            }
             if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel08.setToolTipText(dbfName + " " + dbSurname);
                    sel08.setIcon(cm.resize(icon, sel08.getWidth() - 15, sel08.getHeight() + 15));
                    sel08.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel08.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel08.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel08.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel08.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel08.setVisible(false);
            }
             if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel09.setToolTipText(dbfName + " " + dbSurname);
                    sel09.setIcon(cm.resize(icon, sel09.getWidth() - 15, sel09.getHeight() + 15));
                    sel09.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel09.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel09.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel09.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel09.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel09.setVisible(false);
            }
               if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel10.setToolTipText(dbfName + " " + dbSurname);
                    sel10.setIcon(cm.resize(icon, sel10.getWidth() - 15, sel10.getHeight() + 15));
                    sel10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel10.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel10.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel10.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel10.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel11.setToolTipText(dbfName + " " + dbSurname);
                    sel11.setIcon(cm.resize(icon, sel11.getWidth() - 15, sel11.getHeight() + 15));
                    sel11.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel11.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel11.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel11.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel11.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel12.setToolTipText(dbfName + " " + dbSurname);
                    sel12.setIcon(cm.resize(icon, sel12.getWidth() - 15, sel12.getHeight() + 15));
                    sel12.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel12.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel12.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel12.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel12.setVisible(false);
            }
             if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel13.setToolTipText(dbfName + " " + dbSurname);
                    sel13.setIcon(cm.resize(icon, sel13.getWidth() - 15, sel13.getHeight() + 15));
                    sel13.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel13.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel13.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel13.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel13.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel14.setToolTipText(dbfName + " " + dbSurname);
                    sel14.setIcon(cm.resize(icon, sel14.getWidth() - 15, sel14.getHeight() + 15));
                    sel14.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel14.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel14.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel14.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel14.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel15.setToolTipText(dbfName + " " + dbSurname);
                    sel15.setIcon(cm.resize(icon, sel15.getWidth() - 15, sel15.getHeight() + 15));
                    sel15.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel15.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel15.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel15.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel15.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel16.setToolTipText(dbfName + " " + dbSurname);
                    sel16.setIcon(cm.resize(icon, sel16.getWidth() - 15, sel16.getHeight() + 15));
                    sel16.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel16.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel16.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel16.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel16.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel17.setToolTipText(dbfName + " " + dbSurname);
                    sel17.setIcon(cm.resize(icon, sel17.getWidth() - 15, sel17.getHeight() + 15));
                    sel17.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel17.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel17.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel17.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel17.setVisible(false);
            }
             if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel18.setToolTipText(dbfName + " " + dbSurname);
                    sel18.setIcon(cm.resize(icon, sel18.getWidth() - 15, sel18.getHeight() + 15));
                    sel18.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel18.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel18.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel18.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel18.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel19.setToolTipText(dbfName + " " + dbSurname);
                    sel19.setIcon(cm.resize(icon, sel19.getWidth() - 15, sel19.getHeight() + 15));
                    sel19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel19.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel19.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel19.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel19.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel20.setToolTipText(dbfName + " " + dbSurname);
                    sel20.setIcon(cm.resize(icon, sel20.getWidth() - 15, sel20.getHeight() + 15));
                    sel20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel20.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel20.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel20.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel20.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel21.setToolTipText(dbfName + " " + dbSurname);
                    sel21.setIcon(cm.resize(icon, sel21.getWidth() - 15, sel21.getHeight() + 15));
                    sel21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel21.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel21.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel21.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel21.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel22.setToolTipText(dbfName + " " + dbSurname);
                    sel22.setIcon(cm.resize(icon, sel22.getWidth() - 15, sel22.getHeight() + 15));
                    sel22.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel22.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel22.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel22.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel22.setVisible(false);
            }
            if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel23.setToolTipText(dbfName + " " + dbSurname);
                    sel23.setIcon(cm.resize(icon, sel23.getWidth() - 15, sel23.getHeight() + 15));
                    sel23.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel23.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel23.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel23.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel23.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel24.setToolTipText(dbfName + " " + dbSurname);
                    sel24.setIcon(cm.resize(icon, sel24.getWidth() - 15, sel24.getHeight() + 15));
                    sel24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel24.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel24.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel24.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel24.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel25.setToolTipText(dbfName + " " + dbSurname);
                    sel25.setIcon(cm.resize(icon, sel25.getWidth() - 15, sel25.getHeight() + 15));
                    sel25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel25.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel25.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel25.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel25.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel26.setToolTipText(dbfName + " " + dbSurname);
                    sel26.setIcon(cm.resize(icon, sel26.getWidth() - 15, sel26.getHeight() + 15));
                    sel26.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel26.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel26.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel26.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel26.setVisible(false);
            }
             if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel27.setToolTipText(dbfName + " " + dbSurname);
                    sel27.setIcon(cm.resize(icon, sel27.getWidth() - 15, sel27.getHeight() + 15));
                    sel27.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel27.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel27.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel27.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel27.setVisible(false);
            }
               if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel28.setToolTipText(dbfName + " " + dbSurname);
                    sel28.setIcon(cm.resize(icon, sel28.getWidth() - 15, sel28.getHeight() + 15));
                    sel28.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel28.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel28.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel28.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel28.setVisible(false);
            }
              if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel29.setToolTipText(dbfName + " " + dbSurname);
                    sel29.setIcon(cm.resize(icon, sel29.getWidth() - 15, sel29.getHeight() + 15));
                    sel29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel29.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel29.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel29.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel29.setVisible(false);
            }
               if (fNameArr[counter] != null) {
                dbfName = fNameArr[counter];
                dbSurname = sNameArr[counter];
                counter++;

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel30.setToolTipText(dbfName + " " + dbSurname);
                    sel30.setIcon(cm.resize(icon, sel30.getWidth() - 15, sel30.getHeight() + 15));
                    sel30.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel30.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel30.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel30.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel30.setVisible(false);
            }
          

        } catch (Exception e) {
           //TODO (ADD BACKUP LOADER)
          
           this.loadAllDataBackup();
           ar.reloadOptimisedSystem();
        }

    }

    public void saveVotingData() //This will get all true booleans and save the text that are set as true to a text file then to a database
    {
        SmartSQLProcessing spp = new SmartSQLProcessing();
        String allVotes;
        String userToAdd;
        try {
            PrintWriter saveActiveNumVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeTotalVotes.db"));
            saveActiveNumVotes.print(activeVotes);
            System.out.println(activeVotes + " Saved to local Storage");
            saveActiveNumVotes.close();
          
                        PrintWriter saveActiveVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeUserVotedFor.db", true));
/*
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
*/
            if (chosen01 == true) {
                userToAdd = sel01.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", ""); // removes the hrml code from the text so it will only display appropriate data
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED
            }
            if (chosen02 == true) {
                userToAdd = sel02.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen03 == true) {
                userToAdd = sel03.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen04 == true) {
                userToAdd = sel04.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
              spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGEDate();
                //CHANGED

            }
            if (chosen05 == true) {
                userToAdd = sel05.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen06 == true) {
                userToAdd = sel06.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
            spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen07 == true) {
                userToAdd = sel07.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
               spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen08 == true) {
                userToAdd = sel08.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen09 == true) {
                userToAdd = sel09.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen10 == true) {
                userToAdd = sel10.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
         spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen11 == true) {
                userToAdd = sel11.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen12 == true) {
                userToAdd = sel12.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
            spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen13 == true) {
                userToAdd = sel13.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
          spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen14 == true) {
                userToAdd = sel14.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen15 == true) {
                userToAdd = sel15.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen16 == true) {
                userToAdd = sel16.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
            spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen17 == true) {
                userToAdd = sel17.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
           spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen18 == true) {
                userToAdd = sel18.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen19 == true) {
                userToAdd = sel19.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
                 spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen20 == true) {
                userToAdd = sel20.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
              spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen21 == true) {
                userToAdd = sel21.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen22 == true) {
                userToAdd = sel22.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
               spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }

            if (chosen23 == true) {
                userToAdd = sel23.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
            spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen24 == true) {
                userToAdd = sel24.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
           spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen25 == true) {
                userToAdd = sel25.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
               spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen26 == true) {
                userToAdd = sel26.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
               spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen27 == true) {
                userToAdd = sel27.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
            spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen28 == true) {
                userToAdd = sel28.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
        spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen29 == true) {
                userToAdd = sel29.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED

            }
            if (chosen30 == true) {
                userToAdd = sel30.getText();//x
                String[] fullname;
                fullname = userToAdd.split("<br>");
                String genFirstName = fullname[0].replace("<html>", "");
                String genLastName = fullname[1].replace("</html>", "");
                System.out.println(genFirstName + " " + genLastName + "<----");
                saveActiveVotes.print("- " + genFirstName + " " + genLastName + " - ");
             spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET TotalVotes = TotalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");      
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = OriginalVotes + 1 WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET Score = Score + " + score + " WHERE fName = \"" + genFirstName + "\" AND sName = \"" + genLastName + "\"");
                //CHANGED
            }
            saveActiveVotes.close();
            spp.addSqlStatement("update", "UPDATE UsersToVoteFor SET OriginalVotes = TotalVotes WHERE ReasonForChangingData = \"No data was changed yet\"");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

 /*   private void loadNextPageNames() { //TODO DISABLE
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            //ADD HERE
            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            String query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"m\"";
            result = stmt.executeQuery(query);
            String dbfName = "";
            String dbSurname = "";
            for (int i = 0; i < 30; i++) {
                result.next();
            }
            while (result.next()) {
                btnNextPage.setText("Go To Second Page");
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
             
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    */

   /*private void loadTotalPages() {
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();

            String query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"m\"";
            result = stmt.executeQuery(query);
            String dbfName = "";
            String dbSurname = "";
            for (int i = 0; i < 30; i++) {
                result.next();
            }
            if (result.next()) {
                lblMainMessage.setText("Vote - Boys - Page 1 / 2");
            }
            for (int i = 0; i < 30; i++) {
                result.next();
            }
            if (result.next()) {
                lblMainMessage.setText("Vote - Boys - Page 1 / 3");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
    
    public void loadAllDataBackup() { // method loads all appropriate text into the buttons and sets them visable if they should have text
        ToolTipManager.sharedInstance().setInitialDelay(0); //xx
        boolean showPictures = sm.checkStatus("DisplayPictures"); //xx
        boolean showTextOnPictures = sm.checkStatus("DisplayTextOnPictures"); //xx
        int cV1 = cm.getTextColour(1); //xx
        int cV2 = cm.getTextColour(2); //xx
        int cV3 = cm.getTextColour(3); //xx

        try {
            PrintWriter saveActiveNumVotes = new PrintWriter(new FileWriter(cm.getLocalStorageLocation() + "\\activeTotalVotes.db", false));
            saveActiveNumVotes.print("");
            saveActiveNumVotes.close();

            Scanner countTotalVotes = new Scanner(new File(cm.getLocalStorageLocation() + "\\activeTotalVotes.db"));
            if (countTotalVotes.hasNext()) {
                activeVotes = countTotalVotes.nextInt();
            }
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);
            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();
            String query = "";
            if (sm.checkStatus("ForceRandomisedDisplay") == true) {
                query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"m\" ORDER BY RAND()";
            } else {
                query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"m\"";
            }
            result = stmt.executeQuery(query);
            String dbfName = "";
            String dbSurname = "";

            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel01.setToolTipText(dbfName + " " + dbSurname);
                    sel01.setIcon(cm.resize(icon, sel01.getWidth() - 15, sel01.getHeight() + 15));
                    sel01.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel01.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel01.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel01.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel01.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>"); //html code used to simulate a next line for a button
            } else {
                sel01.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel02.setToolTipText(dbfName + " " + dbSurname);
                    sel02.setIcon(cm.resize(icon, sel02.getWidth() - 15, sel02.getHeight() + 15));
                    sel02.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel02.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel02.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel02.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel02.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel02.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
                dbSurname = result.getString("sName");
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel03.setToolTipText(dbfName + " " + dbSurname);
                    sel03.setIcon(cm.resize(icon, sel03.getWidth() - 15, sel03.getHeight() + 15));
                    sel03.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel03.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel03.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel03.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel03.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel03.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                dbSurname = result.getString("sName");
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel04.setToolTipText(dbfName + " " + dbSurname);
                    sel04.setIcon(cm.resize(icon, sel04.getWidth() - 15, sel04.getHeight() + 15));
                    sel04.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel04.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel04.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel04.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel04.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel04.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel05.setToolTipText(dbfName + " " + dbSurname);
                    sel05.setIcon(cm.resize(icon, sel05.getWidth() - 15, sel05.getHeight() + 15));
                    sel05.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel05.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel05.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel05.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel05.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel05.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel06.setToolTipText(dbfName + " " + dbSurname);
                    sel06.setIcon(cm.resize(icon, sel06.getWidth() - 15, sel06.getHeight() + 15));
                    sel06.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel06.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel06.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel06.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel06.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel06.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");
                //**************************************************************************************************

                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel07.setToolTipText(dbfName + " " + dbSurname);
                    sel07.setIcon(cm.resize(icon, sel07.getWidth() - 15, sel07.getHeight() + 15));
                    sel07.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel07.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel07.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel07.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************
                sel07.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel07.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel08.setToolTipText(dbfName + " " + dbSurname);
                    sel08.setIcon(cm.resize(icon, sel08.getWidth() - 15, sel08.getHeight() + 15));
                    sel08.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel08.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel08.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel08.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel08.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel08.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel09.setToolTipText(dbfName + " " + dbSurname);
                    sel09.setIcon(cm.resize(icon, sel09.getWidth() - 15, sel09.getHeight() + 15));
                    sel09.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel09.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel09.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel09.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel09.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel09.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel10.setToolTipText(dbfName + " " + dbSurname);
                    sel10.setIcon(cm.resize(icon, sel10.getWidth() - 15, sel10.getHeight() + 15));
                    sel10.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel10.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel10.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel10.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel10.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel11.setToolTipText(dbfName + " " + dbSurname);
                    sel11.setIcon(cm.resize(icon, sel11.getWidth() - 15, sel11.getHeight() + 15));
                    sel11.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel11.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel11.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel11.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel11.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel12.setToolTipText(dbfName + " " + dbSurname);
                    sel12.setIcon(cm.resize(icon, sel12.getWidth() - 15, sel12.getHeight() + 15));
                    sel12.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel12.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel12.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel12.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel12.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel13.setToolTipText(dbfName + " " + dbSurname);
                    sel13.setIcon(cm.resize(icon, sel13.getWidth() - 15, sel13.getHeight() + 15));
                    sel13.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel13.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel13.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel13.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel13.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel14.setToolTipText(dbfName + " " + dbSurname);
                    sel14.setIcon(cm.resize(icon, sel14.getWidth() - 15, sel14.getHeight() + 15));
                    sel14.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel14.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel14.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel14.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel14.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel15.setToolTipText(dbfName + " " + dbSurname);
                    sel15.setIcon(cm.resize(icon, sel15.getWidth() - 15, sel15.getHeight() + 15));
                    sel15.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel15.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel15.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel15.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel15.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel16.setToolTipText(dbfName + " " + dbSurname);
                    sel16.setIcon(cm.resize(icon, sel16.getWidth() - 15, sel16.getHeight() + 15));
                    sel16.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel16.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel16.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel16.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel16.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel17.setToolTipText(dbfName + " " + dbSurname);
                    sel17.setIcon(cm.resize(icon, sel17.getWidth() - 15, sel17.getHeight() + 15));
                    sel17.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel17.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel17.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel17.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel17.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel18.setToolTipText(dbfName + " " + dbSurname);
                    sel18.setIcon(cm.resize(icon, sel18.getWidth() - 15, sel18.getHeight() + 15));
                    sel18.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel18.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel18.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel18.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel18.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel19.setToolTipText(dbfName + " " + dbSurname);
                    sel19.setIcon(cm.resize(icon, sel19.getWidth() - 15, sel19.getHeight() + 15));
                    sel19.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel19.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel19.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel19.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel19.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel20.setToolTipText(dbfName + " " + dbSurname);
                    sel20.setIcon(cm.resize(icon, sel20.getWidth() - 15, sel20.getHeight() + 15));
                    sel20.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel20.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel20.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel20.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel20.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel21.setToolTipText(dbfName + " " + dbSurname);
                    sel21.setIcon(cm.resize(icon, sel21.getWidth() - 15, sel21.getHeight() + 15));
                    sel21.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel21.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel21.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel21.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel21.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel22.setToolTipText(dbfName + " " + dbSurname);
                    sel22.setIcon(cm.resize(icon, sel22.getWidth() - 15, sel22.getHeight() + 15));
                    sel22.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel22.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel22.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel22.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel22.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel23.setToolTipText(dbfName + " " + dbSurname);
                    sel23.setIcon(cm.resize(icon, sel23.getWidth() - 15, sel23.getHeight() + 15));
                    sel23.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel23.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel23.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel23.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel23.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel24.setToolTipText(dbfName + " " + dbSurname);
                    sel24.setIcon(cm.resize(icon, sel24.getWidth() - 15, sel24.getHeight() + 15));
                    sel24.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel24.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel24.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel24.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel24.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel25.setToolTipText(dbfName + " " + dbSurname);
                    sel25.setIcon(cm.resize(icon, sel25.getWidth() - 15, sel25.getHeight() + 15));
                    sel25.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel25.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel25.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel25.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel25.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel26.setToolTipText(dbfName + " " + dbSurname);
                    sel26.setIcon(cm.resize(icon, sel26.getWidth() - 15, sel26.getHeight() + 15));
                    sel26.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel26.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel26.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel26.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel26.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel27.setToolTipText(dbfName + " " + dbSurname);
                    sel27.setIcon(cm.resize(icon, sel27.getWidth() - 15, sel27.getHeight() + 15));
                    sel27.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel27.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel27.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel27.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel27.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel28.setToolTipText(dbfName + " " + dbSurname);
                    sel28.setIcon(cm.resize(icon, sel28.getWidth() - 15, sel28.getHeight() + 15));
                    sel28.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel28.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel28.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel28.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel28.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel29.setToolTipText(dbfName + " " + dbSurname);
                    sel29.setIcon(cm.resize(icon, sel29.getWidth() - 15, sel29.getHeight() + 15));
                    sel29.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel29.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel29.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel29.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel29.setVisible(false);
            }
            if (result.next()) {
                dbfName = result.getString("fName");
                dbSurname = result.getString("sName");

                //**************************************************************************************************
                if (cm.getPictureLocation(dbfName, dbSurname).equalsIgnoreCase("NoImageSet") || showPictures == false) {
                    System.out.println("No Image Loaded (" + cm.getPictureLocation(dbfName, dbfName));
                } else {
                    ImageIcon icon = (new javax.swing.ImageIcon(cm.getPictureLocation(dbfName, dbSurname)));
                    sel30.setToolTipText(dbfName + " " + dbSurname);
                    sel30.setIcon(cm.resize(icon, sel30.getWidth() - 15, sel30.getHeight() + 15));
                    sel30.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
                    sel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
                    sel30.setForeground(new java.awt.Color(cV1, cV2, cV3));
                    if (showTextOnPictures == false) {
                        sel30.setFont(new Font("Arial", Font.PLAIN, 0));
                    }
                }
                //**************************************************************************************************

                sel30.setText("<html>" + dbfName + "<br>" + dbSurname + "</html>");
            } else {
                sel30.setVisible(false);
            }
            if (result.next()) {

                nextPage = true;
            } else {

            }

        } catch (Exception e) {
            ar.forceImageRepair();
            ar.backupDatabase("default");
           
            JOptionPane.showMessageDialog(null, "Something Went Wrong", "Warning\n\nSome data failed to load\n\nPlease ask a teacher for help\n\nAttempting Automatic Repair...\n\nClicking \"Ok\" Will Relaod This Page!", JOptionPane.WARNING_MESSAGE);

        }

    }


}
