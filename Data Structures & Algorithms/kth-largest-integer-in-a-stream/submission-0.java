class KthLargest {
    PriorityQueue<Integer> pq ;
    int largest ;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>((a,b)->(a-b));
        largest = k;

        for(int n : nums){
            pq.add(n);
             if(pq.size()>largest)pq.poll();
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>largest)pq.poll();

        return pq.peek();
    }
}
