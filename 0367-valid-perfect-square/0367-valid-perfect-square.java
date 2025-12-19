class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long high=num;
        long mid=0;
        if(num==0 || num==1){
            return true;
        }
        while(low<=high){
            mid=(low+high)/2;
            //System.out.println(mid);
            //System.out.println(num/mid);
            if(mid*mid==num){
                return true;
            }
            else if(mid<num/mid){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}