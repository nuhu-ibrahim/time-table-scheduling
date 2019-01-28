package com.gui;

import com.data_structure.DBConnect;
import static com.gui.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EditCourse extends javax.swing.JInternalFrame {
    private int course_id;
    public EditCourse(int course_id) {
        this.course_id = course_id;
        DBConnect.connect();
        initComponents();

        try{
            PreparedStatement st;
            String sql = "select * from course where course_id = ?";
            st = DBConnect.con.prepareStatement(sql);

            st.setInt(1, course_id);

            DBConnect.rs = st.executeQuery();
            DBConnect.rs.next();
            
            course_title.setText(DBConnect.rs.getString("course_name"));
            no_of_student.setValue(DBConnect.rs.getInt("maximum_number_of_student"));
        }catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        course_title = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        no_of_student = new com.toedter.components.JSpinField();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 12, 92));
        jPanel2.setPreferredSize(new java.awt.Dimension(596, 488));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EDIT COURSE INFORMATION PAGE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Course Title");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, 20));

        course_title.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel1.add(course_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 220, -1));

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Update the Information");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 260, 35));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Maximum Number of Student");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        no_of_student.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        no_of_student.setMaximum(300);
        no_of_student.setMinimum(0);
        jPanel1.add(no_of_student, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
        this.hide();
        
        Thread runner = new Thread() {

            public void run() {
                ViewCourse regJ = new ViewCourse();
                desktop1.add(regJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                try {
                    regJ.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_closeActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if(course_title.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else if(no_of_student.getValue() == 0){
            JOptionPane.showMessageDialog(this,"No of student cannot be 0 or non-numeric", "Issue", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql = "select * from course where course_name = ? AND course_id != ?";
                st = DBConnect.con.prepareStatement(sql);

                st.setString(1, course_title.getText().trim());
                st.setInt(2, course_id);

                DBConnect.rs = st.executeQuery();

                if(DBConnect.rs.next()){
                    JOptionPane.showMessageDialog(this, "Course with thesame name already exist", "Issue", JOptionPane.OK_OPTION);
                }else{
                    String sql1="update course set course_name = ?, maximum_number_of_student = ? where course_id = ?";
                    st = DBConnect.con.prepareStatement(sql1);
                    st.setString(1, course_title.getText().trim());
                    st.setInt(2, no_of_student.getValue());
                    st.setInt(3, course_id);

                    st.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Course information has been updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                    ViewCourse view_course = new ViewCourse();
                    MainMenu.desktop1.removeAll();
                    MainMenu.desktop1.add(view_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0) );
                    MainMenu.desktop1.setVisible(false);
                    MainMenu.desktop1.setVisible(true);
                    MainMenu.desktop1.setSelectedFrame(view_course);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTextField course_title;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.components.JSpinField no_of_student;
    // End of variables declaration//GEN-END:variables
}
