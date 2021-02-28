// компаратор используется для листинга номер 15
package com.swvalerian.javacore.module01.chapter18;

import java.util.Comparator;

public class MyCompDemo2 implements Comparator<String> {
    // переопределять метод equals не требуется!

    public int compare(String str1, String str2){
        int indexStr1 = str1.lastIndexOf(" ");  // находим последний пробел и получаем следующий индекс
        int indexStr2 = str2.lastIndexOf(" ");  // т.к. сначало имя, потом пробел, а потом фамилия, то и получим доступ к фамилии

        int ifFamEquals = str1.substring(indexStr1).compareToIgnoreCase(str2.substring(indexStr2)); // если фамилии равны вернется 0
        if (ifFamEquals!=0) {
            return ifFamEquals;
        }
        return str1.compareTo(str2); // если фамилии равны, произойдет сравнение по имени! выполнится именно эта строка кода
    }

}
