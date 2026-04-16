class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[]dp = new int[amount+1]; //no of coins needed to make i amount

        
        Arrays.fill(dp,amount+1);
        dp[0] = 0;

        for(int coin : coins){
            for(int i=coin;i<=amount;i++){
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return dp[amount]>amount ? -1: dp[amount];
    }
}
