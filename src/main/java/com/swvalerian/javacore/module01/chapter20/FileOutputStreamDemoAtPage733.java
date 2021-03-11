package com.swvalerian.javacore.module01.chapter20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemoAtPage733 {
    public static void main(String[] args) {
        String stroka = "Это демонстрационная строка, которая неизбежно\n" +
                "будет записана в файл, который создаст эта программа!\n" +
                "и я надеюсь, что особых ошибок в работе не случиться\n" +
                "кстати, в данной программе я буду использовать структуру\n" +
                "try с ресурсами\n====================================================\n";
        byte[] b = stroka.getBytes();
        System.out.println(b.length);

        String dirName = "C:\\BDA\\";
        File dir = new File(dirName);

        // если каталога не существует - создадим его! Ведь там будут создаваться наши файлы
        if (dir.exists()) {
            System.out.println("Каталог " + dir.getPath() + " уже создан");
        } else {
        } {
            dir.mkdir();
        }

        // создаю экзмепляры класса, причем, если таких файлов не существует - они создаются!
        try (FileOutputStream fout1 = new FileOutputStream(dirName + "file1.txt", true);
             FileOutputStream fout2 = new FileOutputStream(dirName + "file2.txt", true);
             FileOutputStream fout3 = new FileOutputStream(dirName + "file3.txt", true)) {

            fout1.write(b); // запись строки целиком


            for (int i = 0; i < (b.length-1); i++) {
                fout2.write(b[i+1]); // запись каждого второго символа из строки
            } // при этом пишутся крякозябры. Вопрос - почему?

            // в третий файл запишем 50проц символов, начиная с оступа в 1/4 части исходной строки текста
            fout3.write(b, b.length/4, b.length/2);
            fout3.write('\n');
            if (!dir.exists()) {
                throw new IOException();
            }
        } catch (IOException ex) {
            System.out.println("Отловил исключение! - ошибка! ->" + ex);
        }

    }
}
