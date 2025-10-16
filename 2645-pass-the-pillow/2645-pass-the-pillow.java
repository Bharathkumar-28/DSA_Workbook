class Solution {
    public int passThePillow(int n, int time) {
        int soii=1;
        //int f=0;
        int t=1;
        
        while(time>0){
          
                soii+=t;
                 time-=1;
                 System.out.println(soii);
            
          
            if(soii==n || soii==1){
               t*=-1;
            }
            
           
        }
        return soii;
    }
}