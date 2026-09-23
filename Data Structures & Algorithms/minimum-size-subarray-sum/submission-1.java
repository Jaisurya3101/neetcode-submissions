class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int min=Integer.MAX_VALUE;
        while(l<nums.length){
            int sum=nums[l];
            if (sum >= target) {
                min = Math.min(min, 1);
            }
            for(int i=l+1;i<nums.length;i++){
                sum+=nums[i];
                if(sum>=target){
                    min=Math.min(min,i-l+1);
                    break;
                }
            }
            l++;
        }
        return min!=Integer.MAX_VALUE ? min:0;
    }
}