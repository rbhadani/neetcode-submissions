class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res = 0;

        if(nums[left]<=nums[right])return nums[left];

        while(right>left){
        
            int mid = (left+right)/2;

            if(nums[mid]>nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
