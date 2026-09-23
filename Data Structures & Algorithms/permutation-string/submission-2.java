class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Character> l = new ArrayList<>();
        for (char c : s1.toCharArray()) {
            l.add(c);
        }
        int len = s1.length();
        for(int i=0;i<=s2.length()-len;i++){
            char c=s2.charAt(i);
            if(l.contains(c)){
                if(checker(s1,s2.substring(i,i+len))){
                    return true;
                }
            }
        }
        return false;
    }
    boolean checker(String s1 , String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0;i<c1.length;i++){
            if(c1[i]==c2[i]){
                continue;
            }
            return false;
        }
        return true;
    }
}
