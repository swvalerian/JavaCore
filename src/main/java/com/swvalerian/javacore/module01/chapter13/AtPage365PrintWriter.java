/*Демонстрация применения класса PrintWriter
этот класс упрощает интернационализацию программ
в учебный целях - нет никаких преимуществ перед стандартным потоком вывода System.out
* */
package com.swvalerian.javacore.module01.chapter13;

import java.io.PrintWriter;

public class AtPage365PrintWriter {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("Привет, друган!");
        pw.println(86+67);
        pw.println("Hi world!" + '\n');
        pw.println(85 + " а 85 стал строкой");
    }
}
