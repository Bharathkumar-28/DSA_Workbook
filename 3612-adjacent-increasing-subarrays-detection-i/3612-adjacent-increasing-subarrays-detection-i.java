class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        int cur = 1;      // length of current strictly increasing run (in elements)
        int prev = 0;     // length of previous strictly increasing run

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                cur++;
            } else {
                // the increasing run ends here
                prev = cur;
                cur = 1;
            }
            // check: either split the current run into two subarrays of length k, or use tail of prev + head of cur
            if (cur / 2 >= k || Math.min(prev, cur) >= k) {
                return true;
            }
        }

        return false;
    }
}

