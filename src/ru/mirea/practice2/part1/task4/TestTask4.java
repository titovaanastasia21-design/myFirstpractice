package ru.mirea.practice2.part1.task4;
public class TestTask4 {
    public static void main(String[] args) {
        Priceable c = new Car(2500000);
        System.out.println("Цена: " + c.getPrice());
    }
}