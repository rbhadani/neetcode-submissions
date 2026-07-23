class Solution {
    public boolean validTree(int n, int[][] edges) {
        int edgeLen = edges.length;

        if(edgeLen!=n-1)return false;
         List<List<Integer>> adjList = new ArrayList<>();
        if(edges.length!=n-1)return false;

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[]edge : edges){
            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[]visited = new boolean[n];

        if(detectCycle(adjList,visited,0,0))return false;
        for(int i=0;i<n;i++){
            if(!visited[i])return false;
        }
        return true;
    }
    
    public boolean detectCycle(List<List<Integer>>adjList,boolean[]visited,int parent,int node){
        visited[node] = true;

        for(int neigh : adjList.get(node)){
            if(!visited[neigh]){
                detectCycle(adjList,visited,node,neigh);
            }
            else if(parent!=neigh)return true;
        }
        return false;
    }
}
