class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int n = gas.length;
        int gasSum = 0;
        int costSum = 0;

        for(int i: gas){
            gasSum+=i;
        }
        for(int i:cost){
            costSum+=i;
        }
        if(gasSum<costSum)return -1;

        int index = 0;
        int currSum =0;

        for(int i=0;i<n;i++){
            currSum+= gas[i]-cost[i];

            if(currSum<0){
                currSum = 0;
                index= i+1;
            }
        }
        return index;
    }
}
