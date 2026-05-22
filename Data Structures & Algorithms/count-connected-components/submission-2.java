
class Solution {

    public int countComponents(int n, int[][] edges) {

        ArrayList<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {

                dfs(i, adjList, visited);

                count++;
            }
        }

        return count;
    }

    private void dfs(int node,
                     ArrayList<List<Integer>> adjList,
                     boolean[] visited) {

        visited[node] = true;

        for (int neigh : adjList.get(node)) {

            if (!visited[neigh]) {
                dfs(neigh, adjList, visited);
            }
        }
    }
}