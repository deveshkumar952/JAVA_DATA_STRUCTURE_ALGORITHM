

public class main {
    public static void main(String[] args) {
        QueueLinkedList QLL = new QueueLinkedList();

        // boolean result = QLL.isEmpty();
        // System.out.println("Is the queue empty? " + result);

        QLL.enqueue(1);
        QLL.enqueue(2);
        QLL.enqueue(3);

        // int result1 = QLL.dequeue();
        // System.out.println("The first element dequeued is " + result1);
        int result2 = QLL.peek();
        System.out.println(result2);
        QLL.deletequeue();
    }
}
