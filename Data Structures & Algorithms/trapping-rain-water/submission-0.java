class Solution {
    public int trap(int[] height) {
        int maxarea = 0;
        int l=0;
        int r = height.length-1;
        int leftmax=height[l];int rightmax=height[r];
        while(l<r){
            if(leftmax<rightmax){
                l++;
                leftmax=Math.max(leftmax,height[l]);
                maxarea+=leftmax-height[l];
            }else{
                r--;
                rightmax=Math.max(rightmax,height[r]);
                maxarea+=rightmax-height[r];
            }
        }
        return maxarea;
    }
}
