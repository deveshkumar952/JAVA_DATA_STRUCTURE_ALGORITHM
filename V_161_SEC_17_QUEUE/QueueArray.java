public class QueueArray {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;

    public QueueArray(int size){
        this.arr = new int[ size];
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("The Queue is succesffully created with size of: "+ size);
    }

    public boolean isFull(){
        if(topOfQueue == arr.length - 1){
            return true;
        }
        else {
            return false;
        }
    }

    //IsEmpty
    public boolean isEmpty(){
        if((beginningOfQueue == -1) || (beginningOfQueue == arr.length) ){
            return true;
    }
    else{
        return false;
    }
}

public void enQueue(int value){
    if(isFull()){
        System.out.println("The Queue is full, cannot add more elements");
    }
    else if(isEmpty()){
        beginningOfQueue = 0;
        topOfQueue++;
        arr[topOfQueue] = value;
        System.out.println("succesffuly inserted " + value+ " in the queue");
    }
    else{
        topOfQueue++;
        arr[topOfQueue] = value;
        System.out.println("succesffuly inserted " + value+ " in the queue");

    }
}

    //dequeue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The Queue is empty, cannot remove elements");
            return -1;
        }
        else{
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue > topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            return result;
        }
    }

    // peek
    public int peek(){
        if(!isEmpty()){
            return arr[beginningOfQueue];
        }
        else{
            System.out.println("The Queue is empty, cannot peek");
            return -1;
        }
    }

    //delete queue
    public void deleteQueue(){
        arr = null;
        System.out.println("the queue is successfully deleted");
    }
}