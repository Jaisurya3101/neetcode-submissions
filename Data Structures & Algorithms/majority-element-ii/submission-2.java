class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int k = n / 3;

        List<Integer> l = new ArrayList<>();
        Arrays.sort(nums);
        if (n < 3) {
            for (int num : nums) {
                if(l.contains(num)) continue;
                l.add(num);
            }
            return l;
        }
        for (int i = 0; i + k < n; i++) {
            if (nums[i] == nums[i + k]) {
                l.add(nums[i]);
                while (i + k < n && nums[i] == nums[i + k]) {
                    i++;
                }
            }
        }
        return l;
    }
}