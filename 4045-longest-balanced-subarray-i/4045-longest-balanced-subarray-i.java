class Solution {
    public int longestBalanced(int[] nums) {
        int max=0;
       
        int len=nums.length;
        int even=0;
        int odd=0;
       
      for(int i=0;i<len;i++){
        odd=0;
        even=0;
         HashMap<Integer,Integer> map =new HashMap<>();
        for(int j=i;j<len;j++){
            if(nums[j]%2==0 && !map.containsKey(nums[j])){
                map.put(nums[j],0);
                even+=1;
            }
            else if(nums[j]%2!=0 && !map.containsKey(nums[j])){
map.put(nums[j],0);
odd+=1;
            }
            //System.out.println(even);
            if(even==odd){
                //
                //System.out.println(odd);

                max=Math.max(j-i+1,max);
            }

        }
      }
      return max;
        
    }
}