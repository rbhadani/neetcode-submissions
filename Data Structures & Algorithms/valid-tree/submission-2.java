class Solution {
    public boolean validTree(int n, int[][] edges) {
        //with union find check if cycle exists 
        //this happens when the nodes already have a connection ie findparent of 2 nodes are already same 
        if(edges.length!=n-1)return false;
        UF uf = new UF(n);
        for(int[]edge :edges){
            int u = edge[0];
            int v = edge[1];
            if(uf.findParent(u)==uf.findParent(v))return false;
            uf.union(u,v);
        }
        return true;
    }
    public class UF{
        int []parent;

        public UF(int n){
            parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i] = i;
            }
        }
        public int findParent(int x){
            if(parent[x]!=x){
                parent[x] = findParent(parent[x]);
            }
            return parent[x];
        }
        public void union(int x,int y){
            int u = findParent(x);
            int v = findParent(y);
            if(u!=v){
                parent[v] = u;
            }
        }
    }
}
