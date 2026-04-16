class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] edge :edges ){
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }    
        boolean[]visited = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(visited,i,adjList);
                count++;
            }
            
        }
        return count;
    }
    public void dfs(boolean[]visited,int v,List<List<Integer>> adjList){
        
        visited[v] = true;

        for(int neigh : adjList.get(v)){
            if(!visited[neigh]){
                dfs(visited,neigh,adjList);
            }
        }
    }
}
