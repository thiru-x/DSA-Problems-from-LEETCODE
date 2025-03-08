class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //n=nums1.length;
        //m=nums2.length:
        int a1 = nums1.length;
        int b1 = nums2.length;

        int c1 = a1 + b1;

        int[] c = new int[c1];

        System.arraycopy(nums1, 0, c, 0, a1);
        System.arraycopy(nums2, 0, c, a1, b1);
        Arrays.sort(c);
        int d=0;
        if(c.length%2==0){
            d=c[c.length/2]+c[c.length/2-1];
            return (double) d/2;
        }
        else{
            d=c[c.length/2];
            return (double) d;
        }
    }
}