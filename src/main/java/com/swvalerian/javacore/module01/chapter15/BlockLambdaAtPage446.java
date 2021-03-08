package com.swvalerian.javacore.module01.chapter15;

public class BlockLambdaAtPage446 {
    interface Factorial {
        int fac(int f);
    }
    interface ReverseString {
        String reverse(String string);
    }

    public static void main(String[] args) {
        Factorial fac = fff -> {
            int result = 1;
            for (int i = 1; i <= fff; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("ФАКТОРИАЛ числа 3 = " + fac.fac(3));
        System.out.println("ФАКТОРИАЛ числа 5 = " + fac.fac(5));
        System.out.println("ФАКТОРИАЛ числа 7 = " + fac.fac(7));

        String string = "Привет, я строка, демонстрация возможностей лямбда-выражений";
        System.out.println(string.charAt(string.length()-1)); // выведем последний символ

        ReverseString str = strIn -> {
            String result = "";
            for (int i = strIn.length()-1; i >= 0; i--){
                result += strIn.charAt(i);
            }
            return "Каша - " + result + " - Малаша!";
        };
        System.out.println(str.reverse(string));
    }
}
