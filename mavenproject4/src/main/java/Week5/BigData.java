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

    public void Addition(String num1, String num2) {
        if (Validate.validateStringNumber(num1) == true && Validate.validateStringNumber(num2) == true) {
            String result = "", num3, num4;
            int temp = 0;
            int remember = 0;
            if (num1.length() == num2.length()) {
                int l = num1.length();
                while (l >= 1) {
                    if (l == 1) {
                        temp = (num1.charAt(l - 1) - '0') + (num2.charAt(l - 1) - '0') + remember;
                    } else {
                        temp = (num1.charAt(l - 1) - '0') + (num2.charAt(l - 1) - '0') + remember;
                        if (temp >= 10) {
                            temp = temp % 10;
                            remember = 1;
                        }
                    }
                    result = Integer.toString(temp) + result;
                    
                }
            } else {
                num3 = (num1.length() > num2.length())? num1 : num2;
                if(num3 == num1){
                    num4 = num3.substring(num3.length()-num2.length());
                    int l = num3.length();
                    while(l>=1){
                        temp = (num3.charAt(l-1) - '0') + (num2.charAt(l-1)-'0')+ remember;
                        if(temp >= 10){
                            temp = temp%10;
                            remember = 1;
                        }
                        result = Integer.toString(temp) + result;
                        
                    }
                    num4 = num1.substring(0,num1.length()-num2.length()-1);
                    int temp1 = Integer.parseInt(num4);
                    temp = temp1 + remember;
                    result = Integer.toString(temp) + result;
                }
            }
        }
    }
}
