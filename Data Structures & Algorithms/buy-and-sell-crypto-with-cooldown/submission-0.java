class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int[][]dp = new int[n+2][2];


        for(int i=n-1;i>=0;i--){

                
                    dp[i][1] = Math.max(-prices[i]+dp[i+1][0],
                                        dp[i+1][1]);
                
            
                    dp[i][0] = Math.max(prices[i]+dp[i+2][1],
                                        dp[i+1][0]);
              
            
        }
        return dp[0][1];
    }
}

//traverse from back because to calculate i we need i+1 and i+2

//buy -> sell / skip cooldown
//sell -> sell /skip cooldown 


// if buy==1 

// return Math.max( solve(i+1,1),-prices[i]+solve(i+1,0))


// else 
// return Math.max(solve(i+1,0),prices[i]+solve(i+2,1))