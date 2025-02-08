/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week3;
import java.util.Stack;
/**
 *
 * @author ASUS
 */
public class MyStack{
    private Stack<Integer> stackValues;

    public MyStack() {
        this.stackValues = new Stack<>();
    }

   
    public void push(int value) {
        stackValues.push(value);
        System.out.println("Pushed: " + value);
    }

   
    
    public int pop() {
        if (!stackValues.isEmpty()) {
            int value = stackValues.pop();
            System.out.println("Popped: " + value);
            return value;
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

   
    public int get() {
        if (!stackValues.isEmpty()) {
            return stackValues.peek();
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }
}
