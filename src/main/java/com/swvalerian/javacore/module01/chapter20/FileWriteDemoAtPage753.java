package com.swvalerian.javacore.module01.chapter20;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteDemoAtPage753 {
    public static void main(String[] args) {
        String str = "Этот программа демонстрирует работу класса FileWriter" +
                "содержимое этой строки будет записано в три разных файла," +
                "всякий раз по разному алгоритму, но смысл один - демонстративный!";

        char[] buf = new char[str.length()]; // задал массив длиной = длина строки
        str.getChars(0, buf.length, buf, 0); // инициализация массива char

        try (FileWriter f1 = new FileWriter("C:\\BDA\\charFile1.txt", true); // к этому файлу будет добавляться инфа
             FileWriter f2 = new FileWriter("C:\\BDA\\charFile2.txt"); // этот файла всегда занового будет создаваться
             FileWriter f3 = new FileWriter("C:\\BDA\\charFile3.txt", true)) {

            for (int i = 0; i < (buf.length-2); i = i +2) {
                f1.write(buf[i] ); // записываем каждый второй символ из строки
            }

            f2.write(buf);

            f3.write(buf, buf.length/2, buf.length/3);

        } catch ( IOException ex ) {
            System.out.println(ex);
        }


        try (PrintWriter printWriter = new PrintWriter("C:\\BDA\\charFile4.txt")) {
            for (int i = 0; i<10; i++) {
                printWriter.println(str.substring(44));
                System.out.println("операция вывода в файл выполнена успешно!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
