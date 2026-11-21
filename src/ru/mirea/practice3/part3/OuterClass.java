package ru.mirea.practice3.part3;

public class OuterClass {
    // Обычная переменная внешнего класса
    private String name = "Внешний класс";

    // Вложенный (внутренний) класс
    public class InnerClass {
        public void printMessage() {
            // Внутренний класс имеет доступ к переменным внешнего!
            System.out.println("Привет из " + name);
        }
    }

    public static void main(String[] args) {
        // 1. Создаем объект внешнего класса
        OuterClass outer = new OuterClass();

        // 2. Создаем объект внутреннего класса (через объект внешнего!)
        OuterClass.InnerClass inner = outer.new InnerClass();

        // 3. Вызываем метод внутреннего класса
        inner.printMessage();
    }
}