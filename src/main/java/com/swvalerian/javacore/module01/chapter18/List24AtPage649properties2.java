package com.swvalerian.javacore.module01.chapter18;

import java.util.Properties;
import java.util.Set;

public class List24AtPage649properties2 {
    public static void main(String[] args) {
        Properties defProp = new Properties();
        defProp.put("Шанхай", "Китай");
        defProp.put("Токио", "Япония");

        Properties capitals = new Properties(defProp);
        capitals.put("Москва", "Россия");
        capitals.put("Греция", "Афины");
        capitals.put("Нидерланды", "Амстердам");
        capitals.put("Буэнос-Аэрс", "Аргентина");
        capitals.put("Вена", "Австрия");

        // получаю множество ключей
        Set<?> keys = capitals.keySet();

        for (Object in : keys) {
            System.out.println(in + " столица страны -=> " + capitals.getProperty((String) in));
            // ДЛЯ ЧЕГО ТАК ИЗВРАЩАТЬСЯ? ЕСЛИ можно так   + capitals.get(in)
        }

        System.out.println();
        // находим то, что есть в закромах у бабули в сундуке
        System.out.println(capitals.getProperty("Токио", "Флаг в руки! Держи карман шире!"));
        // А вот сейчас понял разницу в методах! getOrDefault ищет без вложенных списков свойств. Тока в главном-родительском
        // getProperty ищет и вложенные списки свойств тоже! Однако!
    }
}
