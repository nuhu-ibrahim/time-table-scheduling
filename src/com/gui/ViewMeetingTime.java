package com.gui;

import com.data_structure.DBConnect;
import com.data_structure.MyTable;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ViewMeetingTime extends javax.swing.JInternalFrame {
    
    public ViewMeetingTime() {
        DBConnect.connect();
        initComponents();
        createTable();
    }

    private void createTable(){
        String sql="select time_title from meeting_time";

        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Meeting Time"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(360, 200));
        scrollPane = new JScrollPane(table);
        for (int i = 0; i < 1; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 0) //MemberID
                column.setPreferredWidth(100);
        }
        
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 200));
        contentPanel.setVisible(false);
        contentPanel.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contentPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        close = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(395, 337));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 480));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 12, 92));
        jPanel2.setPreferredSize(new java.awt.Dimension(596, 488));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tiger Expert", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW MEETING TIME INFORMATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 40));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 360, 200));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("CLOSE");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 80, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
