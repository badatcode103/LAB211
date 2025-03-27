/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import Week1.Validate;

/**
 *
 * @author ASUS
 */
public class BigData {

    private String num1;

    public BigData(String number) {
        this.num1 = number;
    }

    public String Addition(String num2) {
        StringBuilder result = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int remember = 0;
        int temp;
        while (i >= 0 || j >= 0 || remember > 0) {
            int digit1 = (i >= 0) ? (num1.charAt(i) - '0') : 0;
            int digit2 = (j >= 0) ? (num2.charAt(j) - '0') : 0;
            temp = digit1 + digit2 + remember;
            result = result.append(temp % 10);
            remember = temp / 10;
            i--;
            j--;
        } 
        return result.reverse().toString();
    }

//    public String Multiplication(String num2) {
//        StringBuilder result = new StringBuilder();
//        
//    }
//    
    public String smallMulti(String number, char c){
        int base = 1;
        int i = number.length()-1;
        StringBuilder result = new StringBuilder();
        int remember = 0, temp = 0;
        while(i>=0 || remember > 0){
           temp = (c-'0')*(number.charAt(i)-'0') + remember;
           result = result.append(temp%10);
           remember = temp/10;
           i--;
        }
        return result.reverse().toString();
    }

}
