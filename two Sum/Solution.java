class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size=nums.length;
        int[] result;
        result=new int[2];
        for(int i=0; i<size;i++){

            for(int j=i+1;j<size;j++){
                if(i==size-1){
                    break;
                }
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
    
}