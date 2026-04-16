class Solution {
    public int[] countBits(int n) {
        //store count as higher bits+ last bit
        // ie count[n>>1] + n&1
        int [] count = new int[n+1];
        count[0] = 0;
        for(int i=1;i<=n;i++){
            count[i] = count[i>>1] + (i&1);
        }
        return count;
    }
}
