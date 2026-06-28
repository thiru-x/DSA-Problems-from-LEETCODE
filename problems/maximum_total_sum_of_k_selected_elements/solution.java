import java.util.*;

class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        for (int i = 0; i < k; i++)
            ans += 1L * nums[nums.length - 1 - i] * Math.max(1, mul - i);
        return ans;
    }
}