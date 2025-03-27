/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

/**
 *
 * @author ASUS
 */
public class Contact {

    private String fullName, group, address, phone, lastName, firstName;
    private int id;

    public Contact(int id, String fullName, String firstName, String lastName, String group, String address, String phone) {
        this.fullName = fullName;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%-5d %-25s %-15s %-15s %-10s %-25s %-20s",
                id, fullName, firstName, lastName, group, address, phone);
    }

}
