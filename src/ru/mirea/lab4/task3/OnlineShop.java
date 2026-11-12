package ru.mirea.lab4.task3;

import java.util.List;
import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        Cart cart = new Cart();

        // --- 1. Аутентификация ---
        System.out.println("=== Вход в магазин ===");
        User user = new User("admin", "1234");

        boolean loggedIn = false;
        for (int attempt = 1; attempt <= 3; attempt++) {
            System.out.print("Логин: ");
            String login = sc.nextLine();
            System.out.print("Пароль: ");
            String password = sc.nextLine();

            if (user.getLogin().equals(login) && user.checkPassword(password)) {
                System.out.println("Добро пожаловать, " + login + "!");
                loggedIn = true;
                break;
            } else {
                System.out.println("Неверный логин или пароль. Попытка " + attempt + " из 3.");
            }
        }

        if (!loggedIn) {
            System.out.println("Доступ запрещён. Выход.");
            return;
        }

        // --- 2. Главное меню ---
        while (true) {
            System.out.println("\n=== Меню ===");
            System.out.println("1. Каталоги товаров");
            System.out.println("2. Корзина");
            System.out.println("3. Купить");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    shop.showCategories();
                    System.out.print("Выберите номер каталога: ");
                    int catNum = readInt(sc);
                    if (catNum == -1) continue;

                    Category category = shop.getCategoryByNumber(catNum);
                    if (category == null) {
                        System.out.println("Такого каталога нет.");
                        continue;
                    }

                    List<Product> products = shop.getProductsByCategory(category);
                    System.out.println("=== " + category.getTitle() + " ===");
                    if (products.isEmpty()) {
                        System.out.println("В этом каталоге пока нет товаров.");
                        continue;
                    }
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }

                    System.out.print("Введите номер товара для добавления в корзину (или 0 для отмены): ");
                    int pnum = readInt(sc);
                    if (pnum > 0 && pnum <= products.size()) {
                        cart.add(products.get(pnum - 1));
                    }
                    break;

                case "2":
                    cart.show();
                    break;

                case "3":
                    cart.checkout();
                    break;

                case "0":
                    System.out.println("До свидания!");
                    sc.close();
                    return;

                default:
                    System.out.println("Неверная команда.");
            }
        }
    }

    // Вспомогательный метод для безопасного ввода чисел
    private static int readInt(Scanner sc) {
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите число.");
            return -1;
        }
    }
}