class Solution {
    
    int m;
    int n;
   
    public int maxAreaOfIsland(int[][] grid) {

        m = grid.length;
        n = grid[0].length;
       
        int maxArea = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                
                if(grid[i][j]==1){
                    int area = dfs(grid,i,j);
                    maxArea = Math.max(maxArea,area);
                }

            }
            
        }
        return maxArea;
    }

    public int dfs(int[][] grid,int i ,int j){

        if(i<0 || i>=m || j<0 || j>=n ||  grid[i][j]==0)return 0;

        grid[i][j] = 0;
        int res = 1;

        int up =dfs(grid,i+1,j);
        int down = dfs(grid,i,j+1);
        int left = dfs(grid,i-1,j);
        int right = dfs(grid,i,j-1);

        res+=up+left+down+right;
        return res;
    }
}
