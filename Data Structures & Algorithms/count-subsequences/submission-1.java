class Solution {
    public int numDistinct(String s, String t) {
        int s1 = s.length();
        int t1 = t.length();

        int [][] dp = new int[s1+1][t1+1];


        for(int i=0;i<=s1;i++){
           dp[i][0] = 1;
        }
      
        for(int i=1;i<=s1;i++){
            for(int j=1;j<=t1;j++){

                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }

        }
        return dp[s1][t1];
    }
}
