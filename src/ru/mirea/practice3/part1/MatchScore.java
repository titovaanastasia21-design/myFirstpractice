package ru.mirea.practice3.part1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchScore extends JFrame {
    // Счетчики голов (сделаем их полями класса, чтобы они сохраняли значение)
    private int milanScore = 0;
    private int madridScore = 0;

    // Надписи на экране
    private JLabel resultLabel;
    private JLabel lastScorerLabel;
    private JLabel winnerLabel;

    public MatchScore() {
        // Настройка окна (как в прошлых примерах)
        setTitle("AC Milan vs Real Madrid");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(5, 1)); // Сетка: 5 строк, 1 столбец

        // 1. Создаем надписи
        resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
        lastScorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
        winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);

        // 2. Создаем кнопки
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");

        // 3. СЛУШАТЕЛИ СОБЫТИЙ (Что делать при клике)
        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore++;
                updateUI("AC Milan");
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                updateUI("Real Madrid");
            }
        });

        // 4. Добавляем всё в окно (порядок добавления важен для GridLayout)
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);

        setVisible(true); // Показываем окно
    }

    // Метод для обновления текста на экране
    private void updateUI(String lastScorer) {
        // Меняем текст счета
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        // Меняем текст последнего забившего
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        // Определяем победителя
        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }

    public static void main(String[] args) {
        // Запускаем нашу игру
        new MatchScore();
    }
}