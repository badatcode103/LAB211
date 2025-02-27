/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import Week3.BubbleSort;
import Week3.QuickSort;
import Week3.BinarySearch;
import Week3.ArrayStack;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Week3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        while (true) {
            option = Menu.menuWeek3();
            switch (option) {
                case 1 -> {
                    System.out.println("Enter number of array: ");
                    int length = sc.nextInt();
                    BubbleSort bs = new BubbleSort(length);
                    bs.generateArray();
                    System.out.println("Unsorted array: ");
                    bs.printArray();
                    bs.bubbleSort2(bs);
                    System.out.println("Sorted array: ");
                    bs.printArray();
                    break;
                }
                case 2 -> {
                    System.out.println("Enter number of array: ");
                    int length = sc.nextInt();
                    QuickSort qs = new QuickSort(length);
                    qs.generateArray();
                    System.out.println("Unsorted array: ");
                    qs.printArray();
                    qs.sort();
                    System.out.println("Sorted array: ");
                    qs.printArray();
                    break;
                }
                case 3 -> {
                    System.out.println("Enter number of array: ");
                    int length = sc.nextInt();
                    System.out.println("Enter search value: ");
                    int searchVl = sc.nextInt();
                    BinarySearch BS = new BinarySearch(length);
                    BS.generateArray();
                    BS.sortArray();
                    BS.printArray();
                    int result = BS.binarySearch(BS.getArr(), searchVl, 0, length - 1);
                    if (result == -1) {
                        System.out.println("Value not found!");
                    } else {
                        System.out.println("Value found at index: " + result);
                    }
                    break;
                }
                case 4 -> {
                    System.exit(0);
                }
            }
        }
    }
    
}
