class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        String s = new String();
        helper(result,0,0,n,"");
        return result;
    }

    public void helper(List<String> result,int open,int close,int n, String s){
        if(open==n && close==n){
            
             result.add(s);
              return;
        }

        if(open<n){
            helper(result,open+1,close,n,s+'(');
        }
        if(close<open){
            helper(result,open,close+1,n,s+')');
        }

    }
}
