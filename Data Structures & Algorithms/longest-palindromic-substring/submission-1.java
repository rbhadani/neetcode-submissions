class Solution {
    public String longestPalindrome(String s) {
int n = s.length();
        int count = 0;
        int left =0;
        int maxLen =0;
        int right = 0;

        for(int i=0;i<n;i++){
            int oddLen = expand(s,i,i);
            int evenLen = expand(s,i,i+1);
            int len = Math.max(oddLen,evenLen);
            if(maxLen<len){
                right = i+(len)/2;
                left = i-(len-1)/2;
                maxLen = Math.max(maxLen,right-left+1);
            }
            
        }
        return s.substring(left,right+1);
    }
    
    public int expand(String s, int left,int right){
        int count =0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}
