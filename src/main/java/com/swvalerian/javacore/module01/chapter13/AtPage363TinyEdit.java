package com.swvalerian.javacore.module01.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtPage363TinyEdit {
    public static void main(String[] args) throws IOException {
        // Создаю поток ввода типа BufferedReader используя стандартный поток ввода System.in
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));

        String[] stringArray = new String[100];
        System.out.println("Введите строки текста: (введите стоп для завершения)");
        for (int i=0; i < stringArray.length; i++) {
            stringArray[i] = breader.readLine(); // записываем строки в массив строк
            if (stringArray[i].equalsIgnoreCase("стоп")) {
                break;
            }
        }

        for (int i=0; i < stringArray.length; i++) {
            if (stringArray[i].equalsIgnoreCase("стоп")) {
                break;
            }
            System.out.println("Содержимое вашего файла: " + stringArray[i]);
        }
    }
}
