class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        
        int prevEnd = intervals[0][1];

        for(int i=1;i<n;i++){
            int start =intervals[i][0];
            int end = intervals[i][1];

            //we want to keep moving 
            //we want to update the prevEnd in case of overlap
           if(prevEnd<=start){
            prevEnd = end;
           }
            else {
                 prevEnd = Math.min(prevEnd,end);
             count++;
            }
           
        }
        return count;
    }
}
