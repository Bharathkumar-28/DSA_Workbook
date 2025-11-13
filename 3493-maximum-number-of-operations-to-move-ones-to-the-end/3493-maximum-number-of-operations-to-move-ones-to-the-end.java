class Solution {
    public int maxOperations(String s) {
        int len=s.length();
        int op=0;
        int c=0;
        int check=-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='1'){
                c+=1;
                check=1;
            }
            if(s.charAt(i)=='0' && c>=1 && check==1){
                op+=c;
                check=-1;
            }

        }
        return op;
        
    }
}