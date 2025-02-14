/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author ASUS
 */
public class Triangle extends Shape{
    private double sideA, sideB, sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }
    
    

    @Override
    public double getArea(double sideA, double sideB, double sideC) {
        double p = (sideA + sideB + sideC)/2;
        double temp = p*(p - sideA)*(p - sideB)*(p - sideC);       
        return Math.sqrt(temp);
                
    }

    @Override
    public double getPerimeter(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC ;
    }

    @Override
    public void getResult(double a, double b, double c) {
        
        System.out.println("Area: " + getArea(a,b,c));
        System.out.println("Perimeter: " + getPerimeter(a,b,c));
    }
    
    
    
}
