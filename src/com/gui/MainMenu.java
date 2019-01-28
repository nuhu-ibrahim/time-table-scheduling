package com.gui;

import com.data_structure.DBConnect;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        DBConnect.connect();
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setJMenuBar(null);
        valLogin.setVisible(false);
        valDot2.setVisible(false);
        valDot1.setVisible(false);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        uDemo = new javax.swing.JLabel();
        pDemo = new javax.swing.JLabel();
        perfCred = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        iconm = new javax.swing.JLabel();
        message2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valDot2 = new javax.swing.JLabel();
        valLogin = new javax.swing.JLabel();
        valDot1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        banner = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        donor = new javax.swing.JMenu();
        add_lecturer = new javax.swing.JMenuItem();
        edit_lecturer = new javax.swing.JMenuItem();
        patient = new javax.swing.JMenu();
        add_course = new javax.swing.JMenuItem();
        edit_course = new javax.swing.JMenuItem();
        profile_course_instructors = new javax.swing.JMenuItem();
        donations = new javax.swing.JMenu();
        profile_courses_for_class = new javax.swing.JMenuItem();
        dispensations = new javax.swing.JMenu();
        add_venue = new javax.swing.JMenuItem();
        edit_venue = new javax.swing.JMenuItem();
        report1 = new javax.swing.JMenu();
        view_all_lecturers = new javax.swing.JMenuItem();
        view_all_courses = new javax.swing.JMenuItem();
        view_all_classes = new javax.swing.JMenuItem();
        view_all_venues = new javax.swing.JMenuItem();
        view_all_meeting_time = new javax.swing.JMenuItem();
        report = new javax.swing.JMenu();
        generate_time_table = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Time Table Scheduling System using Genetic Algorithm");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        desktop1.setBackground(new java.awt.Color(153, 204, 0));
        desktop1.setEnabled(false);
        desktop1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        desktop1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 170, -1, -1));
        desktop1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 148, -1, -1));

        jLabel7.setText("jLabel7");
        desktop1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1851, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 85, 116));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        uDemo.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        uDemo.setForeground(new java.awt.Color(0, 0, 102));
        uDemo.setText("Username");
        jPanel2.add(uDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 97, 130, 20));

        pDemo.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        pDemo.setForeground(new java.awt.Color(0, 0, 102));
        pDemo.setText("Password");
        jPanel2.add(pDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 147, 130, 20));

        perfCred.setBackground(new java.awt.Color(44, 168, 44));
        perfCred.setFont(new java.awt.Font("Simplified Arabic Fixed", 0, 18)); // NOI18N
        perfCred.setForeground(new java.awt.Color(0, 0, 102));
        perfCred.setText("Login");
        perfCred.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        perfCred.setMaximumSize(new java.awt.Dimension(61, 30));
        perfCred.setMinimumSize(new java.awt.Dimension(61, 30));
        perfCred.setPreferredSize(new java.awt.Dimension(61, 30));
        perfCred.setSelected(true);
        perfCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfCredActionPerformed(evt);
            }
        });
        jPanel2.add(perfCred, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 100, 33));

        password.setBackground(new java.awt.Color(44, 168, 44));
        password.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 30));

        username.setBackground(new java.awt.Color(44, 168, 44));
        username.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 220, 30));
        jPanel2.add(iconm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 50, -1));

        message2.setBackground(new java.awt.Color(255, 255, 255));
        message2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        message2.setForeground(new java.awt.Color(0, 102, 0));
        message2.setText("Validating User...");
        jPanel2.add(message2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 270, 30));

        jLabel10.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SYSTEM LOGIN PAGE");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 540, -1));

        valDot2.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        valDot2.setForeground(new java.awt.Color(0, 0, 102));
        valDot2.setText("...");
        jPanel2.add(valDot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 40, -1));

        valLogin.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        valLogin.setForeground(new java.awt.Color(0, 0, 102));
        valLogin.setText("Validating login details");
        jPanel2.add(valLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 510, -1));

        valDot1.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        valDot1.setForeground(new java.awt.Color(0, 0, 102));
        valDot1.setText("...");
        jPanel2.add(valDot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 40, -1));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/AdminLTELogo.png"))); // NOI18N
        jPanel2.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 140, 130));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Untitled.jpg"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 270));

        jLabel13.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Forgot Password?. Please contact an administrator");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 460, -1));

        desktop1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 540, 270));

        jMenuBar1.setBackground(new java.awt.Color(0, 12, 92));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(276, 28));

        file.setForeground(new java.awt.Color(255, 255, 255));
        file.setText("FILE");
        file.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        file.setIconTextGap(10);
        file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fileMouseExited(evt);
            }
        });

        logout.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/leftturnarrow32.jpg"))); // NOI18N
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        file.add(logout);

        exit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Exit16.gif"))); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        donor.setForeground(new java.awt.Color(255, 255, 255));
        donor.setText("LECTURER");
        donor.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        donor.setIconTextGap(10);
        donor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donorMouseExited(evt);
            }
        });

        add_lecturer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_lecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Add16.gif"))); // NOI18N
        add_lecturer.setText("ADD LECTURER");
        add_lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_lecturerActionPerformed(evt);
            }
        });
        donor.add(add_lecturer);

        edit_lecturer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_lecturer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Edit16.gif"))); // NOI18N
        edit_lecturer.setText("EDIT LECTURER");
        edit_lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_lecturerActionPerformed(evt);
            }
        });
        donor.add(edit_lecturer);

        jMenuBar1.add(donor);

        patient.setForeground(new java.awt.Color(255, 255, 255));
        patient.setText("COURSE");
        patient.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        patient.setIconTextGap(10);
        patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                patientMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                patientMouseExited(evt);
            }
        });

        add_course.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_course.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Add16.gif"))); // NOI18N
        add_course.setText("ADD COURSE");
        add_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_courseActionPerformed(evt);
            }
        });
        patient.add(add_course);

        edit_course.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_course.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Edit16.gif"))); // NOI18N
        edit_course.setText("EDIT COURSE");
        edit_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_courseActionPerformed(evt);
            }
        });
        patient.add(edit_course);

        profile_course_instructors.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_course_instructors.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/boxupload32.jpg"))); // NOI18N
        profile_course_instructors.setText("PROFILE COURSE INSTRUCTORS");
        profile_course_instructors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_course_instructorsActionPerformed(evt);
            }
        });
        patient.add(profile_course_instructors);

        jMenuBar1.add(patient);

        donations.setForeground(new java.awt.Color(255, 255, 255));
        donations.setText("CLASS");
        donations.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        donations.setIconTextGap(10);
        donations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donationsMouseExited(evt);
            }
        });

        profile_courses_for_class.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        profile_courses_for_class.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/boxupload32.jpg"))); // NOI18N
        profile_courses_for_class.setText("PROFILE COURSES FOR CLASS");
        profile_courses_for_class.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profile_courses_for_classActionPerformed(evt);
            }
        });
        donations.add(profile_courses_for_class);

        jMenuBar1.add(donations);

        dispensations.setForeground(new java.awt.Color(255, 255, 255));
        dispensations.setText("VENUES");
        dispensations.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        dispensations.setIconTextGap(10);
        dispensations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dispensationsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dispensationsMouseExited(evt);
            }
        });

        add_venue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add_venue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Add16.gif"))); // NOI18N
        add_venue.setText("ADD VENUE");
        add_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_venueActionPerformed(evt);
            }
        });
        dispensations.add(add_venue);

        edit_venue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        edit_venue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/Edit16.gif"))); // NOI18N
        edit_venue.setText("EDIT VENUE");
        edit_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_venueActionPerformed(evt);
            }
        });
        dispensations.add(edit_venue);

        jMenuBar1.add(dispensations);

        report1.setForeground(new java.awt.Color(255, 255, 255));
        report1.setText("REPORT");
        report1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        report1.setIconTextGap(10);
        report1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                report1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                report1MouseExited(evt);
            }
        });

        view_all_lecturers.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_all_lecturers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/List16.gif"))); // NOI18N
        view_all_lecturers.setText("VIEW ALL LECTURERS");
        view_all_lecturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_all_lecturersActionPerformed(evt);
            }
        });
        report1.add(view_all_lecturers);

        view_all_courses.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_all_courses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/List16.gif"))); // NOI18N
        view_all_courses.setText("VIEW ALL COURSES");
        view_all_courses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_all_coursesActionPerformed(evt);
            }
        });
        report1.add(view_all_courses);

        view_all_classes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_all_classes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/List16.gif"))); // NOI18N
        view_all_classes.setText("VIEW ALL CLASSES");
        view_all_classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_all_classesActionPerformed(evt);
            }
        });
        report1.add(view_all_classes);

        view_all_venues.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_all_venues.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/List16.gif"))); // NOI18N
        view_all_venues.setText("VIEW ALL VENUES");
        view_all_venues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_all_venuesActionPerformed(evt);
            }
        });
        report1.add(view_all_venues);

        view_all_meeting_time.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        view_all_meeting_time.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/List16.gif"))); // NOI18N
        view_all_meeting_time.setText("VIEW ALL MEETING TIME");
        view_all_meeting_time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_all_meeting_timeActionPerformed(evt);
            }
        });
        report1.add(view_all_meeting_time);

        jMenuBar1.add(report1);

        report.setForeground(new java.awt.Color(255, 255, 255));
        report.setText("GENERATE");
        report.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        report.setIconTextGap(10);
        report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportMouseExited(evt);
            }
        });

        generate_time_table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generate_time_table.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/image/ico/boxdownload32.jpg"))); // NOI18N
        generate_time_table.setText("GENERATE TIME TABLE");
        generate_time_table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_time_tableActionPerformed(evt);
            }
        });
        report.add(generate_time_table);

        jMenuBar1.add(report);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 1367, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop1, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1383, 781));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setCursor(Cursor.WAIT_CURSOR);
        int option=JOptionPane.showConfirmDialog(this,"Are You sure You want to "
                + "Exit", "Exit", JOptionPane.YES_NO_OPTION);
        if (option ==0){
            System.exit(0);
        }
        else{

        }
        this.setCursor(Cursor.DEFAULT_CURSOR);
    }//GEN-LAST:event_exitActionPerformed
    private String usertype;
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Continue Logout?","Confirm logout",JOptionPane.YES_NO_OPTION);
        if (a==0){
            new MainMenu().setVisible(true);
            this.dispose();
            this.hide();
        }
    }//GEN-LAST:event_logoutActionPerformed

    private String userType;
    private void perfCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfCredActionPerformed
        valLogin.setForeground(new java.awt.Color(0,0,102));
        valLogin.setText("Validating login details");
        valLogin.setVisible(true);
        valDot1.setText(".");
        valDot1.setVisible(false);
        valDot2.setVisible(false);
        Thread runner = new Thread(){
            public void run() {
                try{
                    Random rand= new Random();
                    int a=rand.nextInt(15);
                    for(int i=0; i<=a;i++){
                        Thread.sleep(500);
                        if(valDot1.getText().equals(".")){
                            valLogin.setText("Validating login details.");
                            valDot1.setText("..");
                        }else if(valDot1.getText().equals("..")){
                            valLogin.setText("Validating login details..");
                            valDot1.setText("...");
                        }else if(valDot1.getText().equals("...")){
                            valLogin.setText("Validating login details...");
                            valDot1.setText(".");
                        }
                    }
                    String pass="";
                    String user="";
                    
                    PreparedStatement st;
                    String sql= "select * from app_user where username = ?";
                    st = DBConnect.con.prepareStatement(sql);
                    st.setString(1, username.getText());
                    
                    DBConnect.rs= st.executeQuery();
                    if(DBConnect.rs.next()){
                        pass = DBConnect.rs.getString("password");
                        user = DBConnect.rs.getString("username");
                    }
                    if(username.getText().equals("") || password.getText().equals("")){
                        valLogin.setForeground(new java.awt.Color(248, 90, 43));
                        valLogin.setText("The username or password is incorrect");
                        valDot1.setVisible(false);
                        valDot2.setVisible(false);
                    }else if (pass.equals(password.getText()) && user.equalsIgnoreCase(username.getText())){
                        valLogin.setForeground(new java.awt.Color(0,0,102));
                        valLogin.setText("Welcome, loading");
                        try{
                            valLogin.setVisible(true);
                            valDot2.setVisible(false);
                            valDot1.setVisible(false);
                            //Put dot readings here
                            Random rand2= new Random();
                            int ab=rand2.nextInt(15);
                            for(int i=0; i<=ab;i++){
                                Thread.sleep(500);
                                if(valDot2.getText().equals(".")){
                                    valLogin.setText("Welcome, loading.");
                                    valDot2.setText("..");
                                }else if(valDot2.getText().equals("..")){
                                    valLogin.setText("Welcome, loading..");
                                    valDot2.setText("...");
                                }else if(valDot2.getText().equals("...")){
                                    valLogin.setText("Welcome, loading...");
                                    valDot2.setText(".");
                                }
                            }
                            //Show it here
                            setJMenuBar(jMenuBar1);
                            desktop1.removeAll();
                            desktop1.setVisible(false);
                            desktop1.setVisible(true);
                        } catch (Exception e) {
                        }

                    }else{
                        valLogin.setForeground(new java.awt.Color(248, 90, 43));
                        valLogin.setText("The username or password is incorrect");
                        valDot1.setVisible(false);
                        valDot2.setVisible(false);
                    }
                }catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_perfCredActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        pDemo.setVisible(false);
        //if(!pText.getText().equals(""))
        //pText.setHighlighter();
    }//GEN-LAST:event_passwordMouseClicked

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        if(password.getText().equals(""))
            pDemo.setVisible(true);
        else
            pDemo.setVisible(false);
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        if(password.getText().equals(""))
            pDemo.setVisible(true);
        else
            pDemo.setVisible(false);
    }//GEN-LAST:event_passwordFocusLost

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if(password.getText().equals(""))
            pDemo.setVisible(true);
        else
            pDemo.setVisible(false);
    }//GEN-LAST:event_passwordKeyReleased

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        uDemo.setVisible(false);
        //if(!uText.getText().equals(""))
        //uText.setHighlighter();
        //Highlight
    }//GEN-LAST:event_usernameMouseClicked

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        if(username.getText().equals(""))
            uDemo.setVisible(true);
        else
            uDemo.setVisible(false);
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        if(username.getText().equals(""))
            uDemo.setVisible(true);
        else
            uDemo.setVisible(false);
    }//GEN-LAST:event_usernameFocusLost

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
        if(username.getText().equals(""))
            uDemo.setVisible(true);
        else
            uDemo.setVisible(false);
    }//GEN-LAST:event_usernameKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to Quit Window?");
        if (result == JOptionPane.YES_OPTION)
            System.exit(0);
        else {
            int keepOpen = WindowConstants.DO_NOTHING_ON_CLOSE;
            setDefaultCloseOperation(keepOpen);
        }
    }//GEN-LAST:event_formWindowClosing

    private void fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMouseExited
        file.setForeground(Color.white);
    }//GEN-LAST:event_fileMouseExited

    private void fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMouseEntered
        file.setForeground(Color.red);
    }//GEN-LAST:event_fileMouseEntered

    private void donorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donorMouseEntered
        donor.setForeground(Color.red);
    }//GEN-LAST:event_donorMouseEntered

    private void donorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donorMouseExited
        donor.setForeground(Color.white);
    }//GEN-LAST:event_donorMouseExited

    private void patientMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseEntered
        patient.setForeground(Color.red);
    }//GEN-LAST:event_patientMouseEntered

    private void patientMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientMouseExited
        patient.setForeground(Color.white);
    }//GEN-LAST:event_patientMouseExited

    private void donationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationsMouseEntered
        donations.setForeground(Color.red);
    }//GEN-LAST:event_donationsMouseEntered

    private void donationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donationsMouseExited
        donations.setForeground(Color.white);
    }//GEN-LAST:event_donationsMouseExited

    private void dispensationsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dispensationsMouseEntered
        dispensations.setForeground(Color.red);
    }//GEN-LAST:event_dispensationsMouseEntered

    private void dispensationsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dispensationsMouseExited
        dispensations.setForeground(Color.white);
    }//GEN-LAST:event_dispensationsMouseExited

    private void reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseEntered
        report.setForeground(Color.red);
    }//GEN-LAST:event_reportMouseEntered

    private void reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportMouseExited
        report.setForeground(Color.white);
    }//GEN-LAST:event_reportMouseExited

    private void add_lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_lecturerActionPerformed
        Thread runner = new Thread() {

            public void run() {
                AddLecturer add_lecturer = new AddLecturer();
                desktop1.removeAll();
                desktop1.add(add_lecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    add_lecturer.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();   
    }//GEN-LAST:event_add_lecturerActionPerformed

    private void edit_lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_lecturerActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewLecturer view_lecturer = new ViewLecturer();
                desktop1.removeAll();
                desktop1.add(view_lecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_lecturer.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_edit_lecturerActionPerformed

    private void report1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report1MouseEntered
        report1.setForeground(Color.red);
    }//GEN-LAST:event_report1MouseEntered

    private void report1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_report1MouseExited
        report1.setForeground(Color.white);
    }//GEN-LAST:event_report1MouseExited

    private void add_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_courseActionPerformed
        Thread runner = new Thread() {

            public void run() {
                AddCourse add_course = new AddCourse();
                desktop1.removeAll();
                desktop1.add(add_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    add_course.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();  
    }//GEN-LAST:event_add_courseActionPerformed

    private void edit_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_courseActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewCourse view_course = new ViewCourse();
                desktop1.removeAll();
                desktop1.add(view_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_course.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_edit_courseActionPerformed

    private void profile_courses_for_classActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_courses_for_classActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ProfileClassCourses profile_class_courses = new ProfileClassCourses();
                desktop1.removeAll();
                desktop1.add(profile_class_courses, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    profile_class_courses.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_profile_courses_for_classActionPerformed

    private void add_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_venueActionPerformed
        Thread runner = new Thread() {

            public void run() {
                AddVenue add_venue = new AddVenue();
                desktop1.removeAll();
                desktop1.add(add_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    add_venue.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_add_venueActionPerformed

    private void edit_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_venueActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewVenue view_venue = new ViewVenue();
                desktop1.removeAll();
                desktop1.add(view_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_venue.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_edit_venueActionPerformed

    private void view_all_lecturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_all_lecturersActionPerformed
        Thread runner = new Thread() {

        public void run() {
            ViewLecturer view_lecturers = new ViewLecturer();
            desktop1.removeAll();
            desktop1.add(view_lecturers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
            desktop1.setVisible(false);
            desktop1.setVisible(true);
        try {
            view_lecturers.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
        }
            };
        runner.start();
    }//GEN-LAST:event_view_all_lecturersActionPerformed

    private void view_all_coursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_all_coursesActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewCourse view_course = new ViewCourse();
                desktop1.removeAll();
                desktop1.add(view_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_course.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_view_all_coursesActionPerformed

    private void view_all_classesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_all_classesActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewClass view_class = new ViewClass();
                desktop1.removeAll();
                desktop1.add(view_class, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_class.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_view_all_classesActionPerformed

    private void view_all_venuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_all_venuesActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewVenue view_venue = new ViewVenue();
                desktop1.removeAll();
                desktop1.add(view_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_venue.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_view_all_venuesActionPerformed

    private void view_all_meeting_timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_all_meeting_timeActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ViewMeetingTime view_meeting_time = new ViewMeetingTime();
                desktop1.removeAll();
                desktop1.add(view_meeting_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    view_meeting_time.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_view_all_meeting_timeActionPerformed

    private void generate_time_tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_time_tableActionPerformed
        Thread runner = new Thread() {

            public void run() {
                GenerateTimeTable generate_time_table = new GenerateTimeTable();
                desktop1.removeAll();
                desktop1.add(generate_time_table, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    generate_time_table.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                    
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_generate_time_tableActionPerformed

    private void profile_course_instructorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profile_course_instructorsActionPerformed
        Thread runner = new Thread() {

            public void run() {
                ProfileCourseInstructor profile_course_instructor = new ProfileCourseInstructor();
                desktop1.removeAll();
                desktop1.add(profile_course_instructor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                desktop1.setVisible(false);
                desktop1.setVisible(true);
                try {
                    profile_course_instructor.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_profile_course_instructorsActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_course;
    private javax.swing.JMenuItem add_lecturer;
    private javax.swing.JMenuItem add_venue;
    private javax.swing.JLabel banner;
    public static javax.swing.JDesktopPane desktop1;
    private javax.swing.JMenu dispensations;
    private javax.swing.JMenu donations;
    private javax.swing.JMenu donor;
    private javax.swing.JMenuItem edit_course;
    private javax.swing.JMenuItem edit_lecturer;
    private javax.swing.JMenuItem edit_venue;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem generate_time_table;
    public static javax.swing.JLabel iconm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem logout;
    public static javax.swing.JLabel message2;
    private javax.swing.JLabel pDemo;
    private javax.swing.JPasswordField password;
    private javax.swing.JMenu patient;
    public static javax.swing.JButton perfCred;
    private javax.swing.JMenuItem profile_course_instructors;
    private javax.swing.JMenuItem profile_courses_for_class;
    private javax.swing.JMenu report;
    private javax.swing.JMenu report1;
    private javax.swing.JLabel uDemo;
    public static javax.swing.JTextField username;
    private javax.swing.JLabel valDot1;
    private javax.swing.JLabel valDot2;
    private javax.swing.JLabel valLogin;
    private javax.swing.JMenuItem view_all_classes;
    private javax.swing.JMenuItem view_all_courses;
    private javax.swing.JMenuItem view_all_lecturers;
    private javax.swing.JMenuItem view_all_meeting_time;
    private javax.swing.JMenuItem view_all_venues;
    // End of variables declaration//GEN-END:variables
}
