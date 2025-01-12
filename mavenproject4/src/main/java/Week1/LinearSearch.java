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
    
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    public LinearSearch() {
        System.out.println("Enter number of array");
        int length = scanner.nextInt();
        this.array = new int[length];
    }
    
    public void generateArray(){
        for(int i=0; i< array.length; i++){
            this.array[i] = random.nextInt(array.length);
        }
    }
    
    public void displayArray(){
        for(int i = 0; i < array.length;i++){
            System.out.print(array[i] + "  ");
        }
    }
    
    public void searchNumber(){
        System.out.println("Enter search value: ");
        int number = scanner.nextInt();
        displayArray();
        for(int i = 0; i<array.length; i++){
            if(number == array[i]){
                System.out.println("Found " + number + " at " + i);
            }
        }
        
    }
}
