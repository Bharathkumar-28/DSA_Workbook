class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int min=1000;
int soii=0;
for(int i=0;i<n-k;i++){
    soii=0;
    
    for(int j=i;j<n;j++){
        if(blocks.charAt(j)=='W'){
            soii+=1;
        }
        if(j-i+1==k){
            break;
        }

    }
    System.out.println(soii);
    min=Math.min(min,soii);
}
return min;


    }}
