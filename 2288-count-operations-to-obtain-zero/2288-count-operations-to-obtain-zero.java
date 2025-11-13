class Solution {
    public int countOperations(int num1, int num2) {
        int c=0;
        if(num1==num2 && num2!=0){
            return 1;
        }
     while(num2!=0 || num1!=0){
        if(num1>num2){
            num1=num1-num2;
            c+=1;
        }
        else{
            num2=num2-num1;
            c+=1;
        }
        if(num2<=0 || num1<=0){
            break;
        }

     }  
     return c; 
        
    }
}