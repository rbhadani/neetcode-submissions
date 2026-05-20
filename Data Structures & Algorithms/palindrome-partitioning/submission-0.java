class Solution {
    public List<List<String>> partition(String s) {

        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();

        recur(s,ans,path,0);
        return ans;
    }
    public void recur(String s,List<List<String>> ans,List<String> path,int start){
      if(start==s.length()){
        ans.add(new ArrayList<>(path));
        return;
      }

      for(int end = start;end<s.length();end++){

        String sub = s.substring(start,end+1);

        if(isPalindrome(sub)){
            path.add(sub);
            recur(s,ans,path,end+1);
            path.remove(path.size()-1);
        }
      }
    }
    public boolean isPalindrome(String s){
        int i=0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
             i++;
             j--;
        }
        return true;
    }
}
