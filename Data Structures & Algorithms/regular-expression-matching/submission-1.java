class Solution {
    Boolean[][]dp ;
    int l1 ;
    int l2 ;

    public boolean isMatch(String s, String p) {
         l1 = s.length();
         l2 = p.length();

        dp= new Boolean[l1+1][l2+1];
       

       return dfs(s,p,0,0);
    }

    public boolean dfs(String s, String p,int i,int j){
        if(j==l2)return i==l1;

        if(dp[i][j]!=null)return dp[i][j];

        boolean match = i<l1 && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');
        boolean curr;
        if(j+1<l2 && p.charAt(j+1)=='*'){
            curr  = dfs(s,p,i,j+2) || match && dfs(s,p,i+1,j);
        }
        else{
            curr = match && dfs(s,p,i+1,j+1);//move only when prev match
        }
        if(i<l1)dp[i][j] = curr;

        return curr;
           
    }
}
