class Solution {
    public int maxProfit(int[] prices) {
        int minimumPrice = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            int todayProfit = prices[i] - minimumPrice;
            maxProfit = maxProfit > todayProfit ? maxProfit : todayProfit;
            minimumPrice = minimumPrice < prices[i] ? minimumPrice : prices[i];
        }
        return maxProfit;
    }
}