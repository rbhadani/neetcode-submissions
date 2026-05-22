class Solution {
    public boolean validTree(int n, int[][] edges) {

        ArrayList<List<Integer>> adjList = new ArrayList<>();
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

     
            if(detectCycle(visited,0,0,adjList))return false;
            for(int i=0;i<n;i++){
                if(!visited[i])return false;
            }
            return true;
        }
        

    
    public boolean detectCycle(boolean[]visited,int parent,int node,ArrayList<List<Integer>> adjList){
        visited[node]= true;

        for(int neigh : adjList.get(node)){
            if(!visited[neigh]){
                detectCycle(visited,node,neigh,adjList);
            }
            else if(parent!=neigh)return true;
        }
        return false;
    }
}
//no cycle cycle in undirected graph 
//all components connected //visisted

