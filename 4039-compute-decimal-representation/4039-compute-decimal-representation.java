class Solution {
    public int[] decimalRepresentation(int n) {
        String soii=String.valueOf(n);
        int len=soii.length();
        List<Integer> list=new ArrayList<>();
        int boii=len;
        for(int i=0;i<len;i++){
if(soii.charAt(i)!='0'){
   list.add((int) ((soii.charAt(i) - '0') * Math.pow(10, boii - 1)));


    boii-=1;
    
}
else{
    boii-=1;
}
        }
        int poii=list.size();
        int[] arr1=new int[poii];
        for(int i=0;i<poii;i++){
            arr1[i]=list.get(i);
        }


        return arr1;
        
    }
}