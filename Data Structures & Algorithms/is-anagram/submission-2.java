class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;
        char[] c = s.toCharArray();
        char[] c1 = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        for(int i=0;i<s.length();i++){
            if(c[i]!=c1[i]){
                return false;
            }
        }
        return true;
    }
}
