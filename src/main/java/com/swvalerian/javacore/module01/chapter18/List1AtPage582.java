// Продемонстрировать применение класса ArrayList
package com.swvalerian.javacore.module01.chapter18;

import java.util.ArrayList;

public class List1AtPage582 {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(8); // задал размер массива, для экономии памяти

        System.out.println("Начальный размер списочного массива = " + stringArrayList.size());

        // filing ArrayList = наполняем массив, заодно учу инглишь ))
        stringArrayList.add("D");
        stringArrayList.add("A");
        stringArrayList.add("Q");
        stringArrayList.add("U");
        stringArrayList.add("V");
        stringArrayList.add("C");
        stringArrayList.add("S");
        // сделаем вставочку по индексу 3, но счет по списку будет 4ым элементом (а что вы хотели - это все таки массив, хоть и динамический)
        stringArrayList.add(3, "xxx");

        System.out.println("После заполнения, размер массива стал = " + stringArrayList.size());
        System.out.println("Списочный массив содержит следующие элементы:" + stringArrayList + "\n");

        // удалим пару элементов
        stringArrayList.remove(6);
        stringArrayList.remove("A");
        stringArrayList.trimToSize(); // уменьшил размер массива до текущего значения, чтоб не занимать лишнюю память.

        System.out.println("После удаления некоторых элементов, размер массива стал = " + stringArrayList.size());
        System.out.println("Списочный массив содержит следующие элементы:" + stringArrayList);


    }
}
