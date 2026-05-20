class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        Arrays.sort(nums);

        recur(ans,temp,nums,0);
        return ans;
    }

    public void recur(List<List<Integer>> ans,List<Integer> temp,int[] nums,int index){
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1])continue;
            temp.add(nums[i]);
            recur(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
