class Solution {
    public int missingMultiple(int[] nums, int k) {
        int len=nums.length;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<len;i++){
            set.add(nums[i]);

        }
        int s=1;
        while(true){
            if(!set.contains(s*k)){
                return s*k;
            }
            s++;
        }
       // return 0;
        
    }
}