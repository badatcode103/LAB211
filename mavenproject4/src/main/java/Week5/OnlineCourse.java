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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCredits() {
        return credits;
    }

    public void setCredits(Double credits) {
        this.credits = credits;
    }
    
    

    OnlineCourse inputCourse() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Input course ID: ");
            String courseId = sc.nextLine();
            if (courseId == null || courseId.trim().isEmpty()) {
                throw new InputMismatchException("Course ID can't be null.");
            }
            System.out.println("Input course name: ");
            String name = sc.nextLine();
            if (name == null || name.trim().isEmpty()) {
                throw new InputMismatchException("Course name can't be null.");
            }
            System.out.println("Input course credits: ");
            Double credits = sc.nextDouble();
            sc.nextLine();
            if (credits < 0.0) {
                throw new InputMismatchException("Course credits must greater than 0.");
            }
            System.out.println("Input course platform: ");
            String platform = sc.nextLine();
            if (platform == null || platform.trim().isEmpty()) {
                throw new InputMismatchException("Platform can't be null.");
            }
            System.out.println("Input course instructor: ");
            String instructor = sc.nextLine();
            if (instructor == null || instructor.trim().isEmpty()) {
                throw new InputMismatchException("Instructor can't be null.");
            }
            System.out.println("Input course note: ");
            String note = sc.nextLine();
            if (note == null || note.trim().isEmpty()) {
                throw new InputMismatchException("Note can't be null.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return new OnlineCourse(platform, instructor, note, courseId, name, credits);
    }

}
