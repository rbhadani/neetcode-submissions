class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int x = newInterval[0];
        int y = newInterval[1];
       List<int[]> ans = new ArrayList();
       boolean inserted = false;

        for(int [] curr : intervals){
            int a = curr[0];
            int b = curr[1];
            
            if(b<x){
                ans.add(new int[]{a,b});
            }
            else if(a>y){
                if(!inserted){
                   ans.add(new int[]{x,y});
                    inserted = true;
                }
                 ans.add(new int[]{a,b});
            }
            else{
                 x = Math.min(a,x);
                 y = Math.max(b,y);
                
            }

            

        }
        if (!inserted) {
            ans.add(new int[]{x, y});
        }
        return ans.toArray(new int[ans.size()][]);

    }
}
