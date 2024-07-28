

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2, 1);
        cdll.insertNode(3, 02);
        // System.out.println(cdll.head.next.value);
        // cdll.traverseCDLL();
        // cdll.reverseTraversalCDLL();
        // cdll.searchNode(2);
        cdll.deleteNode(2);
        cdll.traverseCDLL();
        cdll.deleteCDLL();
        cdll.traverseCDLL();
    }
}
