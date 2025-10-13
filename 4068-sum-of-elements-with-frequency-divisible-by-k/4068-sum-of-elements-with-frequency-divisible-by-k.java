import java.util.*;

class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        Arrays.sort(nums);
        int[] count = new int[201]; // counts of numbers 0-100
        int sum = 0;

        // Count occurrences
        for (int num : nums) {
            count[num]++;
        }

        // Check which counts are divisible by k
        for (int num = 0; num < count.length; num++) {
            if (count[num] > 0 && count[num] % k == 0) {
                sum += count[num] * num; // add square of number
            }
        }

        return sum;
    }
}

