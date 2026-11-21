package ru.mirea.practice3.part2;

public class StaticTest {

    // Обычная (динамическая) переменная. У каждого круга она своя.
    private double radius;

    // СТАТИЧЕСКАЯ переменная. Она ОДНА на весь класс.
    // Она общая для всех объектов.
    private static int numberOfObjects = 0;

    public StaticTest(double radius) {
        this.radius = radius;
        numberOfObjects++; // При создании нового объекта увеличиваем счетчик
    }

    public static void main(String[] args) {
        System.out.println("До создания объектов: " + StaticTest.numberOfObjects);

        StaticTest c1 = new StaticTest(5.0);
        System.out.println("После создания c1: " + StaticTest.numberOfObjects);

        StaticTest c2 = new StaticTest(10.0);
        StaticTest c3 = new StaticTest(15.0);

        // Обратите внимание: мы обращаемся к статической переменной через ИМЯ КЛАССА
        System.out.println("После создания c2 и c3: " + StaticTest.numberOfObjects);
    }
}