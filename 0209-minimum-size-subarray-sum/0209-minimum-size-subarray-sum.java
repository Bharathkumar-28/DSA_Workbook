class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int c=0;
        int len=nums.length;
        int j=0;
        int i=0;
        long sum=0;
        int minlen=Integer.MAX_VALUE;
        while(i<len){
            sum+=nums[i];
            while(sum>=target){
                minlen=Math.min(minlen,i-j+1);
                //System.out.println(minlen);
                sum-=nums[j];
                j+=1;

            }
            i++;
        }
return minlen==Integer.MAX_VALUE?0:minlen;
    }
}