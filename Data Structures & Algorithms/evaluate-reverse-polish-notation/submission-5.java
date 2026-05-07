class Solution {
    public int evalRPN(String[] tokens) {
        

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(!stack.isEmpty() &&isOperator(token)){
                int a  = stack.pop();
                int b = stack.pop();

                int res = calculate(token,a,b);
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
           
        }
         return stack.pop();
    }
        public  boolean isOperator(String op){
            if(op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/"))return true;
            return false;
        }
        public  int calculate(String op,int a,int b){
            switch(op){
                case "+":return a+b;
                case "-":return b-a;
                case "*":return a*b;
                case "/":return b/a;
                default : throw new IllegalArgumentException("invalid token");
        }}
}

