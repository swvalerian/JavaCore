package com.swvalerian.javacore.module01.chapter13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOfAtPage381 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) {
            System.out.println("а является экземпляром класса А");
        }

        if (b instanceof B) {
            System.out.println("b является экземпляром класса B");
        }

        if (c instanceof A) {
            System.out.println("c можно привести к типу А");
        }

        if (a instanceof C) { // здесь будет false
            System.out.println("a можно привести к типу С"); // это неверное утверждение - не выведется!
        }

        A ca;
        ca = d;

        if (ca instanceof D) {
            System.out.println("ca ссылается на d и является экземпляром D");
        }

        ca = c;

        System.out.println("теперь са ссылается на С");

        if (ca instanceof D) {
            System.out.println("са можно привести к типу D");
        } else {
            System.out.println("ca нельзя привести к типу D");
        }

        if (ca instanceof A) {
            System.out.println("са можно привести к типу А");
        }
    }
}
