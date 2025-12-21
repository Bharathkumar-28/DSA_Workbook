class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int len=bloomDay.length;
        if(len<m*k){
            return -1;
        }
        int left=100;
        int right=-1;
        //Arrays.sort(bloomDay);
        for(int i=0;i<len;i++){
            left=Math.min(bloomDay[i],left);
            right=Math.max(bloomDay[i],right);
        }
        int flowers=m*k;
        int copy=k;

       
        while(left<=right){
            int mid=(left+right)/2;
            int result=calculate(bloomDay,mid,flowers,copy);
            System.out.println(mid);
            System.out.println(result);
            if(result==flowers){
                   right=mid-1;
                
                
            }
            else{
                left=mid+1; 
             
            
            }


        }





        return left;
        
    }
    public int calculate(int[] bloomDay,int mid,int flowers,int copy){
        int total=0;
        int poii=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                poii+=1;
                if(poii==copy){
                    total+=poii;
                    poii=0;
                }
                if(total==flowers){
                    break;
                }
            }
            else{
                poii=0;
            }
        }
       return total;

    }
}