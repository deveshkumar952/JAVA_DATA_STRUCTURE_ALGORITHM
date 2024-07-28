
public class TwoDimensionalArray {
    int arr[][] = null;
    //Constructor
    public TwoDimensionalArray(int numberofRows,int numberOfColumns){
        this.arr = new int[numberofRows][numberOfColumns];
        for(int row = 0;row<arr.length;row++){
            for (int col = 0 ; col<arr.length;col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }
    //Inserting value in the Array
    public void insertValueInTheArray(int row,int col,int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println("The value is successfully inserted");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    //Accessing cell value from given Array
    public void accessCell(int row,int col){
        System.out.println("\nAccessing Row#" + row + ",Col#" + col);
        try{
            System.out.println("Cell value is " +arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index for 2D array");
        }
    }
    //Traverse 2D Array
    public void traverse2DArray(){
    for(int row =0; row < arr.length;row++){
        for(int col = 0;col<arr[0].length; col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println();
    }
}
    //Searching  value int the Array
    public void searchingValue(int value){
        for(int row =0; row<arr.length;row++){
            for(int col =0 ; col<arr[0].length;col++){
                if(arr[row][col] == value){
                    System.out.println("Value is found at row: " +row+ " col: "+col);
                    return;
                }
            }
        }
        System.out.println("Value is not found");
    }
    //Deleting a Value from Array
    public void deleteValuefromArray(int row,int col){
        try{
            
            System.out.println("Successfully deleted: "+ arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("This index is not valid for Array");
        }
    }
}