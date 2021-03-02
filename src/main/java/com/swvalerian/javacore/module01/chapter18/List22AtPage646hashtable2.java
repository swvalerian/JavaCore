// демонстрация применения итераторов для хештаблиц
package com.swvalerian.javacore.module01.chapter18;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class List22AtPage646hashtable2 {
    public static void main(String[] args) {
        Hashtable<String, Double> hashtable = new Hashtable<>();
        // filling hashtable
        hashtable.put("Джон Смит", 18744.00);
        hashtable.put("Малькольм Смит", 44.00);
        hashtable.put("Джон Самшитов", 11.00);
        hashtable.put("Элвин Бурундук", 97.00);

        //получаю представление ключей в виде множества.
        Set<String> set = hashtable.keySet();

        //Вводим в дело итератор
        Iterator<String> iton = set.iterator();

        String s = null;
        while (iton.hasNext()) {
            s = iton.next();
            System.out.println(hashtable.get(s) + " золотых дерхем! Такую сумму накопил -=> " + s);
        }

        hashtable.put("Валька Чебурек", 100.77);
        hashtable.put("Элвин Бурундук", hashtable.get("Элвин Бурундук") + 100.00);

        System.out.println();
        iton = set.iterator(); // обнулил указатель итератора
        while (iton.hasNext()) {
            s = iton.next();
            System.out.println(hashtable.get(s) + " золотых дерхем! Такую сумму накопил -=> " + s);
        }

        System.out.println();
        System.out.println(System.getProperties());
    }
}
