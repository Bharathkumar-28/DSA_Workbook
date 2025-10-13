class Solution {
    public List<String> removeAnagrams(String[] words) {

        List<String> list=new ArrayList<>();
        int len=words.length;
        List<Integer> list1=new ArrayList<>();
        int sum;
        int copy=0;
        for(int i=0;i<len;i++){
            sum=0;
            for(int j=0;j<words[i].length();j++){
                sum+=words[i].charAt(j)-'0';

            }

            if(copy==0){
                copy=sum;
                list.add(words[i]);
            }
            else if(copy!=sum){
                list.add(words[i]);
                copy=sum;
            }
                //list1.add(sum);
                
            }
        
return list;
        
    }
}