/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 *
 * @author ASUS
 */
public class OfflineCourse extends Course {
    private LocalDate begin, end;
    private String campus, teacherName;

    public OfflineCourse(LocalDate begin, LocalDate end, String campus, String teacherName, String courseId, String name, Double credits) {
        super(courseId, name, credits);
        this.begin = begin;
        this.end = end;
        this.campus = campus;
        this.teacherName = teacherName;
    }

    public OfflineCourse() {
        super();
        this.begin = null;
        this.end = null;
        this.campus = "";
        this.teacherName = "";
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public OfflineCourse inputCourse() {
        String courseId = "", name = "", campus = "", teacherName = "";
        Double credits = 0.0;
        LocalDate begin = null, end = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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

            System.out.println("Input begin date (dd/MM/yyyy): ");
            String beginString = sc.nextLine().trim();
            begin = parseDate(beginString, formatter);

            System.out.println("Input end date (dd/MM/yyyy): ");
            String endString = sc.nextLine().trim();
            end = parseDate(endString, formatter);

            if (!checkTime(begin, end)) {
                throw new InputMismatchException("End date must be after begin date.");
            }

            System.out.println("Input campus: ");
            campus = sc.nextLine().trim();
            if (campus.isEmpty()) {
                throw new InputMismatchException("Campus can't be empty.");
            }

            System.out.println("Input teacher name: ");
            teacherName = sc.nextLine().trim();
            if (teacherName.isEmpty()) {
                throw new InputMismatchException("Teacher name can't be empty.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return new OfflineCourse(begin, end, campus, teacherName, courseId, name, credits);
    }

    private LocalDate parseDate(String dateString, DateTimeFormatter formatter) {
        try {
            return LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            throw new InputMismatchException("Invalid date format. Please use dd/MM/yyyy.");
        }
    }

    boolean checkTime(LocalDate begin, LocalDate end) {
        return end.isAfter(begin);
    }
}
