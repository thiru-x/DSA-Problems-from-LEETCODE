class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max=0;
        if(n==0) return 0;
        else{
            for(int i=1;i<n;i++){
                    max=Math.max(max,(nums[i]-nums[i-1]));
            }
        }
     return max;
    }
}