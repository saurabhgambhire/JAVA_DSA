package Queue;

public class QueueDriver {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        for (int i = 0; i < 10; i++) {
            queue.insert(i);
        }

        queue.display();

        queue.remove();

        queue.display();

    }
}
