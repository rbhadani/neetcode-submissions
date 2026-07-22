class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int l1 = s1.length();
        int l2 = s2.length();

        if(l1>l2)return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for(int i=0;i<l1;i++){
            s1Count[s1.charAt(i)-'a']++;
            windowCount[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(s1Count,windowCount))return true;

        for(int i=l1;i<l2;i++){
             windowCount[s2.charAt(i)-'a']++;

             windowCount[s2.charAt(i-l1)-'a']--;
               if(Arrays.equals(s1Count,windowCount))return true;

        }
        return false;


    }
}
