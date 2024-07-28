

public class Stack {
    LinkedList linkedList;
    public Stack(){
        linkedList = new LinkedList();
    }

    //Push method
    public void push(int value){
        linkedList.insertInLinkedList(value);
        System.out.println("inserted "+value+" successfull");
    }

    //isEmpty
    public boolean isEmpty(){
        if(linkedList.head == null){
            return true;
        }
        else{
            return false;
        }
    }
    //pop

    public int pop(){
        int result = -1;
        if(isEmpty()){
            System.out.println("The stack is empty");
        }
        else{
            result = linkedList.head.value;
            linkedList.deletionNode();
        }
        return result;
    }
    //peek method
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is Empty");
            return -1;
        }
        else{
            return linkedList.head.value;
        }
    }
    //delete stack
    public void deleteStack(){
        linkedList.head = null;
        System.out.println("The stack is deleted");
    }
}
