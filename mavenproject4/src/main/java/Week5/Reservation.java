/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class Reservation {
    private FlightInformation infor;
    private String bookingId, customerName, phoneNumber, roomNumber;
    private LocalDate bookingDate;

    public Reservation(FlightInformation infor, String bookingId, String customerName, String phoneNumber, String roomNumber, LocalDate bookingDate) {
        this.infor = infor;
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.bookingDate = bookingDate;
    }

    public Reservation() {
        bookingId = customerName = phoneNumber = roomNumber = "";
    }

    public FlightInformation getInfor() {
        return infor;
    }

    public void setInfor(FlightInformation infor) {
        this.infor = infor;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Reservation{" + "infor=" + infor + ", bookingId=" + bookingId + ", customerName=" + customerName + ", phoneNumber=" + phoneNumber + ", roomNumber=" + roomNumber + ", bookingDate=" + bookingDate.toString() + '}';
    }
    
    
    
}
