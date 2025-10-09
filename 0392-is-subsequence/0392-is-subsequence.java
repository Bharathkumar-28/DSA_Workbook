class Solution {
public boolean isSubsequence(String s, String t) {
int a = s.length();
int b = t.length();
int i = 0;
int j = 0;
StringBuilder sb = new StringBuilder("");

    while (i < a && j < b) {
        if (s.charAt(i) == t.charAt(j)) {
            sb.append(t.charAt(j));
            i++;
            
            
        }
        j++;
    }

    return sb.toString().equals(s);
}}