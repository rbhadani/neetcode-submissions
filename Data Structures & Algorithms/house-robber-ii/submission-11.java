class Solution {
    public int rob(int[] nums) {
        //space optimized dp bottom up 
        int n = nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];

        int startIncluded = rob(0,n-2,nums);
        int endIncluded = rob(1,n-1,nums);

        return Math.max(startIncluded,endIncluded);
    }
    public int rob(int start,int end,int[]nums){
       int prev1 = 0;
       int prev2 = 0;

       for(int i=start;i<=end;i++){
        int curr = Math.max(prev2+nums[i],prev1);
        prev2 = prev1;
        prev1 = curr;
       }
       return prev1;
    }
}
