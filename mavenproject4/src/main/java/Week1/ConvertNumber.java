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

   
    private Scanner sc = new Scanner(System.in);

    public int convertBinaryToDecimal(int binaryNumber) {
        int decimalNumber = 0; 
        int base = 1;        

        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10; 
            decimalNumber += lastDigit * base; 
            base *= 2; 
            binaryNumber /= 10; 
        }
        return decimalNumber;
    }

    public int convertDecimalToBinary(int decimalNumber) {
        System.out.println("Enter number you want to convert: ");
        decimalNumber = sc.nextInt();
        int binaryNumber = 0;
        int base = 1;
        while (decimalNumber > 0) {
            int lastDigit = decimalNumber % 2;
            binaryNumber += lastDigit * base;
            base = base * 10;
            decimalNumber = decimalNumber / 2;
        }
        return binaryNumber;
    }

    public int convertHexaDecimalToDecimal(String hexaNumber) {     
        int decNumber = 0;
        int base = 1;

        for (int i = hexaNumber.length() - 1; i >= 0; i--) {
            int digit;
            char ch = hexaNumber.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0'; 
            } else if (ch >= 'A' && ch <= 'F') {
                digit = ch - 'A' + 10;
            } else {
                System.out.println("Invalid character in hexadecimal number: " + ch);
                break; 
            }
            decNumber += digit * base;
            base *= 16;
        }
        return decNumber;
    }

    public String convertDecimalToHexaDecimal(int decNumber) {
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
        return builder.reverse().toString();
    }

    public String convertBinaryToHexaDecimal(int binaryNumber) {
        int decimalNumber = convertBinaryToDecimal(binaryNumber);
        return convertDecimalToHexaDecimal(decimalNumber);
    }
    
    public int convertHexaDecimalToBinary(String hexaNumber){
        int decimalNumber = convertHexaDecimalToDecimal(hexaNumber);
        return convertDecimalToBinary(decimalNumber);       
    }
    
    
       
}
