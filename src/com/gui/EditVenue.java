package com.gui;

import com.data_structure.DBConnect;
import static com.gui.MainMenu.desktop1;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class EditVenue extends javax.swing.JInternalFrame {
    private int class_room_id;
    public EditVenue(int class_room_id) {
        this.class_room_id = class_room_id;
        DBConnect.connect();
        initComponents();
        
        try{
            PreparedStatement st;
            String sql = "select * from class_room where class_room_id = ?";
            st = DBConnect.con.prepareStatement(sql);

            st.setInt(1, class_room_id);

            DBConnect.rs = st.executeQuery();
            DBConnect.rs.next();
            
            name.setText(DBConnect.rs.getString("class_room_name"));
            capacity.setValue(DBConnect.rs.getInt("space_capacity"));
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
        capacity = new com.toedter.components.JSpinField();

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
        jLabel1.setText("EDIT VENUE INFORMATION PAGE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Venue Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, 20));

        name.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 220, -1));

        insert.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        insert.setText("Update the Information");
        insert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });
        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 260, 35));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("Close");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 80, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Space Capacity");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        capacity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        capacity.setMaximum(300);
        capacity.setMinimum(0);
        jPanel1.add(capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
        this.hide();
        
        Thread runner = new Thread() {

            public void run() {
                ViewVenue view_venue = new ViewVenue();
                desktop1.add(view_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
                try {
                    view_venue.setSelected(true);
                } catch (java.beans.PropertyVetoException e) {
                }
            }
        };
        runner.start();
    }//GEN-LAST:event_closeActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if(name.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Empty Field(s), Please correct and try again", "Empty Field(s)", JOptionPane.OK_OPTION);
        }else if(capacity.getValue() == 0){
            JOptionPane.showMessageDialog(this,"Venue capacity cannot be 0 or non-numeric", "Issue", JOptionPane.OK_OPTION);
        }else{
            try{
                PreparedStatement st;
                String sql = "select * from class_room where class_room_name = ? AND class_room_id != ?";
                st = DBConnect.con.prepareStatement(sql);

                st.setString(1, name.getText().trim());
                st.setInt(2, class_room_id);

                DBConnect.rs = st.executeQuery();

                if(DBConnect.rs.next()){
                    JOptionPane.showMessageDialog(this, "Venue with thesame name already exist","Issue",JOptionPane.OK_OPTION);
                }else{
                    String sql1="update class_room set class_room_name = ?, space_capacity = ? where class_room_id = ?";
                    st = DBConnect.con.prepareStatement(sql1);
                    st.setString(1, name.getText().trim());
                    st.setInt(2, capacity.getValue());
                    st.setInt(3, class_room_id);

                    st.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Venue information has been updated","Success",JOptionPane.INFORMATION_MESSAGE);
                    ViewVenue view_venue = new ViewVenue();
                    MainMenu.desktop1.removeAll();
                    MainMenu.desktop1.add(view_venue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0) );
                    MainMenu.desktop1.setVisible(false);
                    MainMenu.desktop1.setVisible(true);
                    MainMenu.desktop1.setSelectedFrame(view_venue);
                }
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_insertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.components.JSpinField capacity;
    private javax.swing.JButton close;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
