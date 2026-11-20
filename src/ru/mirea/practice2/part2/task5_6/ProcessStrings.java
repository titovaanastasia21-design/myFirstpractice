package ru.mirea.practice2.part2.task5_6; // 1

public class ProcessStrings implements StringProcessor { // 2

    @Override                                // 3
    public int countChars(String s) {        // 4
        return s.length();                   // 5
    }                                        // 6

    @Override                                // 7
    public String oddChars(String s) {       // 8
        StringBuilder result = new StringBuilder(); // 9
        for (int i = 0; i < s.length(); i += 2) {   // 10
            result.append(s.charAt(i));             // 11
        }                                           // 12
        return result.toString();                   // 13
    }                                               // 14

    @Override                                       // 15
    public String reverse(String s) {               // 16
        return new StringBuilder(s).reverse().toString(); // 17
    }                                               // 18
}                                                   // 19