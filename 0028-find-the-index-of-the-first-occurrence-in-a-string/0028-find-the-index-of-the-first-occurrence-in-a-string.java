class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length();
        int len1 = needle.length();
        int sl = 0; // length of matched part
        int si = 0; // index in needle

        for (int i = 0; i < len; i++) {
            if (haystack.charAt(i) == needle.charAt(si)) {
                si++;
                sl++;

                // ✅ when full match found
                if (sl == len1) {
                    return i - len1 + 1;
                }
            } else {
                // ❗ reset properly when mismatch happens
                i = i - sl; // go back to next position after the start of last match
                sl = 0;
                si = 0;
            }
        }

        return -1; // not found
    }
}
