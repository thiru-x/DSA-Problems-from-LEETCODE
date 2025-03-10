class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];  // Return immediately when a match is found
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;  // No common element found
    }
}
