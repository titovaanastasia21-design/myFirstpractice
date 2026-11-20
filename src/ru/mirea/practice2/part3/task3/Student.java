package ru.mirea.practice2.part3.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private Date birthDate;

    // Конструктор
    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Метод, который возвращает дату в нужном формате
    public String getFormattedBirthDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Дата рождения: " + getFormattedBirthDate("dd.MM.yyyy");
    }
}