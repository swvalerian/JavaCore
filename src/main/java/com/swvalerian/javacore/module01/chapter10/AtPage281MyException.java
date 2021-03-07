// в этой программе создается специальный тип исключения. Демонстрация работы
package com.swvalerian.javacore.module01.chapter10;

public class AtPage281MyException {
    static class MyException extends Exception {
        private int detail; // поле
        MyException(int a) {  // создали конструктор, который будет инициализировать поле
            detail = a;
        }
        public String toString() { // переопределяем метод toString
            return ("MyException[ " + detail + " ]");
        }
    }

    static class ExceptionDemo {
        static void compute(int a) throws MyException {
            System.out.println("Вызван метод compute(" + a + ")");
            if (a > 10) {
                throw new MyException(a);
            }
            System.out.println("Метод завершен без ошибок");
        }
    }

    public static void main(String[] args) {
        try {
            ExceptionDemo.compute(5);
            ExceptionDemo.compute(10);
            ExceptionDemo.compute(11);
        } catch (MyException e) {
            System.out.println("Отловили исключение: " + e);
        }
    }
}
