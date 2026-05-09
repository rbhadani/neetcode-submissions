class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = 0;
        
        int ans =1;

        for(int p : piles){
            max = Math.max(p,max);
           
        }
        int left = 1;
        int right = max;

        while(left<=right){

            int mid =(left+right)/2;    
            int timeTaken = 0;

            for(int i=0;i<n;i++){
                timeTaken+=Math.ceil((double)piles[i]/mid);
            }
            if(timeTaken<=h){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
            
        }
        return ans;
    }
}
