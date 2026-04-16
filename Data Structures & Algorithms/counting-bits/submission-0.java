class Solution {
    public int[] countBits(int n) {
        int[] count = new int[n+1];
       for(int i=0;i<=n;i++){
        count[i] = countBit(i);
       }
       return count;
    }
    public int countBit(int n){
        int cnt =0;
        while(n!=0){
            cnt += n&1;
            n = n>>>1;
        }
        return cnt;
    }
}
