
public class Main {
    public static void main(String[] args) {
    DoublyLinkedList dll = new DoublyLinkedList();
    // dll.createDlL(1);
    // System.out.println(dll.head.value);
    dll.insertDLL(0,0);
    dll.insertDLL(1,1);
    dll.insertDLL(2,2);
    dll.insertDLL(3,3);
    dll.insertDLL(4,4);
    // System.out.println(dll.head.next.next.value);

    // dll.traverse();
    dll.reverseTraversal();

    dll.searchNode(2);
    dll.deleteNodeDLL(2);

    dll.deleteDLL();
    }


}
