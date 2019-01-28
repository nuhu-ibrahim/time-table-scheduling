package com.gui;

import com.data_structure.DBConnect;
import static com.gui.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EditLecturer extends javax.swing.JInternalFrame {
    
    private int lecturer_id;
    public EditLecturer(int lecturer_id) {
        this.lecturer_id = lecturer_id;
        DBConnect.connect();
        initComponents();
        
        try{
            PreparedStatement st;
            String sql = "select * from instructor where instructor_id = ?";
            st = DBConnect.con.prepareStatement(sql);

            st.setInt(1, lecturer_id);

            DBConnect.rs = st.executeQuery();
            DBConnect.rs.next();
            
            name.setText(DBConnect.rs.getString("instructor_name"));
            phone.setText(DBConnect.rs.getString("phone"));
            gender.setSelectedItem(DBConnect.rs.getString("gender"));
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
        name = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();

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
        jLabel1.setText("EDIT LECTURER INFORMATION PAGE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Lecturer Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        name.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 220, -1));

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Update the Information");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 260, 35));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 80, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("GSM Number");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        phone.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 220, 26));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Gender");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        gender.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Gender", "Male", "Female" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 220, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 230));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
        this.hide();
        
        Thread runner = new Thread() {

        public void run() {
            ViewLecturer regJ = new ViewLecturer();
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
        if(name.getText().trim().equals("") ||
            phone.getText().trim().equals("") || 
            gender.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql1="update instructor set instructor_name = ?, phone = ?, gender = ? where instructor_id = ?";
                st = DBConnect.con.prepareStatement(sql1);
                st.setString(1, name.getText().trim());
                st.setString(2, phone.getText().trim());
                st.setString(3, ""+gender.getSelectedItem());
                st.setInt(4, lecturer_id);
                
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Lecturer information has been update","Success",JOptionPane.INFORMATION_MESSAGE);
                
                ViewLecturer view_lecturer = new ViewLecturer();
                MainMenu.desktop1.removeAll();
                MainMenu.desktop1.add(view_lecturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0) );
                MainMenu.desktop1.setVisible(false);
                MainMenu.desktop1.setVisible(true);
                MainMenu.desktop1.setSelectedFrame(view_lecturer);
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JComboBox gender;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
