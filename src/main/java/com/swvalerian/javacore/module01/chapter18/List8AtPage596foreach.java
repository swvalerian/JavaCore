package com.swvalerian.javacore.module01.chapter18;

import java.util.ArrayList;

public class List8AtPage596foreach
{
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(500);
        al.add(400);
        al.add(300);

        System.out.print("ArrayList contains: ");
        for (int i : al) {
            System.out.print("[" + i + "]" );
        }
        System.out.println();

        ArrayList<Integer> alBuf = new ArrayList<>();

        // решил немножко выебнуться )))
        int index = 0;
        for (int i: al) {
            System.out.println(i);
            alBuf.add(i * 10); // формируем элементы нового списка, видоизменяя элементы первой коллекции
            System.out.println(alBuf.get(index));
            index++;
        }

    }
}
