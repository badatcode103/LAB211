/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ManagerEastAsiaCountries {

    public EastAsiaCountries enterCountry(Scanner sc) {
        String code="", name="", terrain="";
        float area = (float) 0;
        try {
            System.out.println("Enter code of country: ");
            code = sc.nextLine();
            System.out.println("Enter name of country: ");
            name = sc.nextLine();
            System.out.println("Enter total Area: ");
            area = sc.nextFloat();
            sc.nextLine();
            System.out.println("Enter terrain of country: ");
            terrain = sc.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
            area = sc.nextFloat();
        }
        return new EastAsiaCountries(terrain, code, name, area);
    }

}
