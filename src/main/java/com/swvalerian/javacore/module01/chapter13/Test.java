package com.swvalerian.javacore.module01.chapter13;

public class Test {
    public static void main(String[] args) {
        System.err.println("Вот это да!" + " ошибка");

        int b;
        b = 'A';
        System.out.write(b);
        System.out.write(270);
        System.out.write('\n'); // без перевода строки - не выведется символ, почему!?
    }
}
