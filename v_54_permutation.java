public class v_54_permutation {
    
    public boolean permutation(int[] array1, int[] array2){
        // TODO
        int sum1 = 0;
        int sum2 = 0;
        int mul1 = 1;
        int mul2 = 1;
        if(array2.length != array1.length){
            return false;
        }
        for(int i =0;i<array2.length;i++){
            sum2+=array2[i];
            sum1+=array1[i];
            mul2*=array2[i];
            mul1*=array1[i];
        }
         if(sum1 == sum2 && mul1 == mul2){
            return true;
        }
        return false;
    }

}
