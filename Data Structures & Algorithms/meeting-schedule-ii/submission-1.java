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
    public int minMeetingRooms(List<Interval> intervals) {
        //sort based on end time 
        //put in min heap 
        //if the new time in greater than the top of heap that means no extra room required 
        //return the size of heap 
        if(intervals.isEmpty())return 0;
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        for(Interval interval : intervals){
            int startTime = interval.start;
            int endTime = interval.end;
            if(pq.isEmpty() || pq.peek()<=startTime){
                pq.poll();
            }
             pq.offer(endTime);
        }
        return pq.size();


















    }
}
