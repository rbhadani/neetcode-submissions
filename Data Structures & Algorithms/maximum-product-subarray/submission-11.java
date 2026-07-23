class Solution {
    public int maxProduct(int[] nums) {
        int currMax = 1;
        int currMin = 1;
        int res = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            if(nums[i]<0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(nums[i],nums[i]*currMax);
            currMin = Math.min(nums[i],nums[i]*currMin);

            res = Math.max(res,currMax);
        }
        return res;
    }
}
