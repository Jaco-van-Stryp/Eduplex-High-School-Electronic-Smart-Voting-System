//This class was created on 2018.08.13 by Jaco van Stryp
package com.MainData;

import com.Backend.commonMethods;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaco van Stryp
 */
public class MultiVote extends javax.swing.JFrame {

    /**
     * Creates new form MultiVote
     */
    commonMethods cm = new commonMethods();

    public MultiVote() {
        initComponents();
        this.loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        btnSettings5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        gtvp1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        gtvp2 = new javax.swing.JTextField();
        gtv2 = new javax.swing.JTextField();
        gtv1 = new javax.swing.JTextField();
        g12v1 = new javax.swing.JTextField();
        g12v2 = new javax.swing.JTextField();
        g12vp1 = new javax.swing.JTextField();
        g12vp2 = new javax.swing.JTextField();
        g11vp2 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        g11v1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        g11v2 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        g11vp1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        g10v1 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        g10v2 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        g10vp1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        g10vp2 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        g9v1 = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        g9v2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        g9vp1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        g9vp2 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        g8v1 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        g8v2 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        g8vp1 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        g8vp2 = new javax.swing.JTextField();
        btnSettings6 = new javax.swing.JButton();
        btnSettings7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel1KeyPressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eduplex High School Electronic Voting System");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MultiVote");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel21MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(176, 176, 176))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 896, -1));

        btnSettings5.setBackground(new java.awt.Color(255, 89, 33));
        btnSettings5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSettings5.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings5.setText("Save Data & Back");
        btnSettings5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettings5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSettings5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 206, 38));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Grade ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 118, 82, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Grade ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 118, 80, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Points");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 118, 80, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Points");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 118, 90, -1));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("Vote 2");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 87, -1));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("Grade 12 - Vote 1");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 184, -1));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Vote 2");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 87, -1));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("Vote 1");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 360, 98, -1));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Teachers - Vote 1");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 184, -1));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Vote 2");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 87, -1));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("Vote 1");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 98, -1));

        gtvp1.setBackground(new java.awt.Color(34, 34, 78));
        gtvp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gtvp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(gtvp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 85, 40));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("Vote 2");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 87, -1));

        gtvp2.setEditable(false);
        gtvp2.setBackground(new java.awt.Color(34, 34, 78));
        gtvp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gtvp2.setForeground(new java.awt.Color(255, 255, 255));
        gtvp2.setText("0");
        jPanel1.add(gtvp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 80, 40));

        gtv2.setEditable(false);
        gtv2.setBackground(new java.awt.Color(34, 34, 78));
        gtv2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gtv2.setForeground(new java.awt.Color(255, 255, 255));
        gtv2.setText("-");
        jPanel1.add(gtv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 85, 40));

        gtv1.setBackground(new java.awt.Color(34, 34, 78));
        gtv1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gtv1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(gtv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 85, 40));

        g12v1.setBackground(new java.awt.Color(34, 34, 78));
        g12v1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g12v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g12v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 85, 40));

        g12v2.setBackground(new java.awt.Color(34, 34, 78));
        g12v2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g12v2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g12v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 85, 40));

        g12vp1.setBackground(new java.awt.Color(34, 34, 78));
        g12vp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g12vp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g12vp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 85, 40));

        g12vp2.setBackground(new java.awt.Color(34, 34, 78));
        g12vp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g12vp2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g12vp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 80, 40));

        g11vp2.setBackground(new java.awt.Color(34, 34, 78));
        g11vp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g11vp2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g11vp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, 80, 40));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("Grade 11 - Vote 1");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 184, -1));

        g11v1.setBackground(new java.awt.Color(34, 34, 78));
        g11v1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g11v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g11v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 85, 40));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("Vote 2");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 87, -1));

        g11v2.setBackground(new java.awt.Color(34, 34, 78));
        g11v2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g11v2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g11v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 85, 40));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("Vote 1");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 98, -1));

        g11vp1.setBackground(new java.awt.Color(34, 34, 78));
        g11vp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g11vp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g11vp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 85, 40));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("Vote 2");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 310, 87, -1));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("Grade 10 - Vote 1");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 184, -1));

        g10v1.setBackground(new java.awt.Color(34, 34, 78));
        g10v1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g10v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g10v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 85, 40));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Vote 2");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, 87, -1));

        g10v2.setBackground(new java.awt.Color(34, 34, 78));
        g10v2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g10v2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g10v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 85, 40));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("Vote 1");
        jPanel1.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 98, -1));

        g10vp1.setBackground(new java.awt.Color(34, 34, 78));
        g10vp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g10vp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g10vp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 85, 40));

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("Vote 2");
        jPanel1.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, 87, -1));

        g10vp2.setBackground(new java.awt.Color(34, 34, 78));
        g10vp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g10vp2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g10vp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, 80, 40));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Grade 9 - Vote 1");
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 184, -1));

        g9v1.setBackground(new java.awt.Color(34, 34, 78));
        g9v1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g9v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g9v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 85, 40));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Vote 2");
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 87, -1));

        g9v2.setBackground(new java.awt.Color(34, 34, 78));
        g9v2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g9v2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g9v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 85, 40));

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("Vote 1");
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 98, -1));

        g9vp1.setBackground(new java.awt.Color(34, 34, 78));
        g9vp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g9vp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g9vp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 85, 40));

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("Vote 2");
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 87, -1));

        g9vp2.setBackground(new java.awt.Color(34, 34, 78));
        g9vp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g9vp2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g9vp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 80, 40));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Grade 8 - Vote 1");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, 184, -1));

        g8v1.setBackground(new java.awt.Color(34, 34, 78));
        g8v1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 85, 40));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Vote 2");
        jPanel1.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 160, 87, -1));

        g8v2.setBackground(new java.awt.Color(34, 34, 78));
        g8v2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8v2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8v2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 85, 40));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Vote 1");
        jPanel1.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 160, 98, -1));

        g8vp1.setBackground(new java.awt.Color(34, 34, 78));
        g8vp1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8vp1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8vp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 85, 40));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Vote 2");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 87, -1));

        g8vp2.setBackground(new java.awt.Color(34, 34, 78));
        g8vp2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8vp2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8vp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 151, 80, 40));

        btnSettings6.setBackground(new java.awt.Color(255, 89, 33));
        btnSettings6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSettings6.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings6.setText("Reset ");
        btnSettings6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettings6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSettings6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 206, 38));

        btnSettings7.setBackground(new java.awt.Color(255, 89, 33));
        btnSettings7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSettings7.setForeground(new java.awt.Color(255, 255, 255));
        btnSettings7.setText("Help");
        btnSettings7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettings7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSettings7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 206, 38));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed

    }//GEN-LAST:event_jLabel21MousePressed

    private void btnSettings5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettings5ActionPerformed
        this.saveData();
        //SAVE ALL DATA
        new Settings().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnSettings5ActionPerformed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered

    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1KeyPressed

    private void btnSettings6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettings6ActionPerformed
        g8v1.setText("8");
        g9v1.setText("9");
        g10v1.setText("10");
        g11v1.setText("11");
        g12v1.setText("11");
        gtv1.setText("11");

        g8v2.setText("-");
        g9v2.setText("-");
        g10v2.setText("11");
        g11v2.setText("11");
        g12v2.setText("11");
        gtv2.setText("-");

        g8vp1.setText("100");
        g9vp1.setText("100");
        g10vp1.setText("100");
        g11vp1.setText("100");
        g12vp1.setText("100");
        gtvp1.setText("100");

        g8vp2.setText("0");
        g9vp2.setText("0");
        g10vp2.setText("15");
        g11vp2.setText("80");
        g12vp2.setText("15");
        gtvp2.setText("0");
    }//GEN-LAST:event_btnSettings6ActionPerformed

    private void btnSettings7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettings7ActionPerformed
    JOptionPane.showMessageDialog(null, "For The Grade Fields, Enter a number between 8 and 11\n\nIf you dont want a grade to have that vote,\nReplace the Number with a \"-\"\n\nIf you dont want a vote to give points\nReplace the \"Point\"Value with a \"0\"");
    }//GEN-LAST:event_btnSettings7ActionPerformed

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
            java.util.logging.Logger.getLogger(MultiVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiVote.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiVote().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSettings5;
    private javax.swing.JButton btnSettings6;
    private javax.swing.JButton btnSettings7;
    private javax.swing.JTextField g10v1;
    private javax.swing.JTextField g10v2;
    private javax.swing.JTextField g10vp1;
    private javax.swing.JTextField g10vp2;
    private javax.swing.JTextField g11v1;
    private javax.swing.JTextField g11v2;
    private javax.swing.JTextField g11vp1;
    private javax.swing.JTextField g11vp2;
    private javax.swing.JTextField g12v1;
    private javax.swing.JTextField g12v2;
    private javax.swing.JTextField g12vp1;
    private javax.swing.JTextField g12vp2;
    private javax.swing.JTextField g8v1;
    private javax.swing.JTextField g8v2;
    private javax.swing.JTextField g8vp1;
    private javax.swing.JTextField g8vp2;
    private javax.swing.JTextField g9v1;
    private javax.swing.JTextField g9v2;
    private javax.swing.JTextField g9vp1;
    private javax.swing.JTextField g9vp2;
    private javax.swing.JTextField gtv1;
    private javax.swing.JTextField gtv2;
    private javax.swing.JTextField gtvp1;
    private javax.swing.JTextField gtvp2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    public void saveSpecificData(String mainGrade, String entrie, String updatedValue) {
        try {
            Connection myconObj;

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
            Class.forName(driver);

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb");
            ResultSet result;
            String query = "Update MultiVoteSettings SET " + entrie + "= '" + updatedValue + "' Where GradeMain = '" + mainGrade + "'";

         //   JOptionPane.showMessageDialog(null, "Update MultiVoteSettings SET " + entrie + "= '" + updatedValue + "' Where GradeMain = '" + mainGrade + "'");
           System.out.println("Update MultiVoteSettings SET " + entrie + "= '" + updatedValue + "' Where GradeMain = '" + mainGrade + "'");
            PreparedStatement add = myconObj.prepareStatement(query);
            add.executeUpdate();
        } catch (Exception ex) {
            System.err.println("Update MultiVoteSettings SET " + entrie + "= '" + updatedValue + "' Where GradeMain = '" + mainGrade + "'");
            JOptionPane.showMessageDialog(null, "error");
        }
    }

    private void saveData() {
        String sg8v1 = g8v1.getText();
        String sg9v1 = g9v1.getText();
        String sg10v1 = g10v1.getText();
        String sg11v1 = g11v1.getText();
        String sg12v1 = g12v1.getText();
        String sgtv1 = gtv1.getText();
      
        this.saveSpecificData("8", "VoteOneGrade", sg8v1);
        this.saveSpecificData("9", "VoteOneGrade", sg9v1);
        this.saveSpecificData("10", "VoteOneGrade", sg10v1);
        this.saveSpecificData("11", "VoteOneGrade", sg11v1);
        this.saveSpecificData("12", "VoteOneGrade", sg12v1);
        this.saveSpecificData("Teacher", "VoteOneGrade", sgtv1);

        String sg8v2 = g8v2.getText();
        String sg9v2 = g9v2.getText();
        String sg10v2 = g10v2.getText();
        String sg11v2 = g11v2.getText();
        String sg12v2 = g12v2.getText();
        String sgtv2 = gtv2.getText();
        
        this.saveSpecificData("8", "VoteTwoGrade", sg8v2);
        this.saveSpecificData("9", "VoteTwoGrade", sg9v2);
        this.saveSpecificData("10", "VoteTwoGrade", sg10v2);
        this.saveSpecificData("11", "VoteTwoGrade", sg11v2);
        this.saveSpecificData("12", "VoteTwoGrade", sg12v2);
        this.saveSpecificData("Teacher", "VoteTwoGrade", sgtv2);
 

        String sg8vp1 = g8vp1.getText();
        String sg9vp1 = g9vp1.getText();
        String sg10vp1 = g10vp1.getText();
        String sg11vp1 = g11vp1.getText();
        String sg12vp1 = g12vp1.getText();
        String sgtvp1 = gtvp1.getText();
        
        this.saveSpecificData("8", "VoteOnePoints", sg8vp1);
        this.saveSpecificData("9", "VoteOnePoints", sg9vp1);
        this.saveSpecificData("10", "VoteOnePoints", sg10vp1);
        this.saveSpecificData("11", "VoteOnePoints", sg11vp1);
        this.saveSpecificData("12", "VoteOnePoints", sg12vp1);
        this.saveSpecificData("Teacher", "VoteOnePoints", sgtvp1);
        
        String sg8vp2 = g8vp2.getText();
        String sg9vp2 = g9vp2.getText();
        String sg10vp2 = g10vp2.getText();
        String sg11vp2 = g11vp2.getText();
        String sg12vp2 = g12vp2.getText();
        String sgtvp2 = gtvp2.getText();

        this.saveSpecificData("8", "VoteTwoPoints", sg8vp2);
        this.saveSpecificData("9", "VoteTwoPoints", sg9vp2);
        this.saveSpecificData("10", "VoteTwoPoints", sg10vp2);
        this.saveSpecificData("11", "VoteTwoPoints", sg11vp2);
        this.saveSpecificData("12", "VoteTwoPoints", sg12vp2);
        this.saveSpecificData("Teacher", "VoteTwoPoints", sgtvp2);
    }

    private void loadData() {
        //get data
        g8v1.setText(this.getMultiVoteSettings("8", "VoteOneGrade"));
        g9v1.setText(this.getMultiVoteSettings("9", "VoteOneGrade"));
        g10v1.setText(this.getMultiVoteSettings("10", "VoteOneGrade"));
        g11v1.setText(this.getMultiVoteSettings("11", "VoteOneGrade"));
        g12v1.setText(this.getMultiVoteSettings("12", "VoteOneGrade"));
        gtv1.setText(this.getMultiVoteSettings("Teacher", "VoteOneGrade"));

        g8v2.setText(this.getMultiVoteSettings("8", "VoteTwoGrade"));
        g9v2.setText(this.getMultiVoteSettings("9", "VoteTwoGrade"));
        g10v2.setText(this.getMultiVoteSettings("10", "VoteTwoGrade"));
        g11v2.setText(this.getMultiVoteSettings("11", "VoteTwoGrade"));
        g12v2.setText(this.getMultiVoteSettings("12", "VoteTwoGrade"));
        gtv2.setText(this.getMultiVoteSettings("Teacher", "VoteTwoGrade"));

        g8vp1.setText(this.getMultiVoteSettings("8", "VoteOnePoints"));
        g9vp1.setText(this.getMultiVoteSettings("9", "VoteOnePoints"));
        g10vp1.setText(this.getMultiVoteSettings("10", "VoteOnePoints"));
        g11vp1.setText(this.getMultiVoteSettings("11", "VoteOnePoints"));
        g12vp1.setText(this.getMultiVoteSettings("12", "VoteOnePoints"));
        gtvp1.setText(this.getMultiVoteSettings("Teacher", "VoteOnePoints"));

        g8vp2.setText(this.getMultiVoteSettings("8", "VoteTwoPoints"));
        g9vp2.setText(this.getMultiVoteSettings("9", "VoteTwoPoints"));
        g10vp2.setText(this.getMultiVoteSettings("10", "VoteTwoPoints"));
        g11vp2.setText(this.getMultiVoteSettings("11", "VoteTwoPoints"));
        g12vp2.setText(this.getMultiVoteSettings("12", "VoteTwoPoints"));
        gtvp2.setText(this.getMultiVoteSettings("Teacher", "VoteTwoPoints"));

    }

   

    public String getMultiVoteSettings(String gradeMain, String entrie) {
        try {
            Connection myconObj; // states connection with the database

            String driver = "net.ucanaccess.jdbc.UcanaccessDriver"; // states Driver 
            Class.forName(driver); // loads driver

            myconObj = DriverManager.getConnection("jdbc:ucanaccess://" + cm.getDatabaseLocation() + "\\StudentVotingData.accdb"); //loads location of database
            ResultSet result;
            Statement stmt = myconObj.createStatement();
            String query = "select " + entrie + " from MultiVoteSettings where GradeMain = '" + gradeMain + "'"; //sql query that will be executed
            result = stmt.executeQuery(query);
            String finalResult = "-";
            while (result.next()) { // loads and compates the name and surname with existing entries in the database

                finalResult = result.getString(entrie);

            }
            return finalResult;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "-";

    }

}
