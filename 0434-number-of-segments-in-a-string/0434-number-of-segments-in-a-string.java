class Solution {
    public int countSegments(String s) {
        System.out.println(s.length());
        if(s.length()==0){
            return 0;
        }
        String[] str=s.trim().split("\\s+");
        return str.length;
        
    }
}