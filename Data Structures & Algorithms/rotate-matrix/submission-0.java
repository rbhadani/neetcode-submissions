class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

//reverse the rows 
        for(int i=0;i<n;i++){
            int low = 0 ;
            int high = n-1;
            while(high>low){
                int temp = matrix[high][i] ;
                matrix[high][i] = matrix[low][i];
                matrix[low][i] = temp;
                high--;
                low++;
            }
        }
        //swap i and j
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
}