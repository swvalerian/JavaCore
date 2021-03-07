package com.swvalerian.javacore.module01.chapter10;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class AtPage268HandleError {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
//                System.out.println("Деление на нуль! - " + e);
                a = 0;
            }
            System.out.println(" a = " + a);
        }
    }
}
