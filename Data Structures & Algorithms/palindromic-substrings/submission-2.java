class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int oddLength = calculate(i,i,s);
            int evenLength = calculate(i,i+1,s);
            count+=oddLength+evenLength;
        }
        return count;
    }
    public int calculate(int start,int end,String s){
        int count=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
            count++;
        }
        return count;
    }
}
