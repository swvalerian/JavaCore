// демонстрация работы с классом File и его методами
package com.swvalerian.javacore.module01.chapter20;

import javax.swing.*;
import java.io.File;
import java.io.FilenameFilter;

public class DirListAtPage723 {
    static public class OnlyExt implements FilenameFilter {
        String ext;

        public OnlyExt(String ext) {
            this.ext = ext;
        }

        // реализуем метод,
        public boolean accept(File dir, String name) {
            return name.endsWith(ext);
        }
    }

    static void p(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        String dirName = "c:\\ADB\\";
        File file = new File(dirName);
        if (file.exists()) {
            p("Обьект file существует");
        }

        if (file.isDirectory()) {
            p("Обьект file является каталогом: ");

            String catalog = file.getAbsolutePath();
            p("\nСодержимое каталога " + catalog + " \n");

            String[] list = file.list();

            for (int i = 0; i < list.length; i++) {
                File f = new File(dirName + list[i]);
                if (f.isFile()) {
                    p("Файл: " + list[i]);
                } else {
                    p("Каталог: " + list[i]);
                }
            }
        } else {
            p("Обьект file является файлом");
        }

        // пример со страницы 724 используем интерфейс FileNaeFilter и реализуем его метод.
        // FilenameFilter filter = new OnlyExt("txt"); // можно так, вместо создания обьекта в конструкторе

        //String ext = "html"; // меняем расширение и получаем на вывод листинга другие файлы
        String ext = "txt";
        String[] listDir = file.list(new OnlyExt(ext)); // создаем отфилтрованный массив из списка файлов

        p("=======================================");
        p("\nприменил фильтр, выведем только файлы, которые имеют расширение " + ext + "\n");
        p("\nСодержимое каталога " + dirName + " \n");
        if (file.exists()) {
            for (int i = 0; i < listDir.length; i++) {
                p(listDir[i]);
            }
        }

        p("А сейчас попробую создать каталог! ");
        p("=======================================");

        file = new File("C:\\BDA\\"); //

        if (file.mkdir()) {
            p("новый каталог успешно создан, вот его путь - " + file.getAbsolutePath());
        }

    }
}
