// demo работы с TreeMap  (древовидное отображение)
package com.swvalerian.javacore.module01.chapter18;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class List12AtPage613treeMap {
    public static void main(String[] args) {
        // создаю древовидное отображение
        TreeMap<String, Long> treeMap = new TreeMap<>();
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

        Set<Map.Entry<String, Long>> set = treeMap.entrySet(); // создали коллекцию из отображения

        for (Map.Entry<String, Long> el : set){
            System.out.println(el); // выводит упорядоченно, так - как было в отображении, компаратор сортировал ключи по именам от А до Я
        }

        long bablo = treeMap.get("Нестор Махно");
        treeMap.put("Нестор Махно", bablo + 10_000);

        System.out.println("\n<><><><><><><>\n");
        // само интересное!
        // на что нужно обратить внимание!
        // это то, что я изменил данные в отображении, а они (данные) автоматически поменялись в соотвествующей коллекции!
        // т.е. опять подтверждается взаимосвязь!
        for (Map.Entry<String, Long> el : set){
            System.out.println(el); // выводит упорядоченно, так - как было в отображении, компаратор сортировал ключи по именам от А до Я
        }

    }
}
