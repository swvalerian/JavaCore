package com.swvalerian.javacore.module01.chapter15;

public class lamdaReferenceAtPage454 {
    interface StringFunc {
        String func(String s);
    }

    static class MyStringOps {
        String stringReverse(String str) { // сделать метод статичным, тогда будет работать первый пример
            String result = "";
            int i;
            for (i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }
    }

    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String stroka = "Джава просто бомба, когда ты начинаешь использовать лямбда выражения! ";
        System.out.println("Orirginal = " + stroka);

        // первый пример
        // ниже используется ссылка на стат метод в статическом классе, который реализует функциональный интерфейс.
        // String outStroka = stringOp(MyStringOps::stringReverse, stroka); // чуть мозг не сломал
        // System.out.println("Post Operation = " + outStroka); //
        // тучи рассеиваются, небо проясняется, но ...

        // ... едем дальше
        // ниже демонстрация применения ссылки на метод экземпляра класса!

        // создаем экземпляр
        MyStringOps exemplar = new MyStringOps();
        stroka = stroka + "--- демонстрация работы лямбда выражения как ссылки на метод класса";

        String outStroka = stringOp(exemplar::stringReverse, stroka); // здесь ссылка на метод экземпляра класса MyStringOps
        System.out.println("\n" + outStroka);

    }
}
