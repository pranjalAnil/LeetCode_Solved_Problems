class Solution {
    public int maxSubArray(int[] nums) {

        int sum=nums[0];
        int temp= nums[0];
        for(int i =1;i<nums.length;i++){
            temp= Math.max(nums[i], nums[i]+temp);
            sum =Math.max(sum,temp);

        }return sum;
    }

}

    //     int sum=0;
    //     int sum1=0;
    //     int sum2=0;
    //    if(nums.length==1){
    //        return nums[0];
    //    }
    //     for(int i=0; i<nums.length; i++){
    //         // int n=0;
    //         for(int j=i+1; j<nums.length; j++){
    //             if(j==i+1){
    //                 sum1=nums[i]+nums[j];
    //                 sum2=sum1;
    //             }else{
    //                 sum1=sum1+nums[j];
    //                 if(sum1>sum2){
    //                 sum2=sum1;
    //             }
    //             } 
    //          if(i==0){
    //             sum=sum2;
    //         }
    //         }if(nums[i]>sum){
    //             sum=nums[i];
    //         }else if(sum<sum2){
    //             sum=sum2;
    //         }
    //         else{
    //             continue;
    //         }  
    //     }
    //     return sum;

//     }
// }
