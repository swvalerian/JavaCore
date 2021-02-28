// демонстрация работы статических алгоритмов коллекции
package com.swvalerian.javacore.module01.chapter18;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class List17AtPage629algorithms {
    public static void main(String[] args) {
        // созаддим неинициализированный() связный список
        LinkedList<Integer> ll = new LinkedList();
        ll.add(-745);
        ll.add(529);
        ll.add(915);
        ll.add(41);
        ll.add(-8);
        ll.add(107);

        for (Integer i : ll) {
            System.out.println(i);
        }
        System.out.println();

        // создание компаратора, с обратным упорядочиванием!
        Comparator<Integer> compReverse = Collections.reverseOrder();

        // Сортируем коллекцию с помощью компаратора
        Collections.sort(ll, compReverse);

        for (Integer i : ll) {
            System.out.println(i);
        }
        System.out.println();

        // Сортируем коллекцию с помощью компаратора и метода - реверсии
        Collections.sort(ll, compReverse.reversed());

        for (Integer i : ll) {
            System.out.println(i);
        }
        System.out.println();

        // тасуем коллекцию
        Collections.shuffle(ll);

        for (Integer i : ll) {
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Сколько раз встречается число -8 в нашей колллекции? \n" + Collections.frequency(ll, -8));

        System.out.println("Максимальный элемент коллекции = " + Collections.max(ll));
        System.out.println("Минимальный элемент коллекции = " + Collections.min(ll));
        System.out.println();

        System.out.println("Элементы коллекции: ");
        for (Integer i : ll) {
            System.out.print("[ " + i + " ] ");
        }
        System.out.println();

        System.out.println("-------------Сдвинем коллекцию вправо на два-------------");

        Collections.rotate(ll, 2);
        for (Integer i : ll) {
            System.out.print("[ " + i + " ] ");
        }
        System.out.println();

    }
}
