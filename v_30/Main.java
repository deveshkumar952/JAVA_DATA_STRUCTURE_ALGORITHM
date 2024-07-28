
import java.util.Arrays;
public class Main{
     public static void main(String[] args){
        // //Step 1 - Declare
        // int[][] int2dArray;
        // //Step 2 - Instantiate
        // int2dArray = new int[2][2];
        // //Step 3 - Initialize
        // int2dArray[0][0] = 1;
        // int2dArray[0][1] = 2;
        // int2dArray[1][0] = 3;
        // int2dArray[1][0] = 4;
        
        // System.out.println(Arrays.deepToString(int2dArray));

        // //All together
        // String s2Darray[][] = {{"a","b"},{"c","d"}};
        // System.out.println(Arrays.deepToString(s2Darray));
        TwoDimensionalArray sda = new TwoDimensionalArray(3, 3);
        sda.insertValueInTheArray(0, 0, 1);
        sda.insertValueInTheArray(0, 1, 2);
        sda.insertValueInTheArray(0, 2, 3);

        // System.out.println(Arrays.deepToString(sda.arr));
        // sda.accessCell(0, 1);
        sda.traverse2DArray();
        sda.searchingValue(2);
        sda.deleteValuefromArray(0, 0);



}
}