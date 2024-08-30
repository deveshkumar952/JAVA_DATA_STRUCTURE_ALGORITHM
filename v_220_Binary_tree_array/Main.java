package v_220_Binary_tree_array;



public class Main {
    public static void main(String[] args) {
    BinaryTree newBinaryTree = new BinaryTree(5);
    newBinaryTree.insert("N1");
    newBinaryTree.insert("N2");
    newBinaryTree.insert("N3");
    newBinaryTree.insert("N4");
    newBinaryTree.insert("N5");
    // newBinaryTree.preOrder(1);
    // newBinaryTree.Inorder(1);
    // newBinaryTree.PostOrder(1);
    newBinaryTree.levelOrder();
    // newBinaryTree.search("N1");
    newBinaryTree.delete("N3");
    newBinaryTree.levelOrder();
    newBinaryTree.deleteBT();
}


}
