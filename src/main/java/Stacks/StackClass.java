package Stacks;

public class StackClass {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public StackClass() {
        this(DEFAULT_SIZE);
    }

    public StackClass(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int peek() throws StackException {
        if (isEmpty())
            throw new StackException("Cannot peak from an empty stack !!");
        return data[ptr];
    }

    public int pop() throws StackException {
        if (isEmpty())
            throw new StackException("Cannot pop from an empty stack !!");
        return data[ptr--];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
