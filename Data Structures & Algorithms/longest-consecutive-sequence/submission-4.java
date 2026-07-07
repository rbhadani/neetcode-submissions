class Solution {
    public int longestConsecutive(int[] nums) {
       
        int maxLen = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int curr = nums[i];
                int len = 1;

                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }
        return maxLen;
    }
}
