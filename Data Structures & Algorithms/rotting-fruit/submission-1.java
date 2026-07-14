class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCount =0;
        int minutes = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }

        int[][] dir = {{1,0},{-1,0},{0,-1},{0,1}};

        while(!q.isEmpty() && freshCount>0){
            int size = q.size();

            for(int i=0;i<size;i++){

            int[] curr = q.poll();

            for(int[] d : dir){
                int ni = curr[0]+d[0];
                int nj = curr[1]+d[1];

                if(ni<0 || ni>=m || nj<0 || nj>=n)continue;

                if(grid[ni][nj]!=1)continue;

               if(grid[ni][nj]==1){
                grid[ni][nj]= 2;
                q.offer(new int[]{ni,nj});
                freshCount--;
               }
            }
           
           }
            minutes++;
        }
    
    return (freshCount==0)?minutes : -1;
    }
}
