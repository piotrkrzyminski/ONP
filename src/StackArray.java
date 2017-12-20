public class StackArray implements Stack {

    private int maxSize;
    private int[] array;
    private int top;

    public StackArray(int size) {
        maxSize = size;
        array = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        array[++top] = value;
    }

    public int pop() {
        return array[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
