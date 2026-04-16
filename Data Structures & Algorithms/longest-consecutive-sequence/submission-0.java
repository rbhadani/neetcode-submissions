class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxCount = 0;

        for(int i:nums){
            set.add(i);
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int count = 0;
                int curr = nums[i];
                while(set.contains(curr)){
                    count++;
                    curr++;
                }
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}
