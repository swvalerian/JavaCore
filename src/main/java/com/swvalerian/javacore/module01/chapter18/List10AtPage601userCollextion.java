package com.swvalerian.javacore.module01.chapter18;

import java.util.Iterator;
import java.util.LinkedList;

public class List10AtPage601userCollextion {
    static class Birthday {
        private String name;
        private int age;
        private int date;


        Birthday(String name, int date, int age) {
            this.name = name;
            this.date = date;
            this.age = age;
        }

        public String toString() {
            return name + "\n" + "родился - " + date + "\n" + "возраст: " + age;
        }
    }

    public static void main(String[] args) {
        LinkedList<Birthday> birthdayLinkedList = new LinkedList<>();
        // filling
        birthdayLinkedList.add(new Birthday("Валерий", 1980, 40));
        birthdayLinkedList.add(new Birthday("Юлия", 2003, 18));
        birthdayLinkedList.add(new Birthday("Татьяна", 1971, 49));

        Iterator<Birthday> iterator = birthdayLinkedList.listIterator();

        iterator.forEachRemaining(o -> System.out.println(o + "\n")); // вывод

    }
}
