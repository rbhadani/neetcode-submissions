class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int maxArea = 0;

        while(left<right){
            int width = Math.min(heights[left],heights[right]);

            int area = (right-left)* width;

            if(heights[left]>heights[right]){
                right--;
            }
            else{
                left++;
            }
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
