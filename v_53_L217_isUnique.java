public class v_53_L217_isUnique {
    public boolean isUnique(int[] intArray) {
        // TODO
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(intArray[i] == intArray[j]){
                    return false;
                }
            }
        }
        return true;
    }

}