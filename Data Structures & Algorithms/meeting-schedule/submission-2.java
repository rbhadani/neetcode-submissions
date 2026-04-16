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
        if(intervals.size()==0)return true;
      intervals.sort((a,b)->Integer.compare(a.start,b.start));
        int ps = intervals.get(0).start;
        int pe = intervals.get(0).end;


        for(int i=1;i<intervals.size() ;i++){
            int cs = intervals.get(i).start;
            int ce = intervals.get(i).end;


            if(pe>cs){
                return false;
            }
            else{
                ps = cs;
                pe = ce;
            }
        }
return true;
    }
}
