class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> list=new ArrayList<>();
         List<Integer> list2=new ArrayList<>();
         list.add(nums[0]);
         list2.add(nums[1]);
         int[] arr=new int[nums.length];
         //arr[0]=nums[0];
        // arr[1]=nums[1];
         int j=2; 
         int boii=nums[0];
         int soii=nums[1];
         for(int i=2;i<nums.length;i++){
            
            if(boii>soii){
                list.add(nums[i]);
                //arr[j]=nums[i];
                boii=nums[i];
               // System.out.println("oii");
            }
            else{
                list2.add(nums[i]);
                //arr[j]=nums[i];
                soii=nums[i];
                //System.out.println("soii");
            }
            j+=1;
         }
         list.addAll(list2);
         for(int i=0;i<nums.length;i++){
            arr[i]=list.get(i);
         }
         return arr;


        
    }
}