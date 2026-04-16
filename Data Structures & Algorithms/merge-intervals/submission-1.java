class Solution {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<len;i++){
            

            if( intervals[i][0] <= end){
                end = Math.max(intervals[i][1],end);
            }
            else {
                list.add(new int[]{start,end});
                 start = intervals[i][0];
                 end = intervals[i][1];
            }
        }
        list.add(new int[]{start,end});

        return list.toArray(new int[0][]);
    }
}
