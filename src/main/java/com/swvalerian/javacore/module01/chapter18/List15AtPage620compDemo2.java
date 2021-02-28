// демонстрация применения сортировки с помощью компаратора для предыдущей коллекции отображения
package com.swvalerian.javacore.module01.chapter18;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class List15AtPage620compDemo2 {
    public static void main(String[] args) {
        // создаю древовидное отображение
        TreeMap<String, Long> treeMap = new TreeMap<>(new MyCompDemo2());
        // еще вопрос, в чем разница, если я создаю так, как выше, и не создаю так, как ниже закоментил!?
        // TreeMap<String, Long> treeMap = new TreeMap<String, Long>();

        treeMap.put("Себастьян Американо", (long) 345);
        treeMap.put("Себастьян Перейро", (long) 41234);
        treeMap.put("Долче Габанна", (long) 4567);
        treeMap.put("Франческо Вито", (long) 678);
        treeMap.put("Аль Капоне", (long) 4356);
        treeMap.put("Дон Карлеоне", (long) -123);
        treeMap.put("Нестор Махно", (long) -356);
        treeMap.put("Иван Чапаев", (long) 0);
        treeMap.put("Петька Чапаев", (long) 3170);
        treeMap.put("Рамиль Чапаев", (long) 17340);
        treeMap.put("Аль Пачино", (long) 15467001);

        for (Map.Entry<String, Long> set : treeMap.entrySet()) {
            System.out.println(set.getKey() + " -> " + set.getValue());
        }

    }
}
