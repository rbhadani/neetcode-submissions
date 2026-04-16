class Solution {
    public boolean isAnagram(String s, String t) {
        int[] check = new int[26];
        if(s.length()!=t.length())return false;

        for(char c : s.toCharArray()){
            check[c-'a']++;
        }
        for(char c : t.toCharArray()){
            check[c-'a']--;
        }
        for(int i : check){
            if(i!=0)return false;
        }
        return true;
    }
}
