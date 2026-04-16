class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] course :prerequisites ){
            int u = course[0];
            int v = course[1];
            adjList.get(v).add(u);
        }
        boolean[]visited = new boolean[n];
        boolean[]pathVis = new boolean[n];
      
       for(int i=0;i<n;i++){
        if(!visited[i]){
           if( dfs(adjList,visited,pathVis,i))return false;
        }
       }
       return true;
    }
    public boolean dfs(List<List<Integer>> adjList,boolean[]visited,boolean[] pathVis,int v){
        if(visited[v])return false;
        visited[v] = true;
        pathVis[v] = true;
        

        for(int neigh : adjList.get(v)){
            if(!visited[neigh]){
                if(dfs(adjList,visited,pathVis,neigh))return true;
            }
            else if(pathVis[neigh])return true;
        }
        pathVis[v] = false;
       return false;
    }
}



//detect cycle in undirected graph 