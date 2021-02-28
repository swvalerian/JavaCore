package com.swvalerian.javacore.module01.chapter18;

import java.util.*;

public class testDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(10);
        // filling arraylist
        list.add("P");
        list.add("Z");
        list.add("C");
        list.add("F");
        list.add("R");
        list.add("H");
        list.add("N");
        list.add("Y");
        list.add("X");
        list.add("Q");
        System.out.println(list + " - unSorted arraylist");

        Collections.sort(list);
        System.out.println(list + " - sorted arraylist");

        Set<String> hashSet = new HashSet<>();
        // filling hashset
        hashSet.add("P");
        hashSet.add("Z");
        hashSet.add("C");
        hashSet.add("F");
        hashSet.add("R");
        hashSet.add("H");
        hashSet.add("N");
        hashSet.add("Y");
        hashSet.add("X");
        hashSet.add("Q");
        System.out.println(hashSet + " - hashset not sorted collections"); // hashset not sorted collections!

        for (String el : hashSet) {
            System.out.print("[" + el + "] "); // а так  выводить элементы хешсета правильнее!
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "P");
        map.put(2, "Z");
        map.put(3, "C");
        map.put(4, "F");
        map.put(5, "R");
        map.put(6, "H");
        map.put(7, "N");
        map.put(8, "Y");
        map.put(9, "X");
        map.put(10, "Q");

        System.out.println("\n\n--------------------\n");
        for (Integer key : map.keySet()){
            System.out.print("в " + key + " лежит - " + map.get(key) + " : ");
        }

        // sorting arraylist

        /*Map<Integer, String> map = new HashMap<>();
        map.put(1, "Понедельник");
        map.put(2, "Вторник");

        Set<Map<Integer, String>> set = new HashSet<>();
        set.add(map);

        System.out.println(set);*/
    }
}
