// компаратор используется для листинга List16AtPage622thenComp
package com.swvalerian.javacore.module01.chapter18;

import java.util.Comparator;

public class MyCompThen implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i = o1.lastIndexOf(" ");
        int j = o2.lastIndexOf(" ");
        return o1.substring(i).compareToIgnoreCase(o2.substring(j)); // магия однако!
    }
}
