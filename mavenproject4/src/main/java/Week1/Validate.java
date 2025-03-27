/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import Week6.Contact;
import Week6.SalaryInfo;
import Week6.Worker;
import Week7.Fruit;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

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
            } else {
                break;
            }
        }
    }

    public static void validateRoomNumber(String roomNum, Scanner sc) {
        while (true) {
            if (roomNum.toCharArray().length != 4 && !roomNum.matches("\\d+")) {
                System.out.println("Data input is invalid");
                System.out.println("Room number: ");
                roomNum = sc.nextLine();
            } else {
                break;
            }
        }
    }

    public static void validateDate(LocalDate date1, LocalDate date2, Scanner sc) {
        while (true) {
            if (date1.isBefore(date2)) {
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
            } else {
                break;
            }
        }
    }

    public static boolean validateStringNumber(String number) {
        return (!number.isBlank() && number.matches("\\d+"));
    }

    /* 
    Validation for week6
     */
    //String id, String name, String age,String salary, String workLocation, SalaryInfo salaryInfo
    public static void validateWorker(Worker worker, Scanner sc) {
        boolean check = true;
        while (!check) {
            if (worker.getId().isBlank()) {
                System.out.println("Wrong input for ID " + worker.getId());
                System.out.println("ID: ");
                String newID = sc.nextLine();
                worker.setId(newID);
            } else {
                check = false;
            }
            if (worker.getName().isBlank()) {
                System.out.println("Wrong input for Name" + worker.getName());
                System.out.println("Name: ");
                String newName = sc.nextLine();
                worker.setName(newName);
            } else {
                check = false;
            }
            if (Integer.parseInt(worker.getAge()) > 50 || Integer.parseInt(worker.getAge()) < 18 || worker.getAge().matches("[a-zA-Z]+")) {
                System.out.println("Wrong input for age" + worker.getAge());
                System.out.println("Age: ");
                String newAge = sc.nextLine();
                worker.setAge(newAge);
            } else {
                check = false;
            }
            if (worker.getWorkLocation().isBlank()) {
                System.out.println("Wrong input for work location.Try again.");
                System.out.println("work location: ");
                String newLocation = sc.nextLine();
                worker.setWorkLocation(newLocation);
            } else {
                check = false;
            }
            if ((Integer.parseInt(worker.getSalary())) < 0 || worker.getSalary().matches("[a-zA-Z]+")) {
                System.out.println("Salary can not smaller than 0. Try again.");
                System.out.println("Salary: ");
                String salary = sc.nextLine();
                worker.setSalary(salary);
            } else {
                check = false;
            }
        }
    }

    public static void validateAdjustment(Worker worker, SalaryInfo infor, Scanner sc) {
        while (true) {
            try {
                int newSalary = Integer.parseInt(infor.getSalary());
                int currentSalary = Integer.parseInt(worker.getSalary());

                if (newSalary < 0) {
                    throw new NumberFormatException();
                }

                if (newSalary > currentSalary) {
                    infor.setStatus("UP");
                } else if (newSalary < currentSalary) {
                    infor.setStatus("DOWN");
                } else {
                    infor.setStatus("STABLE");
                }

                worker.setSalaryInfo(infor);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input for salary. Try again.");
                System.out.print("New salary: ");
                infor.setSalary(sc.nextLine());
            }
        }
    }

    public static void validatePhone(Contact c, Scanner sc) {
        String PHONE_REGEX = "^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4}\\s?(x|ext)\\d+)$";
        Pattern PATTERN = Pattern.compile(PHONE_REGEX);
        System.out.println("Checking: " + c.getPhone());
        while (true) {
            if (!PATTERN.matcher(c.getPhone().trim()).matches()) {
                System.out.println("wrong input.");
                System.out.println("Enter phone: ");
                String phone = sc.nextLine();
                c.setPhone(phone);
            } else {
                break;
            }
        }
    }

    /*
    Validation for week 7
     */
    public static void validateFruit(Fruit f, Scanner sc, ArrayList<Fruit> list) {
        boolean check = false;

        for (Fruit o : list) {
            if (o.getId().equals(f.getId())) {
                System.out.println("Fruit ID already exist. Type again.");
                String newID = sc.nextLine();
                f.setId(newID);
                break;
            } else {
                check = true;
            }
        }
        for (Fruit o : list) {
            if (o.getName().equals(f.getName())) {
                System.out.println("Fruit already exist. Do you want to continue? (Y/N) ");
                String option = sc.nextLine();
                if (option.equals("Y")) {
                    String newName = sc.nextLine();
                    f.setName(newName);
                } else {
                    break;
                }
            } else {
                check = true;
            }
        }
        
    }
    
    /*
    Validation for week 8
    */
    void validateCountry(Scanner sc){
        
    }

}
