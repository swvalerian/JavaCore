package com.swvalerian.javacore.module01.chapter15;

    interface MyFunc {
        MyClass func(int n);
    }

    class MyClass {
        private int val;

        MyClass(int v) {
            val = v;
        }

        MyClass(){
            val = 0;
        }
        int getVal() {
            return val;
        }
    }

public class ConstructorRefDemoAtPage462 {
    public static void main(String[] args) {
        MyFunc myRef = MyClass::new;
        MyClass my = myRef.func(100); // тоже самое можно было написать new MyClass(100);
        System.out.println("Значение val в обьекте my = " + my.getVal());
    }
}
