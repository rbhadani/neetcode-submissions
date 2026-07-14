class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

         final int INF = Integer.MAX_VALUE ;

        Queue<Pair> q = new LinkedList<>();//contains distance and i,j

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    q.add(new Pair(i,j));
                }
            }
        }
        int[][] dir = {{-1,0},{1,0},{0,1},{0,-1}};

        while(!q.isEmpty()){

            Pair curr = q.poll();

            for(int[] d : dir){
                int ni = curr.i + d[0];
                int nj = curr.j + d[1];

                if(ni <0 || ni>=m || nj<0 || nj>=n)continue;
                if(grid[ni][nj]!=INF)continue;

                grid[ni][nj] = grid[curr.i][curr.j]+1;
                q.offer(new Pair(ni,nj));
            }
        }
    }
public class Pair{
    int i;
    int j;
    

    Pair(int i,int j){
        this.i = i;
        this.j = j;
       
    }
}
}
