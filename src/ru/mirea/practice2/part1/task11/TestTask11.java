package ru.mirea.practice2.part1.task11;
public class TestTask11 {
    public static void main(String[] args) {
        Convertable k = new KelvinConverter();
        System.out.println("25C = " + k.convert(25) + " K");
    }
}