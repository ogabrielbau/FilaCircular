public class CircularQueue<T> {
    private int top;
    private int base;
    private T[] data;
    private int size;

    public CircularQueue(int capacity) {
        data = (T[]) new Object[capacity];
        top = 0;
        base = 0;
        size = 0;
    }

    public boolean enqueue(T value) {
        if (isFull()) {
            System.out.println("Fila cheia");
            return false;
        }
        data[base] = value;
        base = (base + 1) % data.length;
        size++;
        return true;
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return null;
        }
        T value = data[top];
        top = (top + 1) % data.length;
        size--;
        return value;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
            return;
        }

        System.out.print("Itens na fila: ");
        for (int i = 0; i < size; i++) {
            int index = (top + i) % data.length;
            System.out.print(data[index] + " ");
        }
        System.out.println();
    }
}
