class Solution {
    public int reverseBits(int n) {
        //for all 32 bits try to find the last bit 
        //after that shift the revresed bits to left by 1 place
        //then move forward too next digit by doing right shift 

        int reversed = 0;
        for(int i=0;i<32;i++){
           //push the reverse to left 
           reversed = reversed<<1;
           reversed |= (n&1);
           n = n>>1;
        }
        return reversed;
    }
}
