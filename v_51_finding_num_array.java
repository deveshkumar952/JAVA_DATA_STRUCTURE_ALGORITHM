public class v_51_finding_num_array {

    public int searchInArray(int[] intArray, int valueToSearch) {
        // TODO
        for(int i=0;i<intArray.length;i++){
            if(intArray[i] == valueToSearch){
                return i;
            }
        }
        return -1;
    }


}
