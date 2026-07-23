class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int sum  = 0;

        for(int i : nums){
            sum+=i;
        }

        if(Math.abs(target)>sum)return 0;
        if((sum+target)%2==1)return 0;

        int find = (target+sum)/2;

        int[][]dp = new int[n+1][find+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }

        dp[0][0] = 1;

        for(int i=1;i<=n;i++){
            for(int j=0;j<=find;j++){
                if(j>=nums[i-1]){
                    dp[i][j] = dp[i-1][j-nums[i-1]]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][find];
    }
}

