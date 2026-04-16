class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        combination(nums,target,ans,0,new ArrayList<>());
        return ans;
    }
    public void combination(int[] nums,int target,List<List<Integer>> ans, int idx,ArrayList<Integer>temp){
        if(target==0){
            ans.add(new ArrayList(temp));
            return;
        }
        if(target<0)return ;

        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            combination(nums,target-nums[i],ans,i,temp);
            temp.remove(temp.size()-1);
        }
    }
}
