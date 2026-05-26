class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);

        int n = s.length();
        boolean[] dp = new boolean[n+1];

        dp[0] = true;//ie string can be segemented from 0 

        for(int i=1;i<=n;i++){
          for(int j=0;j<i;j++){
            String temp = s.substring(j,i);

            if(dp[j] && set.contains(temp)){
              dp[i] = true;
            }
          }
        }
        return dp[n];
    }
}
