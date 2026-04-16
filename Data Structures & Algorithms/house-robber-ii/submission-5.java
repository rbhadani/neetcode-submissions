class Solution {
    public int rob(int[] nums) {
        int n =  nums.length;
          if(n==0)return 0;
        if(n==1)return nums[0];
        int excludeFirst = count(1,n-1,nums);
        int excludeLast = count(0,n-2,nums);

        return Math.max(excludeFirst,excludeLast);
    }
    public int count(int start,int end,int[]nums){
        int n = end-start+1;
        if(n==0)return 0;
     
        int[]dp = new int[n];
        
        dp[0] = nums[start];
        if(n>1) dp[1] = Math.max(nums[start],nums[start+1]);

        for(int i=2;i<n;i++){
          
         dp[i] =   Math.max(nums[i+start]+dp[i-2],dp[i-1]);
           

        }

        return dp[n-1];
    }
}
