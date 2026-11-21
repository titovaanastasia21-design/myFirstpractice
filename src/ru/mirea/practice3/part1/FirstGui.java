package ru.mirea.practice3.part1;

import javax.swing.*;

public class FirstGui {
    public static void main(String[] args) {
        // 1. Создаем окно с заголовком
        JFrame frame = new JFrame("Мое первое окно");

        // 2. Говорим программе: "когда закроешь окно, выключи программу"
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3. Задаем размеры окна (ширина, высота)
        frame.setSize(400, 300);

        // 4. Создаем кнопку с текстом
        JButton button = new JButton("Нажми меня");

        // 5. Добавляем кнопку внутрь окна
        frame.getContentPane().add(button);

        // 6. Делаем окно видимым (без этого оно будет невидимым)
        frame.setVisible(true);
    }
}

