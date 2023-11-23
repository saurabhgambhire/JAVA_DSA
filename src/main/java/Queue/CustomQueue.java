package Queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean insert(int item) {
        if (isFull())
            return false;

        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty");
        int remove = data[0];
        // shifting the elements
        for (int i = 0; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return remove;
    }

    public int peek() {
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]);
        }
    }
}
