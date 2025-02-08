/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validate {

    public static int enterAndCheckNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            try {
                System.out.println("Enter number: ");
                number = sc.nextInt();
            } catch (MissingFormatArgumentException e) {
                System.out.println("Please enter integer number.");
            }
            System.out.println("number too small, enter again.");
            number = sc.nextInt();
            if (number > 2) {
                break;
            }
        }
        return number;
    }
}
