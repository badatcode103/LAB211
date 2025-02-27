/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;


import java.time.LocalDateTime;

/**
 *
 * @author ASUS
 */
public class FlightInformation {
    private String flightNumber, seatNumber;
    private LocalDateTime timePickup;

    public FlightInformation(String flightNumber, String seatNumber, LocalDateTime timePickup) {
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
        this.timePickup = timePickup;
    }

    public FlightInformation() {
        flightNumber = seatNumber = "";
        timePickup = LocalDateTime.now();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public LocalDateTime getTimePickup() {
        return timePickup;
    }

    public void setTimePickup(LocalDateTime timePickup) {
        this.timePickup = timePickup;
    }
    
    
    
}
