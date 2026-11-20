package ru.mirea.practice2.part2.task5_6; // 1

public class TestTask5_6 {               // 2
    public static void main(String[] args) { // 3
        ProcessStrings processor = new ProcessStrings(); // 4
        String text = "ПриветМир";       // 5

        System.out.println("Исходная строка: " + text); // 6
        System.out.println("Кол-во символов: " + processor.countChars(text)); // 7
        System.out.println("Нечетные позиции: " + processor.oddChars(text)); // 8
        System.out.println("Реверс: " + processor.reverse(text)); // 9
    }                                    // 10
}                                        // 11