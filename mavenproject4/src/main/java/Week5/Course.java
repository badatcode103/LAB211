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
public class Course {

    protected String courseId, name;
    protected Double credits;

    public Course(String courseId, String name, Double credits) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
    }

    public Course() {
        courseId = "";
        name = "";
        credits = 0.0;
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

    Course inputCourse() {
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
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new Course(courseId, name, credits);
    }
}
