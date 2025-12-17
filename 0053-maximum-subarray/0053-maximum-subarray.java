class Solution {
    public int maxSubArray(int[] nums) {
        int len=nums.length;
        int max=-1000;
        int sum=0;
        //int sum2=0;
        if(len==1){
            return nums[0]; 
        }
        for(int i=0;i<len;i++){
          
           sum+=nums[i];
           
           
               
              max=Math.max(max,sum);
              if(sum<0){
            sum=0;
           }  
           
            }
           
                
        
        return max;
        
    }
}