//Coded And Re-Optimised By Jaco Van Stryp Grade 12/2 (Information Technology PAT Phase 3)
//Date Started 03/20/2018
//Date Finished 05/29/2018
package com.MainData;

import com.Backend.AutoRepair;
import com.Backend.commonMethods;
import java.awt.Desktop;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainNomination extends javax.swing.JFrame {
    //this class will allow the user to nominate others allowing them
    //to be voted for

    commonMethods cm = new commonMethods();
    Settings sm = new Settings();
   
    /**
     * Creates new form MainOptionSelection
     */
    public MainNomination() {
        initComponents();

        if (cm.doesUserIPHaveAdministrationAccess() == false) // checks if user has administration access to give them access to bypass mode
        {
            boxBypassMode.setVisible(false);
            btnAutoNominate.setVisible(true);

        }
        if (sm.checkStatus("ForceBypassMode") == true) //if Force Bypass Mode is toggeld in settings, It will make all of these 
        {
            btnAutoNominate.setVisible(true);

            boxBypassMode.setSelected(true);
            boxBypassMode.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            boxNM.setVisible(false);
            boxN.setVisible(false);
            boxW.setVisible(false);
            txfFNameN.setVisible(false);
            txfSNameN.setVisible(false);
            txfFNameW.setVisible(false);
            txfSNameW.setVisible(false);
        } else {
            btnAutoNominate.setVisible(false);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnNominate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txfFNameMN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txfSNameMN = new javax.swing.JTextField();
        comboGradeMN = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txfFNameN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txfSNameN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txfFNameW = new javax.swing.JTextField();
        txfSNameW = new javax.swing.JTextField();
        boxNM = new javax.swing.JCheckBox();
        boxN = new javax.swing.JCheckBox();
        boxW = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        comboGenderMN = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        boxBypassMode = new javax.swing.JCheckBox();
        btnAutoNominate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Highschool Electronic Voting System");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));

        btnNominate.setBackground(new java.awt.Color(255, 82, 24));
        btnNominate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnNominate.setForeground(new java.awt.Color(255, 255, 255));
        btnNominate.setText("Nominate This Person");
        btnNominate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNominateActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter The First Name Of The Person You Want To Nominate:");

        txfFNameMN.setBackground(new java.awt.Color(34, 34, 78));
        txfFNameMN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfFNameMN.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter The Surname Of The Person You Want To Nominate:");

        txfSNameMN.setBackground(new java.awt.Color(34, 34, 78));
        txfSNameMN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfSNameMN.setForeground(new java.awt.Color(255, 255, 255));

        comboGradeMN.setBackground(new java.awt.Color(37, 37, 103));
        comboGradeMN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboGradeMN.setForeground(new java.awt.Color(255, 255, 255));
        comboGradeMN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Select The Grade Of The Person You Want To Nominate:");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Enter The Firstname of the Person Who is Nominating");

        txfFNameN.setBackground(new java.awt.Color(34, 34, 78));
        txfFNameN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfFNameN.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter The Surname of the Person Who is Nominating");

        txfSNameN.setBackground(new java.awt.Color(34, 34, 78));
        txfSNameN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfSNameN.setForeground(new java.awt.Color(255, 255, 255));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Enter The Firstname of the Witness");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Enter The Surname of the Witness");

        txfFNameW.setBackground(new java.awt.Color(34, 34, 78));
        txfFNameW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfFNameW.setForeground(new java.awt.Color(255, 255, 255));

        txfSNameW.setBackground(new java.awt.Color(34, 34, 78));
        txfSNameW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txfSNameW.setForeground(new java.awt.Color(255, 255, 255));

        boxNM.setBackground(new java.awt.Color(255, 255, 255));
        boxNM.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boxNM.setForeground(new java.awt.Color(255, 255, 255));
        boxNM.setText("Nominee");

        boxN.setBackground(new java.awt.Color(255, 255, 255));
        boxN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boxN.setForeground(new java.awt.Color(255, 255, 255));
        boxN.setText("Nominater");

        boxW.setBackground(new java.awt.Color(255, 255, 255));
        boxW.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boxW.setForeground(new java.awt.Color(255, 255, 255));
        boxW.setText("Witness");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Check The Following Boxes To Agree You Saw This Document");

        comboGenderMN.setBackground(new java.awt.Color(37, 37, 103));
        comboGenderMN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        comboGenderMN.setForeground(new java.awt.Color(255, 255, 255));
        comboGenderMN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "f" }));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Select The Gender Of The Person You Want To Nominate:");

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eduplex High School Electronic Voting System");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("-- Nomination --");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBackMousePressed(evt);
            }
        });

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(72, 72, 72)))
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        boxBypassMode.setBackground(new java.awt.Color(255, 255, 255));
        boxBypassMode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        boxBypassMode.setForeground(new java.awt.Color(255, 255, 255));
        boxBypassMode.setText("Bypass Mode");
        boxBypassMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxBypassModeActionPerformed(evt);
            }
        });

        btnAutoNominate.setBackground(new java.awt.Color(255, 82, 24));
        btnAutoNominate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAutoNominate.setForeground(new java.awt.Color(255, 255, 255));
        btnAutoNominate.setText(" Auto Nominate");
        btnAutoNominate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoNominateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(boxNM)
                                .addGap(38, 38, 38)
                                .addComponent(boxN)
                                .addGap(32, 32, 32)
                                .addComponent(boxW)
                                .addGap(18, 18, 18)
                                .addComponent(boxBypassMode)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfFNameW)
                                .addComponent(txfSNameW)
                                .addComponent(btnNominate, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                            .addComponent(btnAutoNominate, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboGenderMN, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txfSNameN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfFNameN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(comboGradeMN, javax.swing.GroupLayout.Alignment.TRAILING, 0, 280, Short.MAX_VALUE)
                            .addComponent(txfSNameMN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txfFNameMN, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txfFNameMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txfSNameMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGenderMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboGradeMN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txfFNameN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txfSNameN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txfFNameW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txfSNameW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btnAutoNominate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNominate)
                    .addComponent(boxNM)
                    .addComponent(boxN)
                    .addComponent(boxW)
                    .addComponent(boxBypassMode))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNominateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNominateActionPerformed
 AutoRepair ar = new AutoRepair();
        //this methods will run through all input and only take what is required by the settings
        //if information is possably incorect, it will tell the user that there is a mistake somewhere
        //no information can be duplicated

        int allowedDisplayTotal;
        boolean testMode = sm.checkStatus("TestMode");
        // checks if nominations should be displayed randomly

        allowedDisplayTotal = 30;

        String imgLocation = "NoImageSet";
        String nomineeFName = txfFNameMN.getText();
        String nomineeSName = txfSNameMN.getText();
        String nomineeGrade = comboGradeMN.getSelectedItem() + "";
        String nomineeGender = comboGenderMN.getSelectedItem() + "";
        String nominatorFName = txfFNameN.getText();
        String nominatorSName = txfSNameN.getText();
        String witnessFName = txfFNameW.getText();
        String witnessSName = txfSNameW.getText();
        boolean checkNominee = boxNM.isSelected();
        boolean checkNominator = boxN.isSelected();
        boolean checkWitness = boxW.isSelected();
        boolean bypassMode = boxBypassMode.isSelected();

        if (sm.checkStatus("RequireWitness") == true) {
            witnessFName = "-";
            witnessSName = "-";
            boxW.setSelected(true);
            boxW.setVisible(false);
        }

        if (nomineeFName.equalsIgnoreCase("") || nomineeSName.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Please make sure you filled in all the information correctly!");
        } else {
            nomineeFName = nomineeFName.trim();
            nomineeSName = nomineeSName.trim();

            if (this.getCustomNominated(nomineeGender, nomineeGrade) >= allowedDisplayTotal) {
                JOptionPane.showMessageDialog(null, "Sadly the gender group for \"" + nomineeGender + "\" with grade " + nomineeGrade + " is full.\nAdministrators can remove entries.\n\n" + (this.getCustomNominated(nomineeGender, nomineeGrade) + 1) + " / " + allowedDisplayTotal);
            } else {
                if (bypassMode == true) {

                    if (this.hasUserBeenNominated(nomineeFName, nomineeSName) == true) {
                        JOptionPane.showMessageDialog(null, "Whoops!\n\n\n" + nomineeFName + " " + nomineeSName + " Has already been nominated by someone else!", "Duplication Detected!", JOptionPane.ERROR_MESSAGE);
                        txfFNameMN.setText("");
                        txfSNameMN.setText("");
                        txfFNameN.setText("");
                        txfSNameN.setText("");
                        txfFNameW.setText("");
                        txfSNameW.setText("");
                        boxNM.setSelected(false);
                        boxN.setSelected(false);
                        boxW.setSelected(false);
                    } else {
                        //TODO Add code that link an image to display user

                        int dialogResult = JOptionPane.showConfirmDialog(null, "Is the following information correct?\n\n" + nomineeFName + " " + nomineeSName + " with the gender type \"" + nomineeGender + "\" In Grade " + nomineeGrade + " Is being nominated", "Please Confirm If The Following Information Is Correct", 0);
                        if (dialogResult == 0) {

                            try {

                                int reqImg = JOptionPane.showConfirmDialog(null, "You have successfuly nominated " + nomineeFName + " " + nomineeSName + "\n\n" + (this.getCustomNominated(nomineeGender, nomineeGrade) + 1) + " / " + allowedDisplayTotal + "\n\nDo You Wish To Add A Picture To " + nomineeFName + " " + nomineeSName + "?\n\nNOTE\n\nIt Is Required That The Picture Is Located In The Server Location", "Add Nominee Picture", 0);
                                if (reqImg == 0) {

                                    //THIS CODE WILL ASK USER FOR AN IMAGE
                                    //******************************************************************
                                    JFileChooser chooser = new JFileChooser();
                                    chooser.setCurrentDirectory(new java.io.File(cm.getDatabaseLocation()));
                                    chooser.setDialogTitle("Select The Picture For " + txfFNameMN.getText() + " " + txfSNameMN.getText());
                                    chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                                    chooser.setAcceptAllFileFilterUsed(false);

                                    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {

                                        imgLocation = chooser.getSelectedFile() + "";
                                    } else {
                                        System.out.println("No Selection ");
                                    }
                                } else {

                                }
                                //******************************************************************

                                Connection myconObj;
                                String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
                                Class.forName(driver);

                                myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
                                ResultSet result;

                                String query = "INSERT INTO UsersToVoteFor(fName, sName, Grade, Gender, UserPictureLocation) VALUES(?,?,?,?,?)";

                                PreparedStatement add = myconObj.prepareStatement(query);

                                if (testMode == true) {

                                    nomineeSName = nomineeSName + " - [Test Mode]";

                                }
                                add.setString(1, nomineeFName);
                                add.setString(2, nomineeSName);
                                add.setString(3, nomineeGrade);
                                add.setString(4, nomineeGender);
                                add.setString(5, imgLocation);
                                
                                add.executeUpdate();
                                ar.saveNewUser(nomineeFName, nomineeSName, imgLocation, nomineeGrade, nomineeGender);
                                JOptionPane.showMessageDialog(null, txfFNameMN.getText() + " " + txfSNameMN.getText() + " Has successfuly been nominated!");

                                txfFNameMN.setText("");
                                txfSNameMN.setText("");
                                txfFNameN.setText("");
                                txfSNameN.setText("");
                                txfFNameW.setText("");
                                txfSNameW.setText("");
                                boxNM.setSelected(false);
                                boxN.setSelected(false);
                                boxW.setSelected(false);

                            } catch (Exception e) {
                                e.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Could not complete opperation\n\n" + e.getLocalizedMessage());
                            }

                        } else {
                            //No
                        }

                    }
                } else {

                    if (nomineeFName.equalsIgnoreCase("") || (nomineeSName.equalsIgnoreCase("")) || (nominatorFName.equalsIgnoreCase("")) || (nominatorSName.equalsIgnoreCase("")) || (witnessFName.equalsIgnoreCase("")) || (witnessSName.equalsIgnoreCase("")) || (checkNominee == false) || (checkNominator == false) || (checkWitness == false)) {
                        JOptionPane.showMessageDialog(null, "ERROR\n\n\nPlease make sure all fields are filled in correctly");

                    } else {
                        if (this.hasUserBeenNominated(nomineeFName, nomineeSName) == true) {
                            JOptionPane.showMessageDialog(null, "ERROR\n\n\n" + nomineeFName + " " + nomineeSName + " Has already been nominated by someone else!");
                            txfFNameMN.setText("");
                            txfSNameMN.setText("");
                            txfFNameN.setText("");
                            txfSNameN.setText("");
                            txfFNameW.setText("");
                            txfSNameW.setText("");
                            boxNM.setSelected(false);
                            boxN.setSelected(false);
                            boxW.setSelected(false);
                        } else {
                            int dialogResult = JOptionPane.showConfirmDialog(null, "Is the following information correct?\n\n" + nominatorFName + " " + nominatorSName + " Is nominating " + nomineeFName + " " + nomineeSName + "\n\nThe Witness is " + witnessFName + " " + witnessSName, "Please Confirm If The Following Information Is Correct", 0);
                            if (dialogResult == 0) {
                                //Yes

                                try {
                                    Connection myconObj;
                                    String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
                                    Class.forName(driver);

                                    myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
                                    ResultSet result;

                                    String query = "INSERT INTO UsersToVoteFor(fName, sName, Grade, Gender, NominatedBy, Witness) VALUES(?,?,?,?,?,?)";

                                    PreparedStatement add = myconObj.prepareStatement(query);

                                    if (testMode == true) {

                                        nomineeSName = nomineeFName + " - [Test Mode]";
                                        witnessSName = witnessSName + " - [Test Mode]";
                                    }

                                    add.setString(1, nomineeFName);
                                    add.setString(2, nomineeSName);
                                    add.setString(3, nomineeGrade);
                                    add.setString(4, nomineeGender);
                                    add.setString(5, nominatorFName + " " + nominatorSName);
                                    add.setString(6, witnessFName + " " + witnessSName);

                                    add.executeUpdate();

                                    System.out.println("User Successfuly Added to Nominee List");
                                    JOptionPane.showMessageDialog(null, nominatorFName + " " + nominatorSName + " Has successfuly nominated " + nomineeFName + " " + nomineeSName + "\n\n" + (this.getCustomNominated(nomineeGender, nomineeGrade) + 1) + " / " + allowedDisplayTotal);
                                    txfFNameMN.setText("");
                                    txfSNameMN.setText("");
                                    txfFNameN.setText("");
                                    txfSNameN.setText("");
                                    txfFNameW.setText("");
                                    txfSNameW.setText("");
                                    boxNM.setSelected(false);
                                    boxN.setSelected(false);
                                    boxW.setSelected(false);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                            } else {
                                //No
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnNominateActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void boxBypassModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxBypassModeActionPerformed
        boolean boxBypass = boxBypassMode.isSelected();
        //if user has administration access, they can change the data that is required to be entered before submiting
        //this sets the visibility state to false on non-required fields
        if (boxBypass == true) {
            btnAutoNominate.setVisible(true);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
            jLabel12.setVisible(false);
            jLabel13.setVisible(false);
            boxNM.setVisible(false);
            boxN.setVisible(false);
            boxW.setVisible(false);
            txfFNameN.setVisible(false);
            txfSNameN.setVisible(false);
            txfFNameW.setVisible(false);
            txfSNameW.setVisible(false);

        } else {
            btnAutoNominate.setVisible(false);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
            jLabel11.setVisible(true);
            jLabel12.setVisible(true);
            jLabel13.setVisible(true);
            boxNM.setVisible(true);
            boxN.setVisible(true);
            boxW.setVisible(true);
            txfFNameN.setVisible(true);
            txfSNameN.setVisible(true);
            txfFNameW.setVisible(true);
            txfSNameW.setVisible(true);
        }
    }//GEN-LAST:event_boxBypassModeActionPerformed

    private void btnBackMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMousePressed
        new MainOptionSelection().setVisible(true);
        this.dispose();//takes user back to main menu
    }//GEN-LAST:event_btnBackMousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URL(cm.logoWebsite).toURI());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_jLabel15MousePressed

    private void btnAutoNominateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoNominateActionPerformed
        JOptionPane.showMessageDialog(null, "Please make sure of the following\n\nAll pictures are the correct size (Can be changed after nominattions)\nOnly The Name And Surname is written as the picture Name\nAll Pictures are in Correct Locations in the Defualt \"Pictures\" Folder\n\nClick \"Ok\" to Start (This Might Take A Few Seconds)");
        AutoRepair ap = new AutoRepair();
        ap.autoNominate();
    }//GEN-LAST:event_btnAutoNominateActionPerformed

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
            java.util.logging.Logger.getLogger(MainNomination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainNomination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainNomination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainNomination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainNomination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxBypassMode;
    private javax.swing.JCheckBox boxN;
    private javax.swing.JCheckBox boxNM;
    private javax.swing.JCheckBox boxW;
    private javax.swing.JButton btnAutoNominate;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnNominate;
    private javax.swing.JComboBox<String> comboGenderMN;
    private javax.swing.JComboBox<String> comboGradeMN;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txfFNameMN;
    private javax.swing.JTextField txfFNameN;
    private javax.swing.JTextField txfFNameW;
    private javax.swing.JTextField txfSNameMN;
    private javax.swing.JTextField txfSNameN;
    private javax.swing.JTextField txfSNameW;
    // End of variables declaration//GEN-END:variables

    public boolean hasUserBeenNominated(String fName, String sName) //checks if user has been nominated 
    {
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();
            String query = "select * from UsersToVoteFor";
            result = stmt.executeQuery(query);

            while (result.next()) {
                String dbfName = result.getString("fName");
                String dbSurname = result.getString("sName");
                System.out.println();
                if (fName.equalsIgnoreCase(dbfName) && dbSurname.equalsIgnoreCase(sName)) {
                    return true;
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public int getCustomNominated(String gender, String grade) // resurns information based on method paremeters
    {

        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            Statement stmt = myconObj.createStatement();
            int total = 0;
            String query = "SELECT * FROM UsersToVoteFor WHERE Grade = \"" + grade + "\" AND Gender = \"" + gender + "\"";
            result = stmt.executeQuery(query);
            while (result.next()) {
                total++;
                System.out.println(total);
            }
            return total;
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Unable to complete operation\n\n" + ex.getLocalizedMessage());
        }
        return 0;
    }

}
