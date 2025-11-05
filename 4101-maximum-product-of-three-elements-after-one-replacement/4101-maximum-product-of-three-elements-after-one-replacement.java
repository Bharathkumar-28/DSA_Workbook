class Solution {
    public long maxProduct(int[] nums) {
         int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]<0){
                nums[i]=Math.abs(nums[i]);
            }
        }
        Arrays.sort(nums);

    
      
        
        long boii=(long)Math.pow(10,5);


        return nums[len-1]*nums[len-2]*boii;
        
    }
}