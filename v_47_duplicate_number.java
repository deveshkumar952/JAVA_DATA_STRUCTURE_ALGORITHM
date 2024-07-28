import java.util.Arrays;
public class v_47_duplicate_number {
    
  public static int[] removeDuplicates(int[] arr) {
    //   TODO
    int n = arr.length;
    int[] uniqueArray = new int[n];
    int index = 0;
    
    for(int i=0;i<n;i++){
        boolean isDuplicate = false;
        for(int j = i+1;j<n;j++){
            if(arr[i] == arr[j]){
                isDuplicate = true;
                break;
            }
        }
                    if(!isDuplicate){
                uniqueArray[index++] = arr[i];
                // index++;
            }
    }
 return Arrays.copyOf(uniqueArray, index);
  }

}
