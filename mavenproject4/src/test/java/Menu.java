
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class Menu {

    public static int bigMenu() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("-------- LAB211 MENU ---------");
        System.out.println("1. Week 1");
        System.out.println("2. Week 2");
        System.out.println("==============================");
        System.out.print("Input your option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }

    public static int menuWeek1() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Week 1 Program -------");
        System.out.println("1. Letter and character count.");
        System.out.println("2. Linear search.");
        System.out.println("3. Change number base.");
        System.out.println("4. Solve equation.");
        System.out.println("5. Exit program.");
        System.out.println("------------------------------");
        System.out.print("Input your option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }

    public static int menuWeek2() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Week 2 Program -------");
        System.out.println("1. Computer program.");
        System.out.println("2. Calculate perimeter and area.");
        System.out.println("3. Matrix.");
        System.out.println("4. Exit program.");
        System.out.println("------------------------------");
        System.out.print("Input your option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }

}
