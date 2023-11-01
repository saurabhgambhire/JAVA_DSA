package Stacks;

public class CustomStack {
    public static void main(String[] args) throws StackException {
        StackClass stackClass = new StackClass();
        for (int i = 0; i < 5; i++) stackClass.push(i);

        while (!stackClass.isEmpty())
            System.out.println(stackClass.pop());
    }
}
