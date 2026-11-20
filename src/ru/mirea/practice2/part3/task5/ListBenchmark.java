package ru.mirea.practice2.part3.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListBenchmark {
    public static void main(String[] args) {
        int elementsCount = 50000; // Количество элементов для теста

        // 1. Тестируем ArrayList (на основе массива)
        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis(); // Засекаем время
        for (int i = 0; i < elementsCount; i++) {
            arrayList.add(0, i); // Добавляем в НАЧАЛО списка
        }
        long timeArrayList = System.currentTimeMillis() - start;
        System.out.println("ArrayList вставка в начало: " + timeArrayList + " мс");

        // 2. Тестируем LinkedList (на основе связанных узлов)
        List<Integer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();
        for (int i = 0; i < elementsCount; i++) {
            linkedList.add(0, i); // Добавляем в НАЧАЛО списка
        }
        long timeLinkedList = System.currentTimeMillis() - start;
        System.out.println("LinkedList вставка в начало: " + timeLinkedList + " мс");
    }
}