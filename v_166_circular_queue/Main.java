public class Main {
    public static void main(String[] args) {
        CircularQueue newCQ = new CircularQueue(4);

        // boolean result = newCQ.isEmpty();
        // System.out.println(result);
        // boolean result1 = newCQ.isFull();
        // System.out.println(result1);
        newCQ.enqueue(1);
        newCQ.enqueue(2);
        newCQ.enqueue(3);
        newCQ.enqueue(4);
        // int result2 = newCQ.dequeue();
        // System.out.println(result2);
        int result3 = newCQ.peek();
        System.out.println(result3);
        newCQ.deleteQueue();
    }
}
