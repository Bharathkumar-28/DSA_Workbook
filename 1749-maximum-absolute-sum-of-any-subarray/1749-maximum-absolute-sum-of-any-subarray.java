class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int sum2=0;
        int max=Integer.MIN_VALUE;
        int len=nums.length;
        for(int i=0;i<len;i++){
            sum+=nums[i];
            sum2+=nums[i];

           
            max=Math.max(max,Math.max(Math.abs(sum),Math.abs(sum2)));
            if(sum<0){
                sum=0;
            }
            if(sum2>0){
                sum2=0;
            }
           
        }
        
        return max;
        
    }
}