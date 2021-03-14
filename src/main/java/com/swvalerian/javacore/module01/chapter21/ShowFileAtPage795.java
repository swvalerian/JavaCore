package com.swvalerian.javacore.module01.chapter21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ShowFileAtPage795 {
    public static void main(String[] args) {
        int i;

        // Path patchName = Paths.get("C:\\BDA\\log.txt"); // можно так получить экземпляр типа Paths который инкампуслирует файл

        // открываем поток и читаем из потока
        try (InputStream fin = Files.newInputStream(Paths.get("C:\\BDA\\log.txt"), StandardOpenOption.READ)) {
            while ( (i = fin.read()) != -1) { // сразу читаем и сравниваем полученный символ из потока ввода - вывода
                System.out.print((char) i); // вывод содержимого файла в консоль
            }
        } catch (FileNotFoundException e) {
            System.out.println("Перехватили исключение: " + e + " - файлик не найден!");
        } catch (IOException e) {
            System.out.println("Перехватили исключение: " + e + " - ошибка чтения!");
        }
    }
}
