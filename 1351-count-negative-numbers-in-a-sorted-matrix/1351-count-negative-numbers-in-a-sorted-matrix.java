class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        int len=grid.length;
        for(int i=0;i<len;i++){
            int low=0;
            int high=grid[i].length-1;
            int mid=0;
            int index=grid[i].length;
            while(low<=high){
                mid=(low+high)/2;
                if(grid[i][mid]<0){
                    index=mid;
                    high=mid-1;

                }
                else{
                    low=mid+1;
                }
            }
            c+=grid[i].length-index;
            //System.out.println(index);
        }
        return c;
        
    }
}