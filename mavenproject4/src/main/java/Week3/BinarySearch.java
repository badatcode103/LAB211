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
public class BinarySearch {

    private int arr[];

    public BinarySearch(int length) {
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

    public void sortArray() {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
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

    public int binarySearch(int[] array, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            //
            if (array[mid] == target) {
                return mid;

            }else if(array[mid] > target){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public void printArray() {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void binarySearch2(int[] arr, int left, int right, int target) {
        if (left > right) {
            System.out.println("Target not found.");
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            System.out.println("Find at index: " + mid);

        }
        if (arr[mid] < target) {
            binarySearch(arr, left, mid + 1, target);
        } else if (arr[mid] > target) {
            binarySearch(arr, mid - 1, right, target);
        }

    }

}
