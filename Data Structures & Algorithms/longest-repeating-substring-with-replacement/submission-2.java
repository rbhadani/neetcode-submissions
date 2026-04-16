class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int[] freq = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        
        for(int right=0;right<s.length();right++){
          char curr = s.charAt(right);
          freq[curr-'A']++;
          maxFreq = Math.max(maxFreq,freq[curr-'A']);

          while(right-left+1-maxFreq>k){
            char leftCurr = s.charAt(left);
            freq[leftCurr-'A']--;
            left++;
          }
          maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
