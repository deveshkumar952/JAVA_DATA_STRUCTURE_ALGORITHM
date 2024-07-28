import java.util.Arrays;
public class v_43_Middle_Function {
    public static void main(String[] args) {
        int arr[] = {4,6,8,9,156,3,8,9};
        int result2[] = middle(arr);
        System.out.println(Arrays.toString(result2));
        int result[] = middle(new int[]{1, 2, 3, 4, 5});
        System.out.println(Arrays.toString(result));
    }
    public static int[] middle(int[] array) {
        if (array.length <= 2) {
            return new int[0]; // Return an empty array if the input array has 2 or fewer elements
        }
 
        // Create a new array with a size of the input array length minus 2
        int[] middleArray = new int[array.length - 2];
 
        // Copy the elements from the input array, excluding the first and last elements
        int index = 1;
        while (index < array.length - 1) {
            middleArray[index - 1] = array[index];
            index++;
        }
 
        return middleArray;
    }
}