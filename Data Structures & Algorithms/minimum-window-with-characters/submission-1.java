class Solution {
    public String minWindow(String s, String t) {
        int sLen=s.length();
        int tLen=t.length();
        int minLen = Integer.MAX_VALUE;
        int start=0;
        int left=0;
        if(tLen>sLen)return "";

        int required= tLen;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c: t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int right=0;right<sLen;right++){
            char curr = s.charAt(right);

            if(map.containsKey(curr)){
                if(map.get(curr)>0){
                    required--;
                }
                map.put(curr,map.get(curr)-1);
            }

            while(required==0){
                char leftChar = s.charAt(left);

                if(right-left+1<minLen){
                    minLen = right-left+1;
                    start = left;
                }

            if(map.containsKey(leftChar)){
                map.put(leftChar,map.get(leftChar)+1);

                if(map.get(leftChar)>0){
                    required++;
                }
                
            }
            left++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}
