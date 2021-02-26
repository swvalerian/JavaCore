// простенькая демонстрация действия Spliterator
package com.swvalerian.javacore.module01.chapter18;

import javax.crypto.spec.PSource;
import java.text.Format;
import java.util.ArrayList;
import java.util.Spliterator;

public class List9AtPage599spliterator {
    public static void main(String[] args) {
        ArrayList<Double> alist = new ArrayList<>();
        // filling arraylist
        alist.add(8.0);
        alist.add(15.0);
        alist.add(14.4);
        alist.add(18.9);
        alist.add(11.1);
        alist.add(44.4);

        // вывод содержимого списочного массива
        System.out.println("Вывод содержимого списочного массива с помощью методa tryadvance: \n");
        Spliterator<Double> spl = alist.spliterator();

        //дальше магия!
        while (spl.tryAdvance(v-> System.out.println(v)));

        System.out.println();
        // создадим новый списочный массив, из случайных чисел

        ArrayList<Double> aListRandom = new ArrayList<>();

        spl = alist.spliterator(); // обнулили указатель сплитератора

        while (spl.tryAdvance(val -> aListRandom.add(Math.random()*val)));

        //выведем новый списочный массив
        spl = aListRandom.spliterator(); // присвоили новый списочный массив сплитератору

        spl.forEachRemaining(value -> System.out.print("[" + value.shortValue() + "] "));

        System.out.println();
        System.out.println(spl.hasCharacteristics(Spliterator.IMMUTABLE)); // непонятно!
        System.out.println(spl.characteristics()); // выдает какое то число, это характеристика

    }
}
