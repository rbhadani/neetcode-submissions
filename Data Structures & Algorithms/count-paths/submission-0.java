class Solution {
    public int uniquePaths(int m, int n) {
        return unique(m-1,n-1);
    }
    public int unique(int i,int j){
        if(i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0 )return 0;
        return unique(i-1,j) + unique(i,j-1);
    }
}
