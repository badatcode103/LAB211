/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author ASUS
 */
public class Matrix {

    private int arr[][];

    public Matrix(int row, int column) {
        this.arr = new int[row][column];
    }

    public int[][] getArr() {
        return arr;
    }

    public void additionMatrix(Matrix m) {
        if (this.arr.length == m.getArr().length && this.arr[0].length == m.getArr()[0].length) {
            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < this.arr[0].length; j++) {
                    System.out.print("[" + this.arr[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("+");
            for (int i = 0; i < m.getArr().length; i++) {
                for (int j = 0; j < m.getArr().length; j++) {
                    System.out.print("[" + m.getArr()[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("=");
            for (int i = 0; i < m.getArr().length; i++) {
                for (int j = 0; j < m.getArr().length; j++) {
                    System.out.print("[" + (m.getArr()[i][j] + this.arr[i][j]) + "]");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Can not add, row or column not equal.");
        }
    }

    public void subtractionMatrix(Matrix m) {
        if (this.arr.length == m.getArr().length && this.arr[0].length == m.getArr()[0].length) {
            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < this.arr[0].length; j++) {
                    System.out.print("[" + this.arr[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("-");
            for (int i = 0; i < m.getArr().length; i++) {
                for (int j = 0; j < m.getArr().length; j++) {
                    System.out.print("[" + m.getArr()[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("=");
            for (int i = 0; i < m.getArr().length; i++) {
                for (int j = 0; j < m.getArr().length; j++) {
                    System.out.print("[" + (m.getArr()[i][j] - this.arr[i][j]) + "]");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Can not sub, row or column not equal.");
        }
    }

    public void multiplicationMatrix(Matrix m) {
        
        if (this.arr[0].length == m.getArr().length) {
            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < this.arr[0].length; j++) {
                    System.out.print("[" + this.arr[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("*");
            for (int i = 0; i < m.getArr().length; i++) {
                for (int j = 0; j < m.getArr().length; j++) {
                    System.out.print("[" + m.getArr()[i][j] + "]");
                }
                System.out.println("");
            }
            System.out.println("=");
            int[][] result = new int[this.arr.length][m.getArr()[0].length];
            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < m.getArr().length; j++) {
                    for (int k = 0; k < this.arr[0].length; k++) {
                        result[i][j] += arr[i][k] * m.getArr()[k][j];
                    }
                }
            }

            for (int i = 0; i < this.arr.length; i++) {
                for (int j = 0; j < m.getArr()[0].length; j++) {
                    System.out.print("[" + (result[i][j]) + "]");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Can not multiply.");
        }
    }
}
