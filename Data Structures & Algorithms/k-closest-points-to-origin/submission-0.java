class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        //keep removing the fartheset eleme so use maxHeap

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b)->(
            (b[1]*b[1]+b[0]*b[0])-(a[1]*a[1]+a[0]*a[0])));
        int[][] result = new int[k][2];

        for(int []point : points){
            int a = point[0];
            int b = point[1];

            pq.add(new int[]{a,b});
            if(pq.size()>k)pq.poll();
        }

       for(int i=0;i<k;i++){
        int[]curr= pq.poll();
        result[i][0] = curr[0];
        result[i][1] = curr[1];
       }
        return result;
    }
}
