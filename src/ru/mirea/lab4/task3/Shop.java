package ru.mirea.lab4.task3;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products = new ArrayList<>();

    public Shop() {
        // Наполняем магазин товарами при создании
        products.add(new Product("Смартфон", 25000, Category.ELECTRONICS));
        products.add(new Product("Наушники", 3000, Category.ELECTRONICS));
        products.add(new Product("Ноутбук", 60000, Category.ELECTRONICS));
        products.add(new Product("Футболка", 1500, Category.CLOTHING));
        products.add(new Product("Джинсы", 3500, Category.CLOTHING));
        products.add(new Product("Война и мир", 800, Category.BOOKS));
        products.add(new Product("Java для начинающих", 1200, Category.BOOKS));
        products.add(new Product("Хлеб", 50, Category.FOOD));
        products.add(new Product("Молоко", 90, Category.FOOD));
    }

    public void showCategories() {
        System.out.println("=== Каталоги ===");
        for (int i = 0; i < Category.values().length; i++) {
            System.out.println((i + 1) + ". " + Category.values()[i].getTitle());
        }
    }

    public Category getCategoryByNumber(int num) {
        Category[] values = Category.values();
        if (num < 1 || num > values.length) return null;
        return values[num - 1];
    }

    public List<Product> getProductsByCategory(Category category) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getCategory() == category) result.add(p);
        }
        return result;
    }
}