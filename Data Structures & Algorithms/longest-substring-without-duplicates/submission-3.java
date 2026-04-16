class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int right=0;right<s.length();right++){
            char curr = s.charAt(right);
           

           if(map.containsKey(curr)){
             left = Math.max(left,map.get(curr)+1);
             
           }
            map.put(curr,right);
            maxLen = Math.max(maxLen,right-left+1);

        }
        return maxLen==Integer.MIN_VALUE? 0 : maxLen;
    }
}
//10:27 am
//take left and right pointers 
//keep increasing the right pointer 
//as soon as a char already present in map is found calculate the len so far