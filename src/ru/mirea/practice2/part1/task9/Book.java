package ru.mirea.practice2.part1.task9;
public class Book implements Printable {
    private String name;
    public Book(String name) { this.name = name; }
    public void print() { System.out.println("Книга: " + name); }
}