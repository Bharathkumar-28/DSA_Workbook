class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int len=nums.length;
        int low=1;
        int high=-1;
        for(int i=0;i<len;i++){
            //low=Math.min(nums[i],low);
            high=Math.max(nums[i],high);
            
        }
        System.out.println(low);
        System.out.println(high);
        while(low<=high){
            int mid=(low+high)/2;
            int result=calculate(nums,mid);
            if(result>threshold){
                low=mid+1;
            }
            else{
                high=mid-1;

            }
        }
        return low;
        
    }
    public int calculate(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/mid);
        }
        return sum;
    }
}