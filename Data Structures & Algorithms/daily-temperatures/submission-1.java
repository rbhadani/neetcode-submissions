class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[]result = new int[temp.length];
        Arrays.fill(result,0);

        for(int i=0;i<temp.length;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                    int prev = stack.pop();
                    result[prev] = i-prev;
            }
           
            stack.push(i);

        }
        return result;
    }
}
