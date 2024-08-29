import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        
        int arr [] = {1,1,3,2,8,4,6,6};
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) max = arr[i];
        }

        int a[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            a[arr[i]]++;
        }
        
        for(int i=0; i<a.length; i++){
            if(a[i] != 0) System.out.print(i + " ");
        }
     }
}