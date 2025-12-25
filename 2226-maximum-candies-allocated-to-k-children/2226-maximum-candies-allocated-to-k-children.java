class Solution {
    public int maximumCandies(int[] candies, long k) {
        int len=candies.length;
        long fsum=0;
        for(int i=0;i<len;i++){
            fsum+=candies[i];
        }
        if(fsum<k){
            return 0;
        }
        if(len==1 && k==1){
            return candies[0];
        }
        Arrays.sort(candies);
        int sum=0;
        int temp=0;
        int high=candies[len-1];
        int low=0;
        //for(int j=min;j>0;j--){
           // sum=0;
        //for(int i=0;i<len;i++){
            while(low<=high){
                int mid=(low+high)/2;
                int result=calculate(candies,mid);
              //  System.out.println(result);
                if(result<k){
                    //
                     high=mid-1;

                }
                else{
                   low=mid+1;
                }
            
          
           


        }
        return low-1;}
        public int calculate(int[] candies,int mid){
            int sum=0;
           // System.out.println(mid);
            for(int i=0;i<candies.length;i++){
                try{
                sum+=candies[i]/mid;
                

            }
            catch(Exception e){
                
            }}
            return sum;
        }
        //min-=1;
        

        
    
    //return temp;
    
}