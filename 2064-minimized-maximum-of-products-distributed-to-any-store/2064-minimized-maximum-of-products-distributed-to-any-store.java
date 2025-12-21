class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int len=quantities.length;
        Arrays.sort(quantities);
        int low=1;
        int high=quantities[len-1];
        while(low<=high){
            int mid=(low+high)/2;
            int result=calculate(quantities,mid);
            if(result<=n){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
    public int calculate(int[] quantities,int mid){
        int total=0;
        for(int i=0;i<quantities.length;i++){
            total+=Math.ceil((double)quantities[i]/mid);
        }
        return total;
    }
}