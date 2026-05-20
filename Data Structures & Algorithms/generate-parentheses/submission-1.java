class Solution {
    public List<String> generateParenthesis(int n) {

        StringBuilder s = new StringBuilder();
        List<String> ans = new ArrayList<>();

        recur(s,ans,n,0,0);
        return ans;
    }
    public void recur(StringBuilder s ,List<String> ans,int n,int open,int closed){
        if(s.length()==n*2){
            ans.add(new String(s));
            return;
        }
        if(open<n){
            s.append('(');
            recur(s,ans,n,open+1,closed);
            s.deleteCharAt(s.length()-1);
        }
        if(closed<open){
            s.append(')');
            recur(s,ans,n,open,closed+1);
            s.deleteCharAt(s.length()-1);
        }
    }
}
