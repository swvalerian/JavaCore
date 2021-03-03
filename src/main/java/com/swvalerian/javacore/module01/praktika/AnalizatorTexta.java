/*
Реализовать анализатор текста, который принимает строку и проверяет,
что у нее закрыты все открытые скобки вот корректная строка - "[({})]"
"[({})" - не корректно!

*/

package com.swvalerian.javacore.module01.praktika;

import java.util.Arrays;
import java.util.Scanner;

public class AnalizatorTexta {
    public static void main(String[] args) {
        int[] aOfBrackets;
        String[] aText;
        String text;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку, со скобками вида [({})] ");
        // [(строк}а для {]примера) ну и по желанию эксперементируе(м
        text = sc.nextLine();

        aText = text.split("");
        System.out.println("Длина строки: " + aText.length + " символов");

        // инициализация массива
        aOfBrackets = new int[6];

        for (int i = 0; i < aText.length; i++){
            switch (aText[i]) {
                case "[" : ++aOfBrackets[0];
                    break;
                case "(" : ++aOfBrackets[1];
                    break;
                case "{" : ++aOfBrackets[2];
                    break;
                case "]" : ++aOfBrackets[3];
                    break;
                case ")" : ++aOfBrackets[4];
                    break;
                case "}" : ++aOfBrackets[5];
                    break;
            }
        }

        // отладочная информация - можно стереть
        System.out.println("\n[ = " + aOfBrackets[0] + "штук");
        System.out.println("( = " + aOfBrackets[1] + "штук");
        System.out.println("{ = " + aOfBrackets[2] + "штук");
        System.out.println("] = " + aOfBrackets[3] + "штук");
        System.out.println(") = " + aOfBrackets[4] + "штук");
        System.out.println("} = " + aOfBrackets[5] + "штук");
        //

        if ((aOfBrackets[0] == aOfBrackets[3]) && (aOfBrackets[1] == aOfBrackets[4]) && (aOfBrackets[2] == aOfBrackets[5])) {
            System.out.println("Всё в порядке, все открытые скобки соотвествуют закрытым!");
        }
        else
        {
            System.out.println("Ошибка! Не все открытые скобки - закрыты!");
        }
    }
}
