class Solution {
    public int largestRectangleArea(int[] h) {

        int n = h.length;

        int[]left = new int[n];
        int[]right = new int[n];
        int maxArea = 0;

        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && h[stack.peek()]>=h[i]){
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && h[stack.peek()]>=h[i]){
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        for(int i=0;i<n;i++){
            int width = right[i]-left[i]-1;
            int area = h[i]*width;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
