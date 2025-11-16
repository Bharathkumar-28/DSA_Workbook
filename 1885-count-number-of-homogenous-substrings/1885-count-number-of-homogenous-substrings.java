class Solution {
    public int countHomogenous(String s) {
        long sum=0;
        long con=1;
        int len=s.length();
        long MOD = 1000000007;
        if(len==1){
            return 1;
        }
    char oii=s.charAt(0);
        for(int i=1;i<len;i++){
            if(s.charAt(i)==oii){
                con+=1;
            }
            if((s.charAt(i)!=oii && con>=1)||(con>=1 && i==len-1)){
                oii=s.charAt(i);
                sum+=con*(con+1)/2;
                con=1;


                
            }
            if(i==len-1){
                if(s.charAt(i-1)!=s.charAt(i)){
                   sum+=con*(con+1)/2; 
                }
            }




        }
        return (int)(sum%MOD);
        
    }
}