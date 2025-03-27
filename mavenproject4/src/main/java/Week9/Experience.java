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

    public class Experience extends Candidate {
    private int yearsExperience;
    private String proSkill;

    public Experience(String id, String firstName, String lastName, Date birthDate, String address, String phone, String email, int yearsExperience, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, 0);
        this.yearsExperience = yearsExperience;
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return super.toString() + " - Experience: " + yearsExperience + " years - Skill: " + proSkill;
    }
}


