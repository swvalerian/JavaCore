// демонстрация применения класса ArrayDeque (двухсторонняя очередь)
package com.swvalerian.javacore.module01.chapter18;

import java.util.ArrayDeque;

public class List6AtPage591 {
    public static void main(String[] args) {
        // организуем стэк
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        // filling Deque
        arrayDeque.push("H");
        arrayDeque.push("e");
        arrayDeque.push("l");
        arrayDeque.push("l");
        arrayDeque.push("o");
        arrayDeque.push(" ");
        arrayDeque.push("W");
        arrayDeque.push("o");
        arrayDeque.push("r");
        arrayDeque.push("l");
        arrayDeque.push("d");
        arrayDeque.push("!");

        System.out.println("Размер очереди = " + arrayDeque.size() + "\n");

        while (arrayDeque.peek() != null) {

            System.out.print(arrayDeque.pop()); // взяли первый элемент - он был добавлен последним. (генерирует исключение)

            // System.out.print(arrayDeque.pollFirst()); // взяли первый элемент - он был добавлен последним. (возвращает null)
            // System.out.print(arrayDeque.poll()); // они идентичны в данном случае!? (возвращает null)

            // System.out.print(arrayDeque.pollLast()); // а вот так напечатает в порядке добавления элементов в очередь. Т.к. последний элемент в очереди - это тот, что пришел первым
        }

        System.out.println("\nРазмер очереди = " + arrayDeque.size() + " увы, исчерпали!");


    }

}
