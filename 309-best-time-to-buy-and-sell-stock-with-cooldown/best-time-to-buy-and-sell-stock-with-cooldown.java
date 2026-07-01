class Solution {

    public int rec(int i, int buy, int[] prices, int[][] dp) {
        if (i >= prices.length) {
            return 0;
        }

        if (dp[i][buy] != -1) {
            return dp[i][buy];
        }

        int ans;

        if (buy == 0) {
            int skip = rec(i + 1, 0, prices, dp);
            int buyStock = -prices[i] + rec(i + 1, 1, prices, dp);

            ans = Math.max(skip, buyStock);
        } else {
            int skip = rec(i + 1, 1, prices, dp);
            int sell = prices[i] + rec(i + 2, 0, prices, dp);

            ans = Math.max(skip, sell);
        }

        dp[i][buy] = ans;
        return ans;
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][] dp = new int[n][2];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return rec(0, 0, prices, dp);
    }
}