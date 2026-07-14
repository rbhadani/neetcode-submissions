class Solution {
       int m ;
    int n;
  
    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
       int area = 0;
       int maxArea = 0;


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    area=dfs(i,j,grid);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
    }
    public int dfs (int i,int j,int[][]grid){
        int res = 1;
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0)return 0;

        grid[i][j] = 0;

        int up = dfs(i+1,j,grid);
        int down = dfs(i-1,j,grid);
        int right = dfs(i,j+1,grid);
        int left = dfs(i,j-1,grid);

        res +=up+left+right+down;
        return res;
    }
}
