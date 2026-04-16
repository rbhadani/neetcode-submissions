class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        for(int i=0;i<n;i++){
            int oddLen = expand(s,i,i);
            int evenLen = expand(s,i,i+1);
            count+=oddLen+evenLen;
        }
return count;
    }
    public int expand(String s, int left,int right){
        int count =0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
            count++;
        }
        return count;
    }
}
