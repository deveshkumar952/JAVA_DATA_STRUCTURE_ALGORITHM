package v_248_avl_tree;

// package v_248_avl_tree
public class Main {
    public static void main(String[] args) {
        AVL newAVL = new AVL();
        newAVL.insert(5);
        newAVL.insert(6);
        newAVL.insert(7);
        newAVL.insert(1);
        newAVL.levelOrder();
    }    
}
