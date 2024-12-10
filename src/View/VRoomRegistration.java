package View;
import java.sql.ResultSet;
import Controller.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VRoomRegistration extends javax.swing.JFrame {

    private CRoomRegistration Room;
    public VRoomRegistration() {
        initComponents();
        setSize(960, 680);
        Room = new CRoomRegistration();
        autoID();
        loadRoom();
        
    }
    private void autoID() 
    { 
        String room_no =  Room.generateRoomNo(); txt_room_no.setText( room_no); 
    }
    
    private void loadRoom() 
    { 
        DefaultTableModel MGuestTable = (DefaultTableModel) table_room.getModel(); 
        Room.loadRooms(MGuestTable);
    }
    
    private void clean()
    {
        cmb_floor.setSelectedIndex(-1);
        cmb_room_type.setSelectedIndex(-1);
        txt_price.setText("");
        btn_bed_group.clearSelection();
        txt_area_room_description.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_bed_group = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_area_room_description = new javax.swing.JTextArea();
        rb_single_bed = new javax.swing.JRadioButton();
        rb_double_bed = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rb_king_bed = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_room = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        rb_queen_bed = new javax.swing.JRadioButton();
        txt_room_no = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        cmb_floor = new javax.swing.JComboBox<>();
        btn_clear = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        cmb_room_type = new javax.swing.JComboBox<>();
        txt_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_search_room = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_close = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rate/Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 83, 24));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room Description");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 112, 24));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bed Type");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 92, -1));

        txt_area_room_description.setColumns(20);
        txt_area_room_description.setRows(5);
        jScrollPane1.setViewportView(txt_area_room_description);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 280, 90));

        btn_bed_group.add(rb_single_bed);
        rb_single_bed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_single_bed.setForeground(new java.awt.Color(255, 255, 255));
        rb_single_bed.setText("Single Bed");
        rb_single_bed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_single_bedActionPerformed(evt);
            }
        });
        getContentPane().add(rb_single_bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        btn_bed_group.add(rb_double_bed);
        rb_double_bed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_double_bed.setForeground(new java.awt.Color(255, 255, 255));
        rb_double_bed.setText("Double Bed");
        getContentPane().add(rb_double_bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 330, -1));

        btn_bed_group.add(rb_king_bed);
        rb_king_bed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_king_bed.setForeground(new java.awt.Color(255, 255, 255));
        rb_king_bed.setText("King Bed");
        getContentPane().add(rb_king_bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 92, -1));

        table_room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room No", "Floor", "Room Type", "Price", "Bed Type", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_roomMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_room);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 570, 320));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 92, 24));

        btn_bed_group.add(rb_queen_bed);
        rb_queen_bed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_queen_bed.setForeground(new java.awt.Color(255, 255, 255));
        rb_queen_bed.setText("Queen Bed");
        getContentPane().add(rb_queen_bed, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 98, -1));

        txt_room_no.setEditable(false);
        getContentPane().add(txt_room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 138, -1));

        btn_save.setBackground(new java.awt.Color(40, 167, 69));
        btn_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_save.setBorderPainted(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 454, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Floor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 92, 24));

        btn_edit.setBackground(new java.awt.Color(0, 123, 255));
        btn_edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_edit.setBorderPainted(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        getContentPane().add(btn_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 454, 120, 30));

        cmb_floor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Floor 1", "Floor 2", "Floor 3", "Floor 4" }));
        cmb_floor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_floorActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_floor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 138, -1));

        btn_clear.setBackground(new java.awt.Color(253, 126, 20));
        btn_clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_clear.setText("Clear Form");
        btn_clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_clear.setBorderPainted(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 514, 120, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Room Type");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 92, 24));

        btn_delete.setBackground(new java.awt.Color(220, 53, 69));
        btn_delete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_delete.setBorderPainted(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 514, 120, 30));

        cmb_room_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Standard", "Deluxe", "Suite", "Executive Suit" }));
        getContentPane().add(cmb_room_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 138, -1));
        getContentPane().add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 138, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Room Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 92, 24));
        getContentPane().add(txt_search_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 138, -1));

        btn_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 100, -1));

        btn_close.setBackground(new java.awt.Color(108, 117, 125));
        btn_close.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_close.setText("Close");
        btn_close.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_close.setBorderPainted(false);
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 564, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\Hotel Reservation System\\images\\Hotels Business Website (3).png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb_single_bedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_single_bedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb_single_bedActionPerformed

    private void table_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_roomMouseClicked

    }//GEN-LAST:event_table_roomMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

       String room_no = txt_room_no.getText().trim();
       String floor = cmb_floor.getSelectedItem().toString();
       String room_type = cmb_room_type.getSelectedItem().toString();
       String room_description = txt_area_room_description.getText().trim();
       String bed_type = "";
       Double price;

    
       try {
            price = Double.valueOf(txt_price.getText().trim());
        if (price <= 0) {
            
            throw new NumberFormatException("Price must be positive");    
        }
       } catch (NumberFormatException e) {
           
            JOptionPane.showMessageDialog(this, "Invalid price entered. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
       }

        if (room_no.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(this, "Room Number must be filled", "Input Error", JOptionPane.ERROR_MESSAGE); 
            return; 
        } 
        if (floor.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(this, "Floor must be selected", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        if (room_type.isEmpty()) 
        { 
            JOptionPane.showMessageDialog(this, "Room Type must be selected", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (room_description.isEmpty()) 
        {
            JOptionPane.showMessageDialog(this, "Room Description must be filled", "Input Error", JOptionPane.ERROR_MESSAGE);
            return; 
        } 
        if (!rb_single_bed.isSelected() && !rb_double_bed.isSelected() && !rb_queen_bed.isSelected() && !rb_king_bed.isSelected()) 
        { 
            JOptionPane.showMessageDialog(this, "Please select a Bed Type", "Input Error", JOptionPane.ERROR_MESSAGE); 
             return; 
        }

    
        if (rb_single_bed.isSelected()) {
            bed_type = "Single Bed";
        } else if (rb_double_bed.isSelected()) {
            bed_type = "Double Bed";
        } else if (rb_queen_bed.isSelected()) {
            bed_type = "Queen Bed";
        } else if (rb_king_bed.isSelected()) {
            bed_type = "King Bed";
        }

    
        Room.registerRoom(room_no, floor, room_type, bed_type, room_description, price);
        JOptionPane.showMessageDialog(this, "Room Added Successfully");

        clean();
        autoID();
        loadRoom();
     
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        
        String room_no = txt_room_no.getText();
        String floor = cmb_floor.getSelectedItem().toString();
        String room_type = cmb_room_type.getSelectedItem().toString();
        String room_description = txt_area_room_description.getText();
        Double price = Double.parseDouble(txt_price.getText().trim());
        String bed_type = "";

            if (rb_single_bed.isSelected()) {
                bed_type = "Single Bed";
            } else if (rb_double_bed.isSelected()) {
                bed_type = "Double Bed";
            }else if (rb_queen_bed.isSelected()) {
                bed_type = "Queen Bed";
            }else if (rb_king_bed.isSelected()) {
                bed_type = "King Bed";
            }
        Room.editRoom(room_no, floor, room_type, bed_type, room_description, price);
        
         try {
        price = Double.valueOf(txt_price.getText().trim());
        if (price <= 0) {
            throw new NumberFormatException("Price must be positive");
        }
        } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid price entered. Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
        }
        JOptionPane.showMessageDialog(this, "Room Edited Successfully");
        
        clean();
        autoID();
        loadRoom();    

    }//GEN-LAST:event_btn_editActionPerformed

    private void cmb_floorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_floorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_floorActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed

        clean();
        autoID();
        loadRoom();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed

       String room_no;
       room_no = txt_room_no.getText();
       
       int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this room?", "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

       if (response == JOptionPane.YES_OPTION) 
       {
           Room.deleteRoom(room_no);
           JOptionPane.showMessageDialog(this, "Room Deleted Successfully");
       } else {
       JOptionPane.showMessageDialog(this, "Room deletion canceled");
       }
       
       clean();
       autoID();
       loadRoom();

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        
        String room_no = txt_search_room.getText().trim();

        if (room_no.isEmpty()) 
        {
           JOptionPane.showMessageDialog(this, "Please enter a Room Number to search!", "Input Error", JOptionPane.ERROR_MESSAGE);
           return;
        }

        ResultSet rs = null;

        try {
    
        rs = Room.searchRoomByNo(room_no);

        if (rs.next()) 
        {
            txt_room_no.setText(rs.getString("room_no"));
            cmb_floor.setSelectedItem(rs.getString("floor"));
            cmb_room_type.setSelectedItem(rs.getString("room_type"));
            txt_price.setText(rs.getString("price"));

            String bed_type = rs.getString("bed_type");
            switch (bed_type) {
                case "Single Bed":
                    rb_single_bed.setSelected(true);
                    break;
                case "Double Bed":
                    rb_double_bed.setSelected(true);
                    break;
                case "Queen Bed":
                    rb_queen_bed.setSelected(true);
                    break;
                case "King Bed":
                    rb_king_bed.setSelected(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Unknown Bed Type: " + bed_type, "Error", JOptionPane.WARNING_MESSAGE);
                     break;
            }

            txt_area_room_description.setText(rs.getString("room_description"));
        } else {
            JOptionPane.showMessageDialog(this, "Room not found!", "Search Result", JOptionPane.INFORMATION_MESSAGE);
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while searching for the room: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
        try {
           if (rs != null)
           {
            rs.close(); // Close the ResultSet to free up resources
           }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "An error occurred while closing the database connection: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        
        VDashboard dashboard = new VDashboard();
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_btn_closeActionPerformed

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
            java.util.logging.Logger.getLogger(VRoomRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRoomRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRoomRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRoomRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRoomRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btn_bed_group;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cmb_floor;
    private javax.swing.JComboBox<String> cmb_room_type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rb_double_bed;
    private javax.swing.JRadioButton rb_king_bed;
    private javax.swing.JRadioButton rb_queen_bed;
    private javax.swing.JRadioButton rb_single_bed;
    private javax.swing.JTable table_room;
    private javax.swing.JTextArea txt_area_room_description;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_room_no;
    private javax.swing.JTextField txt_search_room;
    // End of variables declaration//GEN-END:variables
}
