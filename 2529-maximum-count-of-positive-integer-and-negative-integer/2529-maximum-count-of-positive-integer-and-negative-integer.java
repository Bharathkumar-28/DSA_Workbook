class Solution {
    public int maximumCount(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        int index=nums.length;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>0){
                index=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }
        int index2=nums.length;
         low=0;
          high=nums.length-1;
         mid=0;

          while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=0){
                index2=mid;
                high=mid-1;

            }
            else{
                low=mid+1;
            }

        }
        //System.out.println(index2);
        //System.out.println(nums.length-index);
        return index2>nums.length-index?index2:nums.length-index;
       
        
    }
}