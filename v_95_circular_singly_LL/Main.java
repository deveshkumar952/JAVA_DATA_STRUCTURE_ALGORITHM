

public class Main {
    public static void main(String[] args) {
    CircularSinglyLL csll = new CircularSinglyLL();
    csll.createCSLL(3);
    csll.insertCSLL(4, 1);
    csll.insertCSLL(5, 2);
    csll.insertCSLL(6, 3);
    csll.insertCSLL(7, 4);
    csll.insertCSLL(8, 5);
    csll.insertCSLL(9, 6);
    // System.out.println(csll.head.value);
    // System.out.println(csll.head.next.value);

    csll.traveraslCSLL();
    // csll.searchNode(6);
    // csll.deleteNode(2);
    csll.deleteCSLL();
    csll.traveraslCSLL();
    }
}
