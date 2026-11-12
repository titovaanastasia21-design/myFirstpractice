package ru.mirea.lab4;

public enum Season {
    WINTER(-5) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SPRING(10) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    },
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(8) {
        @Override
        public String getDescription() {
            return "Холодное время года";
        }
    };

    private final int averageTemp;

    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    // Базовый метод — переопределяется у каждой константы
    public String getDescription() {
        return "Холодное время года";
    }

    // Задание 1.2 — switch
    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER: System.out.println("Я люблю зиму");  break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето");  break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    @Override
    public String toString() {
        return name() + " (средняя температура: " + averageTemp + "°C)";
    }
}