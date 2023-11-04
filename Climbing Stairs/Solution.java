class Solution {
    public int climbStairs(int n) {
        int[] num = new int[n+1];
       
        for(int i=0;i<=n;i++){
            if(i==0 || i==1){
                num[i]=1;
             }else {
                 num[i]=num[i-1]+num[i-2];
             }
        }
        return num[n];


        
    }
}