class Solution {
     int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};;
     int m ;
     int n;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
         m = heights.length;
         n = heights[0].length;
        

        List<List<Integer>> ans = new ArrayList<>();

        //call dfs from row and col of both oceans 
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        for(int i=0;i<m;i++){
           dfs(heights,pacific,i,0);
        }
        for(int i=0;i<n;i++){
          dfs(heights,pacific,0,i);
        }
        for(int i=0;i<n;i++){
           dfs(heights,atlantic,m-1,i);
        }
        for(int i=0;i<m;i++){
            dfs(heights,atlantic,i,n-1);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(atlantic[i][j] && pacific[i][j]){
                    ans.add(Arrays.asList(i,j));
                }
            }
        }

        return ans;
    }
    public void dfs(int[][]heights,boolean[][] visited,int x,int y){

        visited[x][y] = true;

        for(int[] d : dir){
            int newX = d[0]+x;
            int newY = d[1]+y;

            if(newX<0 || newY<0 || newX>=m || newY>=n || visited[newX][newY])continue;

            if(heights[x][y]>heights[newX][newY])continue;

            dfs(heights,visited,newX,newY);
        }

    }
}
