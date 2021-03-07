package com.swvalerian.javacore.module01.chapter10;

public class AtPage277Finnaly {
    public static void procA(){
        try {
            System.out.println("In procA");
            throw new ArithmeticException();
        } finally {
            System.out.println("block code finally in procA");
        }
    }
    static void procB(){
        try {
            System.out.println("In procB");
            return;
        } finally { // все равно код в блоке финалли выполнится
            System.out.println("block code finally in procB");
        }
    }
    static void procC(){
        try {
            System.out.println("in ProcC");
        } finally {
            System.out.println("block code finally in procC");
        }
    }
    public static void main(String[] args) {
        try {
            procA();
        } catch (ArithmeticException e) {
            System.out.println("in Main class :" + e);
        }
        procB();
        procC();
    }
}
