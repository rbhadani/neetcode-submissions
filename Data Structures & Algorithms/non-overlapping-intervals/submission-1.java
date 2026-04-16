class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int count = 0;
        int n =intervals.length;

        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];

        for(int i=1;i<n;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];

            if(prevEnd>currStart){
                prevEnd = Math.min(prevEnd,currEnd);
                count++;
            }
            else{
                prevStart = currStart;
                prevEnd = currEnd;
            }
        }
        return count;
    }
}
