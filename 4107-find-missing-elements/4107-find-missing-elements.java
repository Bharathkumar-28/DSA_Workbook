class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int j=0;
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
          list1.add(nums[i]);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++){
         if(!list1.contains(i))  {
            list.add(i);
         }
        }
        return list;

        
    }
}