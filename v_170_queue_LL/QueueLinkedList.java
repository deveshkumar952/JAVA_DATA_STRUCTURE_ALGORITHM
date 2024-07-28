public class QueueLinkedList {
    SinglyLinkedList list;
    public QueueLinkedList() {
        list = new SinglyLinkedList();
        System.out.println("The queue is successfully created");
    }

    //isEmpty method
    public boolean isEmpty(){
        if(list.head == null){
            return true;
        }
        else{
            return false;
        }
    }

    //enqueue
    public void enqueue(int data){
        list.insertInLinkedList(data, list.size);
        System.out.println("succesfully inserted "+ data);
    }

    // dequeue
    public int dequeue(){
        int value = -1;
        if(isEmpty()){
            System.out.println("The queue is empty");
        }
        else{
            value = list.head.value;
            list.deletionOfNode(0);
        }
        return value;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        }
        else{
            return list.head.value;
        }
    }

    //delete
    public void deletequeue(){
        list.head = null;
        list.tail = null;
        System.out.println("The queue is successfully deleted");
    }
}
