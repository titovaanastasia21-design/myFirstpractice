package ru.mirea.practice2.part1.task11;
public class FahrenheitConverter implements Convertable {
    public double convert(double c) { return (c * 9/5) + 32; }
}