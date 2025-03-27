
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
    
    public static int menuWeek3() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Week 3 Program -------");
        System.out.println("1. Bubble sort.");
        System.out.println("2. Quick sort.");
        System.out.println("3. Binary search.");
        System.out.println("4. Stack.");
        System.out.println("5. Exit program.");
        System.out.println("------------------------------");
        System.out.print("Input your option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }
    
    public static int menuCourseWeek5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Course management ***");
        System.out.println("1. ADD online/ offline course.");
        System.out.println("2. Update course.");
        System.out.println("3. Delete course.");
        System.out.println("4. Print all/ online course/ offline course.");
        System.out.println("5. Search information base on course name.");
        System.out.println("6. Exit.");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }
    
    public static int menuWorkerWeek6(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("======= Worker Program =======");
        System.out.println("1. Add worker.");
        System.out.println("2. Adjust salary.");
        System.out.println("3. Display salary information.");
        System.out.println("4. exit program.");
        System.out.println("------------------------------");
        System.out.println("Input you option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }
    public static int menuWeek6(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("======= WEEK6 MENU =======");
        System.out.println("1. Worker management program.");
        System.out.println("2. Contact management program.");
        System.out.println("3. Exit program.");
        System.out.println("------------------------------");
        System.out.println("Input you option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }
    
    public static int menuContactWeek6(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("======= Contact program =======");
        System.out.println("1. Add contact.");
        System.out.println("2. Display contact.");
        System.out.println("3. Delete contact.");
        System.out.println("4. exit program.");
        System.out.println("------------------------------");
        System.out.println("Input you option: ");
        String option = sc.nextLine();
        return Integer.parseInt(option);
    }

}
