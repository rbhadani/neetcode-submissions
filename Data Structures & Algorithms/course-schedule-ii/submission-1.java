class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<List<Integer>> adjList = new ArrayList<>();
        int[]result = new int[numCourses];


        for(int i=0;i<numCourses;i++){
            adjList.add(new ArrayList<>());
        }

        for(int[] req : prerequisites){
            int u = req[0];
            int v = req[1];

            adjList.get(v).add(u);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] path = new boolean[numCourses];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(dfs(visited,i,adjList,stack,path))return new int[0];
            }
        }
        int j=0;
        while(!stack.isEmpty()){
            result[j++] = stack.pop();
        }
        return result;
    }
    public boolean dfs( boolean[] visited ,int node,ArrayList<List<Integer>> adjList,Stack<Integer> stack,boolean[] path ){
        visited[node] = true;
        path[node] = true;

        for(int neigh : adjList.get(node)){
             if(!visited[neigh]){
                if(dfs(visited,neigh,adjList,stack,path))return true;
            }
            else if(path[neigh])return true;
        }
        path[node] = false;
        stack.push(node);
        return false;
    }
}
