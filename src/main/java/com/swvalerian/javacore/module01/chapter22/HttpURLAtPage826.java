package com.swvalerian.javacore.module01.chapter22;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLAtPage826 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://world.mist-game.ru");

        HttpURLConnection urlcon = (HttpURLConnection) url.openConnection(); // преобразуем подкласс от класса

        // выводим метод запроса
        System.out.println("метод запроса: " + urlcon.getRequestMethod());

        // выводим код ответа
        System.out.println("код ответа: " + urlcon.getResponseCode());
        // выводим ответное сообщение
        System.out.println("ответное сообщение было такое: " + urlcon.getResponseMessage());

        System.out.println();
        // получить списко полей и множество ключей из заголовка
        Map<String, List<String>> headerMap = urlcon.getHeaderFields();
        Set<String> headerFields = headerMap.keySet();
        for (String key : headerFields) {
            System.out.println("<Ключ>: " + key + "--- <Значение>: " + headerMap.get(key));
        }
        // вывести все ключи и значения из заголовка

        System.out.println("\nДальнейший код не работает\n");
        // почему то это неработает
        InputStream in = urlcon.getInputStream();

        int cont;

        while ((cont = in.read()) != -1) {
            System.out.print((char) cont);
        }
    }
}
