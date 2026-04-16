class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String token : tokens){
                if(isOperator(token) && !stack.isEmpty()){
                    int b = stack.pop();
                    int a = stack.pop();
                    int res = calculate(a,b,token);
                    stack.push(res);
                }
                else{
                    stack.push(Integer.parseInt(token));
                }
        }
        return stack.pop();
    }
    public boolean isOperator(String c){
        if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")){
            return true;
        }
        return false;
    }
    public int calculate(int a,int b,String op){
        switch(op){
            case "*" : return a*b;
            case "-" : return a-b;
            case "+" : return a+b;
            case "/" :return a/b;
            default : throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
