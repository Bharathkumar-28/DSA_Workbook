class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int size=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
                size+=1;
            }

        }
        return Calculate(nums,size)-Calculate(nums,size-1);
     
    }
    private int Calculate(int[] nums,int size){
        int left=0;
        int count=0;
        HashMap<Integer,Integer> mosh= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mosh.put(nums[i],mosh.getOrDefault(nums[i],0)+1);
            while(mosh.size()>size){
                mosh.put(nums[left],mosh.get(nums[left])-1);
                if(mosh.get(nums[left])==0){
                    mosh.remove(nums[left]);
                }
                left+=1;
            }
            count+=i-left+1;
        }
        return count;
    }
}