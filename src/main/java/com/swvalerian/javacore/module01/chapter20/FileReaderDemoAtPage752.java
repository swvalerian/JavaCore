package com.swvalerian.javacore.module01.chapter20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemoAtPage752 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\BDA\\log.txt")) {
            int c;

            // прочитать и вывести содержимое файла
            while ((c = fr.read()) != -1 ) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println("понял да, отловил исключуху");
        }
    }
}
