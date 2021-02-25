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

        while (arrayDeque.peek() != null) {
            System.out.print(arrayDeque.pop());
        }

    }

}
