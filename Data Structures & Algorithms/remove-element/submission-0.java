class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        int count=0;
        while (i < n) {
            if (nums[i] == val) {
                int j = i;
                while (j < n - 1) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    j++;
                }
                n--;
            }else{i++;}
        }
        return i;
    }
}