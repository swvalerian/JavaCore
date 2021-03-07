package com.swvalerian.javacore.module01.chapter13;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AtPage367ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("D:\\Java\\GoJava\\src\\main\\java\\com\\swvalerian\\javacore\\module01\\chapter13\\aTesta.txt");
            System.out.println("Файл открыт");

        // файл открыт, теперь из него можно читать символы, до тех пор, пока не встретиться конец файла
            do {
                i = fi.read();
                System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Перехватили исключение: " + e + " - файлик не найден!");
        } catch (IOException e) {
            System.out.println("Перехватили исключение: " + e + " - ошибка чтения!");
        } finally {
            System.out.println("\nПрограмма завершена");
            if (fi != null) {
                try {
                    System.out.println("Но нужно еще закрыть файл, попытаемся...");
                    fi.close();
                    System.out.println("Файл закрыт!");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
