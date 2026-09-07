class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String p = new String(chars);
            map.putIfAbsent(p,new ArrayList<>());
            map.get(p).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
