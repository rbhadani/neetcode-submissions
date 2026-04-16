class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
            int a = intervals[0][0];
            int b = intervals[0][1];

        for(int i=1;i<n;i++){
            int x = intervals[i][0];
            int y = intervals[i][1];

          
           
            if(b>=x){
                b = Math.max(b,y);
            }
            else{
                ans.add(new int[]{a,b});
                a = x;
                b = y;
            }
        }
        ans.add(new int[]{a,b});
        return ans.toArray(new int[ans.size()][]);
    }
}
