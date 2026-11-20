package ru.mirea.practice2.part2.task7_8;

public class Book implements Printable {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Книга: " + name);
    }

    // Задание 8: Статический метод для вывода только книг
    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                System.out.println("Книга: " + ((Book) item).name);
            }
        }
    }
}