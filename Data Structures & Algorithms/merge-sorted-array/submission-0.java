class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        while (i < nums1.length - n) {
            for (int j = 0; j < n; j++) {
                if (nums1[i] > nums2[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
                }
            }
            i++;
        }int k=0;
        Arrays.sort(nums2);
        while(i<nums1.length){
            nums1[i]=nums2[k++];
            i++;
        }
    }
}