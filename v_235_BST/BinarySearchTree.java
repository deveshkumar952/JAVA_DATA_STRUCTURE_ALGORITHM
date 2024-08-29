package v_235_BST;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    BinaryNode root;
    public BinarySearchTree() {
        this.root = null;
    }
    //Insert method
  // Insert Method
  private BinaryNode insert(BinaryNode currentNode, int value) {
    if (currentNode == null) {
      BinaryNode newNode = new BinaryNode();
      newNode.value = value;
      // System.out.println("The value successfully inserted");
      return newNode;
    } else if (value <= currentNode.value) {
      currentNode.left = insert(currentNode.left, value);
      return currentNode;
    } else {
      currentNode.right = insert(currentNode.right, value);
      return currentNode;
    }
  }

  void insert(int value) {
    root = insert(root, value);
  }


  // PreOrder Traversal

  public void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }
    //Inorder traversal
    public void InOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        InOrder(node.left);
        System.out.print(node.value + " ");
        InOrder(node.right);
    }

    //Post order traversal
    public void postOrder(BinaryNode node){
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }
    
    //Level Order traversal
        void levelOrder(){
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + " ");
            if(presentNode.left != null){
                queue.add(presentNode.left);
        }
        if(presentNode.right != null){
            queue.add(presentNode.right);
        }
    }
}

    //Search in BST
    BinaryNode search(BinaryNode node, int value){
        if(node == null){
            System.out.println("vaue : "+ value + " not found in BST");
            return null;
        }
        else if(node.value == value){
            System.out.println("value : "+ value + " found in BST");
            return node;
        }
        else if(value < node.value){
            return search(node.left, value);

        }
        else{
            return search(node.right, value);
        }
    }
      // Minimum node
  public static BinaryNode minimumNode(BinaryNode root) {
    if (root.left == null) {
      return root;
    } else {
      return minimumNode(root.left);
    }
  }

  // Delete node
  public BinaryNode deleteNode(BinaryNode root, int value) {
    if (root == null) {
      System.out.println("Value not found in BST");
      return null;
    }
    if (value < root.value) {
      root.left = deleteNode(root.left, value);
    } else if (value > root.value) {
      root.right = deleteNode(root.right, value);
    } else {
      if (root.left != null && root.right != null) {
        BinaryNode temp = root;
        BinaryNode minNodeForRight = minimumNode(temp.right);
        root.value = minNodeForRight.value;
        root.right = deleteNode(root.right, minNodeForRight.value);
      } else if (root.left != null) {
        root = root.left;
      } else if (root.right != null) {
        root = root.right;
      } else {
        root = null;
      }
    }

    return root;

  }

  public void deleteBST() {
    root = null;
    System.out.println("BST has been deleted successfully");
  }
}
