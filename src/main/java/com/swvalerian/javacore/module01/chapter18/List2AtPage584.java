// Преобразовать списочный массив ArrayList в обычный массив
package com.swvalerian.javacore.module01.chapter18;

import java.util.ArrayList;

public class List2AtPage584 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        // filing arraylist
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(6);

        System.out.println("Содержимое списочного массива: " + arrayList);
        // получаем обычный массив
        Integer array[] = new Integer[arrayList.size()];
        array = arrayList.toArray(array);

        System.out.println("РАзмер обычного массива = " + array.length);

        int summa = 0;

        System.out.print("Содержимое обычного массива: ");
        for (int i : array)
        {
            System.out.print(i);
            summa += i;
        }

        System.out.println("\nСумма элементов обычного массива = " + summa);

    }
}
