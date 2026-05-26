class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count=0;
        

        for(int i=0;i<s.length();i++){
            int oddCount = check(i,i,s);
            int evenCount = check(i,i+1,s);
            count+=oddCount+evenCount;
        }
        return count;
    }
    public int check(int i,int j ,String s){

        int count=0;

        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
            count++;
        }
        return count;
    }
}
