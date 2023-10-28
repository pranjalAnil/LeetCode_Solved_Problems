class Solution {
    public boolean isPalindrome(int x) {
        
       
        String s= String.valueOf(x);
        int size=s.length();
        int a= size/2;
        char[] ch = new char[s.length()];
        for (int i = 0; i < size; i++) {
          ch[i] = s.charAt(i);
        }
        int a1=10;
        int a2=1;
        int i, j;
        for(i=0; i<size; i++){
            
            
                if(ch[i]==ch[size-a2]){
                    a2++;
                    a1=10;
                }    
                else{
                    a1=0;
                    break;
                }

            

        }
        if(a1==10){
            return true;
            
        }  
        else{
            return false;
        }
    }
}