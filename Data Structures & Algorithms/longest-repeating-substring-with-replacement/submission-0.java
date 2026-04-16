class Solution {
    public int characterReplacement(String s, int k) {

          HashMap<Character,Integer> map = new HashMap<>();
          int left =0;
          int maxCount =0;
          int freq=0;

          for(int right=0;right<s.length();right++){

            char curr = s.charAt(right);
            map.put(curr,map.getOrDefault(curr,0)+1);
             freq = Math.max(freq,map.get(curr));

            if((right-left-freq+1)>k)
               {
                char l = s.charAt(left);
                map.put(l,map.get(l)-1);
                left++;
               }
               maxCount = Math.max(maxCount,right-left+1);
          }
          return maxCount;
        }
}
