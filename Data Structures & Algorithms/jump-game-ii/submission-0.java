class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int maxReach = nums[0];
        int curr = 0;

        for(int i=0;i<nums.length-1;i++){
            maxReach = Math.max(maxReach,nums[i]+i);

            if(curr==i){
                jump++;
                curr = maxReach;
            }
        }
        return jump; 
    }
}
