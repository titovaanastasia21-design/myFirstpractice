package ru.mirea.practice2.part3.task1_2_4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;

public class DatesTest {
    public static void main(String[] args) {
        // --- ЗАДАНИЕ 1 ---
        // Получаем текущую дату и время
        Date now = new Date();
        System.out.println("Студент: Титова Анастасия"); // Ваше имя
        System.out.println("Время получения задания: " + now);

        // --- ЗАДАНИЕ 2 ---
        // Сравниваем текущую дату с датой, введенной пользователем
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваш год рождения (например, 2005): ");
        int birthYear = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, birthYear);
        Date userDate = cal.getTime();

        // Метод after() проверяет, наступила ли текущая дата позже введенной
        if (now.after(userDate)) {
            System.out.println("Эта дата (год) уже в прошлом.");
        } else {
            System.out.println("Эта дата (год) в будущем.");
        }

        // --- ЗАДАНИЕ 4 ---
        // Создаем объекты Date и Calendar из ввода пользователя
        System.out.print("Введите год, месяц (0-11), день: ");
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print("Введите часы (0-23) и минуты: ");
        int h = sc.nextInt();
        int min = sc.nextInt();

        // Создаем через Calendar (он позволяет менять каждое поле отдельно)
        Calendar customCal = Calendar.getInstance();
        customCal.set(y, m, d, h, min);
        Date customDate = customCal.getTime();

        // Форматируем вывод, чтобы было красиво
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        System.out.println("Вы ввели дату: " + sdf.format(customDate));
    }
}