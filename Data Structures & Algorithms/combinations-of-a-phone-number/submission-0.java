class Solution {
    HashMap<Character,String> map;

    public List<String> letterCombinations(String digits) {
        map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        List<String> ans = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        if(digits.length()==0)return ans;

        recur(ans,temp,digits,0);
        return ans;
    }

    public void recur(List<String> ans,StringBuilder temp,String digits,int index){
        if(temp.length()==digits.length()){
            ans.add(new String(temp));
            return;
        }
        String curr = map.get(digits.charAt(index));

        for(int i=0;i<curr.length();i++){
            temp.append(curr.charAt(i));
            recur(ans,temp,digits,index+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
