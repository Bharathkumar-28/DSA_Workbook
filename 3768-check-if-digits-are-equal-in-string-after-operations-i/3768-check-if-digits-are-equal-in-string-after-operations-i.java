class Solution {
    public boolean hasSameDigits(String s) {
        //int len=s.length();
        //int i=0;
        
        //while(1){
     
            StringBuilder soii= new StringBuilder(s);
           

            int len=soii.length();
            while(true){
                 if(len==2){
                break;
             }

            StringBuilder koii= new StringBuilder();
            for(int i=1;i<len;i++){
                int boii=soii.charAt(i-1)-'0';
                int doii=soii.charAt(i)-'0';
                int poii=(boii+doii)%10;
               
                koii.append(String.valueOf(poii));


            }
             len=koii.length();
             
             soii=koii;
            
            
             
            }




        
        return soii.charAt(0)==soii.charAt(1);
        
    }
}