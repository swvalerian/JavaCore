package com.swvalerian.javacore.module01.chapter15;

public class LambdaExcDemoAtPage451 {

    interface AverageNumberFunc {
        Double func(Double[] doub) throws EmptyArrayException;
    }

    static class EmptyArrayException extends Exception { // исключение можно было и не добавлять, тогда выводится NaN значение
        EmptyArrayException() {
            super("Массив пустой!");
        }
    }

    public static void main(String[] args) throws EmptyArrayException {
        Double[] arrayOfDouble = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0}; // семь элементов в массиве

        AverageNumberFunc average = i -> {
            Double result = 0.0;

            if (i.length == 0) {
                throw new EmptyArrayException();
            }

            for (int j = 0; j < i.length; j++) {
                result += i[j];
            }
            return result/i.length; // сумма средних значений массива = 4
        };

        System.out.println(average.func(arrayOfDouble));
        // System.out.println(average.func(new Double[0])); // РАСКОМЕНТИРУЙ МЕНЯ И БУДЕТ ИСКЛЮЧЕНИЕ!!!
    }
}
