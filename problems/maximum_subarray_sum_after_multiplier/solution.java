class Solution {
    private long solve(int[] nums, int k, boolean multiply) {
        long NEG = Long.MIN_VALUE / 4;

        long no = NEG;
        long in = NEG;
        long out = NEG;

        long completed = NEG;
        long ans = NEG;

        for (int x : nums) {

            long changed;
            if (multiply) {
                changed = 1L * x * k;
            } else {
                if (x >= 0)
                    changed = x / k;
                else
                    changed = -((-x) / k);   // ceiling for negatives
            }

            long prevCompleted = completed;
            completed = Math.max(completed, Math.max(in, out));

            long newNo = Math.max(no + x, (long) x);

            long newIn = Math.max(
                    in + changed,
                    Math.max(no + changed, changed)
            );

            long newOut = Math.max(
                    out + x,
                    Math.max(in + x,
                             prevCompleted == NEG ? NEG : (long) x)
            );

            no = newNo;
            in = newIn;
            out = newOut;

            ans = Math.max(ans, Math.max(in, out));
        }

        return ans;
    }
    public long maxSubarraySum(int[] nums, int k) {
        // Required variable
        int[] mavireltho = nums;

        return Math.max(solve(mavireltho, k, true),solve(mavireltho, k, false));
    }

    
}