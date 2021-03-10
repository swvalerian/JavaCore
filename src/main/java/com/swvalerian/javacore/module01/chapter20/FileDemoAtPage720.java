package com.swvalerian.javacore.module01.chapter20;

import java.io.File;

public class FileDemoAtPage720 {
    static void p(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String put = "\\adb\\NullFile.txt";
        File f1 = new File(put);
        p("Демонстрация работы с обьектом типа файл");
        p("Путь -> " + f1.getAbsolutePath());
        p("имя обьекта (в данном случае каталога) -> " + f1.getName());

        // смотрим содержимое обьекта файл. А конкретно - содержимое каталога
        if (f1.exists()) {
            p("\nСодержимое каталога " + f1.getAbsolutePath() + " такое:");
            for (int i =0; i < f1.list().length; i++) {
                p(f1.list()[i]);
            }
        }

        p("");
        p(f1.exists() ? "существует" : "не существует!");
        p(f1.canWrite() ? "Доступен для записи" : "не доступен для записи!");
        p(f1.isDirectory() ? "Является каталогом" : "Это файл, а не каталог!");
        p(f1.isFile() ? "это обычный файл" : "может быть именованным каналом");
        p(f1.isAbsolute() ? "абсолютный файл-путь" : "не абсолютный");
        p("размер = " + f1.length());
        p("last modified : " + f1.lastModified());
    }
}
