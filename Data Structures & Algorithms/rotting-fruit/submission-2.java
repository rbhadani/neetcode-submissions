class Solution {
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        int minutes = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)q.add(new int[]{i,j});
                else if(grid[i][j]==1)fresh++;
            }
        }
        int[][]dir = {{-1,0},{0,-1},{1,0},{0,1}};

        while(!q.isEmpty() && fresh>0){
            int size = q.size();

            for(int i=0;i<size;i++){
                
                int[] curr = q.poll();

                for(int[] d : dir){
                    int nx = d[0]+curr[0];
                    int ny = d[1]+curr[1];


                    if(nx<0 || nx>=m || ny<0 || ny>=n)continue;
                    if(grid[nx][ny]!=1)continue;

                    if(grid[nx][ny]==1)
                    {grid[nx][ny] = 2;
                    q.offer(new int[]{nx,ny});
                    fresh--;}
                }
                
            }
            minutes++;
        }
        return fresh==0 ? minutes : -1;
    }
}
