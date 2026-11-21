package ru.mirea.practice3.part2;

public class TestCircle {
    public static void main(String[] args) {
        // Проверяем статическую переменную ДО создания объектов
        System.out.println("До создания объектов: " + Circle.numberOfObjects);

        // Создаем первый круг
        Circle c1 = new Circle(5.0);
        System.out.println("После создания c1: " + Circle.numberOfObjects);

        // Создаем второй круг
        Circle c2 = new Circle(10.0);
        System.out.println("После создания c2: " + Circle.numberOfObjects);

        // Создаем третий круг
        Circle c3 = new Circle(15.0);
        System.out.println("После создания c3: " + Circle.numberOfObjects);

        // Посмотрим на площади (это обычные методы экземпляра)
        System.out.println("Площадь c1: " + c1.getArea());
        System.out.println("Площадь c2: " + c2.getArea());
    }
}