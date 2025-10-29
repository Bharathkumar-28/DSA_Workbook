class Solution {
    public int numberOfBeams(String[] bank) {
int len=bank.length;
int sum=0;
int p=0;
List<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            int soii=bank[i].length();
            p=0;
            for(int j=0;j<soii;j++){
                if(bank[i].charAt(j)=='1'){
                   p+=1; 

                }
            }
            if(p>0){
 list.add(p);
            }
           



        }
        for(int i=1;i<list.size();i++){
           sum+= list.get(i-1)*list.get(i);
        }
        return sum;



    }
}