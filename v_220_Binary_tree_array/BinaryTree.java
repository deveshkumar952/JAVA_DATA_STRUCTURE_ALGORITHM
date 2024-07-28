
public class BinaryTree {
    String[] arr;
    int lastUsedIndex;
    public BinaryTree(int size){
        arr = new String[size + 1];
        this.lastUsedIndex= 0;
        System.out.println("Tree of size "+size+" has been created");
    }    

    //isFull
    boolean isFull(){
        if(arr.length-1 == lastUsedIndex){
            return true;
        }
        else{
            return false;
        }
    }
    //insert method
    void insert(String value){
        if(!isFull()){
            arr[lastUsedIndex+1]= value;
            lastUsedIndex++;
            System.out.println("Inserted "+value+" at index "+(lastUsedIndex));

        }
        else{
            System.out.println("Tree is full");
        }
    }

    //Preorder traversal
    public void preOrder(int index){
        if(index > lastUsedIndex){
            return;
        }
        System.out.print(arr[index]+ " ");
        preOrder(index*2);
        preOrder(index*2+1);
    }

    //Inorder traversal
    public void Inorder(int index){
        if(index> lastUsedIndex){
            return;
        }
        Inorder(index *2);
        System.out.println(arr[index] + " ");
        Inorder(index *2 + 1);
    }

    //postorder traversal
    public void PostOrder(int index){
        if(index> lastUsedIndex){
            return;
        }
        PostOrder(index *2);
        PostOrder(index *2 + 1);
        System.out.println(arr[index] + " ");
    }
    //level order traversal
    public void levelOrder(){
        for(int i =1;i<=lastUsedIndex;i++){
            System.out.println(arr[i]+ " ");
        }
    }

    //search node method
    public int search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i]==value){
                System.out.println(value + " exists at the location: " + i);
                return i;
            }
        }
        System.out.println("The value does not exist in BT");
        return -1;
    }
        //Delete method
        public void delete(String value){
            int location = search((value));
            if(location == -1){
                return;
            }
            else{
                arr[location] = arr[lastUsedIndex];
                lastUsedIndex--;
                System.out.println("The node successsfully deleted");
            }
        }

        //Delete Bt
        public void deleteBT(){
            try{
                arr = null;
                System.out.println("The binary tree has been deleted");
            }
            catch(Exception e){
                System.out.println("There was an error deleting the tree");
            }
        }

}
