class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[]freq1 = new int[26];
        int[]freq2 = new int[26];

        if(l1>l2)return false;

        for(int i=0;i<l1;i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<l2-l1;i++){
            if(matches(freq1,freq2))return true;

            freq2[s2.charAt(i+l1)-'a']++;
            freq2[s2.charAt(i)-'a']--;
        }
        return matches(freq1,freq2);
    }
    public boolean matches(int[]freq1,int[] freq2){
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i])return false;
        }
        return true;
    }
}
