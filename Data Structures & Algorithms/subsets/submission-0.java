class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();


        recur(ans,temp,nums,0);
        return ans;
    }

    public void recur(List<List<Integer>> ans,List<Integer> temp,int[]nums,int index){
        
        ans.add(new ArrayList<>(temp));

        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            recur(ans,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
