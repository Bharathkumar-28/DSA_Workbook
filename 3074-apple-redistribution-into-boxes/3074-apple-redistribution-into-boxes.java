class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int len=apple.length;
        int len2=capacity.length;
        //Arrays.sort(apple);
        Arrays.sort(capacity);
        int sum=0;
        //int sum2=0;
        int c=0;
        //int j=len2-1;
        for(int i=len-1;i>=0;i--){
            sum+=apple[i];
            

            }
            for(int j=len2-1;j>=0;j--){
                //if()
                sum-=capacity[j];
                c++;
                if(sum<=0){
                    break;
                }
            }
        return c;
        
    }
}