package ru.mirea.lab1;

public class Task7 {

    // Метод для вычисления факториала
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Точка входа — здесь проверяем работу метода
    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
}