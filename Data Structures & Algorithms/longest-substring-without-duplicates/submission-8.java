class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxLen =0;

        for(int right=0;right<s.length();right++){
            char curr = s.charAt(right);

            if(map.containsKey(curr)){
                left = Math.max(left,map.get(curr)+1);
            }
            maxLen = Math.max(maxLen,right-left+1);
            map.put(curr,right);
        }
        return maxLen;
    }
}
