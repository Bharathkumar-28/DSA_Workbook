class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr=new int[(int)Math.pow(10, 5)];
       // Arrays.sort(nums);
       if(nums.length==1){
        if(nums[0]%2==0){
            return nums[0];
        }
       }
        int c=0;
        int sc=0;
        System.out.println(arr[0]);
       
        //int same=nums[0];
        int element=-1;
        for(int i=1;i<nums.length;i++){
        arr[nums[i]]+=1;
        }
        int len=arr.length;
        //System.out.println(len);
        for(int i=0;i<len;i+=2){
           // System.out.println(arr[i]);
            if(arr[i]>c && arr[i]!=-1){
                
                element=i;
                c=arr[i];
            }
        }
        
      return element;  
    }
}