class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

       for(int i : map.keySet()){
        pq.add(i);
        if(pq.size()>k)pq.poll();
       }

        int[]result = new int[k];
        int j=0;

        for(int i=1;i<=k;i++){
            result[j++]=pq.poll();
        }
        return result;
    }
}
