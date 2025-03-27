/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

import Week1.Validate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ContactManagement {

    private ArrayList<Contact> contactList = new ArrayList();

    public void addContact(Scanner sc) {
       
        System.out.println("----- Add a contact -----");
        System.out.println("First name: ");
        String firstName = sc.nextLine();
        System.out.println("Last name: ");
        String lastName = sc.nextLine();
        System.out.println("Group : ");
        String group = sc.nextLine();
        System.out.println("Address: ");
        String address = sc.nextLine();
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        int id = contactList.size() + 1;
        String fullName = firstName.trim() + " " + lastName.trim();
        Contact c = new Contact(id, fullName, firstName, lastName, group, address, phone);
        Validate.validatePhone(c, sc);
        contactList.add(c);
        System.out.println("Add successfully.");
    }

    public void displayContact() {
        
        for (Contact c : contactList) {
            System.out.println(c.toString());
        }
    }

    public void deleteContact(Scanner sc) {
        int id;
        while (true) {
            try {
                System.out.println("Input ID: ");
                id = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("ID must be integer.");
            }
        }
        boolean check = false;
        for (Contact c : contactList) {
            if (c.getId() == id) {
                contactList.remove(c);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Can not find contact.");
        } else {
            System.out.println("Delete successfully.");
        }
    }

}
