package com.swvalerian.javacore.module01.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressAtPage815 {
    public static void main(String[] args) throws UnknownHostException {
        // выведет адрес моего компа
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);

        // далее получаем адрес машины, на котором находится сайт в интернете (сервер)
        Address = InetAddress.getByName("www.mist-game.ru");
        System.out.println("Адрес онлайн игры: " + Address);

        //
        InetAddress SW[] = InetAddress.getAllByName("www.worldoftanks.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }

        byte[] bAddres = Address.getAddress();

        System.out.println(bAddres.length);
        for (int i = 0; i < bAddres.length; i++) {
            System.out.println(bAddres[i]);
        }

        // выведу только имя хоста
        System.out.println(Address.getHostName());

    }
}
