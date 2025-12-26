class Solution {
    public int bestClosingTime(String customers) {
        int len=customers.length();
       
        int index=0;
        int penaltyy=0;
        int penalty=0;
      
     
        
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            if(customers.charAt(i)=='N'){
               
                list.add(i);
            }
            else{
              
               penaltyy+=1;

            }}
            int z=0;
             int sum=10000;
            
            for(int i=0;i<len+1;i++){
                 if(penalty+penaltyy<sum){
                    sum=penalty+penaltyy;
                    index=i;

                }
                if(list.contains(i)){
                   
                    penalty+=1;
                }
                else{
                    penaltyy-=1;
                    
                }
               
               
            }
            return index;
        
    }
}