package Controller;
import Model.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CRoomRegistration {
   
    public void registerRoom(String room_no,String floor,String room_type,String bed_type,String room_description,Double price) {
        MRoomRegistration MRoomReg = new MRoomRegistration();
        MRoomReg.registerRoom(room_no, floor, room_type, bed_type, room_description, price);
    } 
    
    public String generateRoomNo()
    {
        MRoomRegistration MRoomReg = new MRoomRegistration();
        return MRoomReg.generateRoomNo();
    }
    
    public DefaultTableModel loadRooms(DefaultTableModel MRoom)
    {
        MRoomRegistration MRoomLoad = new MRoomRegistration();
         return MRoomLoad.loadRooms(MRoom);
    }
    
    public ResultSet searchRoomByNo(String room_no)
    {
        MRoomRegistration MRoomSearch = new MRoomRegistration();
        return MRoomSearch.searchRoomByNo(room_no);   
    }
    
    public void editRoom(String room_no,String floor,String room_type,String bed_type,String room_description,Double price)
    {
        MRoomRegistration MRoomEdit = new MRoomRegistration();
        MRoomEdit.editRoom(room_no, floor, room_type, bed_type, room_description, price);
    }
    
     public void deleteRoom(String room_no)
     {
         MRoomRegistration MRoomDelete = new MRoomRegistration();
         MRoomDelete.deleteRoom(room_no);
     }
     
}
