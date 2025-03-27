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

    public class Fresher extends Candidate {
    private Date graduationDate;
    private String graduationRank, universityName;

    public Fresher(String id, String firstName, String lastName, Date birthDate, String address, String phone, String email, Date graduationDate, String graduationRank, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return super.toString() + " - Fresher: " + graduationRank + " - " + universityName;
    }
}


