import java.util.*;
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;
        int[][] jobs = new int[n][3];

        for (int i = 0; i < n; i++) {
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }

        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

        int[] dp = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            int skip = dp[i + 1];
            int next = findNextJob(jobs, i);
            int take = jobs[i][2] + dp[next];
            dp[i] = Math.max(skip, take);
        }
        return dp[0];
    }
    private int findNextJob(int[][] jobs, int index) {

        int low = index + 1;
        int high = jobs.length - 1;
        int ans = jobs.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (jobs[mid][0] >= jobs[index][1]) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
