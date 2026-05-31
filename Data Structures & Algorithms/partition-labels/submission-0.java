class Solution {
    public List<Integer> partitionLabels(String s) {

        HashMap<Character,Integer> map = new HashMap<>();
       

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            map.put(curr,i);
        }
        List<Integer> res = new ArrayList<>();
        int size=0;
        int end = 0;
        for(int i=0;i<s.length();i++){

            size++;
            char curr = s.charAt(i);
            
            end = Math.max(end,(map.get(curr)));
            if(i==end){
                res.add(size);
                size=0;
            }

        }
return res;
    }
}
