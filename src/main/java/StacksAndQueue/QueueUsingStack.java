package StacksAndQueue;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> secound;

    public QueueUsingStack() {
        first = new Stack<>();
        secound = new Stack<>();
    }

    public void push(int val) {
        first.push(val);
    }

    public int pop() {
        while (first.isEmpty()) {
            secound.push(first.pop());
        }
        Integer removed = secound.pop();
        while (secound.isEmpty()) {
            first.push(secound.pop());
        }
        return removed;
    }

    public int peek() {
        return first.peek();
    }
}

