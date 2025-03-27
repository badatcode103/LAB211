/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;
    import java.util.Date;
/**
 *
 * @author ASUS
 */


public class Candidate {
    protected String id, firstName, lastName, phone, email, address;
    protected Date birthDate;
    protected int candidateType;

    public Candidate(String id, String firstName, String lastName, Date birthDate, String address, String phone, String email, int candidateType) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getCandidateType() {
        return candidateType;
    }

    @Override
    public String toString() {
        return String.format("%s - %s - %s - %s", id, getFullName(), phone, email);
    }
}


