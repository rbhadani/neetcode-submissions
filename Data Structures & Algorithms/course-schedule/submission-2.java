class Solution {
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adjList = new LinkedList<>();

        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] pre : prerequisites){
            int u = pre[0];
            int v = pre[1];

            adjList.get(v).add(u);
        }
        boolean[]visited = new boolean[n];
        boolean[]pathVisited = new boolean[n];
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(detectCycle(adjList,visited,i,pathVisited))return false;
            }
        }
        return true;
    }
    public boolean detectCycle(List<List<Integer>> adjList,boolean[]visited,int i , boolean[]pathVisited){
        visited[i] = true;
        pathVisited[i] = true;

        for(int neigh : adjList.get(i)){
            if(!visited[neigh]){
                if(detectCycle(adjList,visited,neigh,pathVisited))return true;
            }
            else if(pathVisited[neigh])
return true;
        }
        pathVisited[i] = false;
        return false;
    }
}
