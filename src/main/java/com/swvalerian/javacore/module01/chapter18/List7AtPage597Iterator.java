// демонстрация работы итератора
package com.swvalerian.javacore.module01.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List7AtPage597Iterator {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        // filling arraylist
        al.add("B");
        al.add("U");
        al.add("K");
        al.add("A");
        al.add("S");
        al.add("H");
        al.add("K");
        al.add("A");

        // вывод коллекции с помощью итератора
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext()) {
            String elem = iterator.next();
            System.out.println(elem + " hashcode = " + elem.hashCode());
        }

        // изменение содержимого коллекции
        ListIterator<String> litr = al.listIterator();

        while (litr.hasNext()) {
            String temp = litr.next();
            litr.set(temp + " wow!");
        }
        // после выполнения цикла, указатель итератора будет стоять на последнем элементе! Вот так то
        // и поэтому ниже перебор цикла идет в обратном порядке

        System.out.println(al); // вывод arraylist по старинке

        while (litr.hasPrevious()) {
            System.out.print(litr.previous());
        }

        // еще один эксперимент, удалим элемент из коллекции
        System.out.println();
        litr.next(); // сначало получим элемент
        litr.remove(); // чтоб его и удалить!
        while (litr.hasNext()) {
            System.out.print(litr.next());
        }

        System.out.println();
        System.out.println(iterator.hasNext()); // выведет false и это именно потому, что указатель итератора в цикле прошелся по всем элементам!

    }
}
