class Solution {
    public int singleNumber(int[] nums) {
        //int size = nums[].length;
        int size = nums.length;
        // int singleNum;
        int i,j;
        int k = 0;
        for( i=0;i<size-1;i++){
            
            for(j=i+1;j<size;j++){
                if(nums[i]==nums[j]){
                    k=1;
                    nums[i]=0;
                    nums[j]=0;
                  
                }
                

            }
            if(k==1){
                k=0;
               continue;
            }else{
                if(nums[i]!=0){
                    k=0;
                    break;
                }
                
               
            }
        }
        return nums[i];
    }
}