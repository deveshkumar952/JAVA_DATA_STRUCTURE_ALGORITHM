

public class main {
    public static void main(String[] args) {
        BinaryTreeLL BinaryTree = new BinaryTreeLL();
            // BinaryNode N1 = new BinaryNode();
            // N1.value = "N1";
            // BinaryNode N2 = new BinaryNode();
            // N2.value = "N2";
            // BinaryNode N3 = new BinaryNode();
            // N3.value = "N3";
            // BinaryNode N4 = new BinaryNode();
            // N4.value = "N4";
            // BinaryNode N5 = new BinaryNode();
            // N5.value = "N5";
            // BinaryNode N6 = new BinaryNode();
            // N6.value = "N6";
            // BinaryNode N7 = new BinaryNode();
            // N7.value = "N7";
            // BinaryNode N8 = new BinaryNode();
            // N8.value = "N8";
            // BinaryNode N9 = new BinaryNode();
            // N9.value = "N9";

            // N1.left = N2;
            // N1.right = N3;
            // N2.left = N4;
            // N2.right = N5;
            // N3.left = N6;
            // N3.right = N7;
            // N4.left = N8;
            // N4.right = N9;
            // BinaryTree.root = N1;
            // BinaryTree.PostOrder(BinaryTree.root);

            // BinaryTree.levelOrder();
            // BinaryTree.search("N5");
            BinaryTree.insert("N1");
            BinaryTree.insert("N2");
            BinaryTree.insert("N3");
            BinaryTree.insert("N4");
            BinaryTree.insert("N5");
            BinaryTree.insert("N6");
            BinaryTree.levelOrder();
            // System.out.println();
            // System.out.println(BinaryTree.getDeepestNode().value);
            // System.out.println();
            BinaryTree.deleteNode("N3");
            System.out.println();
            BinaryTree.levelOrder();
            BinaryTree.deleteBT();
    }    
}
