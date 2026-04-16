class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       
        int n = piles.length-1;
          int right = getMax(piles);
        int left =1;
        
        int ans =0;

        while(right>=left){
            int time =0;
            int mid = (left+right)/2;

            for(int curr : piles){
                 time +=(int)Math.ceil((double)curr/mid);
            }
            if(time<=h) {
                right = mid-1;
                ans= mid;
                }
            else{
                left = mid+1;
            }
            
        }
        return ans;

    }
    private int getMax(int[] piles) {
        int max = 0;
        for (int p : piles) {
            max = Math.max(max, p);
        }
        return max;
    }
}
