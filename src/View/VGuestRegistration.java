package View;
import Controller.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VGuestRegistration extends javax.swing.JFrame {
   private CGuestRegistration Guest;
    public VGuestRegistration() {
        initComponents();
        setSize(960, 680);
        Guest = new CGuestRegistration(); 
        autoID(); 
        loadGuest();
    }
    private void autoID() 
    { 
        String guest_id = Guest.generateGuestID(); 
        txt_guest_id.setText(guest_id); 
    }
    
    private void loadGuest() 
    { 
        DefaultTableModel MGuestTable = (DefaultTableModel) table_guest.getModel(); 
        Guest.loadGuests(MGuestTable); 
    }
    
    private void clean()
    {
        txt_first_name.setText(""); 
        txt_last_name.setText(""); 
        txt_email.setText(""); 
        txt_phone.setText(""); 
        cmb_id_type.setSelectedIndex(-1);
        txt_id_no.setText(""); 
        txt_guest_id_search.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_guest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_guest_id_search = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_guest_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_first_name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_last_name = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        cmb_id_type = new javax.swing.JComboBox<>();
        txt_id_no = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_save.setBackground(new java.awt.Color(40, 167, 69));
        btn_save.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_save.setBorderPainted(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 150, 30));

        btn_update.setBackground(new java.awt.Color(0, 123, 255));
        btn_update.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        btn_update.setText("Update");
        btn_update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_update.setBorderPainted(false);
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 233, 150, 30));

        btn_clear.setBackground(new java.awt.Color(255, 153, 0));
        btn_clear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_clear.setText("Clear Form");
        btn_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_clear.setBorderPainted(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 193, 150, 30));

        btn_delete.setBackground(new java.awt.Color(220, 53, 69));
        btn_delete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.setBorderPainted(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 273, 150, 30));

        table_guest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Guest ID", "First Name", "Last Name", "Email", "Phone", "ID Type", "ID No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_guest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_guestMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_guest);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 840, 200));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Guest Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 330, -1));

        txt_guest_id_search.setToolTipText("Search Guest Here");
        getContentPane().add(txt_guest_id_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 168, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Search Guest ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 97, 120, 30));

        btn_search.setText("Search");
        btn_search.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_search.setBorderPainted(false);
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 100, 90, 30));

        btn_close.setBackground(new java.awt.Color(108, 117, 125));
        btn_close.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("Close");
        btn_close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_close.setBorderPainted(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 313, 150, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Enter Guest Details");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 78, 186, -1));

        txt_guest_id.setEditable(false);
        getContentPane().add(txt_guest_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Guest ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 99, 27));

        txt_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_first_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_first_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 99, 27));
        getContentPane().add(txt_last_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 99, 27));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 190, -1));
        getContentPane().add(txt_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 190, -1));

        cmb_id_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIC", "Passport No" }));
        getContentPane().add(cmb_id_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 190, -1));
        getContentPane().add(txt_id_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 99, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 99, 27));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Type");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 99, 27));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 99, 27));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\Hotel Reservation System\\images\\Hotels Business Website (3).png")); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
    
        String guest_id = txt_guest_id.getText(); 
        String first_name = txt_first_name.getText(); 
        String last_name = txt_last_name.getText(); 
        String email = txt_email.getText(); 
        String phone = txt_phone.getText(); 
        String id_type = cmb_id_type.getSelectedItem().toString();
        String id_no = txt_id_no.getText(); 

        if (guest_id.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Guest ID must be filled");
        } else if (first_name.isEmpty()) {
           JOptionPane.showMessageDialog(this, "First Name must be filled");
        } else if (last_name.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Last Name must be filled");
        } else if (email.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Email must be filled");
        } else if (phone.isEmpty()) {
           JOptionPane.showMessageDialog(this, "Phone number must be filled");
        } else if (id_type.isEmpty()) {
           JOptionPane.showMessageDialog(this, "ID Type must be selected");
        } else if (id_no.isEmpty()) {
           JOptionPane.showMessageDialog(this, "ID Number must be filled");
        } else if (!phone.matches("^\\+\\d{1,3}\\d{7,}$")) {
           JOptionPane.showMessageDialog(this, "Phone number must start with a country code and contain only digits after it");
        } else if (!email.contains("@") || !email.contains(".")) {
           JOptionPane.showMessageDialog(this, "Invalid email address. It should contain both '@' and '.'");
        } else {
        Guest.registerGuest(guest_id, first_name, last_name, email, phone, id_type, id_no); 
        JOptionPane.showMessageDialog(this, "Guest Added Successfully"); 
        clean();
        autoID(); 
        loadGuest();
        
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
     
        String guest_id = txt_guest_id.getText(); 
        String first_name = txt_first_name.getText(); 
        String last_name = txt_last_name.getText();
        String email = txt_email.getText();
        String phone = txt_phone.getText(); 
        String id_type = cmb_id_type.getSelectedItem().toString();
        String id_no = txt_id_no.getText();
     
        if(!phone.matches("^\\+\\d{1,3}\\d{7,}$"))
        {
         JOptionPane.showMessageDialog(this, "Phone number must start with a country code and contain only digits after it");
        } else if (!email.contains("@") || !email.contains(".")) {
           JOptionPane.showMessageDialog(this, "Invalid email address. It should contain both '@' and '.'");
        } else {
         Guest.updateGuest(guest_id, first_name, last_name, email, phone, id_type, id_no);
         JOptionPane.showMessageDialog(this, "Guest Updated Successfully"); 
        }
        
        clean();
        autoID(); 
        loadGuest(); 
        
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
    
        clean();
        autoID(); 
        loadGuest();
      
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        String guest_id = txt_guest_id.getText();

        int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this guest?", "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) 
        {
            Guest.deleteGuest(guest_id);
            JOptionPane.showMessageDialog(this, "Guest Deleted Successfully");
    
        } else {
            JOptionPane.showMessageDialog(this, "Guest Deletion Cancelled");
        }
        
        clean();
        autoID();
        loadGuest(); 
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void table_guestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_guestMouseClicked

     
    }//GEN-LAST:event_table_guestMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        String guest_id = txt_guest_id_search.getText(); 
        ResultSet rs = Guest.searchGuestByID(guest_id);
        try 
        { 
            if (rs.next()) 
            { 
                txt_guest_id.setText(rs.getString("guest_id"));
                txt_first_name.setText(rs.getString("first_name"));
                txt_last_name.setText(rs.getString("last_name")); 
                txt_email.setText(rs.getString("email")); 
                txt_phone.setText(rs.getString("phone")); 
                cmb_id_type.setSelectedItem(rs.getString("id_type")); 
                txt_id_no.setText(rs.getString("id_no")); 
            } else 
            { 
                JOptionPane.showMessageDialog(this, "Guest not found!"); 
            }
        } catch (Exception e) 
        { 
            System.err.println(e.getMessage()); 
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        VDashboard dashboard = new VDashboard();
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_btn_closeActionPerformed

    private void txt_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_first_nameActionPerformed

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
            java.util.logging.Logger.getLogger(VGuestRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VGuestRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VGuestRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VGuestRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VGuestRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cmb_id_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_guest;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_first_name;
    private javax.swing.JTextField txt_guest_id;
    private javax.swing.JTextField txt_guest_id_search;
    private javax.swing.JTextField txt_id_no;
    private javax.swing.JTextField txt_last_name;
    private javax.swing.JTextField txt_phone;
    // End of variables declaration//GEN-END:variables
}
