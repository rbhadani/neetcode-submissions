class Solution {

    //walls and gates - multisource bfs 

    public void islandsAndTreasure(int[][] grid) {
       //put all 0 into a queue
       //from there try to find lamd and add it 
        
        Queue<int[]> q= new LinkedList<>();
        final int INF = 2147483647;
        int m = grid.length;
        int n = grid[0].length;
        int[][]dir = {{0,-1},{0,1},{1,0},{-1,0}};

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.offer(new int[]{i,j});
                }
            }
        }
        while(!q.isEmpty()){
            int[] node = q.poll();
            int x = node[0];
            int y = node[1];

            for(int[] d : dir){
                int newX = d[0]+x;
                int newY = d[1]+y;

                if(newX<0 || newY<0 || newX>=m || newY>=n)continue;

                if(grid[newX][newY]!=INF)continue;

                grid[newX][newY] = 1+grid[x][y];
                q.offer(new int[]{newX,newY});
            }
            
        }
    }
}
