public class BestTimetoBuyandSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];

            }
            int profit = prices[i] - min;
            if (profit > maxProfit)
                maxProfit = profit;
        }

        System.out.println(maxProfit);
        return maxProfit;
    }
}