package ru.mirea.practice2.part2.task7_8;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Журнал: " + name);
    }

    // Задание 7: Статический метод для вывода только журналов
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Magazine) {
                System.out.println("Журнал: " + ((Magazine) item).name);
            }
        }
    }
}