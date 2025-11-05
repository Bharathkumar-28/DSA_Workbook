class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int koii=1;
        int boii=1;
        for(int i=1;i<=n;i++){
            sum+=boii;
            boii+=1;
            if(i%7==0){
                boii=++koii;
            }

        }
        return sum;
        
    }
}