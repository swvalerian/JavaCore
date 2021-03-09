/*Демонстрация применения функциоанльного интерфейса через реализацию лямбда выражениями и применение лямбад-выражений
* для передачи методу в качестве аргумента*/
package com.swvalerian.javacore.module01.chapter15;

public class LambdaAsArgumAtPage449 {
    interface Func{
        String create(String str);
    }
    static String striptocid(Func func, String string) {
        System.out.println(func.create(string));
        return func.create(string);
    }

    public static void main(String[] args) {
        String stroka = "Лямбда-выражения, это сила языка Джава! Применяй и почувствуй это на себе, мОлодец!";
        System.out.println("Исходная строка, с которой будем проводить эксперименты: ");
        System.out.println(stroka + "\n"); // вывели исходную строку

        // методу передали первым параметром - блочное лямбда выражение, вторым - строку для обработки
        striptocid(str -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        }, stroka);

        Func funcFM = str -> str.toUpperCase(); // создали экземпляр лямбда-выражения и сохранили его по ссылке в funcFM

        striptocid(funcFM, stroka); // вот тут в метод передаем ссылку на экземпляр лямбда выражения - который создали ранее.

        striptocid(str -> str.substring(str.lastIndexOf("," ) + 2), stroka); // здесь же, само лямбда-выражение передается в метод!
        // при этом создается экземпляр фунционального интерфейса Func и конкретно ссылка на вновь созданный обьект (экземпляр класса)
        // передается в качестве аргумента первому параметру метода striptocid
        // Или: код лямбда-выражения, встраиваемый в экземпляр класса передается данному методу.
        // И вот так тоже будет понятно: ЭКЗЕМПЛЯР получаемый в результате вычисления каждого лямбда-выражения,
        // является РЕАЛИЗАЦИЕЙ функционального интерфейса, поэтому каждое из этих выражений, может быть передано
        // в качестве первого аргумента вызываемому методу striptocid

    }
}