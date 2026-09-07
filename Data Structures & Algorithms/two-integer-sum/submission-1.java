class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<n;i++){
            int k = target-nums[i];
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(k,i);
        }
        return new int[]{};
    }
}
