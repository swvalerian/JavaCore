// demo FileInputStream
// demo try with resource
// demo demo demo

package com.swvalerian.javacore.module01.chapter20;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemoAtPage732 {
    public static void main(String[] args) {
        int size;
        // для автоматического закрытия потока ввода - вывода используется оператор try c ресурсами
        // указывая ссылку на файл, незабываем указывать расширение файла!
        try (FileInputStream file = new FileInputStream("C:\\BDA\\log.txt")) {
            System.out.println("общее количество доступных байтов для чтения = " + (size = file.available()));
            int n = size / 44;
            System.out.println("Первые " + n + " байт прочитанных из файла методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) file.read());
            }

            System.out.println("\nВсё еще доступно для чтения = " + file.available() + " байтов");
            System.out.println("\nЧтение следующих по очереди " + n + " байтов, но уже методом read(b[]) ");

            byte[] b = new byte[n]; //тут создаем массив, для последующего использования его в качестве буфера для чтения байтов

            if ( file.read(b) != n ) {
                System.err.println("Невозможно прочитать " + n + " байтов");
            }
            System.out.print("\n" + new String(b, 0, n)); // тут магия, я еще не сталкивался с такой формой записи String
            System.out.println("\nВсе еще доступно = " + (size = file.available()) + " байтов");
            System.out.println("\nПропустим половину оставшихся байтов методом skip()");

            file.skip(size/2); // пропускаем половину оставшихся байтов, они уже не существуют в потоке ввода для нас

            System.out.println("После пропуска, Осталось доступно " + file.available() + " байтов");

            System.out.println("чтение " + (n / 2) +" байтов оставшихся в конце массива b[]");
            if (file.read(b, n/2, n/2) != n/2) {
                System.out.println("ошибка, неполучается прочитать байты в конце массива");
            }

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсё еще доступно для чтения = " + file.available() + " байтов");

        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода!");
        }
    }
}
