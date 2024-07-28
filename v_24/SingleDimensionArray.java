

public class SingleDimensionArray {
    int arr[] = null;
    
    public SingleDimensionArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE; //integer.min_value is holding the constant value that int can have we can also replace this by 0 and in the insert also we have to replace to make the code runnable
        }
    }
    public void insert(int location, int valueToBeInserted){
    try{
        if(arr[location] == Integer.MIN_VALUE){
            arr[location] = valueToBeInserted;
            System.out.println("Successfully inserted");
        }
        else{
            System.out.println("This cell is already occupied");
        } }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index to access array");
        }
    }
    //Array Traversal
    public void traverseArray(){
        try{
            for(int i = 0;i<arr.length;i++){
                System.out.print(arr[i] + " ");
            }
        }
        catch (Exception e){
            System.out.println("Array no longer exits!");
        }
    }
    //Search for an element in the given Array
    public void searchArray(int valueToSearch){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == valueToSearch){
                System.out.println("Value " + valueToSearch + " is found at the index " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " is not found");
    }

    //Delete value from Array
    public void deleteValue(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted success");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The value that is provided is not in the range of array");
        }
    }
}
