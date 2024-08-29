package v_263_Binary_heap;
public class Main {
    public static void main(String[] args) {
        
    BinaryHeap newBH  = new BinaryHeap(5);
    // newBH.peek();
    // newBH.sizeOfBP();
    newBH.levelOrder();
    newBH.insert(10,"Min");
    newBH.insert(5,"Min");
    newBH.insert(15,"Min");
    newBH.insert(1,"Min");
    newBH.levelOrder();
    newBH.extractHeadOfBP("Min");
    newBH.levelOrder();
    }

}
