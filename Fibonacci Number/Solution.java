class Solution {
    public int fib(int n) {
        int[] arr= new int[n];
        
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }else{

        for(int i=0;i<n;i++){
            if(i==0){
                arr[i]=0;
            }else if(i==1 || i==2){
                arr[i]=1;
            }else{
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        return arr[n-1]+arr[n-2];
        }
    }
}