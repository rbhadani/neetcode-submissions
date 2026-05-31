class Solution {
    public boolean checkValidString(String s) {
        //dfs(0,0,string)
        //dfs(index,open,string)
        //if open<0 return galse else if i==s.length true
        
        int leftMin = 0;
        int leftMax = 0;

        for(char c : s.toCharArray()){

            if(c=='('){
                leftMin++;
                leftMax++;
            }
            else if(c==')'){
                leftMin--;
                leftMax--;
            }
            else{
                leftMin--;
                leftMax++;
            }
            if(leftMax<0){
                return false;
            }
            if(leftMin<0){
                leftMin=0; 
            }
        }
        return leftMin==0;

    }
}
