package com.gui;

import com.data_structure.DBConnect;
import com.data_structure.MyTable;
import static com.gui.MainMenu.desktop1;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

public class ViewCourse extends javax.swing.JInternalFrame {
    
    private String course_name;
    
    public ViewCourse() {
        DBConnect.connect();
        initComponents();
        createTable();
    }

    private void createTable(){
        String sql="select course_name, maximum_number_of_student from course";

        JTable table;
        TableColumn column = null;
        JScrollPane scrollPane;
        String meta[]={"Course Title", "Maximum Number of Student"};
        table= MyTable.createTable(sql, meta);
        table.setPreferredScrollableViewportSize(new Dimension(480, 200));
        table.setToolTipText("Select course record and click edit or delete to edit or delete information");
        scrollPane = new JScrollPane(table);
        for (int i = 0; i < 2; i++) {
            column = table.getColumnModel().getColumn(i);
            if (i == 0) //MemberID
                column.setPreferredWidth(100);
            if (i == 1) //MemberID
                column.setPreferredWidth(100);
        }
        
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try{
                    int row= table.getSelectedRow();
                    
                    course_name = table.getModel().getValueAt(row, 0).toString();
                    
                    edit.setEnabled(true);
                    delete.setEnabled(true);
                }catch(Exception ex){
                    ex.printStackTrace();
                    System.out.println(ex.getMessage());
                }
            }
        });
        
        contentPanel.removeAll();
        scrollPane.setViewportView(table);
        contentPanel.add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 200));
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
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        close = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(515, 350));
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
        jLabel1.setText("EDIT/DELETE COURSE INFORMATION");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 40));

        contentPanel.setBackground(new java.awt.Color(255, 255, 255));
        contentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92)));
        contentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        contentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        jPanel1.add(contentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 480, 200));

        edit.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        edit.setText("EDIT");
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        edit.setEnabled(false);
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 35));

        delete.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        delete.setText("DELETE");
        delete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 35));

        close.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        close.setText("CLOSE");
        close.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 12, 92), 2));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel1.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 80, 35));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.hide();
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            int confirm = JOptionPane.showConfirmDialog(this, "Delecte course Information? Notice that all information related to the course will also be deleted.", "Confirmation", JOptionPane.YES_NO_OPTION);
            PreparedStatement st;
            
            if(confirm == JOptionPane.YES_OPTION){
                String sql = "delete from course where course_name = ?";
                st = DBConnect.con.prepareStatement(sql);

                st.setString(1, course_name);
                
                st.executeUpdate();
                
                JOptionPane.showMessageDialog(this, "Course information has been deleted","Success",JOptionPane.INFORMATION_MESSAGE);
                
                createTable();
                this.edit.setEnabled(false);
                this.delete.setEnabled(false);
            }
        }catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        try{
            PreparedStatement st;
            String sql = "select * from course where course_name = ?";
            st = DBConnect.con.prepareStatement(sql);

            st.setString(1, course_name);

            DBConnect.rs = st.executeQuery();
            DBConnect.rs.next();

            int course_id = DBConnect.rs.getInt("course_id");

            this.dispose();
            this.hide();
            
            EditCourse edit_course = new EditCourse(course_id);
            desktop1.add(edit_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0));
            edit_course.setSelected(true);
        }catch (Exception e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    public static javax.swing.JPanel contentPanel;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
