package v_235_BST;
public class Main {
    public static void main(String[] args) {
        BinarySearchTree newBST = new BinarySearchTree();
        newBST.insert(70);
        newBST.insert(50);
        newBST.insert(90);
        newBST.insert(30);
        newBST.insert(60);
        newBST.insert(80);
        newBST.insert(100);
        newBST.insert(20);
        newBST.insert(40);

        // newBST.preOrder(newBST.root);
        // newBST.InOrder(newBST.root);
        // newBST.postOrder(newBST.root);
        newBST.levelOrder();
        System.out.println();
        newBST.search(newBST.root, 80);
    }


}