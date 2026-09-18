class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                return new int[]{map.get(numbers[i])+1,i+1};
            }
            int diff = target-numbers[i];
            if(diff>=numbers[i]){
                map.put(diff,i);
            }
        }
        return new int[]{};
    }
}
