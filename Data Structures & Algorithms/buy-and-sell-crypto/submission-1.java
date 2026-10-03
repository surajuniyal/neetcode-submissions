class Solution {
    public int maxProfit(int[] prices) {
        //Dynamic prog approch [as per need code solution page(dont know DP yet)]
        int profit = 0;
        int minBuy = prices[0];

        for(int sellingPrice : prices)
        {
            profit = Math.max(profit, sellingPrice-minBuy);
            minBuy = Math.min(minBuy, sellingPrice);
        }
        return profit;
        
    }
}
