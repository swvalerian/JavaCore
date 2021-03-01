package com.swvalerian.javacore.module01.praktika;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> collectOne = new ArrayList<>();
        collectOne.add(6);
        collectOne.add(4);
        collectOne.add(6);
        collectOne.add(1);
        collectOne.add(8);
        collectOne.add(100);
        collectOne.add(-100);
        collectOne.add(44);
        System.out.println(collectOne);

        List<Integer> collectTwo = new ArrayList<>();
        collectTwo.add(3);
        collectTwo.add(8);
        collectTwo.add(76);
        collectTwo.add(504);
        collectTwo.add(100);
        collectTwo.add(1);
        System.out.println(collectTwo);

        System.out.println(algo(collectOne, collectTwo));

    }

    public static TreeSet algo(List<Integer> list1, List<Integer> list2) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        if (list1.size() >= list2.size()) {
            list1.retainAll(list2);
            treeSet.addAll(list1);
            return treeSet;
        }
        else
        {
            list2.retainAll(list1);
            treeSet.addAll(list2);
            return treeSet;
        }
    }
}
