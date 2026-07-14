class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        boolean[][]atlantic = new boolean[m][n];
        boolean[][]pacific = new boolean[m][n];

        ArrayList<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            dfs(heights,pacific,0,i);
        }
         for(int i=0;i<m;i++){
            dfs(heights,pacific,i,0);
        }
         for(int i=0;i<m;i++){
            dfs(heights,atlantic,i,n-1);
        }
         for(int i=0;i<n;i++){
            dfs(heights,atlantic,m-1,i);
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

    public void dfs(int[][]heights,boolean[][]ocean,int i,int j){
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        ocean[i][j] = true;

        for(int[] d : dir){
            int nx = i+d[0];
            int ny = j+d[1];

            if(nx<0 || nx>=heights.length || ny<0 || ny>=heights[0].length)continue;
            if(ocean[nx][ny])continue;

            if(heights[nx][ny]<heights[i][j])continue;

            dfs(heights,ocean,nx,ny);
        }
    }
}
