// демонстрация обобщенного функционального интерфейса и работа с разнотипными лямбда выражениями
package com.swvalerian.javacore.module01.chapter15;

public class SomeFuncTAtPage447 {
    interface SomeFunc<T> {
        T value(T elem);
    }
    public static void main(String[] args) {
        SomeFunc<Integer> doubleD = d -> d*d;
        System.out.println("Дубль числа 5 = " + doubleD.value(5));

        SomeFunc<String> reverseString = s -> {
            String result = "";
            for (int i = s.length()-1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };

        System.out.println(reverseString.value("!ьтахыдто ямерв ен еще он ,киндзарП яндогеС ?алед как ,тевирП"));

    }
}
