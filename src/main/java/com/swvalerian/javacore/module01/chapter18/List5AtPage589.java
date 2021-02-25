// демонстрация применения и работы класса TreeSet (этот класс реализует интерфейс NavigableSet)
package com.swvalerian.javacore.module01.chapter18;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.TreeSet;

public class List5AtPage589 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        // ввод элементов в множество
        hashSet.add("Таня");
        hashSet.add("Валера");
        hashSet.add("Сергей");
        hashSet.add("Маша");
        hashSet.add("Женя");
        hashSet.add("Пэтя");
        hashSet.add("Ануфрий");
        // мы помним, что множество не сортированное

        TreeSet<String> ts = new TreeSet<>();
        ts.addAll(hashSet);


        System.out.println("Вывод TreeSet" + "\n" + ts); // этот список отсортировался автоматически.

        System.out.println("Взяли элементы из трисета - " + ts.subSet("Валера", "Таня"));
        System.out.println("трисет остался равен = " + ts.size() + " элементов");

        TreeSet<String> treeSet = new TreeSet();
        treeSet.addAll(ts.subSet("Валера", "Пэтя"));
        System.out.println("Новый трисет содержит элементы: " + treeSet +
                " и имеет размер = " + treeSet.size() + " элементов");

        System.out.println(treeSet.floor("Женя"));

    }
}
