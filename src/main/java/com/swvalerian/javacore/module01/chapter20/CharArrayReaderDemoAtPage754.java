package com.swvalerian.javacore.module01.chapter20;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemoAtPage754 {
    public static void main(String[] args) {
        String str = "abcdefghklmnopkq";
        int length = str.length();
        char[] buf = new char[length];
        str.getChars(0, length, buf, 0);

        try (CharArrayReader cr = new CharArrayReader(buf, 0, 4)) { // загоняем в буфер тока первые четыре символа
            System.out.println((char) cr.read()); // выведет один символ - первый
            System.out.println("");

            while ((length=cr.read()) != -1) { // обраим внимание, чтение в алгоритме начнется со второй позиции, т.к.
                System.out.print((char) length); // до этого мы уже вывели символ с первой позиции из буфера
            }
        } catch (IOException ex)  {
            System.out.println("ошибка ввода-вывода");
        }
    }
}
