class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q= new LinkedList<>();
        final int INF = Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0 ){
                    q.add(new int[]{i,j});
                }
            }
        }

        int[][]dir = {{-1,0},{0,-1},{1,0},{0,1}};

        while(!q.isEmpty()){
            int[] curr = q.poll();

            for(int[] d : dir){
                int nx = d[0]+curr[0];
                int ny = d[1]+curr[1];

                if(nx<0 || nx>=m || ny<0 || ny>=n )continue;
                if(grid[nx][ny]!=INF)continue;

                grid[nx][ny] = 1+grid[curr[0]][curr[1]];
                q.offer(new int[]{nx,ny});
            }
        }
    }
}
