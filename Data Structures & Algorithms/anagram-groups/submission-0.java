class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        if (strs==null) return null;
        for(String s : strs){
            char[] key1 = s.toCharArray();
            Arrays.sort(key1);
            String key = new String(key1);
            if(!map.containsKey(key)){
               map.put(key,new ArrayList<>());
            }
            
                map.get(key).add(s);
            
        }
        return new ArrayList<>(map.values());
    }
}



