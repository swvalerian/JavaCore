package com.swvalerian.javacore.module01.chapter18;

import java.util.Map;
import java.util.TreeMap;

public class List16AtPage622thenComp {
    public static void main(String[] args) {
//        первый способ реализации интерфейса Comparator
//        MyCompThen firstComp = new MyCompThen();
//        MyComp lastComp = new MyComp().reversed();
//        Map<String, Integer> treeMap = new TreeMap<>(firstComp.thenComparing(lastComp);
//
//        тут второй способ
        TreeMap<String, Integer> treeMap = new TreeMap<>(new MyCompThen().thenComparing(new MyComp()));
//
//
        // а надо сделать с помощью лямбда выражений! я неумею, надо освоить!
//        TreeMap<String, Integer> treeMap = new TreeMap<>()

        treeMap.put("Аль Капоне", 500);
        treeMap.put("Аль Пачино", 300);
        treeMap.put("Аль Доминикано", 900);
        treeMap.put("Фредерик Доминикано", 4100);
        treeMap.put("Фредерик Бекбедер", 7030);
        treeMap.put("Доминик Джокер", 7030);

        for (Map.Entry<String, Integer> set : treeMap.entrySet()) {
            System.out.println(set.getKey() + ":" + set.getValue());
        }

    }
}
