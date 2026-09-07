class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int n=strs.length;
        int k=0;
        for(int i=0;i<strs[0].length();i++){
            char s=strs[0].charAt(i);
            for(int j=1;j<n;j++){
                if(strs[j].length()==i || s!=strs[j].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}