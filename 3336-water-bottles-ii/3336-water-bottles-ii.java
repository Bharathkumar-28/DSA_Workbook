class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
   
        int soii=numExchange;
        int copy=numBottles;
        if(numBottles==numExchange){
            return numBottles+1;
        }
        if(numBottles<numExchange){
            return numBottles;
        }
        int sum=numBottles;
        int rem;
        int boii;
        while(copy>=soii){
            boii=copy-soii;
            sum+=1;
             soii+=1;
             boii+=1;
             copy=boii;
           
            
           // rem=numBottles%numExchange;
          
            
             
             //copy=rem;
             //numBottles=copy;
            
            


        }
        
        return sum;
    }
}
        
