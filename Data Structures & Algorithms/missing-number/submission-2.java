class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorAll = 0;
        int xorArr = 0;
        for(int i=0;i<=n;i++){
            xorAll=xorAll^i;
        }
        for(int i=0;i<n;i++){
            xorArr = xorArr^nums[i];
        }
        return xorArr^xorAll;
    }
}
