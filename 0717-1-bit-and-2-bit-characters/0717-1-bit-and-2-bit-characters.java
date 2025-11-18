class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int len=bits.length;
      int one=0;
      int two=0;
      int i=0;
      int soii=0;
      while(i<len){
        if( bits[i]==1){
            two=1;
            try{
                if(bits[i+1]==1 || bits[i+1]==0){
                    two=0;
                    if(i+1==len-1){
                        soii=1;
                    }
                    i=i+2;

                }

            }
            catch( Exception e){
              //  System.out.println("soii");

            }

        }
        else{
 i=i+1;
        }
       
        System.out.println(i);
       
      }
      if(bits[len-1]==0 && soii==0){
        return true;

      }
      else{
        return false;
      }
      
        
    }
}