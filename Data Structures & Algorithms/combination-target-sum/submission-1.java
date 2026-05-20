class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        recur(nums,temp,ans,target,0);
        return ans;
    }
    public void recur(int[]nums,List<Integer> temp,List<List<Integer>> ans,int target,int index){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        if(target<0)return;

        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            recur(nums,temp,ans,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
}
