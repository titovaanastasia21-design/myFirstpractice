package ru.mirea.lab4;

public class TestSeason {
    public static void main(String[] args) {
        // 1. Любимое время года + вся информация
        Season favorite = Season.SUMMER;
        System.out.println("Моё любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemp() + "°C");
        System.out.println("Описание: " + favorite.getDescription());

        System.out.println();

        // 2. Метод switch
        Season.printSeasonMessage(favorite);
        Season.printSeasonMessage(Season.WINTER);

        System.out.println();

        // 6. Цикл по всем временам года
        System.out.println("=== Все времена года ===");
        for (Season s : Season.values()) {
            System.out.println(s.name()
                    + " | температура: " + s.getAverageTemp() + "°C"
                    + " | " + s.getDescription());
        }
    }
}