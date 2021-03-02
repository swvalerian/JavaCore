// демонстрация работы с классом Vector который уже устарел, но унаследован абстрактлист
package com.swvalerian.javacore.module01.chapter18;

import javax.crypto.spec.PSource;
import java.util.Enumeration;
import java.util.Vector;

public class List19AtPage639vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,5); // указал начальный размер массива, и инкремент
        // Размер инкремента (на сколько будет увеличиваться выделяемый обьем памяти под массив)
        System.out.println("Размер массива равен = " + vector.size());
        System.out.println("Начальная ёмкость массива (выделяемый обьем памяти под массив) = " + vector.capacity());
        vector.addElement(4);
        vector.add(6);
        vector.addElement(8);

        System.out.println("Размер массива после ввода трех элементов стал равен = " + vector.size());
        System.out.println("Ёмкость массива  = " + vector.capacity());

        vector.addElement(4);
        System.out.println("Размер массива после ввода еще одного элеменат, стал равен = " + vector.size());
        System.out.println("Ёмкость массива после ввода четырех элементов стала = " + vector.capacity());

        vector.add((int) Math.round(Math.random() * 10));

        System.out.println("____________________");
        System.out.println("Элементы массива: ");
        Enumeration<Integer> enumeratorIterator = vector.elements();
        while (enumeratorIterator.hasMoreElements()) {
            System.out.print("[ " + enumeratorIterator.nextElement() + " ]");
        }

        if (vector.contains(5)) {
            System.out.println("\nВ массив случайным образом пробрался элемент со значением = " + vector.lastElement());
        }

    }
}
