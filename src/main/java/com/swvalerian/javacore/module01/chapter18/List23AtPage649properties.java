// демонстрация применения "списка свойств" - тока нахрена это надо, есливсе делается с помощью каркаса коллекций. ну да пусть будет
package com.swvalerian.javacore.module01.chapter18;

import java.util.Properties;
import java.util.Set;

public class List23AtPage649properties {
    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Москва", "Россия");
        capitals.put("Греция", "Афины");
        capitals.put("Нидерланды", "Амстердам");
        capitals.put("Буэнос-Аэрс", "Аргентина");
        capitals.put("Вена", "Австрия");

        // получаю множество ключей
        Set<?> keys = capitals.keySet();

        for (Object in : keys) {
            System.out.println(in + "столица страны -=> " + capitals.getProperty((String) in));
            // ДЛЯ ЧЕГО ТАК ИЗВРАЩАТЬСЯ? ЕСЛИ можно так   + capitals.get(in)
        }

        System.out.println();
        // находим то, чего нету
        System.out.println(capitals.getOrDefault("Токио", "Флаг в руки! Держи карман шире!"));
        System.out.println(capitals.getProperty("Шанхай", "Китай")); // вот тоже самое что и строчка выше
        // зачем два одинаковых метода!? Как говориться - эхо наследства от интерфейсов отображения!?
        // выполняя второй пример - разобрался в разнице этих двух методов...
        // А вот сейчас понял разницу в методах! getOrDefault ищет без вложенных списков свойств. Тока в главном-родительском
        // getProperty ищет и вложенные списки свойств тоже! Однако!
    }
}
