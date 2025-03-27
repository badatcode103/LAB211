/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */

public class OnlineCourse extends Course {
    private String platform, instructor, note;

    public OnlineCourse(String platform, String instructor, String note, String courseId, String name, Double credits) {
        super(courseId, name, credits);
        this.platform = platform;
        this.instructor = instructor;
        this.note = note;
    }

    public OnlineCourse() {
        super();
        platform = instructor = note = "";
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public OnlineCourse inputCourse() {
        String courseId = "", name = "", platform = "", instructor = "", note = "";
        Double credits = 0.0;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Input course ID: ");
            courseId = sc.nextLine().trim();
            if (courseId.isEmpty()) {
                throw new InputMismatchException("Course ID can't be empty.");
            }

            System.out.println("Input course name: ");
            name = sc.nextLine().trim();
            if (name.isEmpty()) {
                throw new InputMismatchException("Course name can't be empty.");
            }

            System.out.println("Input course credits: ");
            if (!sc.hasNextDouble()) {
                throw new InputMismatchException("Course credits must be a valid number.");
            }
            credits = sc.nextDouble();
            sc.nextLine(); 
            if (credits <= 0.0) {
                throw new InputMismatchException("Course credits must be greater than 0.");
            }

            System.out.println("Input course platform: ");
            platform = sc.nextLine().trim();
            if (platform.isEmpty()) {
                throw new InputMismatchException("Platform can't be empty.");
            }

            System.out.println("Input course instructor: ");
            instructor = sc.nextLine().trim();
            if (instructor.isEmpty()) {
                throw new InputMismatchException("Instructor can't be empty.");
            }

            System.out.println("Input course note: ");
            note = sc.nextLine().trim();
            if (note.isEmpty()) {
                throw new InputMismatchException("Note can't be empty.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return new OnlineCourse(platform, instructor, note, courseId, name, credits);
    }
}
