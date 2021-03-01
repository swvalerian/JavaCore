// демонстрация применения класса стэк! любопытно, мне понравилось
package com.swvalerian.javacore.module01.chapter18;

import javax.sound.midi.Soundbank;
import java.util.EmptyStackException;
import java.util.Stack;

public class List20AtPage641stack {
    static void showPush(Stack<Integer> st, int intPush) {
        st.push(intPush);
        System.out.println("push(" + intPush + ")");
        System.out.println("Stack:" + st.toString());
    }

    static void showPop(Stack<Integer> st) {
        System.out.print("pop -> ");
        int a = st.pop(); // вот мы получили элемент из стека (одновременно удалив его из стека)
        System.out.println(a);
        System.out.println("Stack: " + st.toString());
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Stack:" + stack.toString());
        showPush(stack, 17);
        showPush(stack, 25);
        showPush(stack, 78);
        showPush(stack, 14);
        showPop(stack);
        showPop(stack);
        showPop(stack);
        showPop(stack);

        try {
            showPop(stack);
        }
        catch (EmptyStackException e) {
            System.out.println("А стэк уже пустой!");
        }

    }
}
