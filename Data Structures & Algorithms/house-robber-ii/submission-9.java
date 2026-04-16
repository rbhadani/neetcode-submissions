class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];

        return Math.max(robHouse(0,n-2,nums),robHouse(1,n-1,nums));
    }
    public int robHouse(int start,int end,int[]nums){
        int prev1=0;
        int prev2 =0;

        for(int i=start;i<=end;i++){
            int curr = Math.max(nums[i]+prev2,prev1);
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
