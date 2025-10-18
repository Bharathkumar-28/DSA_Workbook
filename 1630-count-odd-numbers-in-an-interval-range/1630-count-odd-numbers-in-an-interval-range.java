class Solution {
    public int countOdds(int low, int high) {
   int N = high - low + 1; // Number of elements in range
        
        if (N % 2 == 0) {
            return N / 2;
        } else {
            if (low % 2 != 0 || high % 2 != 0) {
                return N / 2 + 1;
            } else {
                return N / 2;
            }
        }
    }}