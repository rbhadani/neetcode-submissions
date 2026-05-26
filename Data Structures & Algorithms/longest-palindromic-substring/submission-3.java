class Solution {
    public String longestPalindrome(String s) {
        int start =0;
        int end =0;

      
        for(int i=0;i<s.length();i++){

            int oddLen = check(i,i,s);
            int evenLen = check(i,i+1,s);

            int len = Math.max(oddLen,evenLen);

            if(end-start+1 < len){
                start = i-(len-1)/2;
                end = i+(len)/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int check(int i,int j,String s){

        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            
        
        return j-i-1;
    }
}
