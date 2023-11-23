package StacksAndQueue;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++)
            stack.push(i);

//        for (Integer integer : stack) System.out.println(integer);
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
