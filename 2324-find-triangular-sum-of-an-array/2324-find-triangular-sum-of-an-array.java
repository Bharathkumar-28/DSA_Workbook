class Solution {
    public int triangularSum(int[] nums) {
        int len=nums.length;
        List<Integer> list= new ArrayList<>();
        if(len==1){
            return nums[0];
        }
        for(int i=0;i<len;i++){
            list.add(nums[i]);
        }

        for(int i=0;i<len;i++){
            List<Integer> list1=new ArrayList<>();
            for(int j=0;j<list.size()-1;j++){
           
            list1.add((list.get(j)+list.get(j+1))%10);
            //System.out.println((list.get(j)+list.get(j+1))%10);

            
        }
            list=list1;
            if(list.size()==1){
                return list.get(0);
            }
      
      
        }


        return 0;
    }

}