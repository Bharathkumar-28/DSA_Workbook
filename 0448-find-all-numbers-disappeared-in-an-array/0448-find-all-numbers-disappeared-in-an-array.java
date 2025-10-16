class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
       HashSet<Integer> set=new HashSet<>();
        List<Integer> list1=new ArrayList<>();
        int number=1;
        int prev=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int len=set.size()+(nums.length-set.size());
System.out.println(len);
        for(int i=0;i<len;i++){
            if(!set.contains(i+1)){
                list1.add(i+1);
            }
           
        }
        return list1;
        
    }
}