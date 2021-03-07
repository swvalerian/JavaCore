package com.swvalerian.javacore.module01.chapter10;

public class AtPage282ChainExDemo {
    static void demoProc() {
        // создаю исключение
        NullPointerException e = new NullPointerException("Верхний уровень");
        ArrayIndexOutOfBoundsException outOfb = new ArrayIndexOutOfBoundsException("третий уровень");
        // добавляю причину исключения
        e.initCause(new ArithmeticException("это я - причина исключения!").initCause(outOfb));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoProc();
        } catch (NullPointerException e) {
            // сначало выведем причину верхнего уровня
            System.out.println("Перехваченное исключение: " + e);
            // вывести исключение, послужившее причиной для исключения первого уровня
            System.out.println("Первопричина исключения это - " + e.getCause());
            System.out.println("Но на самом деле есть еще вот причина, самая основная: " + e.getCause().getCause());
            System.out.println("А больше причин нету, смотрите сами: " + e.getCause().getCause().getCause());
        }
    }
}
