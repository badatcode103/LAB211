/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Week3.BubbleSort;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Week3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array");
        int number = sc.nextInt();
        BubbleSort bs = new BubbleSort(number);
        bs.generateArray(number);
        System.out.print("Unsorted array: ");
        for(int i = 0; i < bs.getArr().length; i++){
            System.out.print(bs.getArr()[i] + " ");
        }
        bs.bubbleSort(bs);
        System.out.print("Sorted array: ");
        for(int i = 0; i < bs.getArr().length; i++){
            System.out.print(bs.getArr()[i] + " ");
        }
        
    }
}
