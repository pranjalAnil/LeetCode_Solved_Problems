class Solution {
    public boolean isPowerOfTwo(int n) {
        double ans=0;
        boolean pt=false;

        for(int i=0;ans<=n+1;i++){
            ans=Math.pow(2,i);
            if(ans==n){
                pt=true;
                break;
            }else if(ans>n){
                pt=false;
                break;
            }
        
        }

    // double num =Math.sqrt(n);
    // int num1=(int)num;
    // if(num1*num1==n){
    //     return true;
    // }else{
    //     return false;
    // }
    return pt;

        
    }
}
