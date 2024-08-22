public class Main {
    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>(5);
        //Insersão de valores
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Quantidade de valores na fila: " + queue.getSize());
        queue.printQueue();
        // Insersão além do limite
        queue.enqueue(60);

        //tira dois valores
        System.out.println("Item removido: " + queue.dequeue());
        System.out.println("Item removido: " + queue.dequeue());

        System.out.println("O novo tamanho da fila é " + queue.getSize());

        queue.printQueue();
    }
}
