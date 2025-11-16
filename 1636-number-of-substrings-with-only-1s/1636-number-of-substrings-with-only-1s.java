class Solution {
    public int numSub(String s) {
        long MOD = 1000000007;
        long sum = 0;
        int len = s.length();
        int con = 0;

        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '1') {
                con++;
            }
            
            // segment ends
            if ((con > 0 && s.charAt(i) == '0') || (con > 0 && i == len - 1)) {
                sum += (long)con * (long)(con + 1) / 2;
                con = 0;
            }
        }

        return (int)(sum % MOD);
    }
}
