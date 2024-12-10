package Controller;
import Model.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;



public class CRoomReservation {
    public ResultSet searchGuestByID(String guest_id) 
    {
        MRoomReservation MSearch = new MRoomReservation();
        return MSearch.searchGuestByID(guest_id);
    }
    
    public ResultSet searchRoomNo(String room_no)
    {
        MRoomReservation MSearch = new MRoomReservation();
        return MSearch.searchRoomNo(room_no);
    }
    
    public double calculateTotal(double price, int nights) 
    {
        return price * nights; 
    }
    
    public void ReserveRoom(String reservation_no,String guest_id,String room_no,String check_in_date,String check_out_date,int nights,double total_amount,String payment_method)
    {
        MRoomReservation MReserve = new MRoomReservation();
        MReserve.ReserveRoom(reservation_no, guest_id, room_no, check_in_date, check_out_date, nights, total_amount, payment_method);
    }

    
    public String generateReservationNo()
    {
        MRoomReservation MReserve = new MRoomReservation();
        return MReserve.generateReservationNo();
    }
    
    public DefaultTableModel loadReservation(DefaultTableModel MReservation)
    {
        MRoomReservation MReserve = new MRoomReservation();
        return MReserve.loadReservation(MReservation);
    }
            
}
