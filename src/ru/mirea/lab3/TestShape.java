package ru.mirea.lab3;

public class TestShape {
    public static void main(String[] args) {
        // Создаём разные фигуры
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimeter: " + s1.getPerimeter());
        System.out.println("Color: " + s1.getColor());
        System.out.println("Filled: " + s1.isFilled());

        Circle c1 = (Circle) s1;   // downcast
        System.out.println("Radius: " + c1.getRadius());

        Shape s2 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());

        Shape s3 = new Square(6.6);
        System.out.println(s3);
        System.out.println("Area: " + s3.getArea());

        Square sq = (Square) s3;
        System.out.println("Side: " + sq.getSide());
    }
}