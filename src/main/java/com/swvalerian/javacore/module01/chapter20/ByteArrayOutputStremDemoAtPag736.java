package com.swvalerian.javacore.module01.chapter20;

import java.io.*;

public class ByteArrayOutputStremDemoAtPag736 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
        String str = new String("ABCDEF");

        // данные из строки в массив
        byte [] b = str.getBytes(); //

        System.out.println(" 1 в буфере на выход = " +byteOut.size() + " элементов");

        try {
            byteOut.write(b); // из массива в буфер
            System.out.println(" 2 в буфере на выход = " +byteOut.size() + " элементов");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Выведем данные
        System.out.println("Буфер в виде символьной строки -> " + byteOut.toString());

        // в массив... честно говоря не улавливаю связи, т.е. зачем это нужно
        byte[] buf = byteOut.toByteArray();
        b = byteOut.toByteArray(); // равнозначные же строчки. тем более мы буфер заполнили
        // с помощью массива, а тут - массив создали новый и заполнили его из буфера

        for (int i =0; i < buf.length; i++) {
            System.out.println((char) buf[i]); // вывод вновь созданного массива
        }

        // ну и наконец выведем в поток вывода типа OutputStream
        System.out.println("вывод в поток ввода-вывода типа FileOutPutStream");

        try (FileOutputStream file = new FileOutputStream("C:\\BDA\\test.txt", true)) {
            byteOut.writeTo(file); // воспользовались методом из класса ByteArrayOutputStream
            file.write(byteOut.toByteArray()); // сам догадался, что можно сделать и методом из класса FileOutputStream
            // наверное все таки оба методы нужны, пригодятся когда нибудь
            // сейчас для меня нет смысла в ByteArrayOutputStream вот и маюсь вопросами - зачем???
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Установка в исходное состояние");
        byteOut.reset(); // стирается вся информация записанная ранее

        System.out.println(" 6 --должно измениться-- в буфере на выход = " +byteOut.size() + " элементов");

        for (int i=0; i < 3; i++) {
            byteOut.write('F'); // это запись в буфер экземпляра класса
            System.out.println(byteOut.toString());
        }

        System.out.println(" 7 --должно измениться-- в буфере на выход = " +byteOut.size() + " элементов");

        // демонстрация примера со страницы 335
        String abc = "abc";
        b = abc.getBytes();

        ByteArrayInputStream inputStream = new ByteArrayInputStream(b);

        System.out.println("доступно байт во входящем потоке = " + inputStream.available());
        for (int i=0; i < 2; i++) {
            int c;
            while ( (c = inputStream.read()) != -1) {
                if (i != 0) {
                    System.out.println((char) c);
                } else {
                    System.out.println(Character.toUpperCase((char) c));
                }
            }
            inputStream.reset();
            System.out.println("я сделал - inputStream.reset()");
        }
        // здесь сбрасывается указатель в потоке, а не сам поток, как в случае с ByteArrayOutputStream
        System.out.println("доступно байт во входящем потоке = " + inputStream.available());

    }
}
