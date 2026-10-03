class Solution {
    public int maxProfit(int[] prices) {
        //two pointer approch
        int l=0, r=1, result =0;

        while (r<prices.length)
        {
            if(prices[r]<prices[l])
            {
                l=r;
            }
            else
            {
                result = Math.max(result, prices[r] - prices[l]);
            }
            r++;
        }
        return result;
    }
}
