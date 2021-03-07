package com.swvalerian.javacore.module01.chapter10;

public class AtPage270MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {1};
            c[42] = 45;
        }   catch (ArithmeticException e) {
            System.out.println("деление на нуль - " + e);
        }   catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ошибка индексации за пределами массива" + e);
        }
        System.out.println("Вышли за пределы блока try/catch");
    }
}
