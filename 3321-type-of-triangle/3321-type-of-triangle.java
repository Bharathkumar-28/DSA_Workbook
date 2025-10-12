class Solution {
    public String triangleType(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);

        }
        

        if(set.size()==1){
            return "equilateral";
        }
        else if(set.size()==2){
            //for(int i=0;i<nums.length;i++){
                if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0]){

                     return "isosceles";

                }
            //}
           
        }
        else{
            if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0]){

                    return "scalene";

                }
           // return "scalene";
        }
        return "none";
        
    }
}