class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //cycle in directed graph

        ArrayList<List<Integer>> adjList = new ArrayList<>();


        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] req : prerequisites){
            int u = req[0];
            int v = req[1];

            adjList.get(u).add(v);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i])
            if(detectCycle(adjList,i,visited,path))return false;
        }
        return true;
    }

    public boolean detectCycle( ArrayList<List<Integer>> adjList,int node,boolean[] visited,boolean[] path){

        visited[node] = true;
        path[node] = true;

        for(int i : adjList.get(node)){
            if(!visited[i]){
                if(detectCycle(adjList,i,visited,path))return true;
            }
            else if(path[i])return true;
        }
        path[node] = false;
         return false;
    }
   
}
