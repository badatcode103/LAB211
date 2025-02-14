/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SolveEquation {

    Scanner sc = new Scanner(System.in);

    public void calculateEquation() {
        System.out.println("----- Calculate Equation -----");
        double numberA = 0;
        double numberB = 0;
        boolean isValid1 = false;
        boolean isValid2 = false;
        while (!isValid1) {
            System.out.println("Enter A: ");
            String A = sc.nextLine();
            if (isValidNumber(A)) {
                numberA = Double.parseDouble(A);
                isValid1 = true;
            } else {
                System.out.println("Please input number");
            }
        }
        while (!isValid2) {
            System.out.println("Enter B: ");
            String B = sc.nextLine();
            if (isValidNumber(B)) {
                numberB = Double.parseDouble(B);
                isValid2 = true;
            } else {
                System.out.println("Please input number");
            }
        }
        if (numberA == 0 && numberB != 0) {
            System.out.println("Unsolved Equation.");
        }
        if (numberA == 0 && numberB == 0) {
            System.out.println("The equation has infinitely many solutions. ");
        } else {
            System.out.println("Solution: x = " + (double) (-numberB) / numberA);
            double[] arr = new double[2];
            arr[1] = numberB;
            arr[0] = numberA;
            System.out.print("Number is Odd: ");
            for (double n : arr) {
                if (n == (int) n && isOdd(n)) {
                    System.out.print(n + "   ");
                }
            }
            System.out.println("");
            System.out.print("Number is Even: ");
            for (double n : arr) {
                if (n == (int) n && !isOdd(n)) {
                    System.out.print(n + "   ");
                }
            }
            System.out.println("");
            System.out.print("Number is Perfect Square: ");
            for (double n : arr) {
                if (isPerfectSquare(n)) {
                    System.out.print(n + "   ");
                }
            }
        }
    }

    public void calculateQuadraticEquation() {
        System.out.println("----- Claculate Quadratic Equation -----");
        double numberA = 0, numberB = 0, numberC = 0, delta = 0;
        boolean valid1 = false, valid2 = false, valid3 = false;
        while (!valid1) {
            System.out.println("Enter A: ");
            String A = sc.nextLine();
            if (isValidNumber(A)) {
                numberA = Double.parseDouble(A);
                valid1 = true;
            } else {
                System.out.println("Please input number.");
            }
        }
        while (!valid2) {
            System.out.println("Enter B: ");
            String B = sc.nextLine();
            if (isValidNumber(B)) {
                numberB = Double.parseDouble(B);
                valid2 = true;
            } else {
                System.out.println("Please input number.");
            }
        }
        while (!valid3) {
            System.out.println("Enter C: ");
            String C = sc.nextLine();
            if (isValidNumber(C)) {
                numberC = Double.parseDouble(C);
                valid3 = true;
            } else {
                System.out.println("Please input number.");
            }
        }
        delta = Math.pow(numberB, 2) - 4 * numberA * numberC;
        if (delta < 0) {
            System.out.println("Unsolved equation.");
        } else if (delta == 0) {
            System.out.println("The equation has one solution" + " x1 = x2 = " + -numberB / (2 * numberA) );
        } else {
            double x1 = (-numberB + Math.sqrt(delta)) / (2 * numberA);
            double x2 = (-numberB - Math.sqrt(delta)) / (2 * numberA);
            System.out.println("Solution x1 = " + x1 + " and x2 = " + x2);
            double[] arr = new double[3];
            arr[0] = numberA;
            arr[1] = numberB;
            arr[2] = numberC;
            System.out.print("Number is Odd: ");
            for (double n : arr) {
                if (n == (int) n && isOdd(n)) {
                    System.out.print(n + "   ");
                }
            }
            System.out.println("");
            System.out.print("Number is Even: ");
            for (double n : arr) {
                if (n == (int) n && !isOdd(n)) {
                    System.out.print(n + "   ");
                }
            }
            System.out.println("");
            System.out.print("Number is PerfectSquare: ");
            for (double n : arr) {
                if (isPerfectSquare(n)) {
                    System.out.print(n + "   ");
                }
            }
            
        }

    }

    public static boolean isValidNumber(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isOdd(double number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPerfectSquare(double number) {
        if (number < 0) {
            return false;
        }
        double temp = Math.sqrt(number);
        return temp == (int) temp;
    }
    
   
}
