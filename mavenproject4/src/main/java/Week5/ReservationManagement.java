/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import Week1.Validate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Scanner;
import java.time.format.ResolverStyle;

/**
 *
 * @author ASUS
 */
public class ReservationManagement {

    ArrayList<Reservation> reservationList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void inputReservation() {
        System.out.println("*** Create New Reservation ***");
        while (true) {
            System.out.println("ID: ");
            String id = sc.nextLine();
            Validate.validateId(id, sc);
            System.out.println("Name: ");
            String name = sc.nextLine();
            Validate.validateName(name, sc);
            System.out.println("Phone: ");
            String phone = sc.nextLine();
            Validate.validatePhoneNumber(phone, sc);
            System.out.println("Room number: ");
            String roomNum = sc.nextLine();
            Validate.validateRoomNumber(roomNum, sc);
            System.out.println("Booking date: ");
            String dateString = sc.nextLine();
            DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                    .appendPattern("dd/MM/yyyy")
                    .toFormatter()
                    .withResolverStyle(ResolverStyle.STRICT);
            LocalDate date = LocalDate.parse(dateString, formatter);
            Validate.validateDate(LocalDate.now(), date, sc);
            System.out.println("Need airport pick up? (Y/N)");
            String flight = "", seat = "";
            LocalDateTime pickupTime = LocalDateTime.now();
            while (true) {
                String option = sc.nextLine();
                if (option.equals("Y")) {
                    System.out.println("Flight: ");
                    flight = sc.nextLine();
                    System.out.println("Seat: ");
                    seat = sc.nextLine();
                    System.out.println("Time pick up: ");
                    String pickupString = sc.nextLine();
                    DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
                            .appendPattern("dd/MM/yyyy HH/mm")
                            .toFormatter()
                            .withResolverStyle(ResolverStyle.STRICT);
                    pickupTime = LocalDateTime.parse(pickupString, formatter2);
                    while (true) {
                        if (date.isEqual(pickupTime.toLocalDate())) {
                            break;
                        } else {
                            System.out.println("Data input is invalid.");
                            System.out.println("Time pick up: ");
                            pickupString = sc.nextLine();
                            pickupTime = LocalDateTime.parse(pickupString, formatter2);
                        }
                    }
                } else {
                    break;
                }
            }
            FlightInformation fli = new FlightInformation(flight, seat, pickupTime);
            Reservation rsv = new Reservation(fli, id, name, phone, roomNum, date);
            reservationList.add(rsv);
            System.out.println("Information saved successfully.");
        }
    }

    void updateReservation() {
        System.out.println("*** Update reservation ***");
        System.out.println("booking ID: ");
        String id = sc.nextLine();
        boolean check = false;
        while (true) {
            for (Reservation rsv : reservationList) {
                if (id.equals(rsv.getBookingId())) {
                    System.out.println(rsv.toString());
                    System.out.println("If you dont want to change the information, just press enter to skip.");
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    if (!name.isBlank()) {
                        Validate.validateName(name, sc);
                        rsv.setCustomerName(name);
                    }
                    System.out.println("Phone: ");
                    String phone = sc.nextLine();
                    if (!phone.isBlank()) {
                        Validate.validatePhoneNumber(phone, sc);
                        rsv.setPhoneNumber(phone);
                    }
                    System.out.println("Room number: ");
                    String roomNumber = sc.nextLine();
                    if (!roomNumber.isBlank()) {
                        Validate.validateRoomNumber(roomNumber, sc);
                        rsv.setRoomNumber(roomNumber);
                    }
                    System.out.println("Booking date: ");
                    String dateString = sc.nextLine();
                    if (!dateString.isBlank()) {
                        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                                .appendPattern("dd/MM/yyyy")
                                .toFormatter()
                                .withResolverStyle(ResolverStyle.STRICT);
                        LocalDate date = LocalDate.parse(dateString, formatter);
                        Validate.validateDate(LocalDate.now(), date, sc);
                        rsv.setBookingDate(date);
                    }
                    System.out.println("Need airport pick up? (Y/N)");
                    String option = sc.nextLine();
                    if (!option.isBlank()) {
                        System.out.println("Flight number: ");
                        String flight = sc.nextLine();
                        if (!flight.isBlank()) {
                            rsv.getInfor().setFlightNumber(flight);
                        }
                        System.out.println("Seat number: ");
                        String seat = sc.nextLine();
                        if (!seat.isBlank()) {
                            rsv.getInfor().setSeatNumber(roomNumber);
                        }
                        System.out.println("Pick up time: ");
                        String timeString = sc.nextLine();
                        DateTimeFormatter formatter2 = new DateTimeFormatterBuilder()
                                .appendPattern("dd/MM/yyyy HH/mm")
                                .toFormatter()
                                .withResolverStyle(ResolverStyle.STRICT);
                        LocalDateTime pickupTime ;
                        try {
                            if (!timeString.isBlank()) {

                                pickupTime = LocalDateTime.parse(timeString, formatter2);
                                while (true) {
                                    if (rsv.getBookingDate().isEqual(pickupTime.toLocalDate())) {
                                        rsv.getInfor().setTimePickup(pickupTime);
                                        break;
                                    } else {
                                        System.out.println("Data input is invalid.");
                                        System.out.println("Time pick up: ");
                                        timeString = sc.nextLine();
                                        pickupTime = LocalDateTime.parse(timeString, formatter2);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println("Updated!");
                    System.out.println(rsv.toString());
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("No information found.");
                System.out.println("Do you want to find again? (Y/N)");
                String option = sc.nextLine();
                if (option.equals("Y")) {
                    continue;
                } else {
                    break;
                }
            }
        }

    }

    void deleteReservation() {
        System.out.println("*** Delete resetvation");
        System.out.println("ID: ");
        String id = sc.nextLine();
        boolean check = false;
        while (true) {
            for (Reservation rsv : reservationList) {
                if (rsv.getBookingId().equals(id)) {
                    System.out.println(rsv.toString());
                    while (true) {
                        System.out.println("Do you want to delete this reservation? (y/N)");
                        String option = sc.nextLine();
                        if (option.equals("Y")) {
                            reservationList.remove(rsv);
                            break;
                        } else {
                            break;
                        }
                    }
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Can not find reservation.");
                System.out.println("Do you want to try again? (Y/N)");
                String option = sc.nextLine();
                if (option.equals("Y")) {
                    continue;
                } else {
                    break;
                }
            }
        }
    }

    void printFlightInformation() {
        System.out.println("*** Flight information ***");
        System.out.println("Booking ID - Name - Phone number - Flight number - Seat number - Time pick up");
        for (Reservation rsv : reservationList) {
            System.out.println(rsv.getBookingId() + " - " + rsv.getCustomerName() + " - "
                    + rsv.getPhoneNumber() + " - " + rsv.getInfor().getFlightNumber() + " - "
                    + " - " + rsv.getInfor().getSeatNumber() + " - " + rsv.getInfor().getTimePickup());
        }

    }

    void printAll() {
        System.out.println("*** Reservation Information ***");
        for (Reservation rsv : reservationList) {
            System.out.println(rsv.toString());
        }
    }
}
