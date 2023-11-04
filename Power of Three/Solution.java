class Solution {
    public boolean isPowerOfThree(int n) {
        boolean result = false;
        double ans =3;
        if(n==0){
            result =false;
        }else if(n==-1){
            result =false;
        }else{
            for(int i=0;i<=n;i++){
                ans = Math.pow(3,i);
               
                if(n==ans){
                    result = true;
                    break;
                }else if(n<ans){
                    result=false;
                    break;
                }
            }
        }
        return result;
        
    }
}