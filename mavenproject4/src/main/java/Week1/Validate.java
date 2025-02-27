/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
/**
 *
 * @author ASUS
 */
public class Validate {

    public static int enterAndCheckNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Enter number: ");
                number = sc.nextInt();
                if (number < 2) {
                    throw new IllegalArgumentException("error!");
                }

                return number;
            } catch (MissingFormatArgumentException e) {
                System.out.println("Please enter integer number.");
            }
            System.out.println("number too small, enter again.");
            number = sc.nextInt();

        }

    }

    /* 
     Validation for week 5
     */
    public static void validateId(String id, Scanner sc) {
        while (true) {
            if (id.toCharArray().length != 6 && !id.matches("\\d+")) {
                System.out.println("Data input is invalid. ");
                System.out.println("ID: ");
                id = sc.nextLine();
            } else {
                break;
            }
        }
    }

    public static void validateName(String name, Scanner sc) {
        while (true) {
            if (name.matches("[a-zA-Z]+") || !name.matches(".*\\s.*")) {
                System.out.println("Data input is invalid.");
                System.out.println("Name: ");
                name = sc.nextLine();
            } else {
                break;
            }
        }
    }

    public static void validatePhoneNumber(String number, Scanner sc) {
        while (true) {
            if (number.toCharArray().length != 12 && !number.matches("\\d+")) {
                System.out.println("Data input is invalid.");
                System.out.println("Phone Number: ");
                number = sc.nextLine();
            }else{
                break;
            }
        }
    }
    
    public static void validateRoomNumber(String roomNum, Scanner sc){
        while(true){
            if(roomNum.toCharArray().length != 4 && !roomNum.matches("\\d+")){
                System.out.println("Data input is invalid");
                System.out.println("Room number: ");
                roomNum = sc.nextLine();
            }else{
                break;
            }
        }
    }
    
    public static void validateDate(LocalDate date1, LocalDate date2, Scanner sc){
        while(true){
            if(date1.isBefore(date2)){
                System.out.println("Data input is invalid.");
                System.out.println("Booking date: ");
                String date = sc.nextLine();
                DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                        .appendPattern("dd/MM/yyyy")
                        .toFormatter()
                        .withResolverStyle(ResolverStyle.STRICT);
                try {
                    date2 = LocalDate.parse(date, formatter);
                } catch (Exception e) {
                    e.printStackTrace();
                }      
            }else{
                break;
            }
        }
    }
    
    
    public static boolean validateStringNumber(String number){
        return (!number.isBlank() && number.matches("\\d+"));
    }
    
    

}
