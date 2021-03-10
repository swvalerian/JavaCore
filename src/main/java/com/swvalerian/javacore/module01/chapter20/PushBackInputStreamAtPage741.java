package com.swvalerian.javacore.module01.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushBackInputStreamAtPage741 {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        byte[] b = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(b);
        int c;

        try (PushbackInputStream f = new PushbackInputStream(in)) {
            while ((c = f.read()) != -1 ) {
                switch (c) {
                    case '=' :
                        if ((c = f.read()) == '=') { // если за знаком равно идет знак равно, тогда это оператор сравнения
                            System.out.print(".eq.");
                        } else {
                            System.out.print("<-"); // если за знаком равно идет любой другой символ - тогда это оператор присваивания
                            System.out.println("-" + f.available() + "-"); // здесь в буфере будет дуступно меньше
                            f.unread(c); // вернем прочитанный символ на место (в буфер памяти).
                            System.out.println("-" + f.available() + "-"); // чем здесь ведь мы вернули!
                        }
                        break;
                    default :
                        System.out.print((char) c);
                        break;
                }
            }

        } catch ( IOException ex) {
            System.out.println("Отловил исключение ввода-вывода");
        }
    }
}
