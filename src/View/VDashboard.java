package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class VDashboard extends javax.swing.JFrame {

    
    public VDashboard() {
        initComponents();
        setSize(960, 680);
        DateTime();
    }
    
    public void DateTime() 
    {
    Date d = new Date();
    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MMM-dd");
    String dd = sdfDate.format(d);
    lbl_date.setText(dd);

    Timer timer = new Timer(1000, new ActionListener() 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            Date now = new Date();
            SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
            String tt = sdfTime.format(now);
            lbl_time.setText(tt);
        }
    });
    timer.start();
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_add_guest = new javax.swing.JButton();
        btn_add_room = new javax.swing.JButton();
        btn_reports = new javax.swing.JButton();
        btn_make_reservation = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_date = new javax.swing.JLabel();
        lbl_time = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(960, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_add_guest.setBackground(new java.awt.Color(204, 204, 204));
        btn_add_guest.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_add_guest.setForeground(new java.awt.Color(102, 51, 0));
        btn_add_guest.setText("Add Guest");
        btn_add_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_guestActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add_guest, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 140, 40));

        btn_add_room.setBackground(new java.awt.Color(204, 204, 204));
        btn_add_room.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_add_room.setForeground(new java.awt.Color(102, 51, 0));
        btn_add_room.setText("Add Room");
        btn_add_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_roomActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add_room, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 130, 40));

        btn_reports.setBackground(new java.awt.Color(204, 204, 204));
        btn_reports.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_reports.setForeground(new java.awt.Color(102, 51, 0));
        btn_reports.setText("Reports");
        btn_reports.setPreferredSize(new java.awt.Dimension(96, 24));
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 510, 140, 40));

        btn_make_reservation.setBackground(new java.awt.Color(204, 204, 204));
        btn_make_reservation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_make_reservation.setForeground(new java.awt.Color(102, 51, 0));
        btn_make_reservation.setText("Make Reservation");
        btn_make_reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_make_reservationActionPerformed(evt);
            }
        });
        getContentPane().add(btn_make_reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, -1, 40));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 130, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 62)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Azure Bloom");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 380, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Resort & Spa Hotel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        lbl_date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_date.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 140, 30));

        lbl_time.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 100, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\OneDrive\\Documents\\NetBeansProjects\\Hotel Reservation System\\images\\background.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_add_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_guestActionPerformed
        VGuestRegistration guest = new VGuestRegistration();
        this.setVisible(false);
        guest.setVisible(true);
    }//GEN-LAST:event_btn_add_guestActionPerformed

    private void btn_add_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_roomActionPerformed
        VRoomRegistration room = new VRoomRegistration();
        this.setVisible(false);
        room.setVisible(true);
    }//GEN-LAST:event_btn_add_roomActionPerformed

    private void btn_make_reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_make_reservationActionPerformed
        VRoomReservation reservation = new VRoomReservation();
        this.setVisible(false);
        reservation.setVisible(true);
    }//GEN-LAST:event_btn_make_reservationActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        VReport report = new VReport();
        this.setVisible(false);
        report.setVisible(true);
        
    }//GEN-LAST:event_btn_reportsActionPerformed

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
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_guest;
    private javax.swing.JButton btn_add_room;
    private javax.swing.JButton btn_make_reservation;
    private javax.swing.JButton btn_reports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_date;
    private javax.swing.JLabel lbl_time;
    // End of variables declaration//GEN-END:variables
}
