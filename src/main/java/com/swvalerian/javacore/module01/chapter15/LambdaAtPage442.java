package com.swvalerian.javacore.module01.chapter15;

import javax.crypto.spec.PSource;

public class LambdaAtPage442 {

    interface MyNumber {
        double getValue();
    }

    interface NumericTest {
        boolean test(int n);
    }

    interface NumericTest2 {
        int test(int i, int j);
    }

    public static void main(String[] args) {
        MyNumber myNumber; // обьявил ссылку на функциональный интерфейс

        myNumber = () -> 123.45;

        System.out.println("понимаю пока что: " + myNumber.toString());
        System.out.println("понимаю пока что: " + myNumber.getValue());

        // вот так можно инициализировать лямбду выражение
        MyNumber my = new MyNumber() {
            @Override
            public double getValue() {
                return Math.random() * 100;
            }
        };
        System.out.println(my.getValue());

        // и вот так можно в одном месте обьявить и инициализировать лямбда выражение.. сам догадался, как и пример выше
        MyNumber my2 = () -> 987.654;
        System.out.println(my2.getValue());;

        my2 = () -> Math.random() * 25; // переопределяем метод в интерфейсе, с помощью лямбда выражения
        System.out.println(my2.getValue());

        NumericTest nc = n -> n > 0;
        int value = 12;
        if (nc.test(value)) {
            System.out.println("Число " + value + " положительное");
        } else {
            if (value != 0) {
                System.out.println("Число " + value + " отрицательное");
                return;
            }
            System.out.println("Число ноль");
        }

        // переопределим метод в интерфейсе, создадим другой экземпляр класса с помощью лямбда выражения
        nc = n -> (n % 2) == 0; // проверим число на четность

        if (nc.test(value)) {
            System.out.println("Число " + value + " четное!");
        } else {
            System.out.println("Число " + value + " НЕ четное!");
        }

        NumericTest2 summa; // обьявление ссылки на абстрактный функциональный метод
        summa = (a, b) -> a * b; // реализация метода с помощью лямбда выражения. Инициализация экземпляра от АИ

        System.out.println("результат умножения = " + summa.test(5,6));

    }
}
