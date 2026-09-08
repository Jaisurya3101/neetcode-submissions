class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int n:nums){
        //     map.put(n,map.getOrDefault(n,0)+1);
        // }
        // int max =0;
        // int maxval=0;
        // for(int i : map.keySet()){
        //     if(map.get(i)>max){
        //         max=map.get(i);
        //         maxval=i;
        //     }
        // }
        Arrays.sort(nums);
        int maxval=nums[(nums.length)/2];
        return maxval;
    }
}