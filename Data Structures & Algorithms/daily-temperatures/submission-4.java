class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack  =new Stack<>();
        int n = temp.length;
        int[]result = new int[n];
        Arrays.fill(result,0);


        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temp[stack.peek()]<temp[i]){
                int prev = stack.pop();
                result[prev] = i-prev;
            }
            stack.push(i);
        }
        return result;
    }
}
