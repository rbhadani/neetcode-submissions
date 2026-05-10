class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[nums[0]];

        while(slow!=fast){ // find meeting point 
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        slow = 0;

        while(fast!=slow){//distance between intersection point and 
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}