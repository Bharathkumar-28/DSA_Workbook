class Solution {
    public int smallestNumber(int n) {
        int f=0;
        for(int i=n;i<2000;i++){

            String binary =Integer.toBinaryString(i);
           // System.out.println(binary);
            int len=binary.length();
            f=1;

            for(int j=0;j<len;j++){
                if(binary.charAt(j)=='0'){
                    f=0;
                    //System.out.println("soii");
                    break;
                }

                




            }
            if(f==1){
                    return i;
                }
        }
        return n;
        



    }
}