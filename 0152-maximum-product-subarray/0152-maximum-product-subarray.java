class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int left=0;
        int right=0;
        int pro=1;
    int len=nums.length;
        while(left<=len){
            pro=1;
            for(int i=left;i<len;i++){
                pro*=nums[i];
                if(pro>=max ){
                    max=pro;
                }
               

            }
             left+=1;
        }
        return max;
        
    }
}