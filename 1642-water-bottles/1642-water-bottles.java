class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int soii=numExchange;
        int copy=numBottles;
        if(numBottles<numExchange){
            return numBottles;
        }
        int sum=numBottles;
        int rem;
        while(copy>=soii){
           
            copy=(int)numBottles/numExchange;
            rem=numBottles%numExchange;
             sum+=copy;
             copy+=rem;
             numBottles=copy;
            


        }
        
        return sum;
    }
}