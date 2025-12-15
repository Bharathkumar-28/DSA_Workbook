class Solution {
    public String reverseWords(String s) {
        String[] soii=s.split(" ");
        int len=soii.length;
        int temp=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            int j=soii[i].length();
            int c=0;
            for(int k=0;k<j;k++){
                char ch=soii[i].charAt(k);
                ch=Character.toUpperCase(ch);
                if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    c+=1;
                }
            }
            System.out.println(c);
           if(i==0){
           temp=c;
           }
            if(temp==c && i!=0){
                StringBuilder oii=new StringBuilder(soii[i]);
                oii.reverse();
                soii[i]=oii.toString();
                //System.out.print(oii+" ");
            }
            
        }
        String add="";
        for(int i=0;i<len;i++){
            add+=soii[i];
            if(i!=len-1){
                add+=" ";
            }

        }
       return add;
    }
}