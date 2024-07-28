
public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    public void insertInLinkedList(int nodeValue){
        Node node = new Node();
        node.value = nodeValue;
        if(head == null){
            createSinglyLinkedList(nodeValue);
            return;
        }
        else{
            node.next = head;
            head = node;
        }
    }
    public void deletionNode(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        else{
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
        }
    }
}
