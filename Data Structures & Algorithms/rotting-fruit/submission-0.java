class Solution {
    int m;
int n;
    public int orangesRotting(int[][] grid) {
        
        m= grid.length;
        n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int time=0;
        int fresh = 0;

        int[][] dir = {{0,-1},{0,1},{1,0},{-1,0}};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j]==1)fresh++;
            }
        }
        while(!q.isEmpty() && fresh>0){
            int size = q.size();

            for(int i=0;i<size;i++){
                int[] node =  q.poll();
                int x = node[0];
                int y = node[1];

                for(int[] d : dir){
                    int newX = d[0]+x;
                    int newY = d[1]+y;

                if(newX<0 || newY<0 || newX>=m || newY>=n)continue;

                if(grid[newX][newY]!=1)continue;

                    grid[newX][newY] = 2;
                    fresh--;
                    q.offer(new int[]{newX,newY});
                
                }
               
            }
             time++;
        }
            return fresh==0 ? time: -1;
    }

}

//0 empty 
//1 fresh
//2 rotten