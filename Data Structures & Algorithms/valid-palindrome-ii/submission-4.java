class Solution {
    public boolean validPalindrome(String s) {
        int[] c = new int[26];
        int l=0;
        int r=s.length()-1;
        char mid = s.charAt(s.length()/2);
        while(l<r){
            c[s.charAt(l)-'a']++;
            c[s.charAt(r)-'a']--;
            l++;
            r--;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(c[i]!=0 && i+'a'!=mid){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
}