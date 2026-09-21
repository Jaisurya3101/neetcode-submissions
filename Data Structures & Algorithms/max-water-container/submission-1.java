class Solution {
    public int maxArea(int[] heights) {
        int max =0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            if(heights[left]>heights[right]){
                max=Math.max(max,Math.min(heights[left],heights[right])*(right-left));
                right--;
            }else{
                max=Math.max(max,Math.min(heights[left],heights[right])*(right-left));
                left++;
            }
        }
        return max;
    }
}
