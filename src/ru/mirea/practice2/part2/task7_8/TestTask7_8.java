package ru.mirea.practice2.part2.task7_8;

public class TestTask7_8 {
    public static void main(String[] args) {
        // Создаем общий массив, как в части 1
        Printable[] items = {
                new Book("Война и мир"),
                new Magazine("Хакер"),
                new Book("Java для начинающих"),
                new Magazine("Форбс")
        };

        System.out.println(" Вывод только книг ");
        Book.printBooks(items); // Вызываем статический метод из класса Book

        System.out.println("\n Вывод только журналов ");
        Magazine.printMagazines(items); // Вызываем статический метод из класса Magazine
    }
}