class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long sum=0;
        Arrays.sort(happiness);
        int len=happiness.length;
        sum=happiness[len-1];
        int diff=1;
        k-=1;
        for(int i=len-2;i>=0;i--){
           // diff+=1;
            if(k==0){
                break;
            }
            k-=1;
            if(happiness[i]-diff>0){
                sum+=happiness[i]-diff;
                diff+=1;
            }

            //sum+
            //System.out.println(happiness[i]);
          

        }
        return sum;
        
    }
}