/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import java.util.Scanner;



/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        CourseManagement cm = new CourseManagement();
        cm.inputAll();
        System.out.println("==========");
        cm.inputAll();
        System.out.println("==========");
        cm.inputAll();
        System.out.println("==========");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        cm.printCourse(option);
    }
}
