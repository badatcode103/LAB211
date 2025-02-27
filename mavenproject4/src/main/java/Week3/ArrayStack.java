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
public class ArrayStack{
    private int capacity;
    private int lastIndex;
    
    class Node{
        int data ;
        public Node(int x){
            data = x;
        }    
    }
    Node[] arrayNode;  
    
    public ArrayStack( int capacity){
        this.arrayNode = new Node[capacity];
        this.lastIndex = -1;
        this.capacity = capacity;
    }
    
    public ArrayStack(){
        this(5);
    }
    
    boolean isEmpty(){
        return lastIndex == -1;
    }
    
    boolean isFull(){
        return lastIndex == capacity - 1;
    }
    
    public void push(int x){
        if(isFull()){
            increaseCapa();
        }
        arrayNode[++lastIndex] = new Node(x);
    }
    
    
    void increaseCapa(){
        int newCapacity = capacity*2;
        Node[] newArrayNode = new Node[newCapacity];
        System.out.println("");
        System.arraycopy(arrayNode, 0, newArrayNode, 0, capacity);
        arrayNode = newArrayNode;
        capacity = newCapacity;
    }
    
    void traverse(){
        
        for(Node n : arrayNode){
            System.out.print(n.data + " ");
        }
    }
    
    Node pop(){
        // Node pNode = arrayNode[lastIndex];
        // lastIndex--;
        // return pNode;
        return arrayNode[lastIndex--];
    }
    
    public static void main(String[] args) {
        
    }
}
