class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int[] triple : triplets){
            if( triple[0]>target[0] || triple[1]>target[1] || triple[2]>target[2])continue;

            for(int i=0;i<triple.length;i++){
                if(triple[i]==target[i])
                set.add(i);
            }

        }
        return set.size()==3;
    }
}
