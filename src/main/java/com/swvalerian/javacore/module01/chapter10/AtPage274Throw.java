package com.swvalerian.javacore.module01.chapter10;

public class AtPage274Throw {
    public static void main(String[] args) {
        try {
            demoEx();
        }   catch (NullPointerException e) {
            System.out.println("вот что повторно поймал: " + e);
        }
    }

    static void demoEx(){
        try {
            throw new NullPointerException("демонстрация"); // сам сгенерировал исключение
        }   catch (NullPointerException e) { // отловил исключение
            System.out.println("Исключение перехвачено в теле метода demoEx: " + e.getMessage());
            throw e; // повторно сгенерировал исключение
        }

    }
}
