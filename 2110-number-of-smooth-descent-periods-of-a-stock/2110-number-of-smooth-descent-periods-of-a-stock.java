class Solution {
    public long getDescentPeriods(int[] prices) {
        int len=prices.length;
        long c=0;
        //int con=0;
        int i=0;
        int  j=i+1;
        
        
        while(i<len){
           // j=i+1;
            
            while(j<len){
            if(!(prices[j-1]-prices[j]==1)){
               // j+=1;
                break;
               
            }
            j+=1;
           
        }
        long soii=j-i;
        c+=(long)(((soii)*(soii+1))/2);
        i=j;
        j+=1;
        }
        return c;
        
    }
}