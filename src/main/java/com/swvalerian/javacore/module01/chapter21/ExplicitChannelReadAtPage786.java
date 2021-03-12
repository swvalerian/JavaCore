package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelReadAtPage786 {
    public static void main(String[] args) {
        int count;
        Path filepath = null;

        // получаем путь к файлу
        try {
            filepath = Paths.get("C:\\BDA\\log.txt");
        } catch (InvalidPathException ex) {
            System.out.println("Ты выбрал неверный путь! - > " + ex);
            return; // завершим программу
        }

        // получаем канал к файлу
        try (SeekableByteChannel byteChannel = Files.newByteChannel(filepath)) {
            //выделяем память ОЗУ под буфер
            ByteBuffer buffer = ByteBuffer.allocate(128);

            do {
                // читаю данные из файлового канала в буфер памяти

                count = byteChannel.read(buffer); // метод возвращает количество прочитанный байт, а мы сохраним, пригодится

                System.out.println("\n=======================================");
                System.out.println("Прочитано из файла и записано в буфер (байт) = " + count);
                System.out.println("=======================================");

                if ( count != -1) { // если будет достигнут конец файла - то метод выше вернет -1, и мы прекратим работу тоже
                    // а теперь подготовим буфер, для того, чтоб уже из буфера прочитать данные и воспользоваться ими в своих целях

                    buffer.rewind(); // установим позицию в буфере в ноль, и еще этот метод возвращает ссылку на буфер
                    //System.out.println("обнулили буфер");

                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buffer.get()); // побайтово читаем из буфера и выводим в консоль
                    }
                }

                // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! после чтения, буфер тоже нужно обнулить
                buffer.rewind(); // если этот метод закоментировать, тогда будет лишний проход цикла, т.к. нет сброса буфера
                // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


            } while (count != -1);

        } catch (IOException ex) {
            System.out.println("ошибка ввода-вывода" + ex);
        }
    }
}
