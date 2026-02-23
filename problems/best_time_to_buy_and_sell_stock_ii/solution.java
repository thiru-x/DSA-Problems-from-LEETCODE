class Solution {
    public int maxProfit(int[] prices) {
        //int buyprice=prices[0];
        int profit=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit +=prices[i]-prices[i-1];
            }
           // profit=Math.max(profit,prices[i]-buyprice);
        }
        return profit;

    }
}