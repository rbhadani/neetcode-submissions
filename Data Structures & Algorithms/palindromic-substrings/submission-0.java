class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count =0;

        for(int i=0;i<n;i++){
            count += expand(i,i,s);
            count += expand(i,i+1,s);
        }
        return count;
    }
    public int expand(int left,int right ,String s){
        int cnt = 0;//if we expand that means we have found a palindrome and moving forward
        while(left>=0 && right<s.length() && 
        s.charAt(left)==s.charAt(right)){
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}
