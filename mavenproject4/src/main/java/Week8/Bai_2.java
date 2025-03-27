/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

/**
 *
 * @author ASUS
 */
public class Bai_2 {

    abstract class Shape {

        abstract double getArea();
    }

    abstract class TwoDimensionalShape extends Shape {
    }

    abstract class ThreeDimensionalShape extends Shape {

        abstract double getVolume();
    }

    static class Circle extends TwoDimensionalShape {

        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public String toString() {
            return "Circle with radius " + radius;
        }
    }

    static class Square extends TwoDimensionalShape {

        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        double getArea() {
            return side * side;
        }

        @Override
        public String toString() {
            return "Square with side " + side;
        }
    }

    static class Sphere extends ThreeDimensionalShape {

        private double radius;

        public Sphere(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return 4 * Math.PI * radius * radius;
        }

        @Override
        double getVolume() {
            return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
        }

        @Override
        public String toString() {
            return "Sphere with radius " + radius;
        }
    }

    static class Tetrahedron extends ThreeDimensionalShape {

        private double side;

        public Tetrahedron(double side) {
            this.side = side;
        }

        @Override
        double getArea() {
            return Math.sqrt(3) * side * side;
        }

        @Override
        double getVolume() {
            return (1.0 / 12) * Math.sqrt(2) * Math.pow(side, 3);
        }

        @Override
        public String toString() {
            return "Tetrahedron with side " + side;
        }
    }

    public class ShapeTest {

        public static void main(String[] args) {
            Shape[] shapes = {
                new Circle(5),
                new Square(4),
                new Sphere(3),
                new Tetrahedron(6)
            };

            for (Shape shape : shapes) {
                System.out.println(shape);
                System.out.println("Area: " + shape.getArea());
                if (shape instanceof ThreeDimensionalShape) {
                    System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
                }
                System.out.println();
            }
        }
    }

}
