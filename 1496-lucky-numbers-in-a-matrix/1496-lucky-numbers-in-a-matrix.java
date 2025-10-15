import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        List<Integer> rowMins = new ArrayList<>();
        List<Integer> colMaxs = new ArrayList<>();

        // Step 1: Find the minimum in each row
        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < cols; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rowMins.add(min);
        }

        // Step 2: Find the maximum in each column
        for (int j = 0; j < cols; j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < rows; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            colMaxs.add(max);
        }

        // Step 3: Find common elements (lucky numbers)
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int num : rowMins) {
            if (colMaxs.contains(num)) {
                luckyNumbers.add(num);
            }
        }

        return luckyNumbers;
    }
}
