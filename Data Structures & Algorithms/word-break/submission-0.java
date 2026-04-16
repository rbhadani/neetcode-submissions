class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

         HashSet<String> set = new HashSet<>(wordDict);
         int n = s.length();

         boolean[]dp = new boolean[n+1];

         dp[0] = true;//dp[i] is true if first i characters can be segmented 

         for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
              if(dp[j] && set.contains(s.substring(j,i))){
                dp[i] = true;
                break;
              }
            }
         }
        return dp[n];
    }
}
//5:44 - 6:44 
//8:48