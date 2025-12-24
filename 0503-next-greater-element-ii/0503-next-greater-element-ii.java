class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr=new int[2*nums.length];
        int len=nums.length;
        int[] arr1=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=nums[i];
            arr[i+len]=nums[i];
        }
        int f=0;
        for(int i=0;i<len;i++){

            f=0;
             
            for(int j=i+1;j<2*len;j++){
               // System.out.println(j);
                if(nums[i]<arr[j]){
                    
                    arr1[i]=arr[j];
                    f=1;
                    break;
                }
            }
            if(f==0){
                arr1[i]=-1;
            }
        }
        
        return arr1;
        
    }
}