class Solution {
    public int reverseBits(int n) {
        int res = 0;

        for(int i=0;i<32;i++){
            res = res<<1; //left shift result to make space
            res = res | n&1; //add the last bit of the actual n
            n = n>>1; //right shift the n to get the last bit
        }
        return res;
    }
}
