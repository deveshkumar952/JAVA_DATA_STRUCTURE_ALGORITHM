

public class CircularSinglyLL {
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertCSLL(int nodevalue , int location){
        Node node = new Node();
        node.value = nodevalue;
        if(head == null){
            createCSLL(nodevalue);
            return;
        }
        else if(location == 0){
            node.next = head;
            head = node;
            tail.next = head;
        }
        else if(location>=size){
            tail.next = node;
            tail = node;
            tail.next = head;
        }
        else{
            Node temoNode = head;
            int index = 0;
            while(index <location -1){
                temoNode = temoNode.next;
                index++;
            }
            node.next = temoNode.next;
            temoNode.next = node;
        }
        size++;
    }

    //Traversal Method
    public void traveraslCSLL(){
        if(head != null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!= size -1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
        else{
            System.out.println("\nCSLL does not exist!!");
        }
    }

    public boolean searchNode(int nodeValue){
        if(head != null){
            Node tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value == nodeValue){System.out.println("Found node at location: "+ i);
                return true;
            }
            tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found!");
        return false;
    }

    //Delete method
    public void deleteNode(int location){
        if(head == null){
            System.out.println("The csll does not exists!!");
            return ;
        }
        else if(location ==0){
            head = head.next;
            tail.next = head;
            size--;
        }
        if(size==0){
            tail = null;
            head.next = null;
            head = null;
        }
        else if(location>=size){
            Node tempNode = head;
            for(int i = 0;i<size -1;i++){
                tempNode = tempNode.next;
            }
            if(tempNode==head){
                head.next = null;
                tail = head = null;
                size--;
                return;
            }
            tempNode.next = head;
            tail = tempNode;
            size--;
        }
        else{
            Node tempNode = head;
            for(int i=0;i<location-1;i++){
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    //Delete csll
    public void deleteCSLL(){
        if(head == null){
            System.out.println("The csll does not exist!");
        }
        else{
            head = null;
            tail.next = null;
            tail = null;
            System.out.println("The csll has been deleted");
        }
    }
}
