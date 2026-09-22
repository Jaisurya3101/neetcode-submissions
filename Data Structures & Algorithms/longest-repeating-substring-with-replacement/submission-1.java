class Solution {
    public int characterReplacement(String s, int k) {

        int[] count = new int[26];

        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            int c = s.charAt(right) - 'A';

            count[c]++;

            maxFreq = Math.max(maxFreq, count[c]);

            int windowLength = right - left + 1;

            if (windowLength - maxFreq > k) {
                int leftChar = s.charAt(left) - 'A';
                count[leftChar]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}