package ru.mirea.practice2.part1.task9;
public class TestTask9 {
    public static void main(String[] args) {
        Printable[] items = { new Book("Война и мир"), new Magazine("Хакер") };
        for (Printable item : items) {
            item.print();
        }
    }
}