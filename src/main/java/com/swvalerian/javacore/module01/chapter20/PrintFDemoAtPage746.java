package com.swvalerian.javacore.module01.chapter20;

public class PrintFDemoAtPage746 {
    public static void main(String[] args) {
        System.out.println("разные целочисленные форматы:");
        System.out.printf("%d %(d %+d %06d\n", 3, -3, 3, 3);
        System.out.println("формат чисел с плавающей точкой");
        System.out.printf("%.2f", 6.0078); // две цифры после запятой выводим тока, вот так форматируем вывод длинных чисел
    }
}
