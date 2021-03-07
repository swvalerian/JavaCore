/* Копирование файла .

Чтобы воспользоваться этой программой , укажите имена исходного и целевого файлов.
Например , чтобы скопировать файл FIRST.TXT в файл SECOND.ТXT,
введите в командной строке следующую команду :
java CopyFile FIRST.ТXТ SECOND.TXT

 */
package com.swvalerian.javacore.module01.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AtPage371CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        try {
            // пытаюсь открыть файл
            fin = new FileInputStream("D:\\Java\\GoJava\\src\\main\\java\\com\\swvalerian\\javacore\\module01\\chapter13\\first.txt");
            fout = new FileOutputStream("D:\\Java\\GoJava\\src\\main\\java\\com\\swvalerian\\javacore\\module01\\chapter13\\second.txt");
            //
            System.out.println("Файлы открыты - начинаем копинг");
            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);
            System.out.println("Файл first.txt успещно скопирован в файл second.txt");
            fout.write('\n'); // допишу отсебятину в конец второго файла
            fout.write('!'); // ради эксперимента и постижения науки
        } catch (FileNotFoundException e) {
            System.out.println("Перехватчик - " + e);
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                    System.out.println("first.txt файл закрыт");
                }
            } catch (IOException e2) {
                System.out.println("Ошибка ввода-вывода");
            }
            try {
                if (fout != null) {
                    fout.close();
                    System.out.println("second.txt файл закрыт");
                }
            } catch (IOException e2) {
                System.out.println("Ошибка ввода-вывода");
            }
        }

    }
}
