/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Rectangle extends Shape {
    
    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    
    

    @Override
    public double getPerimeter(double l, double w) {
        return (w + l)*2;
    }

    @Override
    public double getArea(double l, double w) {
        return w*l;
    }

    @Override
    public void getResult(double width , double length) {     
        
        System.out.println("Area: " + getArea(length,width));
        System.out.println("Perimeter: " + getPerimeter(length,width));

    }

    
    
    
}
