/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import com.sun.source.tree.ContinueTree;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.ResolverStyle;

/**
 *
 * @author ASUS
 */
public class CourseManagement {

    ArrayList<Course> courseList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void inputAll() {
        System.out.println("*** Add new course ***");
        System.out.println("Online course(O) or Offline course(F)");
        String option = "";

        option = sc.nextLine();
        chooseCourseCheck(option);

        if (option.equals("O")) {
            OnlineCourse course = new OnlineCourse();
            course = course.inputCourse();
            if (checkRepeat(course) == false) {
                System.out.println("Error, course name or course ID already exist.");
            } else {
                courseList.add(course);
            }
        }
        if (option.equals("F")) {
            OfflineCourse course = new OfflineCourse();
            course = course.inputCourse();
            if (checkRepeat(course) == false) {
                System.out.println("Error, course name or course ID already exist.");
            } else {
                courseList.add(course);
            }
        }
    }

    void chooseCourseCheck(String option) {
        while (true) {
            if (option.equals("O") || option.equals("F")) {
                break;
            } else {
                System.out.println("Data input is invalid.");
                System.out.println("Online course(O) or Offline course(F)");
                option = sc.nextLine();
            }
        }
    }

    boolean checkRepeat(Course c) {
        boolean check = true;
        for (Course o : courseList) {
            if (c instanceof OnlineCourse) {
                if (c.getCourseId().equalsIgnoreCase(o.getCourseId())) {
                    check = false;
                    return check;
                }
                if (c.getName().equalsIgnoreCase(o.getName())) {
                    check = false;
                    return check;
                }
            }
        }
        return check;
    }

    void updateCourse() {
        System.out.println("*** Update Course ***");
        while (true) {
            System.out.println("Course ID: ");
            String courseId = sc.nextLine();
            for (Course o : courseList) {
                if (courseId.equalsIgnoreCase(o.getCourseId())) {
                    System.out.println("***Search results***");
                    if (o instanceof OnlineCourse) {
                        updateOnlineCourse((OnlineCourse) o);
                    }
                    if (o instanceof OfflineCourse) {
                        updateOfflineCOurse((OfflineCourse) o);
                    }
                } else {
                    System.out.println("Can not find course. Do you want to try again? (Y/N): ");
                    String option = sc.nextLine();
                    if (option.equalsIgnoreCase("y")) {
                        continue;
                    } else if (option.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            }
        }

    }

    void updateOnlineCourse(OnlineCourse o) {
        System.out.println("Course ID: " + o.getCourseId());
        System.out.println("Course name: " + o.getName());
        System.out.println("Course credits: " + o.getCredits());
        System.out.println("Platform: " + o.getPlatform());
        System.out.println("Instructors: " + o.getInstructor());
        System.out.println("Note: " + o.getNote());
        System.out.println("***Updating***");
        System.out.println("Attention: enter empty ì you don't want to change it.");
        System.out.println("Course ID: ");
        String id = sc.nextLine();
        if (id != null || id.trim() != null) {
            o.setCourseId(id);
        }
        System.out.println("Course name: ");
        String name = sc.nextLine();

        if (name != null || name.trim() != null) {
            o.setName(name);
        }
        System.out.println("Course credits: ");
        Double credits = sc.nextDouble();
        sc.nextLine();
        if (credits <= 0) {
            throw new InputMismatchException("Credits must greater than 0.");
        }
        if (credits != null) {
            o.setCredits(credits);
        }
        System.out.println("Platform: ");
        String platform = sc.nextLine();
        if (platform != null || platform.trim() != null) {
            ((OnlineCourse) o).setPlatform(platform);
        }
        System.out.println("Instructor: ");
        String instructor = sc.nextLine();
        if (instructor != null || instructor.trim() != null) {
            ((OnlineCourse) o).setInstructor(instructor);
        }
        System.out.println("Note: ");
        String note = sc.nextLine();
        if (note != null || note.trim() != null) {
            ((OnlineCourse) o).setNote(note);
        }
        System.out.println("Updated successfully");
    }

    void updateOfflineCOurse(OfflineCourse o) {
        System.out.println("Course ID: " + o.getCourseId());
        System.out.println("Course name: " + o.getName());
        System.out.println("Course credits: " + o.getCredits());
        System.out.println("Begin: " + ((OfflineCourse) o).getBegin());
        System.out.println("End: " + ((OfflineCourse) o).getEnd());
        System.out.println("Teacher Name: " + ((OfflineCourse) o).getTeacherName());
        System.out.println("***Updating***");
        System.out.println("Attention: enter empty ì you don't want to change it.");
        System.out.println("Course ID: ");
        String id = sc.nextLine();
        if (id != null || id.trim() != null) {
            o.setCourseId(id);
        }
        System.out.println("Course name: ");
        String name = sc.nextLine();
        if (name != null || name.trim() != null) {
            o.setName(name);
        }
        System.out.println("Course credits: ");
        Double credits = sc.nextDouble();
        sc.nextLine();
        if (credits != null) {
            o.setCredits(credits);
        }
        while (true) {
            try {
                System.out.println("Alert: end must greater than begin.");
                System.out.println("Begin: ");
                String beginString = sc.nextLine();
                if (beginString != null || beginString.trim() != null) {
                    DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                            .appendPattern("dd/MM/uuuu") 
                            .toFormatter()
                            .withResolverStyle(ResolverStyle.STRICT);
                    LocalDate begin = LocalDate.parse(beginString, formatter);
                    ((OfflineCourse) o).setBegin(begin);
                }
                System.out.println("End: ");
                String endString = sc.nextLine();
                if (endString != null || endString.trim() != null) {
                    DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                            .appendPattern("dd/MM/uuuu")
                            .toFormatter()
                            .withResolverStyle(ResolverStyle.STRICT);
                    LocalDate end = LocalDate.parse(beginString, formatter);
                    ((OfflineCourse) o).setEnd(end);
                }
            } catch (Exception e) {
                System.out.println("Data input is invalid. End must greater than begin.");
            }

            if (((OfflineCourse) o).checkTime(((OfflineCourse) o).getEnd(), ((OfflineCourse) o).getBegin()) == true) {
                break;
            }
        }
        System.out.println("Teacher name: ");
        String teacherName = sc.nextLine();
        if (teacherName != null || teacherName.trim() != null) {
            ((OfflineCourse) o).setTeacherName(teacherName);
        }
        System.out.println("Campus: ");
        String campus = sc.nextLine();
        if (campus != null || campus.trim() != null) {
            ((OfflineCourse) o).setCampus(campus);
        }
        System.out.println("Updated successfully");
    }

    void deleteCourse() {
        System.out.println("*** Delete course ***");
        while (true) {
            System.out.println("Course ID: ");
            String courseId = sc.nextLine();
            boolean check = false;
            for (Course c : courseList) {
                if (courseId.equals(c.getCourseId())) {
                    courseList.remove(c);
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("No course found, do you want to try again? (Y/N) ");
                String option = sc.nextLine();
                if (option.equals("Y")) {
                    continue;
                } else if (option.equals("N")) {
                    break;
                }
            }
        }
    }

    void printCourse(String option) {
        if (option.equals("1")) {
            for (Course c : courseList) {
                if (c instanceof OnlineCourse) {
                    System.out.println(((OnlineCourse) c).toString());
                }
                if (c instanceof OfflineCourse) {
                    System.out.println(((OfflineCourse) c).toString());
                }
            }
        }
        if (option.equals("2")) {
            for (Course c : courseList) {
                if (c instanceof OnlineCourse) {
                    System.out.println(((OnlineCourse) c).toString());
                }
            }
        }
        if (option.equals("3")) {
            for (Course c : courseList) {
                if (c instanceof OfflineCourse) {
                    System.out.println(((OfflineCourse) c).toString());
                }
            }
        }
    }

    void searchCourse() {
        System.out.println("*** Search Course ***");
        while (true) {
            System.out.println("Course name: ");
            String name = sc.nextLine();
            boolean check = false;
            for (Course c : courseList) {
                if (c.getName().equals(name)) {
                    System.out.println(c.toString());
                    break;
                }
            }
            if (!check) {
                System.out.println("Course not found. Do you want to try again! (Y/N)");
                String option = sc.nextLine();
                if(option.equals("Y")){
                    continue;
                }else if(option.equals("N")){
                    break;
                }
            }
        }
    }
}
