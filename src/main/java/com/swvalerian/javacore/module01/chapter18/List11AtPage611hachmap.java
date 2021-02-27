// демонстрация работы с хешмап
package com.swvalerian.javacore.module01.chapter18;

import java.security.KeyStore;
import java.util.*;

public class List11AtPage611hachmap {
    public static void main(String[] args) {
        HashMap<String, Double> hashMap = new HashMap<>();
        hashMap.put("Валерон", 44.00);
        hashMap.put("В чем разница?", 10.77);
        hashMap.put("Татьяна Панафидина", 110.77);
        hashMap.put("Юрий Лужков", 1000_000.0001);

        System.out.println(hashMap.getOrDefault("Валеhон", 777.777)); // понравился метод

        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        for (Map.Entry<String, Double> mapElem : set) {
            System.out.print(mapElem.getKey() + " : ");
            System.out.println(mapElem.getValue() + 100); // на самом деле содержимое ключей не изменится!
            mapElem.setValue(mapElem.getValue() + 1000); //  а вот так - изменится!
        }

        System.out.println("-------------------------");

        for (Map.Entry<String, Double> mapElem : set) {
            System.out.println(mapElem);
        }

        System.out.println(set.size());

        System.out.println(hashMap.getOrDefault("Валерон", 44.00)); // здесь прослеживается прямая связь!
        // множества сэт с хешсетом! как и говорилось в книге... Хешкод ключа остался неизменным, поменялось лишь значение

        System.out.println("--- Эксперементируем дальше! ---");
        Collection<Double> collections = hashMap.values(); // получил коллекцию значений
        Set<String> stringSet = hashMap.keySet(); // получил коллекцию ключей

        Iterator iton = collections.iterator();

        while (iton.hasNext()) {
            System.out.println(iton.next());
        }

        iton = stringSet.iterator(); // А! Красота! Сменили указатель итератора на другую коллекцию и вуаля-тополя!

        while (iton.hasNext()) {
            System.out.println(iton.next());
        }


        // Вот вопрос, ведь нет разницы как создать ArrayList ?
        List<Double> list = new ArrayList<>();
        list.addAll(collections);

        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.addAll(collections);


    }
}
