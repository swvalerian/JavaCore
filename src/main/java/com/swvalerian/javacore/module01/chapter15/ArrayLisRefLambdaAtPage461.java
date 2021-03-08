// отпадает необходимость явным образом реализовывать и создавать экземпляр метода Comparator
package com.swvalerian.javacore.module01.chapter15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLisRefLambdaAtPage461 {
    static class MyClass {
        private int value;

        MyClass (int v) {
            value = v;
        }
        int getValue() {
            return value;
        }
    }

    // метод compare() совместимый с аналогичным методом определенным в интерфейсе Comparator
    static class MyRef {
        static int compareMC(MyClass a, MyClass b) {
            return a.getValue() - b.getValue();
        }
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(5));
        al.add(new MyClass(-5));
        al.add(new MyClass(15));
        al.add(new MyClass(25));
        al.add(new MyClass(-15));
        al.add(new MyClass(0));

        MyClass maybah = Collections.max(al, MyRef::compareMC);

        System.out.println("Максимальный элемент = " + maybah.getValue());
    }
}
