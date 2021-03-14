package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirListAtPage800 {
    public static void main(String[] args) {
        String dirName = "C:\\BDA";

        // реализуем фильтр
        DirectoryStream.Filter<Path> how =
                new DirectoryStream.Filter<Path>() {
                    @Override
                    public boolean accept(Path entry) throws IOException {
                        if (Files.isWritable(entry)) {
                            return true;
                        }
                        return false;
                    }
                };

        // получсить и обработать поток ввода каталога в блоке оператора try с ресурсами
        try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(Paths.get(dirName), how))
        // применил фильтр, выведем только файлы доступные для записи
        {
            System.out.println("Каталог: " + dirName);

            for (Path entry : dirStream) {
//                System.out.println(entry);

                // создаем экземпляр класса для чтения атрибутов файлов
                BasicFileAttributes fileAttributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (fileAttributes.isDirectory()) {
                    System.out.print("<DIR>");
                } else {
                    System.out.print("     ");
                }

                System.out.println(entry.getName(1));

            }

        } catch (IOException ex) {
            System.out.println("ошибка ввода - вывода");
        }



    }
}
