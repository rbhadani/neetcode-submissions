class Solution {
    public int leastInterval(char[] tasks, int n) {
        //take freq map
        //max heap to take greedy approach by first using the max freq elem
        //cooldown queue to store the element with the time when it will be available

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);

        for(int f : map.values()){
            maxHeap.offer(f);
        }

        Queue<int[]> cooldown = new LinkedList<>();
        int time=0;

        while(!maxHeap.isEmpty() || !cooldown.isEmpty()){
            
            time++;

          if(!maxHeap.isEmpty()){
            int remainingFreq = maxHeap.poll();
            remainingFreq--;

            if(remainingFreq>0){
                cooldown.offer(new int[]{
                    remainingFreq,time+n
                });
            }
          }

          if(!cooldown.isEmpty() && cooldown.peek()[1]==time){
            maxHeap.offer(cooldown.poll()[0]);
          }
        }
        return time;

    }
}
