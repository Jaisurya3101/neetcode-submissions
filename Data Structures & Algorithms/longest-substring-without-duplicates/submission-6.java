class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ch = new int[128];
        int p=0;
        int p1=0;
        int max =0;
        while(p<s.length() && p1<s.length()){
            int c = s.charAt(p1);
            if(ch[c]<1){
                ch[c]++;
                p1++;
            }else{
                max = Math.max(max,p1-p);
                while(ch[c]>=1){
                    int c1 = s.charAt(p);
                    ch[c1]--;
                    p++;
                }
            }
        }
        max = Math.max(max, p1 - p);
        return max;
    }
}
