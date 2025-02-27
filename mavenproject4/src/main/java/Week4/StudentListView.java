/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class StudentListView implements Comparator<Student> {

    StudentList stdList = new StudentList();

    public void createStudent() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Input student name: ");
            String name = sc.nextLine();
            System.out.println("Innput student id: ");
            String id = sc.nextLine();
            System.out.println("Input student semester: ");
            int semester = sc.nextInt();
            System.out.println("Input student course: ");
            String course = sc.nextLine();
            Student newStudent = new Student(id, name, semester, course);
            stdList.addStudent(newStudent);
        }
        while (true) {
            System.out.println("Do you want to continue(Y/N)?");
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("y")) {
                System.out.println("Input student name: ");
                String name = sc.nextLine();
                System.out.println("Innput student id: ");
                String id = sc.nextLine();
                System.out.println("Input student semester: ");
                int semester = sc.nextInt();
                System.out.println("Input student course: ");
                String course = sc.nextLine();
                Student newStudent = new Student(id, name, semester, course);
                stdList.addStudent(newStudent);
            } else if (option.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void showStudent() {
        for (Student s : stdList.getStudentList()) {
            System.out.println(s.toString());
        }
    }

    public Student findStudent() {

        return null;
    }

    public void sortByname() {
        Collections.sort(stdList.getStudentList(), new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareToIgnoreCase(o2.getName());
            }
        });
        System.out.println("Danh sách sinh viên sau khi sắp xếp:");
        showStudent();
    }

    public void findAndSortStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name to search: ");
        String nameSearch = sc.nextLine().trim();

        ArrayList<Student> foundStudents = new ArrayList<>();

        for (Student s : stdList.getStudentList()) {
            if (s.getName().toLowerCase().contains(nameSearch.toLowerCase())) {
                foundStudents.add(s);
            }
        }

        if (foundStudents.isEmpty()) {
            System.out.println("No student found!");
            return;
        }

        foundStudents.sort(Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));

        System.out.println("Found students:");
        for (Student s : foundStudents) {
            System.out.println(s);
        }
    }

    public void updateOrDeleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID to update or delete: ");
        String id = sc.nextLine().trim();

        Student target = null;
        for (Student s : stdList.getStudentList()) {
            if (s.getStudentID().equalsIgnoreCase(id)) {
                target = s;
                break;
            }
        }

        if (target == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.println("Do you want to Update (U) or Delete (D) this student?");
        String choice = sc.nextLine().trim();

        if (choice.equalsIgnoreCase("U")) {
            System.out.println("Enter new name: ");
            target.setName(sc.nextLine());
            System.out.println("Enter new semester: ");
            target.setSemester(sc.nextInt());
            sc.nextLine(); // Clear buffer
            System.out.println("Enter new course: ");
            target.setCourse(sc.nextLine());
            System.out.println("Student updated successfully!");
        } else if (choice.equalsIgnoreCase("D")) {
            stdList.getStudentList().remove(target);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Invalid option!");
        }
    }
    
    public void generateReport() {
    Map<String, Integer> reportMap = new HashMap<>();
    
    for (Student s : stdList.getStudentList()) {
        String key = s.getName() + " | " + s.getName();
        reportMap.put(key, reportMap.getOrDefault(key, 0) + 1);
    }

    System.out.println("Student Report:");
    for (Map.Entry<String, Integer> entry : reportMap.entrySet()) {
        System.out.println(entry.getKey() + " | " + entry.getValue());
    }
}

    @Override
    public int compare(Student o1, Student o2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
