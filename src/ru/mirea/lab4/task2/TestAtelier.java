package ru.mirea.lab4.task2;

public class TestAtelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1500, "белая"),
                new Pants(Size.L, 3500, "чёрные"),
                new Skirt(Size.S, 2500, "красная"),
                new Tie(Size.XS, 800, "синий"),
                new TShirt(Size.XXS, 900, "детская"),
                new Pants(Size.M, 3200, "серые")
        };

        Atelier.dressWomen(clothes);
        System.out.println();
        Atelier.dressMan(clothes);
    }
}