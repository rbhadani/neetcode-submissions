class Solution {
    public int lengthOfLongestSubstring(String s) {

        int n = s.length();
        int left =0;
        int maxDist = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0;right<n;right++){
            
            char r = s.charAt(right);

            while(set.contains(r)){
                char l = s.charAt(left);
                set.remove(l);
                if(left<n)left++;
            }

             int dist = right-left+1;
             maxDist = Math.max(maxDist,dist);
             set.add(r);
        }
        return maxDist;
    }
}
