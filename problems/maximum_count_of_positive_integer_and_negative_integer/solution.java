class Solution {
    public int maximumCount(int[] nums) {
        int pve=0;
        int nve=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pve++;
            else if(nums[i]<0) nve++;
        }

        return Math.max(pve,nve);
    }
}