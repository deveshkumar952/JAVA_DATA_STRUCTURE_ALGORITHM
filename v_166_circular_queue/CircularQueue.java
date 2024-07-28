public class CircularQueue {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;

    public CircularQueue(int size){
        this.arr = new int[size];
        this.size = size;
        this.topOfQueue = -1;
        this.beginningOfQueue = -1;
        System.out.println("the CQ is successfully created");
    }

    //isEmpty method
    public boolean isEmpty(){
        if(topOfQueue == -1){
            return true;
        }
        else{
            return false;
        }
    }

    //isFull
    public boolean isFull(){
        if(topOfQueue + 1==  beginningOfQueue){
            return true;
        }
        else if(beginningOfQueue == 0 && topOfQueue+1 == size){
            return true;
        }
        else{
            return false;
        }
    }

    //enqueue method
    public void enqueue(int data){
        if(isFull()){
            System.out.println("the queue is full");
        }
        else if(isEmpty()){
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = data;
            System.out.println("successfully inserted " + data);
        }
        else{
            if(topOfQueue+1 == size){
                topOfQueue = 0;
            }
            else{
                topOfQueue++;
            }
            arr[topOfQueue] = data;
            System.out.println("Successfully inserted " + data);
        }
    }

    //dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("the queue is empty");
            return -1;
        }
        else{
            int result = arr[beginningOfQueue];
            arr[beginningOfQueue] = 0;
            if(beginningOfQueue == topOfQueue){
                beginningOfQueue = topOfQueue = -1;
            }
            else if(beginningOfQueue+1 == size){
                beginningOfQueue = 0;
            }
            else{
                beginningOfQueue++;
            }
            return result;
        }
    }
    //peek method
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        else{
            return arr[ beginningOfQueue];
        }
    }

    //delete queue
    public void deleteQueue(){
        arr = null;
        System.out.println("The cq is successfully deleted");
    }
}
