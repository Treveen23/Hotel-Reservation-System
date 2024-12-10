package Model;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class MRoomReservation {
    public ResultSet searchGuestByID(String guest_id) 
    { 
        ResultSet rs = null; 
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("select first_name from guest where guest_id = '" + guest_id + "'"); 
        } catch (SQLException e) 
        { 
            System.err.println(e.getMessage()); 
        } 
        return rs; 
    }
    
   public ResultSet searchRoomNo(String room_no) 
    { 
        ResultSet rs = null; 
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("select room_type,price from room where room_no = '" + room_no + "'"); 
        } catch (SQLException e) 
        { 
            System.err.println(e.getMessage()); 
        } 
        return rs; 
    }
   
   public void ReserveRoom(String reservation_no, String guest_id, String room_no, String check_in_date, String check_out_date, int nights, double total_amount, String payment_method)
    {   
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into reservation values('"+reservation_no+"','"+guest_id+"','"+room_no+"','"+check_in_date+"','"+check_out_date+"','"+nights+"','"+total_amount+"','"+payment_method+"')");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
   
   public String generateReservationNo() {
        String reservation_no  = "RS001";
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select MAX(reservation_no) from reservation");
            if(rs.next() && rs.getString("MAX(reservation_no)") != null) {
                int id = Integer.parseInt(rs.getString("MAX(reservation_no)").substring(2)) + 1;
                reservation_no = "RS" + String.format("%03d", id);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return reservation_no;
    }
    
   public DefaultTableModel loadReservation(DefaultTableModel MReservation) {
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from reservation");
            ResultSetMetaData rsd = rs.getMetaData();
            int c = rsd.getColumnCount();
            MReservation.setRowCount(0);
            
            while (rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(rs.getString("reservation_no"));
                v2.add(rs.getString("guest_id"));
                v2.add(rs.getString("room_no"));
                v2.add(rs.getString("check_in_date"));
                v2.add(rs.getString("check_out_date"));
                v2.add(rs.getInt("nights"));
                v2.add(rs.getString("total_amount"));
                v2.add(rs.getString("payment_method"));
            }
            MReservation.addRow(v2);
            
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return MReservation;
    }
 
}
