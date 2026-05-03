class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int i : set){
            if(!set.contains(i-1)){
                int curr = i;
                int count=1;

                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
