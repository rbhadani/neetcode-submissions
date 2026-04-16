/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        int n = intervals.size();
        if(n<=1)return true;

        int prevStart = intervals.get(0).start;
        int prevEnd = intervals.get(0).end;

        for(int i=1;i<n;i++){
            int currStart = intervals.get(i).start;
            int currEnd = intervals.get(i).end;

            if(currStart<prevEnd)return false;
            prevStart = currStart;
            prevEnd = currEnd;
        }
        return true;
    }
}
