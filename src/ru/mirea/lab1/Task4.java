package ru.mirea.lab1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Ввод размера массива
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();

        // 2. Ввод самих элементов
        int[] arr = new int[n];
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Сумма через while
        int sumWhile = 0;
        int i = 0;
        while (i < arr.length) {
            sumWhile += arr[i];
            i++;
        }

        // 4. Сумма через do while
        int sumDo = 0;
        int j = 0;
        if (arr.length > 0) {
            do {
                sumDo += arr[j];
                j++;
            } while (j < arr.length);
        }

        // 5. Поиск min и max
        int min = arr[0];
        int max = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < min) min = arr[k];
            if (arr[k] > max) max = arr[k];
        }

        // 6. Вывод результата
        System.out.println("Сумма (while):    " + sumWhile);
        System.out.println("Сумма (do while): " + sumDo);
        System.out.println("Минимум:          " + min);
        System.out.println("Максимум:         " + max);

        sc.close();
    }
}