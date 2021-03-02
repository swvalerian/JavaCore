// демонстрация применения класса hashtable
package com.swvalerian.javacore.module01.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;

public class List21AtPage645hashetable {
    public static void main(String[] args) {
        Hashtable<String, Double> hashtable = new Hashtable<>();
        Enumeration<String> names;

        String str;
        Double bal;

        hashtable.put("Джон Смит", 18744.00);
        hashtable.put("Малькольм Смит", 44.00);
        hashtable.put("Джон Самшитов", 11.00);
        hashtable.put("Элвин Бурундук", 97.00);

        names = hashtable.keys();

        // вывод счета из хеш-таблицы
        while (names.hasMoreElements()) {
            str = names.nextElement();
            System.out.println(str + " = " + hashtable.get(str));
        }

        // внести сумму 1000 на счет Джон Самшитов
        hashtable.put("Джон Самшитов", hashtable.get("Джон Самшитов") + 1000);

        System.out.println("Баланс Джона Самшитова = " + hashtable.get("Джон Самшитов"));

    }
}
