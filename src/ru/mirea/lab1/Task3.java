package ru.mirea.lab1;

public class Task3 {
    public static void main(String[] args) {
        // Массив создан с помощью инициализации (как в Си)
        int[] arr = {5, 3, 8, 1, 9, 4, 7, 2, 6, 10};

        int sum = 0;

        // Считаем сумму элементов в цикле for
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Среднее арифметическое (приведение к double, чтобы не потерять дробную часть)
        double average = (double) sum / arr.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}