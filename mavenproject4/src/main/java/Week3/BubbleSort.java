/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;

import java.util.Random;

/**
 *
 * @author ASUS
 */
public class BubbleSort {

    private int arr[];

    public BubbleSort(int length) {
        this.arr = new int[length];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void generateArray() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length);
        }
    }

    public void bubbleSort2(BubbleSort b) {
        int[] arr = b.getArr(); 
        boolean check;
        
        for (int i = 0; i < arr.length; i++) {
            check = false;
            for (int j = 0; j < arr.length - i; j++) {
                if(j+1 == arr.length){
                    break;
                }
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) {
                break;
            }
        }
    }

    public void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

//    public void bubbleSort() {
//        
//        while (true) {
//            int count = 0;
//            for (int i = 0; i < arr.length - 1; i++) {
//                if (arr[i] <= arr[i + 1]) {
//                    count++;
//                } else {
//                    int temp;
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            if (count == (arr.length - 1)) {
//                break;
//            }
//        }
//        
//        System.out.println("");
//    }
