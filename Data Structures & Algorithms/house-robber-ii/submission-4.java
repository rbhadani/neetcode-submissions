class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];

        int excludeFirst = robCheck(nums,1,n-1);
        int excludeLast = robCheck(nums,0,n-2);
        return Math.max(excludeFirst,excludeLast);
    }
    public int robCheck(int[]nums,int start,int end){
        int len = end-start+1;

        if(len==0)return 0;
        int[] dp = new int[len];
        dp[0] = nums[start];

        if(len>1){
            dp[1] = Math.max(nums[start],nums[start+1]);
        }

        for(int i=2;i<len;i++){
            dp[i] = Math.max(dp[i-2]+nums[i+start],dp[i-1]);
        }
        return dp[len-1];
    }

}
