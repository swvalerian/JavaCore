package com.swvalerian.javacore.module01.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoIsAtPage819 {
    public static void main(String[] args) throws Exception {
        int c;

        // создаем сокетное соединение с сайтом, через порт 43
        Socket socket = new Socket("whois.internic.net", 43); // адрес и через запятую - порт к котрому подключаемся

        // а теперь необходимо получить потоки ввода-вывода
        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        // сформируем строку запроса
        String stroka = "worldoftanks.com" + "\n";

        byte[] b = stroka.getBytes(); // строку в байты

        out.write(b); // отсылаем запрос на сервер, с помощью канала сокета

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }

        socket.close(); // закрыть же надо сокет!

    }
}
