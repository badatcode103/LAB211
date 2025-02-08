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

    public QuickSort(int length) {
        this.arr = new int[length];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void generateArray(int length) {
        Random random = new Random();
        this.arr = new int[length];
        for (int i = 0; i < length; i++) {
            this.arr[i] = random.nextInt(length);
        }
    }

    public void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Chọn pivot là phần tử cuối
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

    public void sort() {
        quickSort(arr, 0, arr.length - 1);
    }

    public void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
//    public static void main(String[] args) {
//        QuickSort qs = new QuickSort(10);
//        qs.generateArray(10);
//        System.out.println("Mảng trước khi sắp xếp:");
//        qs.printArray();
//
//        qs.sort();
//
//        System.out.println("Mảng sau khi sắp xếp:");
//        qs.printArray();
//    }
