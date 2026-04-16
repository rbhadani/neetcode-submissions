class Solution {
    public int[] countBits(int n) {
        int[]res = new int[n+1];
        res[0] = 0;
        for(int i=0;i<=n;i++){
            res[i] = res[i>>1]+(i&1);
        }
        return res;
    }
}
