/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    
    

    OfflineCourse inputCourse() {
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
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            System.out.println("Input begin date(dd/MM/yyyy): ");
            String beginString = sc.nextLine();
            LocalDate begin = LocalDate.parse(beginString, formatter);
            System.out.println("Input end date(dd/MM/yyyy): ");
            String endString = sc.nextLine();
            LocalDate end = LocalDate.parse(beginString, formatter);
            System.out.println("Input campus: ");
            String campus = sc.nextLine();
            if (campus == null || campus.trim().isEmpty()) {
                throw new InputMismatchException("Campus can't be null.");
            }
            System.out.println("Input teacher name: ");
            String teacherName = sc.nextLine();
            if (teacherName == null || teacherName.trim().isEmpty()) {
                throw new InputMismatchException("Teacher name can't be null.");
            }
            if(checkTime(end, begin)!=true){
                System.out.println("End day must after begin day.");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return new OfflineCourse( begin,  end,  campus,  teacherName, courseId, name, credits);
    }
    
    boolean checkTime(LocalDate time1, LocalDate time2){
        return time1.isAfter(time2);
    }

}
