class Solution {
    public int splitArray(int[] nums, int k) {
        int len=nums.length;
        int low=-1;
        int high=0;
        for(int i=0;i<len;i++){
            low=Math.max(nums[i],low);
            high+=nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int result=calculate(nums,mid);
            if(result>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
           // return low;



        }
        return low;

        
    }
    public int calculate(int[] nums,int mid){
        int soii=1;
        int boii=nums[0];
        for(int i=1;i<nums.length;i++){
            if(boii+nums[i]<=mid){
                boii+=nums[i];
            }
        
        else{
            boii=nums[i];
            soii+=1;
        }}
    return soii;
    }

   
}