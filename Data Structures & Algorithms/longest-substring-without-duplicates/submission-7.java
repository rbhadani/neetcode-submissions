class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        int len =0;
        int maxLen = 0;

       for(int right=0;right<s.length();right++){
        char curr = s.charAt(right);
       

        while(set.contains(curr)){
            set.remove(s.charAt(left));
            left++;
        }
         set.add(curr);
        len = right-left+1;
        maxLen = Math.max(maxLen,len);
       }
       return maxLen;
    }
}
