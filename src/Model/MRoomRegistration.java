package Model;
import java.sql.*;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class MRoomRegistration {
    public void registerRoom(String room_no,String floor,String room_type,String bed_type,String room_description,Double price)
    {   
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            st.executeUpdate("insert into room values('"+room_no+"','"+floor+"','"+room_type+"','"+price+"','"+bed_type+"','"+room_description+"')");
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    public String generateRoomNo() {
        String Room_no  = "R001";
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select MAX(room_no) from room");
            if(rs.next() && rs.getString("MAX(room_no)") != null) {
                int id = Integer.parseInt(rs.getString("MAX(room_no)").substring(2)) + 1;
                Room_no = "R" + String.format("%03d", id);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return Room_no;
    }
    
    public DefaultTableModel loadRooms(DefaultTableModel MRoom) {
        try {
            Statement st = DBConnection.createDBConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from room");
            ResultSetMetaData rsd = rs.getMetaData();
            int c = rsd.getColumnCount();
            MRoom.setRowCount(0);
            
            while (rs.next()) {
            Vector v2 = new Vector();
            for (int i = 1; i <= c; i++) {
                v2.add(rs.getString("room_no"));
                v2.add(rs.getString("floor"));
                v2.add(rs.getString("room_type"));
                v2.add(rs.getInt("price"));
                v2.add(rs.getString("bed_type"));
                v2.add(rs.getString("room_description"));
            }
            MRoom.addRow(v2);
            
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return MRoom;
    }
    
    public ResultSet searchRoomByNo(String room_no) 
    { 
        ResultSet rs = null; 
        try 
        {
            Statement st = DBConnection.createDBConnection().createStatement();
            rs = st.executeQuery("select * from room where room_no = '" + room_no + "'"); 
        } catch (SQLException e) 
        { 
            System.err.println(e.getMessage()); 
        } 
        return rs; 
    }
    public void editRoom(String room_no,String floor,String room_type,String bed_type,String room_description,Double price) 
    { 
        try { 
        Statement st = DBConnection.createDBConnection().createStatement();
        st.executeUpdate("update room set floor = '"+floor+"', room_type = '"+room_type+"', bed_type = '"+bed_type+"', room_description = '"+room_description+"', price = '"+price+"' where room_no = '"+room_no+"'");
        }
        catch (SQLException e)
        { 
        System.err.println(e.getMessage());
        } 
    }
    
    public void deleteRoom(String room_no)
    { 
        try { 
        Statement st = DBConnection.createDBConnection().createStatement();
        st.executeUpdate("delete from room where room_no = '"+room_no+"'");
        } 
        catch (SQLException e) 
        { 
            System.err.println(e.getMessage());
        } 
    }
}