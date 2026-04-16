class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        int maxLen = Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            int oddLen = expand(i,i,s);
            int evenLen = expand(i,i+1,s);

            int currLen = Math.max(oddLen,evenLen);

            if(end-start+1<currLen){
                start = i-(currLen-1)/2;
                end = i+currLen/2;
            }
             
        }
        return s.substring(start,end+1);
    }
    public int expand(int left,int right,String s){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
