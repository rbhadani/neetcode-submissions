class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        
        
        int sum =0;

        for(int i: nums){
            sum+=i;
        }

        int element =  (sum+target)/2;

        if((sum+target)%2!=0 || sum<Math.abs(target))return 0;
        

        int[][] dp = new int[n+1][element+1];

        for(int i=0;i<=n;i++){
            dp[i][0] = 1;
        }

        dp[0][0] = 1;


        for(int i=1;i<=n;i++){
            for(int j=0;j<=element;j++){

              
                int skip = dp[i-1][j];

                int take =0;
                if(j-nums[i-1]>=0)
                take = dp[i-1][j-nums[i-1]];

                dp[i][j] = take+skip;
        }
        }
        return dp[n][element];
    }
}



// a + b = totalSum
// a - b = target

// a = totalSum+target/2