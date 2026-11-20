package ru.mirea.practice2.part1.task9;
public class Magazine implements Printable {
    private String name;
    public Magazine(String name) { this.name = name; }
    public void print() { System.out.println("Журнал: " + name); }
}