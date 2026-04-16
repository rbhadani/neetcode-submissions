class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count =0;

         boolean[][]visited = new boolean [m][n];
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                   dfs(grid,visited,i,j) ;
                   count++;
                }
            }
         }
         return count;
    }
    public void dfs(char[][]grid,boolean[][]visited,int x,int y){
        int m = grid.length;
        int n = grid[0].length;

        if(x<0 || x>=m ||y<0 || y>=n || grid[x][y]=='0' || visited[x][y])
        return ;
        
        visited[x][y] = true;

       dfs(grid,visited,x+1,y);
       dfs(grid,visited,x-1,y);
       dfs(grid,visited,x,y+1);
       dfs(grid,visited,x,y-1);

       

    }
}
//10:34