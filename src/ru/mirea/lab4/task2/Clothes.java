package ru.mirea.lab4.task2;

public abstract class Clothes {
    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "размер=" + size + " (евро " + size.getEuroSize() + ", " + size.getDescription() + ")"
                + ", цена=" + cost + " руб."
                + ", цвет=" + color;
    }
}