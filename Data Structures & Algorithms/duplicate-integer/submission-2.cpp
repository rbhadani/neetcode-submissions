class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        int mapN[100000]={0};
        int mapP[100000]={0};
        for(int i=0;i<nums.size(); i++){
            if(nums[i]<0) {
                if (mapN[nums[i]]>0)
                    return true;

                mapN[nums[i]]++;
            } else {
                if (mapP[nums[i]]>0)
                    return true;

                mapP[nums[i]]++;
            }
        }
        return false;
    }
};
