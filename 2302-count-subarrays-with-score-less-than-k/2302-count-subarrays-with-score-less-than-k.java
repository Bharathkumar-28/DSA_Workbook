class Solution {
    public long countSubarrays(int[] nums, long k) {
    
        int j=0;
        long sum=0;
        long c=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum*(i+1-j)>=k){
sum-=nums[j];
j+=1;
            }
           // System.out.println(c);
            c+=i-j+1;
        }
        return c;
        
    }
}