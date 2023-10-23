package ss11_dsa_stack_queue.practive.queue_array;

public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enqueue(4);
        myQueue.dequeue();
        myQueue.enqueue(56);
        myQueue.enqueue(2);
        myQueue.enqueue(67);
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.enqueue(24);
        myQueue.dequeue();
        myQueue.enqueue(98);
        myQueue.enqueue(45);
        myQueue.enqueue(23);
        myQueue.enqueue(435);
    }
}
