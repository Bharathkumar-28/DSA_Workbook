class Solution {
    public String removeStars(String s) {
          Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='*'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.size()>0){
                stack.pop();}
            }
        }
        StringBuilder soii=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            soii.append(stack.get(i));
        }
        return soii.toString();
        
    }
}