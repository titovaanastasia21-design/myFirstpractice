package ru.mirea.practice3.part2;

public class Circle {
    // Обычная переменная (у каждого круга своя)
    private double radius;

    // СТАТИЧЕСКАЯ переменная (ОДНА на весь класс)
    public static int numberOfObjects = 0;

    public Circle(double radius) {
        this.radius = radius;
        // При создании нового круга увеличиваем общий счетчик
        numberOfObjects++;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}