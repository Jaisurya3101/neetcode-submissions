class Solution {

    int[] required = new int[128];

    public String minWindow(String s, String t) {

        for (char c : t.toCharArray()) {
            required[c]++;
        }

        int[] ch = new int[128];

        int left = 0;
        int minlength = Integer.MAX_VALUE;
        String sub = "";

        for (int i = 0; i < s.length(); i++) {

            ch[s.charAt(i)]++;

            if (checker(ch)) {

                while (left <= i && checker(ch)) {

                    if (minlength > i - left + 1) {
                        minlength = i - left + 1;
                        sub = s.substring(left, i + 1);
                    }

                    ch[s.charAt(left)]--;
                    left++;
                }
            }
        }

        return sub;
    }

    boolean checker(int[] ch) {

        for (int i = 0; i < 128; i++) {

            if (ch[i] < required[i]) {
                return false;
            }
        }

        return true;
    }
}