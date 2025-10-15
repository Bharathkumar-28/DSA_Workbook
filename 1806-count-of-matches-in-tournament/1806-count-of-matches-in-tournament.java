class Solution {
    public int numberOfMatches(int n) {
        if(n%2==0){
            return n-1;
        }
        else{
              int sum=0;
           while(n>1){
          
            int soii=n/2;
            int rem=n%2;
            sum+=soii;
            n=soii+rem;
           } 
           return sum;
        }
        //return 0;
        
    }
}