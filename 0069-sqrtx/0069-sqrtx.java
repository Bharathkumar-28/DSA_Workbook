class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
        int mid=0;
        int ans=-1;
        if(x==0){
            return 0;
        }
        while(low<=high){
            mid=(low+high)/2;

            if(mid==x/mid){
                ans=mid;
                break;
               
            }
            else if(mid<x/mid){
                ans=mid;
                low=mid+1;
                // 
                
            }
            else{
                high=mid-1;
                

            }
        }
        return ans;
        
    }
}