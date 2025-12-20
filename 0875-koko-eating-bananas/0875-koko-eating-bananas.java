class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max = piles[piles.length - 1];
        int low = 1;
        int high = max;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = Calculatesum(piles, mid);

            if (result <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;   // ✅ now inside the method
    }

    public int Calculatesum(int[] piles, int mid) {
        int result = 0;   // ✅ declared

        for (int i = 0; i < piles.length; i++) {
          result  += (int) Math.ceil((double) piles[i] / mid);

        }

        return result;   // ✅ required
    }
}
