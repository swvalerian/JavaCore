package com.swvalerian.javacore.module01.chapter18;

import java.util.*;

// Корректный пример, который показывает разницу в скорости доступа к списку упорядоченного масссива и к уникальной коллекции

public class TreeSetPerformance {
    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        TreeSet treeSet = new TreeSet<>();

        System.out.println("Filling our structures...");

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
            treeSet.add(i);
        }

        System.out.println("Trying to search element 999,999 in arrayList");

        long start = System.nanoTime();
        arrayList.contains(999_999);
        long end = System.nanoTime();

        long timeElapsedArrayList = end - start;

        System.out.println("Time elapsed for TreeSet: " + timeElapsedArrayList);

        System.out.println("Trying to search element 999,999 in TreeSet");

        start = System.nanoTime();
        boolean index = treeSet.contains(999_999);
        end = System.nanoTime();

        long timeElapsedTreeSet = end - start;

        System.out.println("Time elapsed for TreeSet: " + timeElapsedTreeSet + "\n");


        System.out.println("TreeSet " + (int)(timeElapsedArrayList/timeElapsedTreeSet) + " times more effective");


    }
}
