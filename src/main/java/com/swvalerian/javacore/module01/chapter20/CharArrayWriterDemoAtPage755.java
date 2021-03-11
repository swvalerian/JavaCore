package com.swvalerian.javacore.module01.chapter20;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterDemoAtPage755 {
    public static void main(String[] args) {
        CharArrayWriter buffer = new CharArrayWriter();
        String str = "Это строка, которая демонстрирует запись в буфер массив симовлов и вывод из буфера";
        char[] b = new char[str.length()];
        str.getChars(0, str.length(), b, 0);

        System.out.println("пока что наш буфер пустой, размер = "+ buffer.size());

        // ниже я попытаюсь записать наш массив символов , в буфер
        try {
            buffer.write(b);
            System.out.println("теперь размер буфера стал таким = " + buffer.size() + " символов. Инфа взята из " +
                    "защищенного поля count класса CharArrayWriter");
        } catch (IOException ex) {
            System.out.println("ошибка ввоад - вывода");
        }

        System.out.println("Выведем символ из буффера");
        System.out.println(buffer.toString());

        System.out.println("");
        char[] charArray = buffer.toCharArray(); // загнали буферр в массив. Теперь можно вывести из массива как угодно
        for (char c : charArray) {
            System.out.print(c + "."); // чтоб было понятно!
        }
    }
}
