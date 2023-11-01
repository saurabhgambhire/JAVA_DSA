package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> integers = new ArrayDeque<>();
        for (int i = 0; i < 10; i++) {
            integers.push(i);
        }

//        System.out.println(integers.pop());

        // for reverse iteration
        Iterator<Integer> integerIterator = integers.descendingIterator();
//        while (integerIterator.hasNext())
//            System.out.println(integerIterator.next());

        while (!integers.isEmpty())
            System.out.println(integers.pop());
    }
}
