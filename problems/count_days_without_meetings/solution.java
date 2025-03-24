import java.util.*;

public class Solution {
    public static int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int unavailableDays = 0;
        int start = meetings[0][0];
        int end = meetings[0][1];

        for (int i = 1; i < meetings.length; i++) {
            int currentStart = meetings[i][0];
            int currentEnd = meetings[i][1];

            if (currentStart <= end + 1) {
                end = Math.max(end, currentEnd);
            } else {
                unavailableDays += (end - start + 1);
                start = currentStart;
                end = currentEnd;
            }
        }
        unavailableDays += (end - start + 1);
        return days - unavailableDays;
    }
}
