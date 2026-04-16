class Solution {
    public int lengthOfLIS(int[] nums) {
        return findLongest(nums,Integer.MIN_VALUE,0);
    }

    public int findLongest(int[]nums,int prev,int index){
       
        if(index==nums.length) return 0;

        int take =0;

        if(prev==Integer.MIN_VALUE || prev<nums[index]){
             take = 1+ findLongest(nums,nums[index],index+1);
        }
        int skip = findLongest(nums,prev,index+1);
        return Math.max(take,skip);
    }

}
