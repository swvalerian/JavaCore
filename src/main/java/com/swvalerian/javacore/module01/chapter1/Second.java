package com.swvalerian.javacore.module01.chapter1;

import java.util.HashSet;

public class Second {
    public static void main(String[] args) {
        System.out.println("Поздравляю, вторая программа добавлена!");

        HashSet hashSet = new HashSet();
        hashSet.add("Goblin");
        hashSet.add("Statist");
        hashSet.add("Appercod");
        hashSet.add("LinkedHashSet");
        hashSet.add(4356);

        System.out.println(hashSet);
    }
}
