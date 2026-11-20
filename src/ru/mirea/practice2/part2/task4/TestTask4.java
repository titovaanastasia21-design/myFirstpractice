package ru.mirea.practice2.part2.task4; // 1

public class TestTask4 {                // 2
    public static void main(String[] args) { // 3
        // Создаем объект нашего класса
        MathFunc math = new MathFunc();      // 4

        // Тестируем возведение в степень (2 в кубе)
        System.out.println("2^3 = " + math.power(2, 3)); // 5

        // Тестируем модуль (3 + 4i)
        System.out.println("Модуль 3+4i = " + math.modulus(3, 4)); // 6

        // Тестируем длину окружности радиуса 5
        System.out.println("Длина окружности R=5: " + math.circleLength(5)); // 7
    }                                        // 8
}                                            // 9