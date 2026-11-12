package ru.mirea.lab2;

public class TestAuthor {
    public static void main(String[] args) {
        // Создаём автора
        Author author = new Author("Titova Anastasia", "titovaanastasia21@gmail.com", 'F');

        // Проверяем геттеры
        System.out.println("Имя:   " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол:   " + author.getGender());

        // Проверяем toString
        System.out.println("Автор: " + author);

        // Проверяем сеттер email
        author.setEmail("newemail@somewhere.com");
        System.out.println("После изменения почты: " + author);
    }
}