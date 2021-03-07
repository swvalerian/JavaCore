package com.swvalerian.javacore.module01.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtPage361BufferedReader {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы (q - для выхода)");
        do {
            c = (char) bufReader.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
