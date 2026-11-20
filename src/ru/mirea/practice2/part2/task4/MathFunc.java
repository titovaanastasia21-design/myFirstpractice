package ru.mirea.practice2.part2.task4; // 1

public class MathFunc implements MathCalculable { // 2

    @Override                                      // 3
    public double power(double base, double exp) { // 4
        return Math.pow(base, exp);                // 5
    }                                              // 6

    @Override                                      // 7
    public double modulus(double real, double imag) { // 8
        return Math.sqrt(real * real + imag * imag);  // 9
    }                                              // 10

    // Свой дополнительный метод (не из интерфейса)
    public double circleLength(double radius) {    // 11
        return 2 * PI * radius;                    // 12
    }                                              // 13
}                                                  // 14