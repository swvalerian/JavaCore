// демонстрация использования ссылки на метод экземпляра вместе с разными обьектами
// имя_класса::имя_метода_экземпляра

package com.swvalerian.javacore.module01.chapter15;

public class LambdaFuncDemo2AtPae457 {
    // функциональный интерфейс, с методом, принимающим два ссылочных аргумента и возращающий логическое значение
    interface MyFunc<T> {
        boolean func(T v1, T v2);
    }

    // класс для хранения максимальной температуры за день
    static class HighTemp {
        private int hTemp;

        HighTemp(int ht) {
            hTemp = ht;
        }
        // сравниваем температуру двух обьектов типа HighTemp
        boolean sameTemp(HighTemp ht2) {
            return hTemp == ht2.hTemp; // если температура одинаковая - тогда true
        }
        boolean lessThanTemp(HighTemp ht2) {
            return hTemp < ht2.hTemp;
        }
    }


        static <T> int counter(T[] vals, MyFunc<T> f, T v) {
            int count = 0;
            for (int i=0; i < vals.length; i++) {
                if ( f.func(vals[i], v)) {
                    count++;
                }
            }
            return count;
        }


    public static void main(String[] args) {
        int count;
        //создаем массив обьектов типа HighTemp
        HighTemp[] weekDaysHigh = {
                new HighTemp(82), new HighTemp(90),
                new HighTemp(85), new HighTemp(89),
                new HighTemp(92), new HighTemp(91),
                new HighTemp(80), new HighTemp(88)
        };

        count = counter(weekDaysHigh, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Вот столько дней была максимальная температура 89: " + count);

        count = counter(weekDaysHigh, HighTemp::lessThanTemp, new HighTemp(90));
        System.out.println("Вот столько дней температура была меньше 90 : " + count);
    }
}
