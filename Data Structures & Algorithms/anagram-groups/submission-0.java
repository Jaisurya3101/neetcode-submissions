class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> m = new HashMap<>();
        for(String s : strs){
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String key = new String(ar);
            m.computeIfAbsent(key , k -> new ArrayList<>()).add(s);            
        }
        return new ArrayList<>(m.values());
    }
}
