package View;
import Controller.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VRoomReservation extends javax.swing.JFrame {

    private CRoomReservation Reservation;
    public VRoomReservation() {
        initComponents();
        setSize(960, 680);
        Reservation = new CRoomReservation();
        sp_nights.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            calculateTotal();
        });
        autoID() ;
        loadReservation();
          
    }
    private void autoID() 
    { 
        String reservation_no =  Reservation.generateReservationNo(); txt_reservation_no.setText( reservation_no); 
    }
    
    private void loadReservation()
    {
        DefaultTableModel GuestTable = (DefaultTableModel) table_reservations.getModel(); 
        Reservation.loadReservation(GuestTable);
    }
    
    private void clean()
    {
        txt_reservation_no.setText("");
        txt_guest_id.setText("");
        txt_guest_name.setText("");
        txt_room_price.setText("");
        txt_room_type.setText("");
        dc_check_in_date.setDate(null);
        dc_check_out_date.setDate(null);
        sp_nights.setValue(1);
        txt_total_amount.setText("");
        cmb_payment_method.setSelectedIndex(0);
    }
    
    public void calculateTotal() {
    try {
       
        CRoomReservation controller = new CRoomReservation(); 
        double price = Double.parseDouble(txt_room_price.getText());
         
        int nights = (int) sp_nights.getValue();
        
        double total = controller.calculateTotal(price, nights);
        
        txt_total_amount.setText(String.format("%.2f", total));
    } catch (NumberFormatException e) {
        txt_total_amount.setText("Invalid input"); 
    } catch (Exception e) {
        txt_total_amount.setText("Error calculating total"); 
    }
       
}   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_room_type = new javax.swing.JTextField();
        txt_room_price = new javax.swing.JTextField();
        dc_check_in_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dc_check_out_date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_total_amount = new javax.swing.JTextField();
        sp_nights = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_guest_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_reservations = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        txt_guest_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmb_payment_method = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_reservation_no = new javax.swing.JTextField();
        txt_room_no = new javax.swing.JTextField();
        btn_search1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 82, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Room Type");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 90, -1));
        getContentPane().add(txt_room_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 158, -1));
        getContentPane().add(txt_room_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 158, -1));
        getContentPane().add(dc_check_in_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 190, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Check Out Date ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 110, -1));
        getContentPane().add(dc_check_out_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 240, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Amount");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 100, 20));
        getContentPane().add(txt_total_amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 158, -1));
        getContentPane().add(sp_nights, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 290, 160, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nights");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 65, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Guest ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 108, -1));
        getContentPane().add(txt_guest_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 156, -1));

        table_reservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation No", "Guest ID", "Room No", "Check In Date", "Check Out Date", "Nights", "Total Amount", "Payment Method"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_reservations);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 821, 210));

        btn_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 90, -1));

        btn_confirm.setBackground(new java.awt.Color(40, 167, 69));
        btn_confirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_confirm.setText("Confirm");
        btn_confirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_confirm.setBorderPainted(false);
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 114, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guest Name ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 108, -1));

        btn_cancel.setBackground(new java.awt.Color(108, 117, 125));
        btn_cancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cancel.setText("Cancel");
        btn_cancel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_cancel.setBorderPainted(false);
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 120, 30));
        getContentPane().add(txt_guest_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 140, 160, -1));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ROOM RESERVATION");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 370, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Payment Method");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 270, 110, -1));

        cmb_payment_method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));
        getContentPane().add(cmb_payment_method, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 158, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Select Room No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 122, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Check In Date ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reservation No");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 108, -1));
        getContentPane().add(txt_reservation_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 340, 160, -1));
        getContentPane().add(txt_room_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, 158, -1));

        btn_search1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_search1.setText("Search");
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 87, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\Hotel Reservation System\\images\\Hotels Business Website (3).png")); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       
        String guest_id = txt_guest_id.getText(); 
        ResultSet rs = Reservation.searchGuestByID(guest_id);
        try 
        { 
            if (rs.next()) 
            { 
                txt_guest_name.setText(rs.getString("first_name"));
                
            } else 
            { 
                JOptionPane.showMessageDialog(this, "Guest not found!"); 
            }
        } catch (Exception e) 
        { 
            System.err.println(e.getMessage()); 
        }
        
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
       
    try {
        
        String reservation_no = txt_reservation_no.getText();
        String guest_id = txt_guest_id.getText();
        String room_no = txt_room_no.getText();
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        String check_in_date = date_format.format(dc_check_in_date.getDate());
        SimpleDateFormat date_format1 = new SimpleDateFormat("yyyy-MM-dd");
        String check_out_date = date_format1.format(dc_check_out_date.getDate());
        int nights = (int) sp_nights.getValue();
        double total_amount = Double.parseDouble(txt_total_amount.getText());
        String payment_method = (String) cmb_payment_method.getSelectedItem();

        
        if (reservation_no.isEmpty() || guest_id.isEmpty() || room_no.isEmpty() || check_in_date == null || check_out_date == null || nights <= 0 || total_amount <= 0 || payment_method.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields correctly", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        Reservation.ReserveRoom(reservation_no, guest_id, room_no, check_in_date, check_out_date, nights, total_amount, payment_method);
        JOptionPane.showMessageDialog(this, "Room reservation successful", "Success", JOptionPane.INFORMATION_MESSAGE);
       

        
       } catch (NumberFormatException e) {
          JOptionPane.showMessageDialog(this, "Invalid number format: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
       } catch (ArrayIndexOutOfBoundsException e) {
          JOptionPane.showMessageDialog(this, "Array index out of bounds: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
       } catch (Exception e) {
          JOptionPane.showMessageDialog(this, "Error saving reservation: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
          e.printStackTrace(); 
       }
      
        clean();
        autoID();
        loadReservation();

        
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        
        String room_no = txt_room_no.getText(); 
        ResultSet rs = Reservation.searchRoomNo(room_no);
        try 
        { 
            if (rs.next()) 
            { 
                txt_room_type.setText(rs.getString("room_type"));
                txt_room_price.setText(Double.toString(rs.getDouble("price")));
                
            } else 
            { 
                JOptionPane.showMessageDialog(this, "Room not found!"); 
            }
        } catch (Exception e) 
        { 
            System.err.println(e.getMessage()); 
        }
        
    }//GEN-LAST:event_btn_search1ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
       VDashboard dashboard = new VDashboard();
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRoomReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private javax.swing.JComboBox<String> cmb_payment_method;
    private com.toedter.calendar.JDateChooser dc_check_in_date;
    private com.toedter.calendar.JDateChooser dc_check_out_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner sp_nights;
    private javax.swing.JTable table_reservations;
    private javax.swing.JTextField txt_guest_id;
    private javax.swing.JTextField txt_guest_name;
    private javax.swing.JTextField txt_reservation_no;
    private javax.swing.JTextField txt_room_no;
    private javax.swing.JTextField txt_room_price;
    private javax.swing.JTextField txt_room_type;
    private javax.swing.JTextField txt_total_amount;
    // End of variables declaration//GEN-END:variables
}
