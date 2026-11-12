package ru.mirea.lab3;

public class Circle extends Shape {

    protected double radius;

    // Конструктор по умолчанию
    public Circle() {
        super();               // вызов конструктора Shape()
        this.radius = 1.0;
    }

    // Конструктор с радиусом
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Конструктор полный
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);  // вызов Shape(color, filled)
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", " + super.toString() + "]";
    }
}