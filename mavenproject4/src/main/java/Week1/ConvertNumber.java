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
public class ConvertNumber {

    private int number;
    Scanner sc = new Scanner(System.in);

    public void convertBinaryToDecimal() {
        System.out.println("Enter number you want to convert: ");
        number = sc.nextInt();
        int decimalNumber = 0; 
        int base = 1;        

        while (number > 0) {
            int lastDigit = number % 10; 
            decimalNumber += lastDigit * base; 
            base *= 2; 
            number /= 10; 
        }
        System.out.println(decimalNumber);
    }

    public void convertDecimalToBinary() {
        System.out.println("Enter number you want to convert: ");
        number = sc.nextInt();
        int binaryNumber = 0;
        int base = 1;
        while (number > 0) {
            int lastDigit = number % 2;
            binaryNumber += lastDigit * base;
            base = base * 10;
            number = number / 2;
        }
        System.out.println(binaryNumber);
    }

    public void convertHexaDecimalToDecimal() {
        System.out.println("Enter number you want to convert: ");
        String hexaNumber = sc.nextLine().toUpperCase(); 
        int decNumber = 0;
        int base = 1;

        for (int i = hexaNumber.length() - 1; i >= 0; i--) {
            int digit;

            char ch = hexaNumber.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0'; 
            } else if (ch >= 'A' && ch <= 'F') {
                digit = ch - 'A' + 10; // Ký tự A-F
            } else {
                System.out.println("Invalid character in hexadecimal number: " + ch);
                return; 
            }

            decNumber += digit * base;
            base *= 16;
        }

        System.out.println("Decimal number: " + decNumber);
    }

    public void convertDecimalToHexaDecimal() {
        System.out.println("Enter number your want to convert: ");
        int decNumber = sc.nextInt();
        String hexNumber;
        StringBuilder builder = new StringBuilder();
        while (decNumber > 0) {
            int digit = decNumber % 16;
            if (digit >= 0 && digit <= 9) {
                builder.append((char) ('0' + digit)); 
            } else {
                builder.append((char) ('A' + (digit - 10))); 
            }
            decNumber = decNumber / 16;
        }
        hexNumber = builder.toString();
        System.out.println(hexNumber);
    }

    public void convertBinaryToHexaDecimal() {

        System.out.println("Enter binary number you want to convert: ");
        int biNumber = sc.nextInt();

        int decimalNumber = 0;
        int base = 1;

        while (number > 0) {
            int lastDigit = number % 10;
            decimalNumber += lastDigit * base;
            base *= 2;
            number /= 10;
        }
        String hexNumber;
        StringBuilder builder = new StringBuilder();
        while (decimalNumber > 0) {
            int digit = decimalNumber % 16;
            if (digit >= 0 && digit <= 9) {
                builder.append((char) ('0' + digit));
            } else {
                builder.append((char) ('A' + (digit - 10)));
            }
            decimalNumber = decimalNumber / 16;
        }
        hexNumber = builder.toString();
        System.out.println(hexNumber);

    }
    
    public void convertHexaDecimalToBinary(){
        System.out.println("Enter hexa number you want to convert: ");
        String hexaNumber = sc.nextLine().toUpperCase(); 
        int decimalNumber = 0;
        int base1 = 1;

        for (int i = hexaNumber.length() - 1; i >= 0; i--) {
            int digit;

            char ch = hexaNumber.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0'; 
            } else if (ch >= 'A' && ch <= 'F') {
                digit = ch - 'A' + 10; // Ký tự A-F
            } else {
                System.out.println("Invalid character in hexadecimal number: " + ch);
                return; 
            }

            decimalNumber += digit * base1;
            base1 *= 16;
        }
        int binaryNumber = 0;
        int base2 = 1;
        while (number > 0) {
            int lastDigit = number % 2;
            binaryNumber += lastDigit * base2;
            base2 = base2 * 10;
            number = number / 2;
        }
        System.out.println(binaryNumber);
        
    }
}
