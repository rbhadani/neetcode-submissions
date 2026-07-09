class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int i , int j,char[][]grid){
         //if out of bound or 0 - return 
         //if 1 convert to 0 
         //go i+1,i-1,j-1,j+1
         if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0')return;

         grid[i][j] = '0';

         dfs(i,j+1,grid);
         dfs(i,j-1,grid);
         dfs(i+1,j,grid);
         dfs(i-1,j,grid);
    }
}
