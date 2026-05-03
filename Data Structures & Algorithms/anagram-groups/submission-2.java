class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> map = new HashMap<>();

            for(int i=0;i<strs.length;i++){
                String curr = strs[i];
                char[] key = curr.toCharArray();
                Arrays.sort(key);
                String anagram = new String(key);
                if(!map.containsKey(anagram)){
                    map.put(anagram,new ArrayList<>());
                }
               map.get(anagram).add(curr);
            }
            return new ArrayList<>(map.values());
    }
}
