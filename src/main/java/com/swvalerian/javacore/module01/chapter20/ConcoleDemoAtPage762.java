package com.swvalerian.javacore.module01.chapter20;

import java.io.Console;

public class ConcoleDemoAtPage762 {
    public static void main(String[] args) {
        String str;
        Console con;

        // получаем ссылку на консоль
        con = System.console();

        if (con == null) {
            System.out.println("консоль недоступна");
            return;
        } // если консоль недоступан - выйти из программы

        str = con.readLine("Введите строку");
        con.printf("Вот что вышло" + str);
        con.flush();
        con.printf("Вот что вышло" + str);
    }
}
