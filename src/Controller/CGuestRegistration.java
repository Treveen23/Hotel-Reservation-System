package Controller;
import Model.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CGuestRegistration {
    
    public void registerGuest(String guest_id, String first_name, String last_name, String email, String phone, String id_type, String id_no) {
        MGuestRegistration MReg = new MGuestRegistration();
        MReg.registerGuest(guest_id, first_name, last_name, email, phone, id_type, id_no);
    } 

    public String generateGuestID() {
        MGuestRegistration MReg = new MGuestRegistration();
        return MReg.generateGuestID();
    }

    public DefaultTableModel loadGuests(DefaultTableModel tableModel) {
        MGuestRegistration Mload = new MGuestRegistration();
        return Mload.loadGuests(tableModel);
    }
    
    public ResultSet searchGuestByID(String guest_id) 
    {
        MGuestRegistration MSearch = new MGuestRegistration();
        return MSearch.searchGuestByID(guest_id);
    }
    
    public void updateGuest(String guest_id, String first_name, String last_name, String email, String phone, String id_type, String id_no)
    {
        MGuestRegistration MUpdate = new MGuestRegistration();
        MUpdate.updateGuest(guest_id, first_name, last_name, email, phone, id_type, id_no);
        
    }
    
    public void deleteGuest(String guest_id)
    {
         MGuestRegistration MDelete = new MGuestRegistration();
         MDelete.deleteGuest(guest_id);
    }
   
}
