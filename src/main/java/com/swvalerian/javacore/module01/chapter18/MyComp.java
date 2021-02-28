// компаратор используется для листингов номер 13 и листинг номер 16
package com.swvalerian.javacore.module01.chapter18;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    public int compare(String a, String b){
        String aStr = a;
        String bStr = b;

        return bStr.compareTo(aStr); // таким образом изменится сравнение, будет в обратном порядке
    }
}
