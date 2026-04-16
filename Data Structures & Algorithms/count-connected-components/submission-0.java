class Solution {
    public int countComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
            adj.get(u).add(v);
        }
        int count =0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                count++;
            }
        }
        return count;
    }
    public void dfs(int i,List<List<Integer>> adj, boolean[] visited){
        visited[i] = true ;
        for(int j : adj.get(i)){
            if(!visited[j]){
                dfs(j,adj,visited);
                visited[j] = true;
            }
        }
    }
}
