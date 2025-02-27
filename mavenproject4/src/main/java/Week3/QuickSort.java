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
public class QuickSort {

    private int arr[];


    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    
    public QuickSort(int length){
        this.arr = new int[length];
    }
    
    public void generateArray() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(arr.length);
        }
    }


    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public void sort() {
        quickSort(arr, 0, arr.length - 1);
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

//    private int partition2(int[] arr, int head, int tail) {
//        int pivot = head + (head - tail) / 2;
//        int i = tail - 1;
//        
//        for (int j = head; j < tail && j < i; j++) {
//            if (arr[j] >= arr[pivot] && arr[pivot] > arr[i]) {
//                swap(arr, arr[j], arr[i]);
//                i--;
//            }
//        }
//        return i; 
//    }
