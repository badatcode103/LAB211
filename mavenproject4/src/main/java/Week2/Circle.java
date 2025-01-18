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
public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter(double a) {
        return Math.PI * 2 * a;
    }

    @Override
    public double getArea(double a) {
        return Math.pow(Math.PI, 2) * a;
    }

    @Override
    public void getResult(double radius) {     
       
        System.out.println("Area: " + getArea(radius));
        System.out.println("Perimeter: " + getPerimeter(radius));

    }

}
