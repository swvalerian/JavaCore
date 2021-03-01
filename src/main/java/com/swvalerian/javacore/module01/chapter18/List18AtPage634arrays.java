// демонстрация методов из класса Arrays
package com.swvalerian.javacore.module01.chapter18;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class List18AtPage634arrays {
    public static void main(String[] args) {
        // инициализация массива и выделение под него памяти на 10 эелементов
        double array[] = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] += 5 * (i + 1); // filling array
            System.out.print("[" + array[i] + "] "); // array output
        }
        System.out.println();

        for (double i : array) {
            System.out.print("[" + i + "] "); // array output
            i = Math.random() * i;
        }

        System.out.println();
        System.out.println("Длина массива = " + array.length);

        Arrays.stream(array).forEach(System.out::println); // массив не изменился! чтоб поменять массив, нужно использовать другой перебор
        System.out.println();

        for(int i=0; i < 10; i++) {
            System.out.print("[" + array[i] + "] "); // array output
            array[i] = 4 + Math.round(Math.random() * (i + 7));
        }

        // теперь массив изменился
        System.out.println();
        for(int i=0; i < 10; i++) {
            System.out.printf("[%.1f] ", array[i]); // array output
        }

        Arrays.sort(array); // sorting

        System.out.println();
        for(int i=0; i < 10; i++) {
//            System.out.printf("[%.1f] ", array[i]); // array output
            System.out.print("[" + array[i] + "]"); // array output
        }

        Arrays.fill(array, 4, 5, 5.0); // замена с 4 по 5-1 индекс массива на заданное значение 5.0

        System.out.println();
        int hasElement = Arrays.binarySearch(array, 5.0); // массив уже не сортирован и всегда находит элемент под индексом четыре
        if (hasElement >= 0) {
            System.out.println("Элемент со значением 5.0 в массиве найден под индексом = " + hasElement); // именно там, где я заменил
        }

        System.out.println();
        for(int i=0; i < 10; i++) {
            System.out.print("[" + array[i] + "]"); // array output
        }

        int arrayInt[] = new int[10];

    }
}
