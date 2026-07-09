class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int area = 0;
        int maxArea = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                area = dfs(grid,i,j);
                maxArea = Math.max(maxArea,area);
            }
        }
        return maxArea;
    }

    public int dfs(int[][]grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length|| grid[i][j]==0)return 0;

        grid[i][j] = 0;

        int res = 1;

        int up = dfs(grid,i+1,j);
        int down = dfs(grid,i-1,j);
        int left =  dfs(grid,i,j-1);
        int right =  dfs(grid,i,j+1);

         return 1+up+left+right+down;
          

    }
}
