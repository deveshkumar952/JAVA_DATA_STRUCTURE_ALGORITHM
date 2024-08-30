package v_147_sec_15_stack;


public class Stack {
    //stack using array
    int[] arr;
    int topOfStack;

    public Stack(int size){
        this.arr = new int [size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    //IsEmpty
    public boolean isEmpty(){
        if(topOfStack == -1){
            return true;
        }
        else{
            return false;
        }
    }
    //isFull
    public boolean isFull(){
        if(topOfStack == arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }

    //push
    public void push(int value){
        if(isFull()){
            System.out.println("The stack is full");
        }
        else{
            arr[topOfStack+1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }
    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;

        }
    }

    //peek method
    public int peek(){
        if (isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        else{
            return arr[topOfStack];
        }
    }

    //delete method
    public void deleteStack(){
        arr = null;
        System.out.println("the stack is successfully deleted");
    }
}
