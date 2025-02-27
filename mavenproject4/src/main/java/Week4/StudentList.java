/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class StudentList {
    
    private ArrayList<Student> studentList = new ArrayList();

    public StudentList() {
    }
    
    public void addStudent(Student s){
        studentList.add(s);
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    
    
}
