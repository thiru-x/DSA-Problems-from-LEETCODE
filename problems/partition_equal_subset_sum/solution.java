class Solution {
    public boolean solve(int idx, int[] nums, int target, int[][] dp) {
        // Base case: If target is 0, subset is valid
        if (target == 0) return true;

        // Check first element
        if (idx == 0) return nums[0] == target;

        // Return memoized value if available
        if (dp[idx][target] != -1) return dp[idx][target] == 1;

        // Option 1: Do not include current element
        boolean notTake = solve(idx - 1, nums, target, dp);

        // Option 2: Include current element if possible
        boolean take = false;
        if (nums[idx] <= target) {
            take = solve(idx - 1, nums, target - nums[idx], dp);
        }

        // Store result as 1 (true) or 0 (false)
        dp[idx][target] = (take || notTake) ? 1 : 0;
        return take || notTake;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;

        // Cannot split an odd total sum
        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int n = nums.length;

        // Initialize DP with -1
        int[][] dp = new int[n][target + 1];
        for (int i = 0; i < n; i++)
            Arrays.fill(dp[i], -1);

        return solve(n - 1, nums, target, dp);
    }
}