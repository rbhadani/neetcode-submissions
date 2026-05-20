class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        int n = nums.length;
        boolean[] used = new boolean[n];

        recur(used,ans,temp,nums);
        return ans;
    }
    public void recur(boolean[] used,List<List<Integer>> ans,List<Integer> temp,int[]nums){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
        }

        for(int i=0;i<nums.length;i++){
            if(used[i])continue;
            used[i] = true;
            temp.add(nums[i]);
            recur(used,ans,temp,nums);
            used[i] = false;
            temp.remove(temp.size()-1);
        }
    }
}
