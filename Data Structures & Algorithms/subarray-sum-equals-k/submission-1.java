class Solution {

    int count = 0;

    public int subarraySum(int[] nums, int k) {
        count = 0;

        for (int start = 0; start < nums.length; start++) {
            sum(nums, k, start, 0);
        }

        return count;
    }

    public void sum(int[] nums, int k, int start, int sum) {

        for (int i = start; i < nums.length; i++) {

            sum += nums[i];

            if (sum == k) {
                count++;
            }
        }
    }
}