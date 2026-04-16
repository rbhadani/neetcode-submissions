class Solution {
    public int maxProfit(int[] prices) {
        int min_day = prices[0];
        int max_profit = 0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min_day){
                min_day = prices[i];
            }
            if(prices[i]-min_day>max_profit){
                max_profit = prices[i]-min_day;
            }
        }
        return max_profit ;
    }

}
