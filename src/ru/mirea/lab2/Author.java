package ru.mirea.lab2;

public class Author {

    // Три private-поля
    private String name;
    private String email;
    private char gender;

    // Конструктор (из UML: +Author(name:String,email:String,gender:char))
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Геттеры (из UML: +getName():String, +getEmail():String, +getGender():char)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Сеттер только для email (из UML: +setEmail(email:String):void)
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}