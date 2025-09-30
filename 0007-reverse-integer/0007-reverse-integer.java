class Solution {
    public int reverse(int x) {
        if(x<0){
             String s1=String.valueOf(-x);
        StringBuilder soii=new StringBuilder(s1);
        soii.reverse();
        try{
        int boii=-Integer.valueOf(soii.toString());
         return boii;}
        catch(NumberFormatException e){
            return 0;

        }
       

        }
        else{
             String s1=String.valueOf(x);
        StringBuilder soii=new StringBuilder(s1);
         soii.reverse();
         try{
        int boii=Integer.valueOf(soii.toString());
         return boii;}
        catch(NumberFormatException e){
            return 0;

        }
       

        }
       
        
        //return 0;




        
    }
}