class Solution {
    public int minSwaps(int[] nums) {
        int len=nums.length;
        int c=0;
        int doii=0;
        int min=1000000;
       int[]  res=new int[2*len];
        
        for(int i=0;i<len;i++){
            if(nums[i]==1){
                c+=1;
            }
            res[i]=nums[i];
            res[len+i]=nums[i];
        }
        //System.out.println(c);
        int j=0;
        for(int i=0;i<2*len-c;i++){
            //doii=0;
            while(j-i+1<=c){
               
                    doii+=res[j];
                
                j+=1;
            }
           // System.out.println(doii);
           // System.out.println("soii");
            min=Math.min(min,c-doii);
            doii-=res[i];
        }
        
        
        
        return min;
        
    }
}