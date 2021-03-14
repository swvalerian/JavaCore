package com.swvalerian.javacore.module01.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDeomAtPage740 {
    public static void main(String[] args) {
        String s = "Это знак авторскasоasгоas true as &asasasasaaasdfasdfasf; a &co4pydfdfh; ;- not, это уже не ра;спознается системой html как знак";
        byte[] buf = s.getBytes(); // загнали строку в массив

        ByteArrayInputStream bAIS = new ByteArrayInputStream(buf); // создали поток ввода, с которым и будем работать

        boolean marked = false;
        int c;

        // во первых строках загоняем входящий поток в буфер входящего потока
        try (BufferedInputStream bufInput = new BufferedInputStream(bAIS)) {
            while ((c = bufInput.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            bufInput.mark(2); // вот с этим пока непонял, что за цифра указывается в качестве параметра!?
                            // как я понял - это ключ, по которому потом происходит возврат, после reset()
                            marked = true;
                        } else {
                            marked = false;
                        }
                        break;
                    case (';') :
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    case (' ') :
                        if (marked) {
                            marked = false;
                            bufInput.reset();
                            System.out.print('&');
                        } else {
                            System.out.print((char) c);
                        }
                        break;
                    default :
                        if (!marked) {
                            System.out.print((char) c);
                        }
                }
            }
        } catch (IOException ex) {
            System.out.println("ошибка");
        }
    }
}
