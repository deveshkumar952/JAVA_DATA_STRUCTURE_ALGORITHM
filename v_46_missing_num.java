public class v_46_missing_num {
    
    static int findMissingNumberInArray(int[] arr) {
     // TODO
     int n =arr.length +1;
     int expectedSum = (n *(n +1)) /2;
     int actual_sum = 0;
     for(int i=0;i<arr.length;i++){
         actual_sum+=arr[i];
     }
     return expectedSum - actual_sum;
   }
 
 }

