package com.swvalerian.javacore.module01.chapter15;

public class VarCaptureAtPage453 {
    interface MyFunc {
        int num(int n);
    }

    public static void main(String[] args) {
        int n = 10;

        MyFunc func = j -> {
            int v = 10 + n + j; // здесь локальная переменная n считается захваченной лямбда выражением и далее в программе ее
            // уже изменять нельзя!
            // n++;
            return v;
        } ;

        System.out.println(func.num(6));
        System.out.println(n);
    }

}
