class Solution {
    public int lengthOfLastWord(String s) {

        int j,i;
        int k1=0;
        int k2=0;
        int length=0;
         char[] arr = new char[s.length()];
        for(int k=0;k<s.length();k++){
           arr[k] = s.charAt(k);
        }
        
        int countWords = s.split("\\s").length;
         if(countWords==1){
            String neww=s.trim();
            int size=neww.length();
            return size;
        }
        
        for(i=s.length()-1;i>0;i--){
           if(arr[s.length()-1]==' ' && k2==0){
               k1=1;
               k2=1;
               continue;
           }

            if(k1==1){
                if(arr[i]==' '){
              //  return length;
                    continue;
                }
                else{
                   
                   length++;
                   k1=0;
                }
            }
            


            else{
                 if(arr[i]==' '){
             
                    break;
                }
                
                length=length+1;
            }
        }
        return length;
        
    }
}