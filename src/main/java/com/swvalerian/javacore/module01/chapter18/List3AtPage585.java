// демонстрация применения класса LinkedList
package com.swvalerian.javacore.module01.chapter18;

import java.util.LinkedList;

public class List3AtPage585 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        // filling
        linkedList.add("aaa");
        linkedList.add("ddd");
        linkedList.add("uuu");
        linkedList.add("z");
        linkedList.add("xxx");
        linkedList.add("c");
        linkedList.add("hash");
        linkedList.add("ma");
        linkedList.add("tan");

        linkedList.addFirst("bbb");
        linkedList.add(2, "rrr");
        linkedList.addLast("aliz");

        System.out.println("Исходное содержимое связного списка linkedlist" + linkedList);

        // erase element
        linkedList.remove(7);
        linkedList.remove("z");
        System.out.println("\nСодержимое после удаления" + linkedList);
        // erase first and last element
        System.out.println("\nСейчас удалим - " + linkedList.removeFirst());
        System.out.println("Сейчас удалим - " + linkedList.pollLast());
        System.out.println("\nСодержимое после удаления" + linkedList);

        // получить и присвоить значение
        String stringValue = linkedList.get(5);
        linkedList.set(5, stringValue + "set");
        linkedList.set(5, linkedList.get(5) + "set"); // а можно было бы и так сделать, но ... наверное это слишком тяжело читаемо.
        // по итогу дваждый прибавили set к элементу под индексом 5

        System.out.println("Содержимое СвязСпис после получения и изменения значения: " + linkedList);

        linkedList.set(4, linkedList.get(0)); // изменили элемент, за счет другог элемента, вот такая вложенность!

        linkedList.remove(linkedList.getFirst()); // хехе, вот такое вот удаление самокастрация! елки-палки ))

        System.out.println("Содержимое СвязСпис после получения и изменения значения: " + linkedList);

    }
}