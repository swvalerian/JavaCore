package com.swvalerian.javacore.module01.chapter21;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOStremWriteBufferAtPage796 {
    public static void main(String[] args) {
        Path fPath = Paths.get("C:\\BDA\\testNIO2.txt");

        try (OutputStream fOut =  new BufferedOutputStream(Files.newOutputStream(fPath,
                StandardOpenOption.APPEND,
                StandardOpenOption.CREATE)))
        {
            // выведем в поток данные
            for (int i = 0; i<100; i++) {
                fOut.write('A' + ((int) (Math.random()*52))); // случайные символы на вывод, добавляются в конец файла
            }

        } catch (FileNotFoundException e) {
            System.out.println("Перехватили исключение: " + e + " - файлик не найден!");
        } catch (IOException e) {
            System.out.println("Перехватили исключение: " + e + " - ошибка чтения!");
        }
    }
}
