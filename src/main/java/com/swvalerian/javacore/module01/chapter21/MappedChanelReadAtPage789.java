package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

public class MappedChanelReadAtPage789 {
    public static void main(String[] args) {
        // в методе трай с ресурсами создаем канал с файлом полученным из обьекта типа Path
        // получаемый канал приводится к типу FileChanel
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("C:\\BDA\\test.txt"))) {
            // получаем размер файла
            long fsize = fileChannel.size();

            // здесь буфер сопостовляем с файлом.
            MappedByteBuffer mappedBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fsize);

            // обычный алгоритм чтения из буфера и вывода на экран
            for (int i=0; i < fsize; i++) {
                // вывод содержимого файла из буффера
                System.out.print((char) mappedBuffer.get());
            }

        } catch (InvalidPathException iex) {
            System.out.println("ошибка указания пути к файлу");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода- вывода");
        }
    }
}
