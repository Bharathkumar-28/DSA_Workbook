class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                stack.push(s.charAt(i));
            }
            else{
                stack.pop();
            }
        }
        StringBuilder soii=new StringBuilder();
        for(int i=0;i<stack.size();i++){
            soii.append(stack.get(i));
        }
         Stack<Character> stack1=new Stack<>();
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                stack1.push(t.charAt(i));
            }
            else{
                stack1.pop();
            }
        }
         StringBuilder soii1=new StringBuilder();
        for(int i=0;i<stack1.size();i++){
            soii1.append(stack1.get(i));
        }
        
        System.out.println(soii);
         System.out.println(soii1);
        return soii1.toString().equals(soii.toString());
        
    }
}