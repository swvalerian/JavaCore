package com.swvalerian.javacore.module01.chapter10;

public class AtPage284MultiCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] val = {1,2,3};

        try {
            // a = a / b; // коментарий убираем и срабатывает первое исключение, иначе - второе
            val[5] = b;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // в одном операторе описаны два исключения
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
        System.out.println("После блока трай-кеч");
    }
}
