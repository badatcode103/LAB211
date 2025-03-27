/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

import java.util.*;

/**
 *
 * @author ASUS
 */

public class Intern extends Candidate {

    private String major, semester, universityName;

    public Intern(String id, String firstName, String lastName, Date birthDate, String address, String phone, String email, String major, String semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, 2);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + " - Intern: " + major + " - " + universityName;
    }
}
