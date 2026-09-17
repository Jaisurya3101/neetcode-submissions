class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int i=0;
        while(i<nums.length-count-1){
            if(nums[i]==nums[i+1]){
                count++;
                for(int j=i+1;j<nums.length-count;j++){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }else{
                i++;
            }
            
        }
        return nums.length-count;
    }
}