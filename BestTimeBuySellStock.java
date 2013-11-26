/**
  * Problem
  *  you have an array for which the ith element is the price of a given stock on day i.
  * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), 
  * design an algorithm to find the maximum profit.
  *
  * Solution
  * my logic is:
  * We can only buy one stock, and then sell it out, that's all.
  * That's we need to maximum(prices[j]-prices[i]), 0 <= i < j <= n-1;  
  */
  
public class Solution {
    public int maxProfit(int[] prices) {
        // prices[i] - min(prices[j], j <= i)
        int len = prices.length;
        if (len <= 1)
            return 0;
        int low = prices[0];
        int max = 0;
        for (int i = 1; i < len; i++) {
            int tmp = prices[i]-low;
            max = Math.max(max, tmp);
            low = Math.min(low, prices[i]);
        }
        return max;
    }
}

