public class v_50_L1_two_sum {
    

    public int[] twoSum(int[] nums, int target) {
    // TODO
    for(int i =0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j] == target){
                return new int[]{i,j};
            }
        }
    }
    throw new IllegalArgumentException("No two perfect sums found out");
}

}