/*
Реализовать анализатор текста, который принимает строку и проверяет,
что у нее закрыты все открытые скобки вот корректная строка - "[({})]"
"[({})" - не корректно!

*/

package com.swvalerian.javacore.module01.praktika;

import java.util.*;

public class module1_2practice {
    public static void main(String[] args) {



        /*// пример для практического задания номер 1
        List<Integer> collectOne = new ArrayList<>();
        collectOne.add(6);
        collectOne.add(4);
        collectOne.add(6);
        collectOne.add(1);
        collectOne.add(8);
        collectOne.add(100);
        collectOne.add(-100);
        collectOne.add(44);
        System.out.println(collectOne);

        List<Integer> collectTwo = new ArrayList<>();
        collectTwo.add(3);
        collectTwo.add(8);
        collectTwo.add(76);
        collectTwo.add(504);
        collectTwo.add(100);
        collectTwo.add(1);
        System.out.println(collectTwo);

        System.out.println(sortCommonElem(collectOne, collectTwo));

        // пример для практического задания номер 2
        String testText;
        testText = new String("[(строк}а для {]примера) ну и по желанию эксперементируе(м)");
        analBrackets(testText);*/
    }

    public static TreeSet sortCommonElem(List<Integer> list1, List<Integer> list2) {
        TreeSet<Integer> treeSet = new TreeSet<>(); // создаем множество, в котором по умолчанию реализуется естественная сортировка

        // какое из множеств меньше, то и будет являться маской общих элементов, остальные элементы сотруться!
        if (list1.size() >= list2.size()) {
            list1.retainAll(list2); // вот тут и происходит магия, метод всё делает за нас, мы ему лишь предоставили маску
            treeSet.addAll(list1);
            return treeSet; // элементы вернуться отсортированные, в естественном порядке
        }
        else {
            list2.retainAll(list1); // вот тут и происходит магия, метод всё делает за нас, мы ему лишь предоставили маску
            treeSet.addAll(list2);
            return treeSet; // элементы вернуться отсортированные, в естественном порядке
        }
    }

    public static void analBrackets(String text){
        int[] aOfBrackets;
        String[] aText;

        aText = text.split(""); // из строки получаем массив

        // инициализация массива
        // этот массив нужен для подсчета количества открытых и закрытых скобок, для дальнейшего сравнения его элементов
        aOfBrackets = new int[6];

        // перебираем каждый элемент массива, и при обнаружение скобки - инкременируем соостветствующий индексу элемент массива
        for (int i = 0; i < aText.length; i++){
            switch (aText[i]) {
                case "[" : ++aOfBrackets[0];
                    break;
                case "(" : ++aOfBrackets[1];
                    break;
                case "{" : ++aOfBrackets[2];
                    break;
                case "]" : ++aOfBrackets[3];
                    break;
                case ")" : ++aOfBrackets[4];
                    break;
                case "}" : ++aOfBrackets[5];
                    break;
            }
        }

        // сопоставляем количество открытых скобок - закрытым, в соответствии с логикой заполнения массива
        if ((aOfBrackets[0] == aOfBrackets[3]) && (aOfBrackets[1] == aOfBrackets[4]) && (aOfBrackets[2] == aOfBrackets[5])) {
            System.out.println("Всё в порядке, все открытые скобки соотвествуют закрытым!");
        }
        else
        {
            System.out.println("Ошибка! Не все открытые скобки - закрыты!");
        }
    }
}
