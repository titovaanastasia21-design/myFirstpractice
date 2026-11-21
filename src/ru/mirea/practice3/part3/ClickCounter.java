package ru.mirea.practice3.part3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickCounter {
    private int count = 0;

    public ClickCounter() {
        JFrame frame = new JFrame("Счетчик кликов");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());

        // Создаем надпись
        JLabel label = new JLabel("Кликов: 0");

        // Создаем кнопку
        JButton button = new JButton("Нажми меня");

        // Добавляем слушатель (Анонимный класс)
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++; // Увеличиваем счетчик
                label.setText("Кликов: " + count); // Обновляем текст
            }
        });

        frame.add(label);
        frame.add(button);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ClickCounter();
    }
}