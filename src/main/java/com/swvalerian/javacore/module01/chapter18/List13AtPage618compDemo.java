package com.swvalerian.javacore.module01.chapter18;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class List13AtPage618compDemo {
    public static void main(String[] args) {
        // указал компаратор, класс - который создал сам, где реализовал метод compare
        Set<String> treeSet = new TreeSet<>(new MyComp());
        //filling treeset
        treeSet.add("f");
        treeSet.add("a");
        treeSet.add("h");
        treeSet.add("j");
        treeSet.add("u");
        treeSet.add("e");
        treeSet.add("z");
        treeSet.add("q");
        treeSet.add("l");

        System.out.println(treeSet);

        // балуюсь различными способами вывода элементов коллекций
        for(String st : treeSet) {
            System.out.print(" " + st + " ");
        }

        System.out.println(""); // и еще раз!
        Iterator<String> it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.print("-" + it.next() + "-");
        }

        System.out.println("\n\n---------------------reverse--------------------\n");
        // еще один способ использования компараторов
        Set<String> treeSetRevers = new TreeSet<>(new MyComp().reversed()); // вот тут происходит магия, делаем реверс компаратора
        //filling treeset
        treeSetRevers.add("f");
        treeSetRevers.add("a");
        treeSetRevers.add("h");
        treeSetRevers.add("j");
        treeSetRevers.add("u");
        treeSetRevers.add("e");
        treeSetRevers.add("z");
        treeSetRevers.add("q");
        treeSetRevers.add("l");

        for (String s : treeSetRevers){
            System.out.print("!" + s + "!");
        }

    }
}
