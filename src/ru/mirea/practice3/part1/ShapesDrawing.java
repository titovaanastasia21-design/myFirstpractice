package ru.mirea.practice3.part1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ShapesDrawing extends JPanel {
    private Random random = new Random();

    // Метод, который отвечает за рисование
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Очищаем фон

        for (int i = 0; i < 20; i++) {
            // Случайные координаты (от 0 до 400)
            int x = random.nextInt(400);
            int y = random.nextInt(400);
            int size = random.nextInt(50) + 10; // Размер от 10 до 60

            // Случайный цвет
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));

            // Случайно выбираем: круг или квадрат
            if (random.nextBoolean()) {
                g.fillOval(x, y, size, size); // Круг
            } else {
                g.fillRect(x, y, size, size); // Квадрат
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("20 случайных фигур");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Добавляем нашу панель с рисунком в окно
        frame.add(new ShapesDrawing());
        frame.setVisible(true);
    }
}