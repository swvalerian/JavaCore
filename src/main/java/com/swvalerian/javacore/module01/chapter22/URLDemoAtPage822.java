package com.swvalerian.javacore.module01.chapter22;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLDemoAtPage822 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://pogoda.mail.ru/prognoz/orenburg/");

        System.out.println("Протокол: " + url.getProtocol());
        System.out.println("Хост: " + url.getHost());

        System.out.println("файл: " + url.getFile());
        System.out.println("Порт: " + url.getPort());
        System.out.println("Полная форма: " + url.toExternalForm());

        // создадим обьект, дабы получить содержимое url
        URLConnection urlc = null;

        try {
            urlc = url.openConnection(); // присоединили ссылку к обьекту

            long data = urlc.getContentLength();
            System.out.println((data == -1) ? "Сведения о длине контента отсутствуют!" : "Длина контента = " + data);

            data = urlc.getDate();
            System.out.println((data == 0) ? "Сведения о дате отсутствуют!" : "Дата создания: " + data);

            System.out.println("Тип содержимого: " + urlc.getContentType());

            // получаем поток ввода
            InputStream urlIn = urlc.getInputStream();

            int read;

            // получаем код страницы и распечатываем его
            while ((read = urlIn.read()) != -1) {
                System.out.print((char) read);
            }

            System.out.println("\n Работа программы завершена успешно! ");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
