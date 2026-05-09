class Solution {
    public int search(int[] nums, int target) {
        //find mid point 
        //find in both sides 
        int point = findMin(nums);
        int ansLeft = bs(0,point-1,nums,target);
        int ansRight = bs(point,nums.length-1,nums,target);

        return ansLeft==-1 ? ansRight : ansLeft;
    }
    public int findMin(int[] nums) {
        int n = nums.length;

        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            if(nums[left]<=nums[right])return left;

            int mid = (left+right)/2;
            

            if(nums[mid]>nums[right])left = mid+1;
            else right = mid;

        }
        return left;
    }
    public int bs(int start,int end ,int[]nums,int target){
       

        while(start<=end){
            int mid = (start+end)/2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
