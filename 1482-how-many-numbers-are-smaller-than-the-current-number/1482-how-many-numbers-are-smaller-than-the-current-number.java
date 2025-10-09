class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=nums.clone();
        int[] arr1=new int[nums.length];
        int len=nums.length;
        Arrays.sort(nums);
        System.out.println(nums[0]);
         System.out.println(arr[0]);
         for(int j=0;j<len;j++){
         for(int i=0;i<len;i++){
            if(arr[j]>nums[i]){
            arr1[j]+=1;}
            else{
                break;
            }

          
         }}

         return arr1;
        
    }
}