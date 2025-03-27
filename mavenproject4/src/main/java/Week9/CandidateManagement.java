/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author ASUS
 */

public class CandidateManagement {

    private ArrayList<Candidate> candidates = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public void addCandidate() {
        System.out.println("Choose candidate type: 1. Experience  2. Fresher  3. Intern");
        int type = Integer.parseInt(scanner.nextLine()) - 1;

        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Birth Date (dd/MM/yyyy): ");
        Date birthDate;
        try {
            birthDate = sdf.parse(scanner.nextLine());
        } catch (ParseException e) {
            System.out.println("Invalid date format.");
            return;
        }
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        if (type == 0) {
            System.out.print("Enter Years of Experience: ");
            int yearsExperience = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Professional Skill: ");
            String proSkill = scanner.nextLine();
            candidates.add(new Experience(id, firstName, lastName, birthDate, address, phone, email, yearsExperience, proSkill));
        } else if (type == 1) {
            System.out.print("Enter Graduation Date (dd/MM/yyyy): ");
            Date graduationDate;
            try {
                graduationDate = sdf.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Invalid date format.");
                return;
            }
            System.out.print("Enter Graduation Rank: ");
            String graduationRank = scanner.nextLine();
            System.out.print("Enter University Name: ");
            String universityName = scanner.nextLine();
            candidates.add(new Fresher(id, firstName, lastName, birthDate, address, phone, email, graduationDate, graduationRank, universityName));
        } else {
            System.out.print("Enter Major: ");
            String major = scanner.nextLine();
            System.out.print("Enter Semester: ");
            String semester = scanner.nextLine();
            System.out.print("Enter University Name: ");
            String universityName = scanner.nextLine();
            candidates.add(new Intern(id, firstName, lastName, birthDate, address, phone, email, major, semester, universityName));
        }
        System.out.println("Candidate added successfully!");
    }

    public void displayAllCandidates() {
        for (Candidate c : candidates) {
            System.out.println(c);
        }
    }

    public void searchCandidate() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("Choose candidate type: 1. Experience  2. Fresher  3. Intern");
        int type = Integer.parseInt(scanner.nextLine()) - 1;

        for (Candidate c : candidates) {
            if (c.getFullName().toLowerCase().contains(name) && c.getCandidateType() == type) {
                System.out.println(c);
            }
        }
    }

    public void run() {
        while (true) {
            System.out.println("\n===== CANDIDATE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Candidate");
            System.out.println("2. View All Candidates");
            System.out.println("3. Search Candidate");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addCandidate();
                    break;
                case "2":
                    displayAllCandidates();
                    break;
                case "3":
                    searchCandidate();
                    break;
                case "4":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
