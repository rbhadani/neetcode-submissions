class Solution {
    public int hammingWeight(int n) {
        //we will n&1 then right shift the no
        int count = 0;

        while(n!=0){
            count+=n&1;
            n = n>>>1;
        }
        return count;
    }
}
