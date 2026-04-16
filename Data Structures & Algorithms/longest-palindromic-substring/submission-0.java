class Solution {
    public String longestPalindrome(String s) {
        int left = 0;
        int right = 0;
        int maxLen =0;
    

        for(int i=0;i<s.length();i++){
            int oddLen = expand(i,i,s);
            int evenLen = expand(i,i+1,s);
            int len =Math.max(evenLen,oddLen);

            if(maxLen<len){
                maxLen = len;
                left = i-(len-1)/2;
                right = i+ (len)/2;
            }
           
        }
         return s.substring(left,right+1);
    }
    public int expand(int left,int right,String s){
       while(left >=0 && right<s.length()&& s.charAt(left)== s.charAt(right)){
        left--;
        right++;
       }
       return right-left-1;
    }
}
