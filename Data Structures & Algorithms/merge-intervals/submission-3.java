class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n==0)return new int[0][0];
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
        List<int[]> ans = new ArrayList<>();


        for(int i=1;i<n;i++){
          int currStart = intervals[i][0];
          int currEnd = intervals[i][1];

          if(currStart<=prevEnd){
            prevEnd = Math.max(prevEnd,currEnd);
          }
          else{
          ans.add(new int[]{prevStart,prevEnd});
          prevStart = currStart;
          prevEnd = currEnd;
        }
        }

ans.add(new int[]{prevStart,prevEnd});
  return ans.toArray(new int[ans.size()][]);
    }
}
