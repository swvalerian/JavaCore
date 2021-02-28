package com.swvalerian.javacore.module01.chapter18;

import java.util.Set;
import java.util.TreeSet;

public class List14AtPage620compDemoLymb {
    // вот так легко, создали трисет и компаратор в одной записи... лямбда рулит!
    public static void main(String[] args) {
        Set<String> treeset = new TreeSet<>((s, str) -> str.compareToIgnoreCase(s)); // реализовал тут реверсивку! ну круто!
        treeset.add("G");
        treeset.add("Q");
        treeset.add("A");
        treeset.add("Z");

        for (String elem:treeset) {
            System.out.println(elem + " - wow!");
        }
    }
}
