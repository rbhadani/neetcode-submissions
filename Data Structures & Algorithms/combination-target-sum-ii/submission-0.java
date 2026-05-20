class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);

        recur(ans,temp,candidates,target,0);
        return ans;
    }

    public void recur(List<List<Integer>> ans,List<Integer> temp,int[] candidates, int target,int index){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(target<0)return;

        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            temp.add(candidates[i]);
            recur(ans,temp,candidates,target-candidates[i],i+1);//i+1 since we dont want to take curr elem
            temp.remove(temp.size()-1);
        }
    }
}
