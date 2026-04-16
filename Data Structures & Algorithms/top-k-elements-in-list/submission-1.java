class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[]result = new int[k];

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->Integer.compare(map.get(a),map.get(b)));

        for(int num : map.keySet()){
            pq.add(num);
            if(pq.size()>k){
                pq.poll();
            }
        }
        for(int i=0;i<k&!pq.isEmpty();i++){
            result[i] = pq.poll();
        }
        return result;
    }
}
