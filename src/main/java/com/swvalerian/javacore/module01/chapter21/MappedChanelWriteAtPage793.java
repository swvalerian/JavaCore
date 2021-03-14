package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChanelWriteAtPage793 {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel)
                Files.newByteChannel(Paths.get("C:\\BDA\\test2.txt"),
                        StandardOpenOption.WRITE, // при таком открытии канала, данные будут записываться из буфера в самое начало файла! а остальная часть файла не будет затираться или изменяться.
                        StandardOpenOption.READ,  // если добавить эту строчку, файл будет перезаписан
                        StandardOpenOption.CREATE)) //
        {
            // сопоставим буфер в памяти файловому каналу
            MappedByteBuffer mapedBuf = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 26);

            for (int i =0; i < 26; i++) {
                mapedBuf.put((byte) ('A' + (int) (Math.random() * 26))); // заполняю буфер случайными латинскими буквами
            }

        } catch (IOException ex) {
            System.out.println("Ошибка ввода-выода");
        } catch (InvalidPathException exip) {
            System.out.println("ошибка пути к файлу");
        }
    }
}
