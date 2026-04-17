class Solution {
    Boolean[][] dp ;
    public boolean isMatch(String s, String p) {
        dp = new Boolean[s.length()][p.length()];
        return dfs(0,0,s,p);
    }

    public boolean dfs(int i,int j,String s,String p){
        if(j==p.length()){
            return i==s.length();
        }
        if(i<s.length() && dp[i][j]!=null)return dp[i][j];

        boolean match = i<s.length() && 
                        (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');

        boolean ans;
        if(j+1<p.length() && p.charAt(j+1)=='*'){
            ans =  dfs(i,j+2,s,p) || match && dfs(i+1,j,s,p);
        }
        else{
            ans = match && dfs(i+1,j+1,s,p);
        }

        if(i<s.length())dp[i][j]= ans;
        return ans;
    }
}
