import java.util.Arrays;

public class v_71_reverse_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,};
        reverse(arr);
    }
    static void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
            int other = array.length-i-1;
            int temp = array[i];
            array[i]= array[other];
            array[other]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
