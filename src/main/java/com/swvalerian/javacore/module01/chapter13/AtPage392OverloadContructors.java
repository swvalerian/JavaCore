/*Демонстрация работы перегруженных конструкторов, а так же пример статичного импорта из класса System*/
package com.swvalerian.javacore.module01.chapter13;
import static java.lang.System.*; // теперь можно записывать команды без указания главного класса System

public class AtPage392OverloadContructors {
    static class OverLoad {
        int a;
        int b;

        OverLoad(int a, int b){
            this.a = a;
            this.b = b;
        }

        OverLoad(int i){
            this(i,i);
        }

        OverLoad(){
            this(0);
        }

    }
    public static void main(String[] args) {
        OverLoad ol = new OverLoad();
        out.println(ol.a + ol.b + 8);

        assert ol.a != 0;
    }
}
