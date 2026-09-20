class Solution {
    public void rotate(int[] nums, int k) {
        while(k-->0){
            int temp=nums[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
                int temp1=nums[i];
                nums[i]=temp;
                temp=temp1;
            }
            nums[nums.length-1]=temp;
        }
    }
}