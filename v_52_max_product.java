public class v_52_max_product {

    public String maxProduct(int[] intArray) {
        // TODO
        int result =1;
        String pairs = "";
        for(int i=0;i<intArray.length;i++){
            for(int j=i+1;j<intArray.length;j++){
                if(result<intArray[i]*intArray[j]){
                    result = intArray[i]*intArray[j];
                pairs = Integer.toString(intArray[i])+ ","+ Integer.toString(intArray[j]);
                }
               
        }}
        return pairs;
    }

}
