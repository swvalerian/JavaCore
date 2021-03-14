package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemoAtPage798 {
    public static void main(String[] args) {
        Path fPath = Paths.get("C:\\BDA\\testNIO2.txt");

        // поехали примеры, что мы можем узнать о файле
        System.out.println("Имя файла: -> " + fPath.getName(1)); // указывает индекс - где прописано имя
        System.out.println("путь к файлу -> " + fPath);
        System.out.println("абсолютный путь к файлу -> " + fPath.toAbsolutePath());
        System.out.println("Родительский каталог: " + fPath.getParent());
        if (Files.exists(fPath)) {
            System.out.println("Файл существует");
        } else {
            System.out.println("Файл НЕ существует!");
        }

        try {
            if (Files.isHidden(fPath)) {
                System.out.println("Атрибут файла - скрытный");
            } else{
                System.out.println("Атрибут файла - НЕ скрытный");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Файл доступен для чтения -> " + Files.isReadable(fPath));
        System.out.println("Файл доступен для записи -> " + Files.isWritable(fPath));

        try {
            BasicFileAttributes attribs = Files.readAttributes(fPath, BasicFileAttributes.class);
            if (attribs.isDirectory()) {
                System.out.println("this is catalog");
            } else{
                System.out.println("it`s not catalog");
            }

            if (attribs.isRegularFile()) {
                System.out.println("обычный файл");
            } else {
                System.out.println("необычный файл");
            }

            if (attribs.isSymbolicLink()) {
                System.out.println("символическая ссылка");
            } else {
                System.out.println("не символическая ссылка");
            }

            System.out.println("размер файла = " + attribs.size() + " byte");
            System.out.println("время последней модификации файла -> " + attribs.lastModifiedTime());

        } catch (IOException ex) {
            System.out.println("ошибка ввода - вывода");
        }
    }
}
