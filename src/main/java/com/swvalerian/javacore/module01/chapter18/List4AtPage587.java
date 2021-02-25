// Демонстрация HashSet
package com.swvalerian.javacore.module01.chapter18;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class List4AtPage587 {
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
        // вывод множества, обратите внимание - никакой сортировки!
        System.out.println(hashSet);

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        // ввод элементов в множество
        linkedHashSet.add("Таня");
        linkedHashSet.add("Джон");
        linkedHashSet.add("Петя");
        linkedHashSet.add("Силуян");
        linkedHashSet.add("Анечка");
        linkedHashSet.add("Катерина Матвеевна");

        // вывод множества, обратите внимание - никакой сортировки!
        System.out.println(linkedHashSet);

        if (linkedHashSet.contains("Петя") ) {
            System.out.println("Есть такой элемент!");
        }
    }
}
