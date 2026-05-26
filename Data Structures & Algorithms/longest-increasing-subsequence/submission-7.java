class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        if(n==0)return 0;
        int[]dp = new int[n];

        Arrays.fill(dp,1);
        int maxLen = 1;


        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(1+dp[j],dp[i]);
                }
            }
            maxLen = Math.max(dp[i],maxLen);
        }
        return maxLen;
    }
}
