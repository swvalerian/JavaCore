package com.swvalerian.javacore.module01.chapter18;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        System.out.println("Initial treeset...");

        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(9);
        treeSet.add(0);
        treeSet.add(7);
        treeSet.add(6);
        treeSet.add(8);
        treeSet.add(4);

        treeSet.add(14);
        treeSet.add(44);
        treeSet.add(25);

        System.out.println(treeSet.ceiling(12)); //понял как работает, но зачем это может пригодиться?


        System.out.println("TreeSet content:");
        System.out.println(treeSet); // выведет элементы отсортированные по возрастанию!


        Integer i = 0;
        System.out.println("Хешкод нуля = " + i.hashCode());

        System.out.println("Хешкод нуля типа char = " + "0".hashCode());


    }
}
