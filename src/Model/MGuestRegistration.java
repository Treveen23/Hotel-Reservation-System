package Model;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class MGuestRegistration {
    public void registerGuest(String guest_id, String first_name, String last_name, String email, String phone, String id_type, String id_no) {   
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into guest values('"+guest_id+"','"+first_name+"','"+last_name+"','"+email+"','"+phone+"','"+id_type+"','"+id_no+"')");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public String generateGuestID() {
        String guest_id = "G001";
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select MAX(guest_id) from guest");
            if(rs.next() && rs.getString("MAX(guest_id)") != null) {
                int id = Integer.parseInt(rs.getString("MAX(guest_id)").substring(2)) + 1;
                guest_id = "G" + String.format("%03d", id);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return guest_id;
    }

    public DefaultTableModel loadGuests(DefaultTableModel MGuest) {
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from guest");
            ResultSetMetaData rsd = rs.getMetaData();
            int c = rsd.getColumnCount();
            MGuest.setRowCount(0);

            while (rs.next()) {
                Vector<String> v2 = new Vector<>();
                for (int i = 1; i <= c; i++) {
                    v2.add(rs.getString("guest_id"));
                    v2.add(rs.getString("first_name"));
                    v2.add(rs.getString("last_name"));
                    v2.add(rs.getString("email"));
                    v2.add(rs.getString("phone"));
                    v2.add(rs.getString("id_type"));
                    v2.add(rs.getString("id_no"));
                }
                MGuest.addRow(v2);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return MGuest;
    }
    
    public ResultSet searchGuestByID(String guest_id) 
    { 
        ResultSet rs = null; 
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("select * from guest where guest_id = '" + guest_id + "'"); 
        } catch (SQLException e) 
        { 
            System.err.println(e.getMessage()); 
        } 
        return rs; 
    }
    
    public void updateGuest(String guest_id, String first_name, String last_name, String email, String phone, String id_type, String id_no) 
    { 
        try { 
        Statement st = DBConnection.createDBConnection().createStatement();
        st.executeUpdate("update guest set first_name = '"+first_name+"', last_name = '"+last_name+"', email = '"+email+"', phone = '"+phone+"', id_type = '"+id_type+"', id_no = '"+id_no+"' where guest_id = '"+guest_id+"'");
        }
        catch (SQLException e)
        { 
        System.err.println(e.getMessage());
        } 
    }
    
    public void deleteGuest(String guest_id)
    { 
        try { 
        Statement st = DBConnection.createDBConnection().createStatement();
        st.executeUpdate("delete from guest where guest_id = '"+guest_id+"'");
        } 
        catch (SQLException e) 
        { 
            System.err.println(e.getMessage());
        } 
    }
}

