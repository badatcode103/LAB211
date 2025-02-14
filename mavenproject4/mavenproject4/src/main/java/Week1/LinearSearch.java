/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LinearSearch {

    private int[] array;

    private Scanner scanner = new Scanner(System.in);

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public void generateArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            this.array[i] = random.nextInt(50);
        }
    }

    public void displayArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public void searchNumber() {
        System.out.print("Enter search value: ");
        System.out.println("");
        int number = scanner.nextInt();
        displayArray();
        System.out.println("");
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("Found " + number + " at " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Number not found");
            
        }
    }
}
