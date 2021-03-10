package com.swvalerian.javacore.module01.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnum implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnum(Vector<String> files) { // создал конструктор
        this.files = files.elements();
    }

    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    public FileInputStream nextElement() {
        try {
            return new FileInputStream(files.nextElement().toString());
        } catch (IOException ex) {
            System.out.println("ошибка");
            return null;
        }
    }

}

public class SequenceInputStreamDemoAtPage743 {
    public static void main(String[] args) {
        Vector<String> files = new Vector<>();
        files.add("C:\\BDA\\file1.txt");
        files.add("C:\\BDA\\file2.txt");
        files.add("C:\\BDA\\file3.txt");

        int c;

        InputStreamEnum isee = new InputStreamEnum(files); // создаем поток ввода для каждого файла.

        try (InputStream input = new SequenceInputStream(isee)) { // все три потока соединяем в один!
            while ((c = input.read()) != -1) {
                System.out.println("." + (char) c); // и вновь проблеммы с кодировкой, сплошные иероглифы! (
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
