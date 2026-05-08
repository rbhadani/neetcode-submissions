class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        int i=0;

      while(left<=right){
        int width = right-left;
        max = Math.max(width*Math.min(heights[left],heights[right]),max);

        if(heights[left]<heights[right])left++;
        else right--;
        i++;
      }
      return max;
    }
}
