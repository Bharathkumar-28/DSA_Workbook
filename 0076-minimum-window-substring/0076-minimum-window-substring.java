class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character, Integer> mosh = new HashMap<>();
        int len = s.length();
        int l2 = t.length();

        if (l2 > len) return "";

        for (int k = 0; k < l2; k++) {
            mosh.put(t.charAt(k), mosh.getOrDefault(t.charAt(k), 0) + 1);
        }

        int i = 0, j = 0, c = 0;
        int minlen = Integer.MAX_VALUE;
        int start = 0;

        while (j < len) {

            // EXPAND
            if (mosh.containsKey(s.charAt(j))) {
                if (mosh.get(s.charAt(j)) > 0) c++;
                mosh.put(s.charAt(j), mosh.get(s.charAt(j)) - 1);
            }
            j++;

            // SHRINK (i moves ONLY here)
            while (c == l2) {
                if (j - i < minlen) {
                    minlen = j - i;
                    start = i;
                }

                if (mosh.containsKey(s.charAt(i))) {
                    mosh.put(s.charAt(i), mosh.get(s.charAt(i)) + 1);
                    if (mosh.get(s.charAt(i)) > 0) c--;
                }
                i++;
            }
        }

        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
