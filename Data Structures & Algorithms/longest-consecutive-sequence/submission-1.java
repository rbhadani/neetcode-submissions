class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int count =0;
        int maxLen = Integer.MIN_VALUE;
        for(int i : nums){
            set.add(i);
        }

        for(int i=0;i<nums.length;i++){
            
            if(!set.contains(nums[i]-1)){
                int curr = nums[i];
                    count =1;
                 
                 while(set.contains(curr+1)){
                    curr++;
                    count++;
                 }
                 maxLen = Math.max(maxLen,count);
            }
        }
        return maxLen==Integer.MIN_VALUE?0:maxLen;
    }
}
