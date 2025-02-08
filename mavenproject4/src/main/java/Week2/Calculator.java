/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Calculator {

    private Scanner sc = new Scanner(System.in);
    
    public Calculator(Scanner sc){
        this.sc = sc;
    }

    public int menu() {
        System.out.println("======= Calculator Progaram =======");
        System.out.println("1. Normal calculator.");
        System.out.println("2. BMI calculator.");
        System.out.println("3. Exit.");
        return sc.nextInt();
    }

    public void normalCalculator() {
        System.out.println("----- Normal Calculator -----");
        double memory = 0, number, temp;
        String operator;
        while (true) {
            number = enterAndValidateNumber();
            temp = number;
            while (true) {
                System.out.println("Enter operator");
                operator = sc.nextLine();
                if (validateOperator(operator)) {
                    break;
                } else {
                    System.out.println("Input again.");
                }
            }
            switch (operator) {
                case "+":
                    number = enterAndValidateNumber();
                    memory = number + temp;
                    System.out.println("Memory: " + memory);
                    break;
                case "-":
                    number = enterAndValidateNumber();
                    memory = temp - number;
                    System.out.println("Memory: " + memory);
                    break;
                case "*":
                    number = enterAndValidateNumber();
                    memory = number * temp;
                    System.out.println("Memory: " + memory);
                    break;
                case "/":
                    number = enterAndValidateNumber();
                    try {
                        memory = temp / number;
                    } catch (ArithmeticException e) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    break;
                case "^":
                    number = enterAndValidateNumber();
                    memory = Math.pow(temp, number);
                    System.out.println("Memory: " + memory);
                    break;
                case "=":
                    System.out.println("Result: " + memory);
                    return;
            }
        }
    }

    public void calculateBMI() {
        System.out.println("----- BMI Calculator -----");
        System.out.print("Enter Weight(kg): ");
        double weight = enterAndValidateNumber();
        System.out.print("Enter Height(cm): ");
        double height = enterAndValidateNumber();
        double bmi = 0;
        height = height / 100;
        if (height != 0) {
            bmi = weight / (Math.pow(height, 2));
        } else {
            System.out.println("Height cannot be zero.");
            return;
        }
        System.out.println("BMI Numebr: " + bmi);
        if (bmi < 19) {
            System.out.println("Under-standard: BMI is less than 19");
        }
        if (bmi >= 19 && bmi < 25) {
            System.out.println("Standard: BMI is between 19-25");
        }
        if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight: BMI is between 25-30");
        }
        if (bmi >= 30 && bmi < 40) {
            System.out.println("Fat - should lsoe weight: BMI is between 30 - 40");
        }
        if (bmi > 40) {
            System.out.println("Very fat - should lose weight immediatly: BMI is over 40");
        }
    }

    boolean validateOperator(String op) {
        boolean result = false;
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^") || op.equals("=")) {
            result = true;
        }
        return result;
    }

    double enterAndValidateNumber() {
        double number;
        while (true) {
            System.out.print("Enter number: ");
            try {
                number = sc.nextDouble();
                sc.nextLine();
                return number;
            } catch (InputMismatchException e) {
                System.out.println("Input again.");
                sc.nextLine();
            }
        }
    }

    public void run() {
        while (true) {
            int choice = menu();
            sc.nextLine();
            switch (choice) {
                case 1:
                    normalCalculator();
                    break;
                case 2:
                    calculateBMI();
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    return;
            }
        }
    }
}
