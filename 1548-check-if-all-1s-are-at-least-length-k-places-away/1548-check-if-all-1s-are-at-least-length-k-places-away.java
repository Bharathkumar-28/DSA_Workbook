class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int len=nums.length;
        int soii=0;
        int flag=0;
        int j=0;
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                flag=1;
                  j=i+1;
            }
           while(j<len && flag==1){
          
            if(nums[j]==1){
             int sum=j-i-1;
             i=j;
             if(sum<k){
                return false;
             }   
            }
            j++;


           }
        }
        return true;
        
    }
}