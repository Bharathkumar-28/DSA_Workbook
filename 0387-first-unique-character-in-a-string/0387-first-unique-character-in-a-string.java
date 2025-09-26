class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> mosh=new HashMap<>();
        int index=-1;
        int f=0;
        char ch=s.charAt(0);
        mosh.put(s.charAt(0),mosh.getOrDefault(s.charAt(0),0)+1);
//System.out.println(mosh.get(s.charAt(0)));
        for(int i=1;i<s.length();i++){
            mosh.put(s.charAt(i),mosh.getOrDefault(s.charAt(i),0)+1);
           

        }
        for(int i=0;i<s.length();i++){
            if(mosh.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
        
    }
}