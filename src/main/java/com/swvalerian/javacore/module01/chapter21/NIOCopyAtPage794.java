package com.swvalerian.javacore.module01.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class NIOCopyAtPage794 {
    public static void main(String[] args) {
        try {
            Path filePathIn = Paths.get("C:\\BDA\\log.txt");
            Path filePathOut = Paths.get("C:\\BDA\\testNIO.txt");

            // далее магия с помощью класса Files
            Files.copy(filePathIn, filePathOut, StandardCopyOption.REPLACE_EXISTING); // новый файл - перезаписывается

            System.out.println("Программа завершена успешно");

        } catch (IOException ex) {
            System.out.println("Ошибка ввода-выода");
        } catch (InvalidPathException exip) {
            System.out.println("ошибка пути к файлу");
        }
    }
}
