
import Week2.Calculator;
import Week1.CharacterCount;
import Week1.LinearSearch;
import Week1.ConvertNumber;
import Week1.SolveEquation;
import Week2.Rectangle;
import Week2.Circle;
import Week2.Triangle;
import java.util.Scanner;
import Week2.Matrix;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ASUS
 */
public class Week1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            option = Menu.bigMenu();
            switch (option) {
                case 1 -> { //Chọn week 1 để chạy
                    int option1;
                    while (true) {
                        option1 = Menu.menuWeek1();
                        switch (option1) {
                            case 1 -> {

                                System.out.print("Enter your content: ");
                                String content = sc.nextLine();
                                CharacterCount cc = new CharacterCount(content);
                                cc.countWord();
                                cc.countCharacter();
                                break;
                            }
                            case 2 -> {

                                System.out.print("Enter the number of array: ");
                                int num = sc.nextInt();
                                int[] arr = new int[num];
                                LinearSearch ls = new LinearSearch(arr);
                                ls.generateArray();
                                ls.searchNumber();
                                break;
                            }
                            case 3 -> {
                                ConvertNumber cn = new ConvertNumber();

                                System.out.print("Choose base number input: ");
                                int input = sc.nextInt();
                                sc.nextLine();
                                switch (input) {
                                    case 2 -> {
                                        System.out.print("Choose base number ouput: ");
                                        int output = sc.nextInt();
                                        sc.nextLine();
                                        if (output == 10) {
                                            System.out.print("Input number you want to convert: ");
                                            int biNumber = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Result = " + cn.convertBinaryToDecimal(biNumber));
                                        }
                                        if (output == 16) {
                                            System.out.print("Input number you want to convert: ");
                                            int biNumber = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Result = " + cn.convertBinaryToHexaDecimal(biNumber));
                                        }
                                        break;
                                    }
                                    case 10 -> {
                                        System.out.print("Choose base number ouput: ");
                                        int output = sc.nextInt();
                                        sc.nextLine();
                                        if (output == 2) {
                                            System.out.print("Input number you want to convert: ");
                                            int decNumber = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Result = " + cn.convertDecimalToBinary(decNumber));
                                        }
                                        if (output == 16) {
                                            System.out.print("Input number you want to convert: ");
                                            int decNumber = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Result = " + cn.convertDecimalToHexaDecimal(decNumber));
                                        }
                                        break;
                                    }
                                    case 16 -> {
                                        System.out.print("Choose base number ouput: ");
                                        int output = sc.nextInt();
                                        sc.nextLine();
                                        if (output == 10) {
                                            System.out.print("Input number you want to convert: ");
                                            String hexNumber = sc.nextLine();
                                            sc.nextLine();
                                            System.out.println("Result = " + cn.convertHexaDecimalToDecimal(hexNumber));
                                        }
                                        if (output == 2) {
                                            System.out.print("Input number you want to convert: ");
                                            String hexNumber = sc.nextLine();
                                            sc.nextLine();
                                            System.out.println("Result = " + cn.convertHexaDecimalToBinary(hexNumber));
                                        }
                                        break;
                                    }

                                }
                                break;
                            }
                            case 4 -> {

                                SolveEquation se = new SolveEquation();
                                System.out.println("Input 1 to solve equation and input 2 to solve quadratic equation.");
                                System.out.print("Input your choice: ");
                                int choice = sc.nextInt();
                                sc.nextLine();
                                if (choice == 1) {
                                    se.calculateEquation();
                                } else if (choice == 2) {
                                    se.calculateQuadraticEquation();
                                } else {
                                    System.out.println("Wrong input");
                                    return;
                                }
                                System.out.println("");
                            }
                            default -> {
                                System.out.println("Exit program.");
                                break;
                            }

                        }
                        if (option1 != 1 || option1 != 2 || option1 != 3 || option1 != 4) {
                            break;
                        }
                    }
                }
                // Chọn week 2 program
                case 2 -> {
                    int option2;
                    while (true) {
                        option2 = Menu.menuWeek2();
                        switch (option2) {
                            case 1 -> {
                                
                                break;
                            }
                            case 2 -> {
                                System.out.println("=====Calculator Shape Program=====");
                                System.out.println("Please input side width of Rectangle:");
                                double width = sc.nextDouble();
                                System.out.println("Please input length of Rectangle:");
                                double length = sc.nextDouble();
                                System.out.println("Please input radius of Circle:");
                                double radius = sc.nextDouble();
                                System.out.println("Please input side A of Triangle:");
                                double sideA = sc.nextDouble();
                                System.out.println("Please input side B of Triangle::");
                                double sideB = sc.nextDouble();
                                System.out.println("Please input side C of Triangle:");
                                double sideC = sc.nextDouble();
                                System.out.println("");
                                System.out.println("-----Rectangle-----");
                                Rectangle re = new Rectangle(width, length);
                                System.out.println("Width: " + width);
                                System.out.println("Length: " + length);
                                System.out.println("Area: " + re.getArea(width, length));
                                System.out.println("Perimeter: " + re.getPerimeter(length, width));
                                System.out.println("-----Circle------");
                                System.out.println("Radius: " + radius);
                                Circle c = new Circle(radius);
                                System.out.println("Area: " + c.getArea(radius));
                                System.out.println("Perimeter: " + c.getPerimeter(radius));
                                System.out.println("-----Triangle-----");
                                System.out.println("Side A: " + sideA);
                                System.out.println("Side B: " + sideB);
                                System.out.println("Side C: " + sideC);
                                Triangle tri = new Triangle(sideA, sideB, sideC);
                                System.out.println("Area: " + tri.getArea(sideA, sideB, sideC));
                                System.out.println("Perimeter: " + tri.getPerimeter(sideA, sideB, sideC));

                                break;
                            }
                            case 3 -> {
                                System.out.println("=====Calculator program=====");
                                System.out.println("Addition matrix");
                                System.out.println("Subtraction matrix");
                                System.out.println("Multiplication matrix");
                                System.out.println("Quit");
                                System.out.print("your choice: ");
                                String choice = sc.nextLine();
                                if (choice.equals("1")) {
                                    System.out.println("----- Addition -----");
                                    System.out.print("Enter row matrix 1: ");
                                    int row1 = sc.nextInt();
                                    System.out.print("Enter column matrix 1: ");
                                    int column1 = sc.nextInt();
                                    Matrix matrix1 = new Matrix(row1, column1);
                                    for (int i = 0; i < row1; i++) {
                                        for (int j = 0; j < column1; j++) {
                                            System.out.print("Enter matrix" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                            matrix1.getArr()[i][j] = sc.nextInt();
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.print("Enter row matrix 2: ");
                                    int row2 = sc.nextInt();
                                    System.out.print("Enter column matrix 1: ");
                                    int column2 = sc.nextInt();
                                    Matrix matrix2 = new Matrix(row2, column2);
                                    for (int i = 0; i < row2; i++) {
                                        for (int j = 0; j < column2; j++) {
                                            System.out.print("Enter matrix" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                            matrix2.getArr()[i][j] = sc.nextInt();
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println("----- Result -----");
                                    matrix1.additionMatrix(matrix2);
                                    break;
                                }
                                if (choice.equals("2")) {
                                    System.out.println("----- Subtraction -----");
                                    System.out.print("Enter row matrix 1: ");
                                    int row1 = sc.nextInt();
                                    System.out.print("Enter column matrix 1: ");
                                    int column1 = sc.nextInt();
                                    Matrix matrix1 = new Matrix(row1, column1);
                                    for (int i = 0; i < row1; i++) {
                                        for (int j = 0; j < column1; j++) {
                                            System.out.print("Enter matrix" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                            matrix1.getArr()[i][j] = sc.nextInt();
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.print("Enter row matrix 2: ");
                                    int row2 = sc.nextInt();
                                    System.out.print("Enter column matrix 1: ");
                                    int column2 = sc.nextInt();
                                    Matrix matrix2 = new Matrix(row2, column2);
                                    for (int i = 0; i < row2; i++) {
                                        for (int j = 0; j < column2; j++) {
                                            System.out.print("Enter matrix" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                            matrix2.getArr()[i][j] = sc.nextInt();
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println("----- Result -----");
                                    matrix1.subtractionMatrix(matrix2);
                                    break;
                                }
                                if (choice.equals("3")) {
                                    System.out.println("----- Multiplication -----");
                                    System.out.print("Enter row matrix 1: ");
                                    int row1 = sc.nextInt();
                                    System.out.print("Enter column matrix 1: ");
                                    int column1 = sc.nextInt();
                                    Matrix matrix1 = new Matrix(row1, column1);
                                    for (int i = 0; i < row1; i++) {
                                        for (int j = 0; j < column1; j++) {
                                            System.out.print("Enter matrix" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                            matrix1.getArr()[i][j] = sc.nextInt();
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.print("Enter row matrix 2: ");
                                    int row2 = sc.nextInt();
                                    System.out.print("Enter column matrix 1: ");
                                    int column2 = sc.nextInt();
                                    Matrix matrix2 = new Matrix(row2, column2);
                                    for (int i = 0; i < row2; i++) {
                                        for (int j = 0; j < column2; j++) {
                                            System.out.print("Enter matrix" + "[" + (i + 1) + "]" + "[" + (j + 1) + "]");
                                            matrix2.getArr()[i][j] = sc.nextInt();
                                            sc.nextLine();
                                        }
                                    }
                                    System.out.println("----- Result -----");
                                    matrix1.multiplicationMatrix(matrix2);
                                    break;
                                }
                            }
                        }
                        if (option2 != 1 || option2 != 2 || option2 != 3 ) {
                            break;
                        }
                    }
                }
            }
        }
    }
}
