class Solution {
    public int climbStairs(int n) {
       int[] dp = new int[n+1];
       dp[0] = 1;
       dp[1] = 1;
       for(int i=2;i<=n;i++){
        dp[i] = dp[i-1]+dp[i-2];
       }
       return dp[n];
    }
    public int check(int i){
        if(i==0)return 1;
        if(i<0)return 0;
        return check(i-1)+check(i-2);
    }
}
