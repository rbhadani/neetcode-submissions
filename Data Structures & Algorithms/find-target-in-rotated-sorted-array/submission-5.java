class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length-1;
        int pivot =  findMin(nums);
        int index =  bs(nums,0,pivot-1,target);
        if (index!=-1) return index;
        return bs(nums,pivot,n,target);

    }

    public int findMin(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
         if(arr[left]<=arr[right]) return left;

        while(left<right){
            int mid = left + (right-left)/2;
           

            if(arr[mid]>arr[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
    public int bs(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
