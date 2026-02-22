class Solution {
    public int scoreDifference(int[] nums) {
        int p1 = 0, p2 = 0;
        int active = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1) active ^= 1;     
            if (i % 6 == 5) active ^= 1;        
            
            if (active == 0) p1 += nums[i];
            else p2 += nums[i];
        }
        
        return p1 - p2;
    }
}