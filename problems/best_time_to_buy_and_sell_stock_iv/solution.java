import java.util.*;

class Solution {

    public int maxProfit(int k, int[] prices) {

        int n = prices.length;

        if (n <= 1 || k == 0)
            return 0;

        // If k is very large, it becomes LC122 (Unlimited Transactions)
        if (k >= n / 2) {
            int profit = 0;

            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1])
                    profit += prices[i] - prices[i - 1];
            }

            return profit;
        }

        int[] buy = new int[k];
        int[] sell = new int[k];

        Arrays.fill(buy, Integer.MIN_VALUE);

        for (int price : prices) {

            for (int j = 0; j < k; j++) {

                // Buy
                buy[j] = Math.max(
                        buy[j],
                        (j == 0) ? -price : sell[j - 1] - price
                );

                // Sell
                sell[j] = Math.max(
                        sell[j],
                        buy[j] + price
                );
            }
        }

        return sell[k - 1];
    }
}