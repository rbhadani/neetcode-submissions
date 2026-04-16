class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(new int[]{entry.getKey(),entry.getValue()});
        }

        list.sort(new Compare());

        for(int i=0;i<k;i++){
            result[i] = list.get(i)[0];
        }
        return result ;
    }

    public class Compare implements Comparator<int[]>{
        public int compare(int[]p1,int[]p2)
        {if(p1[1]==p2[1]){
            return Integer.compare(p2[0],p1[0]);
        }
        return Integer.compare(p2[1],p1[1]);
    }}
}
