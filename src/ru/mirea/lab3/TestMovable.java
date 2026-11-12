package ru.mirea.lab3;

public class TestMovable {
    public static void main(String[] args) {

        // Проверка MovablePoint
        MovablePoint p = new MovablePoint(0, 0, 2, 3);
        System.out.println("Точка до: " + p);
        p.moveRight();
        p.moveUp();
        System.out.println("Точка после right+up: " + p);

        System.out.println();

        // Проверка MovableCircle
        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);
        System.out.println("Круг до: " + c);
        c.moveRight();
        c.moveDown();
        System.out.println("Круг после right+down: " + c);

        System.out.println();

        // Проверка MovableRectangle
        MovableRectangle r = new MovableRectangle(0, 10, 10, 0, 2, 2);
        System.out.println("Прямоугольник до: " + r);
        r.moveRight();
        r.moveUp();
        System.out.println("Прямоугольник после right+up: " + r);

        System.out.println();

        // Прямоугольник с разными скоростями — движение должно не сработать
        MovableRectangle bad = new MovableRectangle(0, 0, 5, 5, 1, 2);
        System.out.println("Плохой прямоугольник: " + bad);
        bad.moveRight();   // должно вывести сообщение об ошибке
    }
}