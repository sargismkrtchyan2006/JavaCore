package homework.bracechecker;

public class Stack {
    private int[] array = new int[10];
    private int size;

    public Stack() {
        size = -1;
    }


    public void push(int x) {
        if (size == array.length) {
            System.out.println("stack is end");
        } else {
            array[++size] = x;
        }
    }

    public int pop() {
        if (size < 0) {
            return 0;
        } else {
            return array[size--];
        }
    }

    public boolean isempty() {
        return size == -1;
    }
}
