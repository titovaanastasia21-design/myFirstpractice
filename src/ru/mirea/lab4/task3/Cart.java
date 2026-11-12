package ru.mirea.lab4.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void add(Product product) {
        items.add(product);
        System.out.println("Товар добавлен в корзину: " + product.getName());
    }

    public void show() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }
        System.out.println("=== Ваша корзина ===");
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
            total += items.get(i).getPrice();
        }
        System.out.println("Итого: " + total + " руб.");
    }

    public void checkout() {
        if (items.isEmpty()) {
            System.out.println("Корзина пуста — нечего покупать.");
            return;
        }
        double total = 0;
        for (Product p : items) total += p.getPrice();
        System.out.println("Покупка оформлена! Сумма: " + total + " руб.");
        items.clear();
    }
}