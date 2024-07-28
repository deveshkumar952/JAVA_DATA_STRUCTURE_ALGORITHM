
// package v_77_Singly_linkedList;

public class Main {
    public static void main(String[] args) {
    SinglyLinkedList sLL = new SinglyLinkedList();
    sLL.createSinglyLinkedList(5);
    // System.out.println(sLL.head.value);

    sLL.insertInLinkedList(6,1);
    sLL.insertInLinkedList(7,2);
    sLL.insertInLinkedList(8,3);
    sLL.insertInLinkedList(9,4);
    // System.out.println(sLL.head.next.value);
    // System.out.println(sLL.head.next.next.value);
    sLL.traverseSinglyLinkedList();

    sLL.searchNode(7);
    sLL.deletionOfNode(2);
    sLL.traverseSinglyLinkedList();
    sLL.deleteSLL();
    sLL.traverseSinglyLinkedList();
}
}
