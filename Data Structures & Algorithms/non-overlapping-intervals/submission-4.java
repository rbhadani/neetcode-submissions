class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n==0)return 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
       

        int count = 0;

        for(int i=1;i<n;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            if(currStart<prevEnd){
                count++;
              
            }
            else prevEnd =currEnd;
        }
        return count;
    }
}
//take those which finishes fast making space for next interval
//even then if it overlaps remove the 