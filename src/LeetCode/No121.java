package LeetCode;

public class No121 {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0 ;
        for(int i = 0 ;i<prices.length;i++){
            if(prices[i]<=min){
                min=prices[i];
            }
            int profit = prices[i]-min;
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }

}
