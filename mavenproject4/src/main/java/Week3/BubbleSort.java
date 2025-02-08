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

    public void generateArray(int length) {
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(length);
        }
        this.arr = array;
    }

    public void bubbleSort(BubbleSort b) {
        int[] arr = b.getArr();
        while (true) {
            int count = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] <= arr[i + 1]) {
                    count++;
                } else {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if (count == (arr.length - 1)) {
                break;
            }
        }
        b.setArr(arr);
        System.out.println("");
    }

    public void bubbleSort2(BubbleSort b) {
        int[] arr = b.getArr();
        int count = 0;
        boolean check = false;
        int l = arr.length;
        for (int i = 0; i < arr.length; i++) {
            check = true;   
            for(int j = 0; j < l -1 && check!=true; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            l--;
            count++;
            }
        }
    }

}
