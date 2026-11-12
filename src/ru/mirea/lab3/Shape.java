package ru.mirea.lab3;

public abstract class Shape {

    // protected-поля (в UML обозначаются '#')
    protected String color;
    protected boolean filled;

    // Конструктор по умолчанию
    public Shape() {
        this.color = "blue";
        this.filled = false;
    }

    // Конструктор с параметрами
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Геттеры/сеттеры
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Абстрактные методы — без тела
    public abstract double getArea();

    public abstract double getPerimeter();

    // toString
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}