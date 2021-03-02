/*Простая база данных построенная на основе списков свойств, нука нука, интересно!*/
package com.swvalerian.javacore.module01.chapter18;

import javax.crypto.spec.PSource;
import java.io.*;
import java.util.Properties;
import java.util.Set;

public class List25AtPage650storeload {
    public static void main(String[] args) {
        Properties ht = new Properties();
        // однако мы такое не проходили...
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = null;
        String number = null;
        FileInputStream fIn = null;
        boolean changed = false;

        // попытка открыть файл phonebook.dat
        try {
            fIn = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // игнорирую отсутствие файла
        }

        /*Если телефонная книга существует, тогда загрузим телефонные номера в список свойств*/
        try {
            if (fIn != null) {
                ht.load(fIn);
                fIn.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла!");
        }

        do {
            System.out.println("Enter name (exit for exit): ");
            try {
                name = bufferedReader.readLine(); // читаем из консоли
            } catch (IOException e) {
                // пусто
            }
            if (name.equalsIgnoreCase("exit")) continue;
            System.out.println("Enter number: ");
            try {
                number = bufferedReader.readLine();
            } catch (IOException e) {
                // ignore
            }
            ht.put(name, number);
            changed = true;
        }   while (!name.equalsIgnoreCase("exit"));

        // если телефонная книга изменилась - надо её сохранить в файл.
        if (changed) {
            try {
                FileOutputStream fOut = new FileOutputStream("phonebook.dat");
                ht.store(fOut, "Телефонная книга");
                fOut.close();
            } catch (IOException e) {
                System.out.println("Ошибка записи в файл");
            }
        }

        // ищу номер по имени абонента
        do {
            System.out.println("Enter name for search (exit for exit): ");
            try {
                name = bufferedReader.readLine();
            } catch (IOException e) {
                // ignore
            }

            if (name.equalsIgnoreCase("exit")) continue;

            // выведем весь телефонный справочник
            if (name.equalsIgnoreCase("list")) {
                Set<?> keySet = ht.keySet();
                System.out.println("Список абонентов: ");
                for (Object tel : keySet) {
                    System.out.println(tel + " : " + ht.getProperty((String) tel));
                }
            }
            number = ht.getProperty(name);
            System.out.println("Абонент - " + name + " Номер телефона: " + number);
        }   while (!name.equalsIgnoreCase("exit"));

    }
}
