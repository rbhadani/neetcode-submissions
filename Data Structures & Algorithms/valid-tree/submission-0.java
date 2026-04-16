class Solution {
    public boolean validTree(int n, int[][] edges) {
        UF uf = new UF(n);
        if(edges.length != n-1)return false;
       
        for(int []edge : edges){
            int u = edge[0];
            int v = edge[1];
            if(uf.findParent(u)==uf.findParent(v)){
               return false;
            }
           uf.addEdge(u,v);
        }
        return true;
    }
    public class UF {
        
       int[]parent;
       

        UF(int n){
            
             parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
            }
        }
        public int findParent(int i){
         if(parent[i]!=i){ 
            parent[i] = findParent(parent[i]);
         }
         return parent[i];
        }
        public void addEdge(int i,int j){
            int u = findParent(i);
            int v = findParent(j);
            if(v!=u){
                parent[v] = u;
            }
        }
    }
}
//1:45

//i is not the root of current set so recursively find the parent
